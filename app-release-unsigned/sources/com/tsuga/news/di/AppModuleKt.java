package com.tsuga.news.di;

import kotlin.Metadata;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"useCaseModule", "Lorg/koin/core/module/Module;", "getUseCaseModule", "()Lorg/koin/core/module/Module;", "viewModelModule", "getViewModelModule", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: AppModule.kt */
public final class AppModuleKt {
    private static final Module useCaseModule = ModuleKt.module$default(false, false, AppModuleKt$useCaseModule$1.INSTANCE, 3, null);
    private static final Module viewModelModule = ModuleKt.module$default(false, false, AppModuleKt$viewModelModule$1.INSTANCE, 3, null);

    public static final Module getUseCaseModule() {
        return useCaseModule;
    }

    public static final Module getViewModelModule() {
        return viewModelModule;
    }
}
