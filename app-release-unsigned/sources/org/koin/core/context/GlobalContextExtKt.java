package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u001a-\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fj\u0002`\r¢\u0006\u0002\b\u000e\u001a\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"loadKoinModules", "", "modules", "", "Lorg/koin/core/module/Module;", "module", "startKoin", "Lorg/koin/core/KoinApplication;", "koinContext", "Lorg/koin/core/context/KoinContext;", "koinApplication", "appDeclaration", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "stopKoin", "unloadKoinModules", "koin-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: GlobalContextExt.kt */
public final class GlobalContextExtKt {
    public static /* synthetic */ KoinApplication startKoin$default(KoinContext koinContext, KoinApplication koinApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            koinContext = GlobalContext.INSTANCE;
        }
        return startKoin(koinContext, koinApplication);
    }

    public static final KoinApplication startKoin(KoinContext koinContext, KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinContext, "koinContext");
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        return GlobalContext.INSTANCE.startKoin$koin_core(koinContext, koinApplication);
    }

    public static /* synthetic */ KoinApplication startKoin$default(KoinContext koinContext, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            koinContext = GlobalContext.INSTANCE;
        }
        return startKoin(koinContext, function1);
    }

    public static final KoinApplication startKoin(KoinContext koinContext, Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(koinContext, "koinContext");
        Intrinsics.checkNotNullParameter(function1, "appDeclaration");
        return GlobalContext.INSTANCE.startKoin$koin_core(koinContext, function1);
    }

    public static final void stopKoin() {
        GlobalContext.INSTANCE.stop();
    }

    public static final void loadKoinModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        GlobalContext.INSTANCE.loadKoinModules$koin_core(module);
    }

    public static final void loadKoinModules(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        GlobalContext.INSTANCE.loadKoinModules$koin_core(list);
    }

    public static final void unloadKoinModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        GlobalContext.INSTANCE.unloadKoinModules$koin_core(module);
    }

    public static final void unloadKoinModules(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        GlobalContext.INSTANCE.unloadKoinModules$koin_core(list);
    }
}
