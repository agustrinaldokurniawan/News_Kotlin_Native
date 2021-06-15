package com.tsuga.news.di

import com.tsuga.news.core.domain.usecase.NewsInteractor
import com.tsuga.news.core.domain.usecase.NewsUseCase
import com.tsuga.news.home.HomeViewModel
import com.tsuga.news.readnews.ReadNewsViewModel
import com.tsuga.news.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<NewsUseCase> { NewsInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { ReadNewsViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}