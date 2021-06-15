package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Options;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.KoinScopeComponent;
import org.koin.core.scope.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.core.scope.ScopeDefinition$declareNewDefinition$beanDefinition$1;

public final class Koin {
    private Logger logger = new EmptyLogger();
    private final HashSet<Module> modules = new HashSet<>();
    private final PropertyRegistry propertyRegistry = new PropertyRegistry(this);
    private final ScopeRegistry scopeRegistry = new ScopeRegistry(this);

    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    public static /* synthetic */ void getScopeRegistry$annotations() {
    }

    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final void setupLogger(Logger logger2) {
        Intrinsics.checkNotNullParameter(logger2, "logger");
        this.logger = logger2;
    }

    public static /* synthetic */ Lazy inject$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ Object get(Qualifier qualifier, Function0 function0) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ Object getOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ Object getOrNull(Qualifier qualifier, Function0 function0) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.Koin */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.get(kClass, qualifier, function0);
    }

    public final <T> T get(KClass<T> kClass, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) this.scopeRegistry.getRootScope().get(kClass, qualifier, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.Koin */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.getOrNull(kClass, qualifier, function0);
    }

    public final <T> T getOrNull(KClass<T> kClass, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) this.scopeRegistry.getRootScope().getOrNull(kClass, qualifier, function0);
    }

    public static /* synthetic */ void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z, int i, Object obj2) {
        T t = null;
        Qualifier qualifier2 = (i & 2) != 0 ? null : qualifier;
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        List listOf = CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(Object.class));
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        List<? extends KClass<?>> plus = CollectionsKt.plus((Collection) listOf, (Iterable) list);
        synchronized (rootScope) {
            try {
                ScopeDefinition scopeDefinition = rootScope.get_scopeDefinition();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                Iterator<T> it = scopeDefinition.getDefinitions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.is(orCreateKotlinClass, qualifier2, scopeDefinition.getQualifier())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (z) {
                        scopeDefinition.remove(t2);
                    } else {
                        throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
                    }
                }
                BeanDefinition<?> createSingle = Definitions.INSTANCE.createSingle(orCreateKotlinClass, qualifier2, new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj), new Options(false, z, true), plus == null ? CollectionsKt.emptyList() : plus, scopeDefinition.getQualifier());
                scopeDefinition.save(createSingle, z);
                rootScope.getInstanceRegistry().saveDefinition(createSingle, true);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final /* synthetic */ void declare(Object obj, Qualifier qualifier, List list, boolean z) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        List listOf = CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(Object.class));
        Scope rootScope = getScopeRegistry().getRootScope();
        List<? extends KClass<?>> plus = CollectionsKt.plus((Collection) listOf, (Iterable) list);
        synchronized (rootScope) {
            try {
                ScopeDefinition scopeDefinition = rootScope.get_scopeDefinition();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                Iterator<T> it = scopeDefinition.getDefinitions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t.is(orCreateKotlinClass, qualifier, scopeDefinition.getQualifier())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (z) {
                        scopeDefinition.remove(t2);
                    } else {
                        throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
                    }
                }
                Definitions definitions = Definitions.INSTANCE;
                ScopeDefinition$declareNewDefinition$beanDefinition$1 scopeDefinition$declareNewDefinition$beanDefinition$1 = new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj);
                Options options = new Options(false, z, true);
                if (plus == null) {
                    plus = CollectionsKt.emptyList();
                }
                BeanDefinition<?> createSingle = definitions.createSingle(orCreateKotlinClass, qualifier, scopeDefinition$declareNewDefinition$beanDefinition$1, options, plus, scopeDefinition.getQualifier());
                scopeDefinition.save(createSingle, z);
                rootScope.getInstanceRegistry().saveDefinition(createSingle, true);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final /* synthetic */ List getAll() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static /* synthetic */ Object bind$default(Koin koin, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "P");
        return rootScope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    public final /* synthetic */ Object bind(Function0 function0) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "P");
        return rootScope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: org.koin.core.Koin */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object bind$default(Koin koin, KClass kClass, KClass kClass2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.bind(kClass, kClass2, function0);
    }

    public final <S> S bind(KClass<?> kClass, KClass<?> kClass2, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "primaryType");
        Intrinsics.checkNotNullParameter(kClass2, "secondaryType");
        return (S) this.scopeRegistry.getRootScope().bind(kClass, kClass2, function0);
    }

    public final void createEagerInstances$koin_core() {
        this.scopeRegistry.getRootScope().createEagerInstances$koin_core();
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public final Scope createScope(String str, Qualifier qualifier, Object obj) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        if (this.logger.isAt(Level.DEBUG)) {
            Logger logger2 = this.logger;
            logger2.debug("!- create scope - id:'" + str + "' q:" + qualifier);
        }
        return this.scopeRegistry.createScope(str, qualifier, obj);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        if (koin.getLogger().isAt(Level.DEBUG)) {
            Logger logger2 = koin.getLogger();
            logger2.debug("!- create scope - id:'" + str + "' q:" + typeQualifier);
        }
        return koin.getScopeRegistry().createScope(str, typeQualifier, obj);
    }

    public final /* synthetic */ Scope createScope(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        if (getLogger().isAt(Level.DEBUG)) {
            Logger logger2 = getLogger();
            logger2.debug("!- create scope - id:'" + str + "' q:" + typeQualifier);
        }
        return getScopeRegistry().createScope(str, typeQualifier, obj);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str = uuid;
        }
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        if (koin.getLogger().isAt(Level.DEBUG)) {
            Logger logger2 = koin.getLogger();
            logger2.debug("!- create scope - id:'" + str + "' q:" + typeQualifier);
        }
        return koin.getScopeRegistry().createScope(str, typeQualifier, (Object) null);
    }

    public final /* synthetic */ Scope createScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        if (getLogger().isAt(Level.DEBUG)) {
            Logger logger2 = getLogger();
            logger2.debug("!- create scope - id:'" + str + "' q:" + typeQualifier);
        }
        return getScopeRegistry().createScope(str, typeQualifier, (Object) null);
    }

    public final <T extends KoinScopeComponent> Scope createScope(T t) {
        Intrinsics.checkNotNullParameter(t, "t");
        String scopeId = KoinScopeComponentKt.getScopeId(t);
        TypeQualifier scopeName = KoinScopeComponentKt.getScopeName(t);
        if (this.logger.isAt(Level.DEBUG)) {
            Logger logger2 = this.logger;
            logger2.debug("!- create scope - id:'" + scopeId + "' q:" + scopeName);
        }
        return this.scopeRegistry.createScope(scopeId, scopeName, (Object) null);
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    public final Scope getOrCreateScope(String str, Qualifier qualifier, Object obj) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(str);
        return scopeOrNull == null ? createScope(str, qualifier, obj) : scopeOrNull;
    }

    public final /* synthetic */ Scope getOrCreateScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = getScopeRegistry().getScopeOrNull(str);
        return scopeOrNull == null ? createScope$default(this, str, typeQualifier, null, 4, null) : scopeOrNull;
    }

    public final Scope getScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(str);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException("No scope found for id '" + str + '\'');
    }

    public final Scope getScopeOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        return this.scopeRegistry.getScopeOrNull(str);
    }

    public final void deleteScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        this.scopeRegistry.deleteScope(str);
    }

    public final <T> T getProperty(String str, T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(t, "defaultValue");
        T t2 = (T) this.propertyRegistry.getProperty(str);
        return t2 == null ? t : t2;
    }

    public final <T> T getProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return (T) this.propertyRegistry.getProperty(str);
    }

    public final void setProperty(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(obj, "value");
        this.propertyRegistry.saveProperty$koin_core(str, obj);
    }

    public final void deleteProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.propertyRegistry.deleteProperty(str);
    }

    public final void close() {
        Iterator<T> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().setLoaded(false);
        }
        this.modules.clear();
        this.scopeRegistry.close$koin_core();
        this.propertyRegistry.close();
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        koin.loadModules(list, z);
    }

    public final void loadModules(List<Module> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "modules");
        this.modules.addAll(list);
        this.scopeRegistry.loadModules$koin_core(list);
        if (z) {
            createEagerInstances$koin_core();
        }
    }

    public static /* synthetic */ void unloadModules$default(Koin koin, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        koin.unloadModules(list, z);
    }

    public final void unloadModules(List<Module> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "modules");
        this.scopeRegistry.unloadModules(list);
        this.modules.removeAll(list);
        if (z) {
            createEagerInstances$koin_core();
        }
    }

    public final /* synthetic */ Lazy inject() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$default$3(rootScope, null, null));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$default$2(rootScope, qualifier, null));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$default$1(rootScope, qualifier, null));
    }

    public final /* synthetic */ Lazy injectOrNull() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$default$3(rootScope, null, null));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$default$2(rootScope, qualifier, null));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$default$1(rootScope, qualifier, null));
    }

    public final /* synthetic */ Object get() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), (Qualifier) null, (Function0<? extends DefinitionParameters>) null);
    }

    public final /* synthetic */ Object get(Qualifier qualifier) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<? extends DefinitionParameters>) null);
    }

    public final /* synthetic */ Object getOrNull() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    public final /* synthetic */ Object getOrNull(Qualifier qualifier) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }
}
