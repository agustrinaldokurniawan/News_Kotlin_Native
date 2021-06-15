package com.tsuga.news.core.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "news")
data class NewsEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "publishedAt")
    var publishedAt: String,

    @ColumnInfo(name = "author")
    val author: String,

    @ColumnInfo(name = "urlToImage")
    val urlToImage: String,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "source")
    val source: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "content")
    val content: String,

    @ColumnInfo(name = "isBookmark")
    var isBookmark : Boolean = false
) : Parcelable