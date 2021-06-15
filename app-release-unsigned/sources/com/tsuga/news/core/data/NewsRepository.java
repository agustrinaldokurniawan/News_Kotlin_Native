package com.tsuga.news.core.data;

import com.tsuga.news.core.data.source.local.LocalDataSource;
import com.tsuga.news.core.data.source.local.entity.NewsEntity;
import com.tsuga.news.core.data.source.remote.RemoteDataSource;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.domain.repository.INewsRepository;
import com.tsuga.news.core.utils.AppExecutors;
import com.tsuga.news.core.utils.DataMapper;
import io.reactivex.Flowable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tsuga/news/core/data/NewsRepository;", "Lcom/tsuga/news/core/domain/repository/INewsRepository;", "remoteDataSource", "Lcom/tsuga/news/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/tsuga/news/core/data/source/local/LocalDataSource;", "executors", "Lcom/tsuga/news/core/utils/AppExecutors;", "(Lcom/tsuga/news/core/data/source/remote/RemoteDataSource;Lcom/tsuga/news/core/data/source/local/LocalDataSource;Lcom/tsuga/news/core/utils/AppExecutors;)V", "getAllNews", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/Resource;", "", "Lcom/tsuga/news/core/domain/model/News;", "getBookmarkByKeyword", "keyword", "", "getFavoriteNews", "getNewsByKeyword", "setBookmarkNews", "", "news", "state", "", "Companion", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsRepository.kt */
public final class NewsRepository implements INewsRepository {
    public static final Companion Companion = new Companion(null);
    private static volatile NewsRepository instance;
    private final AppExecutors executors;
    private final LocalDataSource localDataSource;
    private final RemoteDataSource remoteDataSource;

    public NewsRepository(RemoteDataSource remoteDataSource2, LocalDataSource localDataSource2, AppExecutors appExecutors) {
        Intrinsics.checkNotNullParameter(remoteDataSource2, "remoteDataSource");
        Intrinsics.checkNotNullParameter(localDataSource2, "localDataSource");
        Intrinsics.checkNotNullParameter(appExecutors, "executors");
        this.remoteDataSource = remoteDataSource2;
        this.localDataSource = localDataSource2;
        this.executors = appExecutors;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tsuga/news/core/data/NewsRepository$Companion;", "", "()V", "instance", "Lcom/tsuga/news/core/data/NewsRepository;", "getInstance", "remoteDataSource", "Lcom/tsuga/news/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/tsuga/news/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/tsuga/news/core/utils/AppExecutors;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: NewsRepository.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NewsRepository getInstance(RemoteDataSource remoteDataSource, LocalDataSource localDataSource, AppExecutors appExecutors) {
            Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
            Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
            Intrinsics.checkNotNullParameter(appExecutors, "appExecutors");
            NewsRepository newsRepository = NewsRepository.instance;
            if (newsRepository == null) {
                synchronized (this) {
                    newsRepository = NewsRepository.instance;
                    if (newsRepository == null) {
                        newsRepository = new NewsRepository(remoteDataSource, localDataSource, appExecutors);
                    }
                }
            }
            return newsRepository;
        }
    }

    @Override // com.tsuga.news.core.domain.repository.INewsRepository
    public Flowable<Resource<List<News>>> getAllNews() {
        return new NewsRepository$getAllNews$1(this, this.executors).asFlowable();
    }

    /* access modifiers changed from: private */
    /* renamed from: getFavoriteNews$lambda-0  reason: not valid java name */
    public static final List m10getFavoriteNews$lambda0(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return DataMapper.INSTANCE.mapEntitiesToDomain(list);
    }

    @Override // com.tsuga.news.core.domain.repository.INewsRepository
    public Flowable<List<News>> getFavoriteNews() {
        Flowable<R> map = this.localDataSource.getBookmarkNews().map($$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(map, "localDataSource.getBookmarkNews().map { DataMapper.mapEntitiesToDomain(it) }");
        return map;
    }

    @Override // com.tsuga.news.core.domain.repository.INewsRepository
    public void setBookmarkNews(News news, boolean z) {
        Intrinsics.checkNotNullParameter(news, "news");
        this.executors.diskIO().execute(new Runnable(DataMapper.INSTANCE.mapDomainToEntity(news), z) {
            /* class com.tsuga.news.core.data.$$Lambda$NewsRepository$WwppdI9IGggIhVAYDfKJrze6Ct4 */
            public final /* synthetic */ NewsEntity f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                NewsRepository.m13setBookmarkNews$lambda1(NewsRepository.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: setBookmarkNews$lambda-1  reason: not valid java name */
    public static final void m13setBookmarkNews$lambda1(NewsRepository newsRepository, NewsEntity newsEntity, boolean z) {
        Intrinsics.checkNotNullParameter(newsRepository, "this$0");
        Intrinsics.checkNotNullParameter(newsEntity, "$newsEntity");
        newsRepository.localDataSource.setBookmarkNews(newsEntity, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: getNewsByKeyword$lambda-2  reason: not valid java name */
    public static final List m11getNewsByKeyword$lambda2(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return DataMapper.INSTANCE.mapEntitiesToDomain(list);
    }

    @Override // com.tsuga.news.core.domain.repository.INewsRepository
    public Flowable<List<News>> getNewsByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        Flowable<R> map = this.localDataSource.getNewsByKeyword(str).map($$Lambda$NewsRepository$ghQIrpzLG8kVa6W9l9DlzKttXM.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(map, "localDataSource.getNewsByKeyword(keyword).map { DataMapper.mapEntitiesToDomain(it) }");
        return map;
    }

    @Override // com.tsuga.news.core.domain.repository.INewsRepository
    public Flowable<List<News>> getBookmarkByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        Flowable<R> map = this.localDataSource.getBookmarkByKeyword(str).map($$Lambda$NewsRepository$Hb9CdmtFN0seFSyReN66iDtpVbY.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(map, "localDataSource.getBookmarkByKeyword(keyword)\n            .map { DataMapper.mapEntitiesToDomain(it) }");
        return map;
    }

    /* access modifiers changed from: private */
    /* renamed from: getBookmarkByKeyword$lambda-3  reason: not valid java name */
    public static final List m9getBookmarkByKeyword$lambda3(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return DataMapper.INSTANCE.mapEntitiesToDomain(list);
    }
}
