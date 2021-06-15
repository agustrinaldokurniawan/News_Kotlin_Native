package com.tsuga.news.core.domain.repository

import com.tsuga.news.core.domain.model.News
import io.reactivex.Flowable

interface INewsRepository {
    fun getAllNews(): Flowable<com.tsuga.news.core.data.Resource<List<News>>>
    fun getFavoriteNews(): Flowable<List<News>>
    fun setBookmarkNews(news: News, state: Boolean)
    fun getNewsByKeyword(keyword: String): Flowable<List<News>>
    fun getBookmarkByKeyword(keyword: String): Flowable<List<News>>
}