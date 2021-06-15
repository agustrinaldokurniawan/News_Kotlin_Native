package com.tsuga.news.core.data;

import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.data.source.remote.network.ApiResponse;
import com.tsuga.news.core.utils.AppExecutors;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000eH$J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH$J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \f*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tsuga/news/core/data/NetworkBoundResource;", "ResultType", "RequestType", "", "mExecutors", "Lcom/tsuga/news/core/utils/AppExecutors;", "(Lcom/tsuga/news/core/utils/AppExecutors;)V", "mCompleteDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "result", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tsuga/news/core/data/Resource;", "kotlin.jvm.PlatformType", "asFlowable", "Lio/reactivex/Flowable;", "createCall", "Lcom/tsuga/news/core/data/source/remote/network/ApiResponse;", "fetchFromNetwork", "", "loadFromDB", "onFetchFailed", "saveCallResult", ReadNewsActivity.DATA, "(Ljava/lang/Object;)V", "shouldFetch", "", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NetworkBoundResource.kt */
public abstract class NetworkBoundResource<ResultType, RequestType> {
    private final CompositeDisposable mCompleteDisposable;
    private final AppExecutors mExecutors;
    private final PublishSubject<Resource<ResultType>> result;

    /* access modifiers changed from: protected */
    public abstract Flowable<ApiResponse<RequestType>> createCall();

    /* access modifiers changed from: protected */
    public abstract Flowable<ResultType> loadFromDB();

    /* access modifiers changed from: protected */
    public void onFetchFailed() {
    }

    /* access modifiers changed from: protected */
    public abstract void saveCallResult(RequestType requesttype);

    /* access modifiers changed from: protected */
    public abstract boolean shouldFetch(ResultType resulttype);

    public NetworkBoundResource(AppExecutors appExecutors) {
        Intrinsics.checkNotNullParameter(appExecutors, "mExecutors");
        this.mExecutors = appExecutors;
        PublishSubject<Resource<ResultType>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<Resource<ResultType>>()");
        this.result = create;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.mCompleteDisposable = compositeDisposable;
        Flowable<ResultType> loadFromDB = loadFromDB();
        compositeDisposable.add(loadFromDB.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).take(1).subscribe(new Consumer(this) {
            /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$EUzLJ3rJfGmOMnyHNm1kZKiW6M */
            public final /* synthetic */ NetworkBoundResource f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetworkBoundResource.m7lambda$EUzLJ3rJfGmOMnyHNm1kZKiW6M(Flowable.this, this.f$1, obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m0_init_$lambda0(Flowable flowable, NetworkBoundResource networkBoundResource, Object obj) {
        Intrinsics.checkNotNullParameter(flowable, "$dbSource");
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        flowable.unsubscribeOn(Schedulers.io());
        if (networkBoundResource.shouldFetch(obj)) {
            networkBoundResource.fetchFromNetwork();
        } else {
            networkBoundResource.result.onNext(new Resource.Success(obj));
        }
    }

    private final void fetchFromNetwork() {
        Flowable<ApiResponse<RequestType>> createCall = createCall();
        this.result.onNext(new Resource.Loading(null));
        this.mCompleteDisposable.add(createCall.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).take(1).doOnComplete(new Action() {
            /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$Jms3KvRrW2h2IfRs3145L3AZYQ */

            @Override // io.reactivex.functions.Action
            public final void run() {
                NetworkBoundResource.m8lambda$Jms3KvRrW2h2IfRs3145L3AZYQ(NetworkBoundResource.this);
            }
        }).subscribe(new Consumer() {
            /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$d_PMwGs10wxXvY3TNOS7F5dCvfI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetworkBoundResource.lambda$d_PMwGs10wxXvY3TNOS7F5dCvfI(NetworkBoundResource.this, (ApiResponse) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchFromNetwork$lambda-1  reason: not valid java name */
    public static final void m1fetchFromNetwork$lambda1(NetworkBoundResource networkBoundResource) {
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        networkBoundResource.mCompleteDisposable.dispose();
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchFromNetwork$lambda-5  reason: not valid java name */
    public static final void m2fetchFromNetwork$lambda5(NetworkBoundResource networkBoundResource, ApiResponse apiResponse) {
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        if (apiResponse instanceof ApiResponse.Success) {
            networkBoundResource.mExecutors.diskIO().execute(new Runnable(apiResponse) {
                /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$yTNHJ7l9SEc6u6IYGQMWHSM0TmY */
                public final /* synthetic */ ApiResponse f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    NetworkBoundResource.lambda$yTNHJ7l9SEc6u6IYGQMWHSM0TmY(NetworkBoundResource.this, this.f$1);
                }
            });
        } else if (apiResponse instanceof ApiResponse.Empty) {
            Flowable<ResultType> loadFromDB = networkBoundResource.loadFromDB();
            loadFromDB.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).take(1).subscribe(new Consumer(networkBoundResource) {
                /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$eCkhitiKxss4xrBZmHHkE5KQi7E */
                public final /* synthetic */ NetworkBoundResource f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NetworkBoundResource.lambda$eCkhitiKxss4xrBZmHHkE5KQi7E(Flowable.this, this.f$1, obj);
                }
            });
        } else if (apiResponse instanceof ApiResponse.Error) {
            networkBoundResource.onFetchFailed();
            networkBoundResource.result.onNext(new Resource.Error(((ApiResponse.Error) apiResponse).getErrorMessage(), null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.tsuga.news.core.data.NetworkBoundResource */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: fetchFromNetwork$lambda-5$lambda-3  reason: not valid java name */
    public static final void m3fetchFromNetwork$lambda5$lambda3(NetworkBoundResource networkBoundResource, ApiResponse apiResponse) {
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        networkBoundResource.saveCallResult(((ApiResponse.Success) apiResponse).getData());
        Flowable loadFromDB = networkBoundResource.loadFromDB();
        loadFromDB.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).take(1).subscribe(new Consumer(networkBoundResource) {
            /* class com.tsuga.news.core.data.$$Lambda$NetworkBoundResource$5e481wUPLbfaJEEuj5D28ZH1lM */
            public final /* synthetic */ NetworkBoundResource f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetworkBoundResource.m6lambda$5e481wUPLbfaJEEuj5D28ZH1lM(Flowable.this, this.f$1, obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchFromNetwork$lambda-5$lambda-3$lambda-2  reason: not valid java name */
    public static final void m4fetchFromNetwork$lambda5$lambda3$lambda2(Flowable flowable, NetworkBoundResource networkBoundResource, Object obj) {
        Intrinsics.checkNotNullParameter(flowable, "$dbSource");
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        flowable.unsubscribeOn(Schedulers.io());
        networkBoundResource.result.onNext(new Resource.Success(obj));
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchFromNetwork$lambda-5$lambda-4  reason: not valid java name */
    public static final void m5fetchFromNetwork$lambda5$lambda4(Flowable flowable, NetworkBoundResource networkBoundResource, Object obj) {
        Intrinsics.checkNotNullParameter(flowable, "$dbSource");
        Intrinsics.checkNotNullParameter(networkBoundResource, "this$0");
        flowable.unsubscribeOn(Schedulers.io());
        networkBoundResource.result.onNext(new Resource.Success(obj));
    }

    public final Flowable<Resource<ResultType>> asFlowable() {
        Flowable<Resource<ResultType>> flowable = this.result.toFlowable(BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(flowable, "result.toFlowable(BackpressureStrategy.BUFFER)");
        return flowable;
    }
}
