package com.tsuga.news.core.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tsuga/news/core/utils/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "networkIO", "mainThread", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "Companion", "MainThreadExecutor", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: AppExecutors.kt */
public final class AppExecutors {
    public static final Companion Companion = new Companion(null);
    private static final int THREAD_COUNT = 3;
    private final Executor diskIO;
    private final Executor mainThread;
    private final Executor networkIO;

    public AppExecutors(Executor executor, Executor executor2, Executor executor3) {
        Intrinsics.checkNotNullParameter(executor, "diskIO");
        Intrinsics.checkNotNullParameter(executor2, "networkIO");
        Intrinsics.checkNotNullParameter(executor3, "mainThread");
        this.diskIO = executor;
        this.networkIO = executor2;
        this.mainThread = executor3;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/core/utils/AppExecutors$Companion;", "", "()V", "THREAD_COUNT", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: AppExecutors.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppExecutors() {
        /*
            r3 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r1 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r1 = 3
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            java.lang.String r2 = "newFixedThreadPool(THREAD_COUNT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.tsuga.news.core.utils.AppExecutors$MainThreadExecutor r2 = new com.tsuga.news.core.utils.AppExecutors$MainThreadExecutor
            r2.<init>()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.core.utils.AppExecutors.<init>():void");
    }

    public final Executor diskIO() {
        return this.diskIO;
    }

    public final Executor networkIO() {
        return this.networkIO;
    }

    public final Executor mainThread() {
        return this.mainThread;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tsuga/news/core/utils/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: AppExecutors.kt */
    public static final class MainThreadExecutor implements Executor {
        private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "command");
            this.mainThreadHandler.post(runnable);
        }
    }
}
