package com.tsuga.news;

import android.app.Application;
import kotlin.Metadata;
import org.koin.core.context.GlobalContextExtKt;
import org.koin.core.context.KoinContext;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/MyApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: MyApplication.kt */
public final class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        GlobalContextExtKt.startKoin$default((KoinContext) null, new MyApplication$onCreate$1(this), 1, (Object) null);
    }
}
