package com.tsuga.news.favorite

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteModule = module {
    viewModel { BookmarkViewModel(get()) }
}