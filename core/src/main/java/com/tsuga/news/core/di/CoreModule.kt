package com.tsuga.news.core.di

import androidx.room.Room
import com.tsuga.news.core.BuildConfig
import com.tsuga.news.core.data.source.local.room.NewsDatabase
import com.tsuga.news.core.data.source.remote.network.NewsApiService
import com.tsuga.news.core.domain.repository.INewsRepository
import com.tsuga.news.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
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
        val phrase : ByteArray = SQLiteDatabase.getBytes("news".toCharArray())
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
    if(BuildConfig.DEBUG){
        single {
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build()
        }
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