package com.tsuga.news;

import com.tsuga.news.core.di.CoreModuleKt;
import com.tsuga.news.di.AppModuleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lorg/koin/core/KoinApplication;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: MyApplication.kt */
final class MyApplication$onCreate$1 extends Lambda implements Function1<KoinApplication, Unit> {
    final /* synthetic */ MyApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MyApplication$onCreate$1(MyApplication myApplication) {
        super(1);
        this.this$0 = myApplication;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KoinApplication koinApplication) {
        invoke(koinApplication);
        return Unit.INSTANCE;
    }

    public final void invoke(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "$this$startKoin");
        KoinExtKt.androidLogger(koinApplication, Level.NONE);
        KoinExtKt.androidContext(koinApplication, this.this$0);
        koinApplication.modules(CollectionsKt.listOf((Object[]) new Module[]{CoreModuleKt.getDatabaseModule(), CoreModuleKt.getNetworkModule(), CoreModuleKt.getRepositoryModule(), AppModuleKt.getUseCaseModule(), AppModuleKt.getViewModelModule()}));
    }
}
