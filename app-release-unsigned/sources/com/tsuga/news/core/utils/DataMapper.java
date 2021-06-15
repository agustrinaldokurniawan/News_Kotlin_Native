package com.tsuga.news.core.utils;

import com.tsuga.news.core.data.source.local.entity.NewsEntity;
import com.tsuga.news.core.data.source.remote.response.NewsResponse;
import com.tsuga.news.core.domain.model.News;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/tsuga/news/core/utils/DataMapper;", "", "()V", "mapDomainToEntity", "Lcom/tsuga/news/core/data/source/local/entity/NewsEntity;", "input", "Lcom/tsuga/news/core/domain/model/News;", "mapEntitiesToDomain", "", "mapResponsesToEntities", "Lcom/tsuga/news/core/data/source/remote/response/NewsResponse;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: DataMapper.kt */
public final class DataMapper {
    public static final DataMapper INSTANCE = new DataMapper();

    private DataMapper() {
    }

    public final List<NewsEntity> mapResponsesToEntities(List<NewsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "input");
        ArrayList arrayList = new ArrayList();
        List<NewsResponse> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new NewsEntity(t.getPublishedAt(), t.getAuthor(), t.getUrlToImage(), t.getDescription(), t.getSource(), t.getTitle(), t.getUrl(), t.getContent(), false, 256, null))));
        }
        return arrayList;
    }

    public final List<News> mapEntitiesToDomain(List<NewsEntity> list) {
        Intrinsics.checkNotNullParameter(list, "input");
        List<NewsEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList.add(new News(t.getPublishedAt(), t.getAuthor(), t.getUrlToImage(), t.getDescription(), t.getSource(), t.getTitle(), t.getUrl(), t.getContent(), t.isBookmark()));
        }
        return arrayList;
    }

    public final NewsEntity mapDomainToEntity(News news) {
        Intrinsics.checkNotNullParameter(news, "input");
        return new NewsEntity(news.getPublishedAt(), news.getAuthor(), news.getUrlToImage(), news.getDescription(), news.getSource(), news.getTitle(), news.getUrl(), news.getContent(), news.isBookmark());
    }
}
