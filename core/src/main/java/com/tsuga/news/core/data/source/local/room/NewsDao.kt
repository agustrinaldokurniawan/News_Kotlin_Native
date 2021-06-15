package com.tsuga.news.core.data.source.local.room

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface NewsDao {
    @Query("select * from news")
    fun getAllNews(): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>>

    @Query("select * from news where isBookmark = 1")
    fun getBookmark(): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>>

    @Query("select * from news where title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword")
    fun getNewsByKeyword(keyword: String?): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>>

    @Query("select * from news where isBookmark=1 and (title like :keyword or content like :keyword or description like :keyword or author like :keyword or source like :keyword)")
    fun getBookmarkByKeyword(keyword: String?): Flowable<List<com.tsuga.news.core.data.source.local.entity.NewsEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(news: List<com.tsuga.news.core.data.source.local.entity.NewsEntity>) : Completable

    @Update
    fun updateBookmarkNews(news: com.tsuga.news.core.data.source.local.entity.NewsEntity)
}