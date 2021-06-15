package com.tsuga.news.readnews

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.domain.usecase.NewsUseCase

class ReadNewsViewModel(private val newsUseCase: NewsUseCase) : ViewModel() {
    val news = LiveDataReactiveStreams.fromPublisher(newsUseCase.getAllNews())
    fun setBookmarkNews(news: News, newState: Boolean) =
        newsUseCase.setBookmarkNews(news, newState)
}