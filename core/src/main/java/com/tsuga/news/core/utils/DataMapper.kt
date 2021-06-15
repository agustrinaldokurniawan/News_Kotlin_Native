package com.tsuga.news.core.utils

import com.tsuga.news.core.data.source.remote.response.NewsResponse
import com.tsuga.news.core.domain.model.News

object DataMapper {
    fun mapResponsesToEntities(input: List<NewsResponse>): List<com.tsuga.news.core.data.source.local.entity.NewsEntity> {
        val newsList = ArrayList<com.tsuga.news.core.data.source.local.entity.NewsEntity>()

        input.map {
            val news = com.tsuga.news.core.data.source.local.entity.NewsEntity(
                publishedAt = it.publishedAt,
                author = it.author,
                urlToImage = it.urlToImage,
                description = it.description,
                title = it.title,
                source = it.source,
                url = it.url,
                content = it.content
            )
            newsList.add(news)
        }
        return newsList
    }

    fun mapEntitiesToDomain(input: List<com.tsuga.news.core.data.source.local.entity.NewsEntity>): List<News> {
        return input.map {
            News(
                publishedAt = it.publishedAt,
                author = it.author,
                urlToImage = it.urlToImage,
                description = it.description,
                title = it.title,
                source = it.source,
                url = it.url,
                content = it.content,
                isBookmark = it.isBookmark
            )
        }
    }

    fun mapDomainToEntity(input: News): com.tsuga.news.core.data.source.local.entity.NewsEntity {
        return com.tsuga.news.core.data.source.local.entity.NewsEntity(
            publishedAt = input.publishedAt,
            author = input.author,
            urlToImage = input.urlToImage,
            description = input.description,
            title = input.title,
            source = input.source,
            url = input.url,
            content = input.content,
            isBookmark = input.isBookmark
        )
    }
}