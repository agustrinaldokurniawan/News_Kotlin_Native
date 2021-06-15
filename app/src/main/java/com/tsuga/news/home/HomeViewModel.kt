package com.tsuga.news.home

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.tsuga.news.core.domain.usecase.NewsUseCase

class HomeViewModel(newsUseCase: NewsUseCase) : ViewModel() {
    val news = LiveDataReactiveStreams.fromPublisher(newsUseCase.getAllNews())
}