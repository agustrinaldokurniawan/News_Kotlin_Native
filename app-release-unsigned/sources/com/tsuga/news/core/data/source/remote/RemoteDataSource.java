package com.tsuga.news.core.data.source.remote;

import com.tsuga.news.core.data.source.remote.network.ApiResponse;
import com.tsuga.news.core.data.source.remote.network.NewsApiResponse;
import com.tsuga.news.core.data.source.remote.network.NewsApiService;
import com.tsuga.news.core.data.source.remote.response.NewsResponse;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tsuga/news/core/data/source/remote/RemoteDataSource;", "", "newsApiService", "Lcom/tsuga/news/core/data/source/remote/network/NewsApiService;", "(Lcom/tsuga/news/core/data/source/remote/network/NewsApiService;)V", "getAllNews", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/source/remote/network/ApiResponse;", "", "Lcom/tsuga/news/core/data/source/remote/response/NewsResponse;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: RemoteDataSource.kt */
public final class RemoteDataSource {
    private final NewsApiService newsApiService;

    public RemoteDataSource(NewsApiService newsApiService2) {
        Intrinsics.checkNotNullParameter(newsApiService2, "newsApiService");
        this.newsApiService = newsApiService2;
    }

    public final Flowable<ApiResponse<List<NewsResponse>>> getAllNews() {
        PublishSubject create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<ApiResponse<List<NewsResponse>>>()");
        this.newsApiService.getTopHeadlines().subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).take(1).subscribe(new Consumer() {
            /* class com.tsuga.news.core.data.source.remote.$$Lambda$RemoteDataSource$3DHnbH6mGA9Y7qA528NoIymWgxE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RemoteDataSource.m15getAllNews$lambda0(PublishSubject.this, (NewsApiResponse) obj);
            }
        }, new Consumer() {
            /* class com.tsuga.news.core.data.source.remote.$$Lambda$RemoteDataSource$LMpMho7JW0EQGIAobk3O3tHdYn0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RemoteDataSource.m16getAllNews$lambda1(PublishSubject.this, (Throwable) obj);
            }
        });
        Flowable<ApiResponse<List<NewsResponse>>> flowable = create.toFlowable(BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(flowable, "resultData.toFlowable(BackpressureStrategy.BUFFER)");
        return flowable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.tsuga.news.core.data.source.remote.response.NewsResponse] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: getAllNews$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m15getAllNews$lambda0(io.reactivex.subjects.PublishSubject r23, com.tsuga.news.core.data.source.remote.network.NewsApiResponse r24) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.core.data.source.remote.RemoteDataSource.m15getAllNews$lambda0(io.reactivex.subjects.PublishSubject, com.tsuga.news.core.data.source.remote.network.NewsApiResponse):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: getAllNews$lambda-1  reason: not valid java name */
    public static final void m16getAllNews$lambda1(PublishSubject publishSubject, Throwable th) {
        Intrinsics.checkNotNullParameter(publishSubject, "$resultData");
        publishSubject.onNext(new ApiResponse.Error(String.valueOf(th.getMessage())));
    }
}
