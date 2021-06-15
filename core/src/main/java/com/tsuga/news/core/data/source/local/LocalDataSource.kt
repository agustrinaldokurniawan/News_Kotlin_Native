package com.tsuga.news.core.data.source.local

import io.reactivex.Flowable

class LocalDataSource(private val newsDao: com.tsuga.news.core.data.source.local.room.NewsDao) {
    companion object {
        private var instance: com.tsuga.news.core.data.source.local.LocalDataSource? = null
    }

    fun getAllNews(): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>> = newsDao.getAllNews()
    fun getBookmarkNews(): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>> = newsDao.getBookmark()
    fun getNewsByKeyword(keyword: String): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>> =
        newsDao.getNewsByKeyword("%$keyword%")

    fun insertNews(newsList: List<com.tsuga.news.core.data.source.local.entity.NewsEntity>) = newsDao.insertNews(newsList)
    fun setBookmarkNews(newsEntity: com.tsuga.news.core.data.source.local.entity.NewsEntity, newState: Boolean) {
        newsEntity.isBookmark = newState
        newsDao.updateBookmarkNews(newsEntity)
    }

    fun getBookmarkByKeyword(keyword: String): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>> =
        newsDao.getBookmarkByKeyword("%$keyword%")
}