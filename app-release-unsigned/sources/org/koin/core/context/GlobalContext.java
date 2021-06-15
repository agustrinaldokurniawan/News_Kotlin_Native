package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.module.Module;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\fJ\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001f\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0013J4\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001b\u0010\u0014\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u0016¢\u0006\u0002\b\u0017H\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0018\u001a\u00020\bH\u0016J\u001b\u0010\u0019\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/koin/core/context/GlobalContext;", "Lorg/koin/core/context/KoinContext;", "()V", "_koin", "Lorg/koin/core/Koin;", "get", "getOrNull", "loadKoinModules", "", "modules", "", "Lorg/koin/core/module/Module;", "loadKoinModules$koin_core", "module", "register", "koinApplication", "Lorg/koin/core/KoinApplication;", "startKoin", "koinContext", "startKoin$koin_core", "appDeclaration", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "stop", "unloadKoinModules", "unloadKoinModules$koin_core", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: GlobalContext.kt */
public final class GlobalContext implements KoinContext {
    public static final GlobalContext INSTANCE = new GlobalContext();
    private static Koin _koin;

    private GlobalContext() {
    }

    @Override // org.koin.core.context.KoinContext
    public Koin get() {
        Koin koin = _koin;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    @Override // org.koin.core.context.KoinContext
    public Koin getOrNull() {
        return _koin;
    }

    @Override // org.koin.core.context.KoinContext
    public void register(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        if (_koin == null) {
            _koin = koinApplication.getKoin();
            return;
        }
        throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
    }

    @Override // org.koin.core.context.KoinContext
    public void stop() {
        synchronized (this) {
            Koin koin = _koin;
            if (koin != null) {
                koin.close();
            }
            _koin = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ KoinApplication startKoin$koin_core$default(GlobalContext globalContext, KoinContext koinContext, KoinApplication koinApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            koinContext = INSTANCE;
        }
        return globalContext.startKoin$koin_core(koinContext, koinApplication);
    }

    public final KoinApplication startKoin$koin_core(KoinContext koinContext, KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinContext, "koinContext");
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        synchronized (this) {
            koinContext.register(koinApplication);
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication startKoin$koin_core$default(GlobalContext globalContext, KoinContext koinContext, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            koinContext = INSTANCE;
        }
        return globalContext.startKoin$koin_core(koinContext, function1);
    }

    public final KoinApplication startKoin$koin_core(KoinContext koinContext, Function1<? super KoinApplication, Unit> function1) {
        KoinApplication init;
        Intrinsics.checkNotNullParameter(koinContext, "koinContext");
        Intrinsics.checkNotNullParameter(function1, "appDeclaration");
        synchronized (this) {
            init = KoinApplication.Companion.init();
            koinContext.register(init);
            function1.invoke(init);
            init.createEagerInstances();
        }
        return init;
    }

    public final void loadKoinModules$koin_core(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), CollectionsKt.listOf(module), false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void loadKoinModules$koin_core(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), list, false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unloadKoinModules$koin_core(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            Koin.unloadModules$default(INSTANCE.get(), CollectionsKt.listOf(module), false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unloadKoinModules$koin_core(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        synchronized (this) {
            Koin.unloadModules$default(INSTANCE.get(), list, false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
