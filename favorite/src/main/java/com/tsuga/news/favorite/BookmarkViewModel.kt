package com.tsuga.news.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.domain.usecase.NewsUseCase

class BookmarkViewModel(private val newsUseCase: NewsUseCase) : ViewModel() {
    val news = LiveDataReactiveStreams.fromPublisher(newsUseCase.getFavoriteNews())

    fun searchQueryBookmark(keyword: String): LiveData<List<News>> {
        return LiveDataReactiveStreams.fromPublisher(newsUseCase.getBookmarkByKeyword(keyword))
    }
}