package com.tsuga.news.core.data.source.local.room;

import com.tsuga.news.core.data.source.local.entity.NewsEntity;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH'J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H'¨\u0006\u0010"}, d2 = {"Lcom/tsuga/news/core/data/source/local/room/NewsDao;", "", "getAllNews", "Lio/reactivex/Flowable;", "", "Lcom/tsuga/news/core/data/source/local/entity/NewsEntity;", "getBookmark", "getBookmarkByKeyword", "keyword", "", "getNewsByKeyword", "insertNews", "Lio/reactivex/Completable;", "news", "updateBookmarkNews", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsDao.kt */
public interface NewsDao {
    Flowable<List<NewsEntity>> getAllNews();

    Flowable<List<NewsEntity>> getBookmark();

    Flowable<List<NewsEntity>> getBookmarkByKeyword(String str);

    Flowable<List<NewsEntity>> getNewsByKeyword(String str);

    Completable insertNews(List<NewsEntity> list);

    void updateBookmarkNews(NewsEntity newsEntity);
}
