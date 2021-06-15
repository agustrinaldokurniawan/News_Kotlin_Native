package com.tsuga.news.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.domain.usecase.NewsUseCase

class SearchViewModel(private val newsUseCase: NewsUseCase) : ViewModel() {
    fun searchNews(keyword: String): LiveData<List<News>>{
        return LiveDataReactiveStreams.fromPublisher(newsUseCase.getNewsByKeyword(keyword))
    }
}