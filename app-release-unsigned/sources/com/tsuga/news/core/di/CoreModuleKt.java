package com.tsuga.news.core.di;

import kotlin.Metadata;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"databaseModule", "Lorg/koin/core/module/Module;", "getDatabaseModule", "()Lorg/koin/core/module/Module;", "networkModule", "getNetworkModule", "repositoryModule", "getRepositoryModule", "core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: CoreModule.kt */
public final class CoreModuleKt {
    private static final Module databaseModule = ModuleKt.module$default(false, false, CoreModuleKt$databaseModule$1.INSTANCE, 3, null);
    private static final Module networkModule = ModuleKt.module$default(false, false, CoreModuleKt$networkModule$1.INSTANCE, 3, null);
    private static final Module repositoryModule = ModuleKt.module$default(false, false, CoreModuleKt$repositoryModule$1.INSTANCE, 3, null);

    public static final Module getDatabaseModule() {
        return databaseModule;
    }

    public static final Module getNetworkModule() {
        return networkModule;
    }

    public static final Module getRepositoryModule() {
        return repositoryModule;
    }
}
