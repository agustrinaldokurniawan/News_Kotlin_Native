package com.tsuga.news.core.data.source.local

import com.tsuga.news.core.data.source.local.entity.NewsEntity
import io.reactivex.Flowable

class LocalDataSource(private val newsDao: com.tsuga.news.core.data.source.local.room.NewsDao) {
    fun getAllNews(): Flowable<List<NewsEntity>> = newsDao.getAllNews()
    fun getBookmarkNews(): Flowable<List<NewsEntity>> = newsDao.getBookmark()
    fun getNewsByKeyword(keyword: String): Flowable<List<NewsEntity>> =
        newsDao.getNewsByKeyword("%$keyword%")

    fun insertNews(newsList: List<NewsEntity>) = newsDao.insertNews(newsList)
    fun setBookmarkNews(newsEntity: NewsEntity, newState: Boolean) {
        newsEntity.isBookmark = newState
        newsDao.updateBookmarkNews(newsEntity)
    }

    fun getBookmarkByKeyword(keyword: String): Flowable<List<NewsEntity>> =
        newsDao.getBookmarkByKeyword("%$keyword%")
}