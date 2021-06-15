package com.tsuga.news.core.data

import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.domain.repository.INewsRepository
import com.tsuga.news.core.utils.AppExecutors
import com.tsuga.news.core.utils.DataMapper
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class NewsRepository(
    private val remoteDataSource: com.tsuga.news.core.data.source.remote.RemoteDataSource,
    private val localDataSource: com.tsuga.news.core.data.source.local.LocalDataSource,
    private val executors: AppExecutors
) : INewsRepository {
    override fun getAllNews(): Flowable<Resource<List<News>>> =
        object : com.tsuga.news.core.data.NetworkBoundResource<List<News>, List<NewsResponse>>(executors) {
            override fun shouldFetch(data: List<News>?): Boolean {
                return data == null || data.isEmpty()
            }

            override fun loadFromDB(): Flowable<List<News>> {
                return localDataSource.getAllNews().map { DataMapper.mapEntitiesToDomain(it) }
            }

            override fun createCall(): Flowable<ApiResponse<List<NewsResponse>>> {
                return remoteDataSource.getAllNews()
            }

            override fun saveCallResult(data: List<NewsResponse>) {
                val newsList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertNews(newsList)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe()
            }
        }.asFlowable()

    override fun getFavoriteNews(): Flowable<List<News>> {
        return localDataSource.getBookmarkNews().map { DataMapper.mapEntitiesToDomain(it) }
    }

    override fun setBookmarkNews(news: News, state: Boolean) {
        val newsEntity = DataMapper.mapDomainToEntity(news)
        executors.diskIO().execute { localDataSource.setBookmarkNews(newsEntity, state) }
    }

    override fun getNewsByKeyword(keyword: String): Flowable<List<News>> {
        return localDataSource.getNewsByKeyword(keyword).map { DataMapper.mapEntitiesToDomain(it) }
    }

    override fun getBookmarkByKeyword(keyword: String): Flowable<List<News>> {
        return localDataSource.getBookmarkByKeyword(keyword)
            .map { DataMapper.mapEntitiesToDomain(it) }
    }
}