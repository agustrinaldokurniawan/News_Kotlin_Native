package org.koin.core.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.NoScopeDefFoundException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\r\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001eJ&\u0010\u001f\u001a\u00020\u00062\n\u0010 \u001a\u00060\u000bj\u0002`\u000f2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001J&\u0010\u001f\u001a\u00020\u00062\n\u0010 \u001a\u00060\u000bj\u0002`\u000f2\u0006\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J(\u0010&\u001a\u00020\u00182\u001e\u0010'\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)`*H\u0002J\u0012\u0010+\u001a\u00020\u00182\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)J\u0016\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0/H\u0002J\u000e\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0006J\u0012\u00100\u001a\u00020\u00182\n\u0010 \u001a\u00060\u000bj\u0002`\u000fJ\u0014\u00102\u001a\u0004\u0018\u00010\u00062\n\u0010 \u001a\u00060\u000bj\u0002`\u000fJ\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0002J\u001b\u00106\u001a\u00020\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u00020508H\u0000¢\u0006\u0002\b9J\u0006\u0010:\u001a\u00020;J\u0014\u0010<\u001a\u00020\u00182\f\u00107\u001a\b\u0012\u0004\u0012\u00020508J\u000e\u0010<\u001a\u00020\u00182\u0006\u00104\u001a\u000205R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\nj\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b`\rX\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\b\u0012\u00060\u000bj\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\nj\u0012\u0012\b\u0012\u00060\u000bj\u0002`\u000f\u0012\u0004\u0012\u00020\u0006`\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006="}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;)V", "_rootScope", "Lorg/koin/core/scope/Scope;", "_rootScopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "_scopeDefinitions", "Ljava/util/HashMap;", "", "Lorg/koin/core/qualifier/QualifierValue;", "Lkotlin/collections/HashMap;", "_scopes", "Lorg/koin/core/scope/ScopeID;", "rootScope", "getRootScope", "()Lorg/koin/core/scope/Scope;", "scopeDefinitions", "", "getScopeDefinitions", "()Ljava/util/Map;", "clearScopes", "", "close", "close$koin_core", "createRootScope", "createRootScope$koin_core", "createRootScopeDefinition", "createRootScopeDefinition$koin_core", "createScope", "scopeId", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "source", "scopeDefinition", "createScopeDefinition", "declareBeanDefinitions", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "declareDefinition", "bean", "declareScopeDefinitions", "scopes", "", "deleteScope", "scope", "getScopeOrNull", "loadModule", "module", "Lorg/koin/core/module/Module;", "loadModules", "modules", "", "loadModules$koin_core", "size", "", "unloadModules", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeRegistry.kt */
public final class ScopeRegistry {
    private final Koin _koin;
    private Scope _rootScope;
    private ScopeDefinition _rootScopeDefinition;
    private final HashMap<String, ScopeDefinition> _scopeDefinitions = new HashMap<>();
    private final HashMap<String, Scope> _scopes = new HashMap<>();

    public ScopeRegistry(Koin koin) {
        Intrinsics.checkNotNullParameter(koin, "_koin");
        this._koin = koin;
    }

    public final Map<String, ScopeDefinition> getScopeDefinitions() {
        return this._scopeDefinitions;
    }

    public final Scope getRootScope() {
        Scope scope = this._rootScope;
        if (scope != null) {
            return scope;
        }
        throw new IllegalStateException("No root scope".toString());
    }

    public final int size() {
        Collection<ScopeDefinition> values = this._scopeDefinitions.values();
        Intrinsics.checkNotNullExpressionValue(values, "_scopeDefinitions.values");
        Collection<ScopeDefinition> collection = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().size$koin_core()));
        }
        return CollectionsKt.sumOfInt(arrayList);
    }

    private final void loadModule(Module module) {
        declareScopeDefinitions(module.getScopes());
        declareBeanDefinitions(module.getDefinitions());
        module.setLoaded(true);
    }

    private final void declareScopeDefinitions(List<? extends Qualifier> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            createScopeDefinition(it.next());
        }
    }

    private final void declareBeanDefinitions(HashSet<BeanDefinition<?>> hashSet) {
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            declareDefinition(it.next());
        }
    }

    public final void declareDefinition(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "bean");
        ScopeDefinition scopeDefinition = this._scopeDefinitions.get(beanDefinition.getScopeQualifier().getValue());
        if (scopeDefinition != null) {
            ScopeDefinition.save$default(scopeDefinition, beanDefinition, false, 2, null);
            Collection<Scope> values = this._scopes.values();
            Intrinsics.checkNotNullExpressionValue(values, "_scopes.values");
            ArrayList<Scope> arrayList = new ArrayList();
            for (T t : values) {
                if (Intrinsics.areEqual(t.get_scopeDefinition(), scopeDefinition)) {
                    arrayList.add(t);
                }
            }
            for (Scope scope : arrayList) {
                scope.loadDefinition(beanDefinition);
            }
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Undeclared scope definition for definition: ", beanDefinition).toString());
    }

    private final void createScopeDefinition(Qualifier qualifier) {
        ScopeDefinition scopeDefinition = new ScopeDefinition(qualifier, false, 2, null);
        if (this._scopeDefinitions.get(qualifier.getValue()) == null) {
            this._scopeDefinitions.put(qualifier.getValue(), scopeDefinition);
        }
    }

    public final void createRootScopeDefinition$koin_core() {
        if (this._rootScopeDefinition == null) {
            ScopeDefinition rootDefinition$koin_core = ScopeDefinition.Companion.rootDefinition$koin_core();
            this._scopeDefinitions.put(ScopeDefinition.Companion.getROOT_SCOPE_QUALIFIER().getValue(), rootDefinition$koin_core);
            this._rootScopeDefinition = rootDefinition$koin_core;
            return;
        }
        throw new IllegalStateException("Try to recreate Root scope definition".toString());
    }

    public final void createRootScope$koin_core() {
        if (this._rootScope == null) {
            this._rootScope = createScope(ScopeDefinition.ROOT_SCOPE_ID, ScopeDefinition.Companion.getROOT_SCOPE_QUALIFIER(), (Object) null);
            return;
        }
        throw new IllegalStateException("Try to recreate Root scope".toString());
    }

    public final Scope getScopeOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        return this._scopes.get(str);
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    public final Scope createScope(String str, Qualifier qualifier, Object obj) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        if (!this._scopes.containsKey(str)) {
            ScopeDefinition scopeDefinition = this._scopeDefinitions.get(qualifier.getValue());
            if (scopeDefinition != null) {
                Scope createScope = createScope(str, scopeDefinition, obj);
                this._scopes.put(str, createScope);
                return createScope;
            }
            throw new NoScopeDefFoundException("No Scope Definition found for qualifer '" + qualifier.getValue() + '\'');
        }
        throw new ScopeAlreadyCreatedException("Scope with id '" + str + "' is already created");
    }

    private final Scope createScope(String str, ScopeDefinition scopeDefinition, Object obj) {
        Scope scope = new Scope(str, scopeDefinition, this._koin);
        scope.set_source(obj);
        Scope scope2 = this._rootScope;
        List<Scope> listOf = scope2 == null ? null : CollectionsKt.listOf(scope2);
        if (listOf == null) {
            listOf = CollectionsKt.emptyList();
        }
        scope.create$koin_core(listOf);
        return scope;
    }

    public final void deleteScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeId");
        this._scopes.remove(str);
    }

    public final void deleteScope(Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.get_scopeDefinition().removeExtras$koin_core();
        this._scopes.remove(scope.getId());
    }

    public final void close$koin_core() {
        clearScopes();
        this._scopes.clear();
        this._scopeDefinitions.clear();
        this._rootScopeDefinition = null;
        this._rootScope = null;
    }

    private final void clearScopes() {
        Collection<Scope> values = this._scopes.values();
        Intrinsics.checkNotNullExpressionValue(values, "_scopes.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().clear$koin_core();
        }
    }

    public final void unloadModules(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        for (T t : module.getDefinitions()) {
            ScopeDefinition scopeDefinition = this._scopeDefinitions.get(t.getScopeQualifier().getValue());
            if (scopeDefinition != null) {
                scopeDefinition.unloadDefinition$koin_core(t);
                Collection<Scope> values = this._scopes.values();
                Intrinsics.checkNotNullExpressionValue(values, "_scopes.values");
                ArrayList<Scope> arrayList = new ArrayList();
                for (T t2 : values) {
                    if (Intrinsics.areEqual(t2.get_scopeDefinition().getQualifier(), scopeDefinition.getQualifier())) {
                        arrayList.add(t2);
                    }
                }
                for (Scope scope : arrayList) {
                    scope.dropInstance(t);
                }
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Can't find scope for definition ", t).toString());
            }
        }
        module.setLoaded(false);
    }

    public final void loadModules$koin_core(Iterable<Module> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "modules");
        for (Module module : iterable) {
            if (!module.isLoaded()) {
                loadModule(module);
            } else {
                Logger logger = this._koin.getLogger();
                logger.error("module '" + module + "' already loaded!");
            }
        }
    }

    public final void unloadModules(Iterable<Module> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "modules");
        for (Module module : iterable) {
            unloadModules(module);
        }
    }
}
