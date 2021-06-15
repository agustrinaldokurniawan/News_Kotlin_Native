package org.koin.core.module;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.ScopeDefinition;
import org.koin.dsl.ScopeDSL;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J[\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\n\"\u0006\b\u0000\u0010!\u0018\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010#\u001a#\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002H!0$j\b\u0012\u0004\u0012\u0002H!`'¢\u0006\u0002\b(H\bø\u0001\u0000J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u0003J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00000-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000-H\u0002J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00000-2\u0006\u0010/\u001a\u00020\u0000H\u0002J'\u00100\u001a\u0002012\u0006\u0010\"\u001a\u00020\u00162\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020103¢\u0006\u0002\b(J-\u00100\u001a\u000201\"\u0006\b\u0000\u0010!\u0018\u00012\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020103¢\u0006\u0002\b(H\bø\u0001\u0000Je\u00105\u001a\b\u0012\u0004\u0012\u0002H!0\n\"\u0006\b\u0000\u0010!\u0018\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032)\b\b\u0010#\u001a#\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002H!0$j\b\u0012\u0004\u0012\u0002H!`'¢\u0006\u0002\b(H\bø\u0001\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R4\u0010\b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n`\u000b8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u001c\u0010\u0015\u001a\u00020\u00168\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u001bj\b\u0012\u0004\u0012\u00020\u0016`\u001c8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b20\u0001¨\u00066"}, d2 = {"Lorg/koin/core/module/Module;", "", "createAtStart", "", "override", "(ZZ)V", "getCreateAtStart$koin_core", "()Z", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "getDefinitions$annotations", "()V", "getDefinitions", "()Ljava/util/HashSet;", "isLoaded", "isLoaded$annotations", "setLoaded", "(Z)V", "getOverride$koin_core", "rootScope", "Lorg/koin/core/qualifier/Qualifier;", "getRootScope$annotations", "getRootScope", "()Lorg/koin/core/qualifier/Qualifier;", "scopes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getScopes$annotations", "getScopes", "()Ljava/util/ArrayList;", "factory", ExifInterface.GPS_DIRECTION_TRUE, "qualifier", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "makeOptions", "Lorg/koin/core/definition/Options;", "createdAtStart", "plus", "", "modules", "module", "scope", "", "scopeSet", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "single", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: Module.kt */
public final class Module {
    private final boolean createAtStart;
    private final HashSet<BeanDefinition<?>> definitions = new HashSet<>();
    private boolean isLoaded;
    private final boolean override;
    private final Qualifier rootScope = ScopeDefinition.Companion.getROOT_SCOPE_QUALIFIER();
    private final ArrayList<Qualifier> scopes = new ArrayList<>();

    public static /* synthetic */ void getDefinitions$annotations() {
    }

    public static /* synthetic */ void getRootScope$annotations() {
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public static /* synthetic */ void isLoaded$annotations() {
    }

    public Module(boolean z, boolean z2) {
        this.createAtStart = z;
        this.override = z2;
    }

    public final boolean getCreateAtStart$koin_core() {
        return this.createAtStart;
    }

    public final boolean getOverride$koin_core() {
        return this.override;
    }

    public final Qualifier getRootScope() {
        return this.rootScope;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public final void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public final ArrayList<Qualifier> getScopes() {
        return this.scopes;
    }

    public final HashSet<BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    public final void scope(Qualifier qualifier, Function1<? super ScopeDSL, Unit> function1) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Intrinsics.checkNotNullParameter(function1, "scopeSet");
        function1.invoke(new ScopeDSL(qualifier, this.definitions));
        this.scopes.add(qualifier);
    }

    public final /* synthetic */ void scope(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "scopeSet");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        function1.invoke(new ScopeDSL(typeQualifier, getDefinitions()));
        getScopes().add(typeQualifier);
    }

    public static /* synthetic */ BeanDefinition single$default(Module module, Qualifier qualifier, boolean z, boolean z2, Function2 function2, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        boolean z3 = false;
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) == 0) {
            z3 = z2;
        }
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions = module.makeOptions(z3, z4);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, function2, kind, emptyList, makeOptions, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public final /* synthetic */ BeanDefinition single(Qualifier qualifier, boolean z, boolean z2, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions = makeOptions(z2, z);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, emptyList, makeOptions, null, 128, null);
        ModuleKt.addDefinition(getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public static /* synthetic */ Options makeOptions$default(Module module, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return module.makeOptions(z, z2);
    }

    public final Options makeOptions(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = this.createAtStart || z2;
        if (!this.override && !z) {
            z3 = false;
        }
        return new Options(z4, z3, false, 4, null);
    }

    public static /* synthetic */ BeanDefinition factory$default(Module module, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        boolean z2 = (i & 2) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions$default = makeOptions$default(module, z2, false, 2, null);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, function2, kind, emptyList, makeOptions$default, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public final /* synthetic */ BeanDefinition factory(Qualifier qualifier, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions$default = makeOptions$default(this, z, false, 2, null);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, emptyList, makeOptions$default, null, 128, null);
        ModuleKt.addDefinition(getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public final List<Module> plus(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return CollectionsKt.listOf((Object[]) new Module[]{this, module});
    }

    public final List<Module> plus(List<Module> list) {
        Intrinsics.checkNotNullParameter(list, "modules");
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this), (Iterable) list);
    }
}
