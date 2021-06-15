package com.tsuga.news.core.domain.usecase

import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.domain.repository.INewsRepository
import io.reactivex.Flowable

class NewsInteractor(private val newsRepository: INewsRepository) : NewsUseCase {
    override fun getAllNews(): Flowable<com.tsuga.news.core.data.Resource<List<News>>> {
        return newsRepository.getAllNews()
    }

    override fun getFavoriteNews(): Flowable<List<News>> {
        return newsRepository.getFavoriteNews()
    }

    override fun setBookmarkNews(news: News, state: Boolean) {
        return newsRepository.setBookmarkNews(news, state)
    }

    override fun getNewsByKeyword(keyword: String): Flowable<List<News>> {
        return newsRepository.getNewsByKeyword(keyword)
    }

    override fun getBookmarkByKeyword(keyword: String): Flowable<List<News>> {
        return newsRepository.getBookmarkByKeyword(keyword)
    }
}