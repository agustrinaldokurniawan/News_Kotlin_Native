package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u0007¢\u0006\u0002\u0010\bJ[\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0006\"\u0006\b\u0000\u0010\u000e\u0018\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112)\b\b\u0010\u0012\u001a#\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u000e0\u0013j\b\u0012\u0004\u0012\u0002H\u000e`\u0016¢\u0006\u0002\b\u0017H\bø\u0001\u0000J[\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0006\"\u0006\b\u0000\u0010\u000e\u0018\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112)\b\b\u0010\u0012\u001a#\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u000e0\u0013j\b\u0012\u0004\u0012\u0002H\u000e`\u0016¢\u0006\u0002\b\u0017H\bø\u0001\u0000J[\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0006\"\u0006\b\u0000\u0010\u000e\u0018\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112)\b\b\u0010\u0012\u001a#\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u000e0\u0013j\b\u0012\u0004\u0012\u0002H\u000e`\u0016¢\u0006\u0002\b\u0017H\bø\u0001\u0000R)\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001a"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "scopeQualifier", "Lorg/koin/core/qualifier/Qualifier;", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "(Lorg/koin/core/qualifier/Qualifier;Ljava/util/HashSet;)V", "getDefinitions", "()Ljava/util/HashSet;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "factory", ExifInterface.GPS_DIRECTION_TRUE, "qualifier", "override", "", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "scoped", "single", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeDSL.kt */
public final class ScopeDSL {
    private final HashSet<BeanDefinition<?>> definitions;
    private final Qualifier scopeQualifier;

    public ScopeDSL(Qualifier qualifier, HashSet<BeanDefinition<?>> hashSet) {
        Intrinsics.checkNotNullParameter(qualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(hashSet, "definitions");
        this.scopeQualifier = qualifier;
        this.definitions = hashSet;
    }

    public final HashSet<BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public static /* synthetic */ BeanDefinition single$default(ScopeDSL scopeDSL, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        int i2 = i & 1;
        int i3 = i & 2;
        Intrinsics.checkNotNullParameter(function2, "definition");
        throw new IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Can't use Single in a scope. Use Scoped instead")
    public final /* synthetic */ BeanDefinition single(Qualifier qualifier, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        throw new IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    public static /* synthetic */ BeanDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        boolean z2 = (i & 2) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(function2, "definition");
        Definitions definitions2 = Definitions.INSTANCE;
        Options options = new Options(false, z2, false, 4, null);
        Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, function2, kind, emptyList, options, null, 128, null);
        ModuleKt.addDefinition(scopeDSL.getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public final /* synthetic */ BeanDefinition scoped(Qualifier qualifier, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Definitions definitions2 = Definitions.INSTANCE;
        Options options = new Options(false, z, false, 4, null);
        Qualifier scopeQualifier2 = getScopeQualifier();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, emptyList, options, null, 128, null);
        ModuleKt.addDefinition(getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public static /* synthetic */ BeanDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        boolean z2 = (i & 2) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(function2, "definition");
        Definitions definitions2 = Definitions.INSTANCE;
        Options options = new Options(false, z2, false, 4, null);
        Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, function2, kind, emptyList, options, null, 128, null);
        ModuleKt.addDefinition(scopeDSL.getDefinitions(), beanDefinition);
        return beanDefinition;
    }

    public final /* synthetic */ BeanDefinition factory(Qualifier qualifier, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Definitions definitions2 = Definitions.INSTANCE;
        Options options = new Options(false, z, false, 4, null);
        Qualifier scopeQualifier2 = getScopeQualifier();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, emptyList, options, null, 128, null);
        ModuleKt.addDefinition(getDefinitions(), beanDefinition);
        return beanDefinition;
    }
}
