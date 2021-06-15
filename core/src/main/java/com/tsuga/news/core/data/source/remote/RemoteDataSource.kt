package com.tsuga.news.core.data.source.remote

import com.tsuga.news.core.data.source.remote.network.ApiResponse
import com.tsuga.news.core.data.source.remote.network.NewsApiService
import com.tsuga.news.core.data.source.remote.response.NewsResponse
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject

class RemoteDataSource(private val newsApiService: NewsApiService) {
    fun getAllNews(): Flowable<ApiResponse<List<NewsResponse>>> {
        val resultData = PublishSubject.create<ApiResponse<List<NewsResponse>>>()

        val client = newsApiService.getTopHeadlines()

        client
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .take(1)
            .subscribe({ response ->
                val dataArray = response.articles
                val list = ArrayList<NewsResponse>()
                if (dataArray != null) {
                    for (i in dataArray.indices) {
                        val news = dataArray[i]

                        var newsResponse: NewsResponse? = null
                        if (news != null) {
                            val sourceObject = news.source
                            val nameSource = sourceObject?.name

                            val author = news.author
                            val title = news.title
                            val description = news.description
                            val url = news.url
                            val urlToImage = news.urlToImage
                            val publishedAt = news.publishedAt
                            val content = news.content

                            newsResponse = NewsResponse(
                                publishedAt = publishedAt ?: "",
                                author = author ?: "",
                                urlToImage = urlToImage ?: "" ,
                                description = description ?: "",
                                source = nameSource ?: "",
                                title = title ?: "",
                                url = url ?: "",
                                content = content ?: "[Empty]"
                            )
                        }


                        if (newsResponse != null) {
                            list.add(newsResponse)
                        }
                    }
                }
                resultData.onNext(if (list.isNotEmpty()) ApiResponse.Success(list) else ApiResponse.Empty)
            }, { error ->
                resultData.onNext(ApiResponse.Error(error.message.toString()))
            })
        return resultData.toFlowable(BackpressureStrategy.BUFFER)
    }
}