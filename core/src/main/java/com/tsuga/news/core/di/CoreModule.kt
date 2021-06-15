package com.tsuga.news.core.di

import androidx.room.Room
import com.tsuga.news.core.data.source.local.room.NewsDatabase
import com.tsuga.news.core.data.source.remote.network.NewsApiService
import com.tsuga.news.core.domain.repository.INewsRepository
import com.tsuga.news.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val databaseModule = module {
    factory { get<NewsDatabase>().newsDao() }
    single {
        val phrase: ByteArray = SQLiteDatabase.getBytes("news".toCharArray())
        val factory = SupportFactory(phrase)
        Room.databaseBuilder(
            androidContext(),
            NewsDatabase::class.java,
            "News.db"
        )
            .fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }
}

val networkModule = module {
    single {
        val hostname = "newsapi.org"
        val cp = CertificatePinner.Builder()
            .add(hostname, "sha256/c5XTqkOxoXqc60M3HuT9fgmfeexiP2+Q8BD3+6abZYU=")
            .add(hostname, "sha256/FEzVOUp4dF3gI0ZVPRJhFbSJVXR+uQmMH65xhs1glH4=")
            .add(hostname, "sha256/Y9mvm0exBk1JoQ57f9Vm28jKo5lFm/woKcVxrYxu80o=")
            .build()

        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .certificatePinner(cp)
            .build()
    }

    single {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(get())
            .build()

        retrofit.create(NewsApiService::class.java)
    }
}

val repositoryModule = module {
    single { com.tsuga.news.core.data.source.local.LocalDataSource(get()) }
    single { com.tsuga.news.core.data.source.remote.RemoteDataSource(get()) }
    factory { AppExecutors() }
    single<INewsRepository> { com.tsuga.news.core.data.NewsRepository(get(), get(), get()) }
}