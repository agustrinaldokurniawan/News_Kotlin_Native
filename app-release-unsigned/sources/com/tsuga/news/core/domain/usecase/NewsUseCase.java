package com.tsuga.news.core.domain.usecase;

import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.domain.model.News;
import io.reactivex.Flowable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/tsuga/news/core/domain/usecase/NewsUseCase;", "", "getAllNews", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/Resource;", "", "Lcom/tsuga/news/core/domain/model/News;", "getBookmarkByKeyword", "keyword", "", "getFavoriteNews", "getNewsByKeyword", "setBookmarkNews", "", "news", "state", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsUseCase.kt */
public interface NewsUseCase {
    Flowable<Resource<List<News>>> getAllNews();

    Flowable<List<News>> getBookmarkByKeyword(String str);

    Flowable<List<News>> getFavoriteNews();

    Flowable<List<News>> getNewsByKeyword(String str);

    void setBookmarkNews(News news, boolean z);
}
