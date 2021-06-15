package org.koin.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;
import org.koin.core.module.Module;
import org.koin.core.time.MeasureKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\rJ\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0016\"\u00020\u0013¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001dJ\u0014\u0010\u001e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "()V", "koin", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "close", "", "createEagerInstances", "environmentProperties", "fileProperties", "fileName", "", "init", "init$koin_core", "loadModules", "modules", "", "Lorg/koin/core/module/Module;", "logger", "Lorg/koin/core/logger/Logger;", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "printLogger", "level", "Lorg/koin/core/logger/Level;", "properties", "values", "", "unloadModules", "module", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinApplication.kt */
public final class KoinApplication {
    public static final Companion Companion = new Companion(null);
    private final Koin koin;

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final KoinApplication init() {
        return Companion.init();
    }

    public final KoinApplication printLogger() {
        return printLogger$default(this, null, 1, null);
    }

    private KoinApplication() {
        this.koin = new Koin();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final void init$koin_core() {
        this.koin.getScopeRegistry().createRootScopeDefinition$koin_core();
        this.koin.getScopeRegistry().createRootScope$koin_core();
    }

    public final KoinApplication modules(Module module) {
        Intrinsics.checkNotNullParameter(module, "modules");
        return modules(CollectionsKt.listOf(module));
    }

    public final KoinApplication modules(Module... moduleArr) {
        Intrinsics.checkNotNullParameter(moduleArr, "modules");
        return modules(ArraysKt.toList(moduleArr));
    }

    public final KoinApplication modules(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        if (this.koin.getLogger().isAt(Level.INFO)) {
            double measureDuration = MeasureKt.measureDuration(new KoinApplication$modules$duration$1(this, list));
            int size = this.koin.getScopeRegistry().size();
            Logger logger = this.koin.getLogger();
            logger.info("loaded " + size + " definitions - " + measureDuration + " ms");
        } else {
            loadModules(list);
        }
        return this;
    }

    /* access modifiers changed from: private */
    public final void loadModules(List<Module> list) {
        Koin.loadModules$default(this.koin, list, false, 2, null);
    }

    public final KoinApplication properties(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "values");
        this.koin.getPropertyRegistry().saveProperties(map);
        return this;
    }

    public static /* synthetic */ KoinApplication fileProperties$default(KoinApplication koinApplication, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "/koin.properties";
        }
        return koinApplication.fileProperties(str);
    }

    public final KoinApplication fileProperties(String str) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        this.koin.getPropertyRegistry().loadPropertiesFromFile(str);
        return this;
    }

    public final KoinApplication environmentProperties() {
        this.koin.getPropertyRegistry().loadEnvironmentProperties();
        return this;
    }

    public final KoinApplication logger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.koin.setupLogger(logger);
        return this;
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i, Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final KoinApplication printLogger(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return logger(new PrintLogger(level));
    }

    public final KoinApplication createEagerInstances() {
        if (this.koin.getLogger().isAt(Level.DEBUG)) {
            double measureDuration = MeasureKt.measureDuration(new KoinApplication$createEagerInstances$duration$1(this));
            Logger logger = this.koin.getLogger();
            logger.debug("instances started in " + measureDuration + " ms");
        } else {
            this.koin.createEagerInstances$koin_core();
        }
        return this;
    }

    public final void close() {
        this.koin.close();
    }

    public final void unloadModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.koin.getScopeRegistry().unloadModules(module);
    }

    public final void unloadModules(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        this.koin.getScopeRegistry().unloadModules(list);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "()V", "init", "Lorg/koin/core/KoinApplication;", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: KoinApplication.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final KoinApplication init() {
            KoinApplication koinApplication = new KoinApplication(null);
            koinApplication.init$koin_core();
            return koinApplication;
        }
    }
}
