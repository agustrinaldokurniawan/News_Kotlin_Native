package com.tsuga.news

import android.app.Application
import com.tsuga.news.core.di.databaseModule
import com.tsuga.news.core.di.networkModule
import com.tsuga.news.core.di.repositoryModule
import com.tsuga.news.di.useCaseModule
import com.tsuga.news.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}