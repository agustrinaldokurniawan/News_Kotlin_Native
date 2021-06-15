package com.tsuga.news.core.data;

import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.core.data.source.remote.network.ApiResponse;
import com.tsuga.news.core.data.source.remote.response.NewsResponse;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.utils.AppExecutors;
import com.tsuga.news.core.utils.DataMapper;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00070\u0006H\u0014J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0014J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0014J\u0018\u0010\f\u001a\u00020\r2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u000e"}, d2 = {"com/tsuga/news/core/data/NewsRepository$getAllNews$1", "Lcom/tsuga/news/core/data/NetworkBoundResource;", "", "Lcom/tsuga/news/core/domain/model/News;", "Lcom/tsuga/news/core/data/source/remote/response/NewsResponse;", "createCall", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/source/remote/network/ApiResponse;", "loadFromDB", "saveCallResult", "", ReadNewsActivity.DATA, "shouldFetch", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsRepository.kt */
public final class NewsRepository$getAllNews$1 extends NetworkBoundResource<List<? extends News>, List<? extends NewsResponse>> {
    final /* synthetic */ NewsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewsRepository$getAllNews$1(NewsRepository newsRepository, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = newsRepository;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.tsuga.news.core.data.NetworkBoundResource
    public /* bridge */ /* synthetic */ void saveCallResult(List<? extends NewsResponse> list) {
        saveCallResult((List<NewsResponse>) list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.tsuga.news.core.data.NetworkBoundResource
    public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends News> list) {
        return shouldFetch((List<News>) list);
    }

    /* access modifiers changed from: protected */
    public boolean shouldFetch(List<News> list) {
        return list == null || list.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: loadFromDB$lambda-0  reason: not valid java name */
    public static final List m14loadFromDB$lambda0(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return DataMapper.INSTANCE.mapEntitiesToDomain(list);
    }

    /* Return type fixed from 'io.reactivex.Flowable<java.util.List<com.tsuga.news.core.domain.model.News>>' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.tsuga.news.core.data.NetworkBoundResource
    public Flowable<List<? extends News>> loadFromDB() {
        Flowable<R> map = this.this$0.localDataSource.getAllNews().map($$Lambda$NewsRepository$getAllNews$1$isPVopV1vPru4Fc45vCdIjWrQZo.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(map, "localDataSource.getAllNews().map { DataMapper.mapEntitiesToDomain(it) }");
        return map;
    }

    /* Return type fixed from 'io.reactivex.Flowable<com.tsuga.news.core.data.source.remote.network.ApiResponse<java.util.List<com.tsuga.news.core.data.source.remote.response.NewsResponse>>>' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.tsuga.news.core.data.NetworkBoundResource
    public Flowable<ApiResponse<List<? extends NewsResponse>>> createCall() {
        return this.this$0.remoteDataSource.getAllNews();
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(List<NewsResponse> list) {
        Intrinsics.checkNotNullParameter(list, ReadNewsActivity.DATA);
        this.this$0.localDataSource.insertNews(DataMapper.INSTANCE.mapResponsesToEntities(list)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
    }
}
