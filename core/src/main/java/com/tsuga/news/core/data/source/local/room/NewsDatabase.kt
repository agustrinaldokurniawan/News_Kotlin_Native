package com.tsuga.news.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [com.tsuga.news.core.data.source.local.entity.NewsEntity::class], version = 1, exportSchema = false)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): com.tsuga.news.core.data.source.local.room.NewsDao

    companion object {
        @Volatile
        private var INSTANCE: com.tsuga.news.core.data.source.local.room.NewsDatabase? = null
    }
}