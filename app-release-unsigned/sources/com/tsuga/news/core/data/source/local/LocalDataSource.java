package com.tsuga.news.core.data.source.local;

import com.tsuga.news.core.data.source.local.entity.NewsEntity;
import com.tsuga.news.core.data.source.local.room.NewsDao;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tsuga/news/core/data/source/local/LocalDataSource;", "", "newsDao", "Lcom/tsuga/news/core/data/source/local/room/NewsDao;", "(Lcom/tsuga/news/core/data/source/local/room/NewsDao;)V", "getAllNews", "Lio/reactivex/Flowable;", "", "Lcom/tsuga/news/core/data/source/local/entity/NewsEntity;", "getBookmarkByKeyword", "keyword", "", "getBookmarkNews", "getNewsByKeyword", "insertNews", "Lio/reactivex/Completable;", "newsList", "setBookmarkNews", "", "newsEntity", "newState", "", "Companion", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: LocalDataSource.kt */
public final class LocalDataSource {
    public static final Companion Companion = new Companion(null);
    private static LocalDataSource instance;
    private final NewsDao newsDao;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/core/data/source/local/LocalDataSource$Companion;", "", "()V", "instance", "Lcom/tsuga/news/core/data/source/local/LocalDataSource;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: LocalDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LocalDataSource(NewsDao newsDao2) {
        Intrinsics.checkNotNullParameter(newsDao2, "newsDao");
        this.newsDao = newsDao2;
    }

    public final Flowable<List<NewsEntity>> getAllNews() {
        return this.newsDao.getAllNews();
    }

    public final Flowable<List<NewsEntity>> getBookmarkNews() {
        return this.newsDao.getBookmark();
    }

    public final Flowable<List<NewsEntity>> getNewsByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        NewsDao newsDao2 = this.newsDao;
        return newsDao2.getNewsByKeyword('%' + str + '%');
    }

    public final Completable insertNews(List<NewsEntity> list) {
        Intrinsics.checkNotNullParameter(list, "newsList");
        return this.newsDao.insertNews(list);
    }

    public final void setBookmarkNews(NewsEntity newsEntity, boolean z) {
        Intrinsics.checkNotNullParameter(newsEntity, "newsEntity");
        newsEntity.setBookmark(z);
        this.newsDao.updateBookmarkNews(newsEntity);
    }

    public final Flowable<List<NewsEntity>> getBookmarkByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        NewsDao newsDao2 = this.newsDao;
        return newsDao2.getBookmarkByKeyword('%' + str + '%');
    }
}
