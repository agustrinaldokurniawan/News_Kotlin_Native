package org.koin.core.definition;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Ju\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\bø\u0001\u0000Jk\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00122\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072#\u0010\b\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\tj\u0006\u0012\u0002\b\u0003`\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0007Ju\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0016"}, d2 = {"Lorg/koin/core/definition/Definitions;", "", "()V", "createFactory", "Lorg/koin/core/definition/BeanDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "options", "Lorg/koin/core/definition/Options;", "secondaryTypes", "", "Lkotlin/reflect/KClass;", "scopeQualifier", "createSingle", "clazz", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: Definitions.kt */
public final class Definitions {
    public static final Definitions INSTANCE = new Definitions();

    private Definitions() {
    }

    public static /* synthetic */ BeanDefinition createSingle$default(Definitions definitions, Qualifier qualifier, Function2 function2, Options options, List list, Qualifier qualifier2, int i, Object obj) {
        Qualifier qualifier3 = (i & 1) != 0 ? null : qualifier;
        List emptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(emptyList, "secondaryTypes");
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, function2, kind, emptyList, options, null, 128, null);
    }

    public final /* synthetic */ BeanDefinition createSingle(Qualifier qualifier, Function2 function2, Options options, List list, Qualifier qualifier2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list, options, null, 128, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: org.koin.core.definition.Definitions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeanDefinition createSingle$default(Definitions definitions, KClass kClass, Qualifier qualifier, Function2 function2, Options options, List list, Qualifier qualifier2, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 16) != 0) {
            list = CollectionsKt.emptyList();
        }
        return definitions.createSingle(kClass, qualifier, function2, options, list, qualifier2);
    }

    public final BeanDefinition<?> createSingle(KClass<?> kClass, Qualifier qualifier, Function2<? super Scope, ? super DefinitionParameters, ?> function2, Options options, List<? extends KClass<?>> list, Qualifier qualifier2) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        return new BeanDefinition<>(qualifier2, kClass, qualifier, function2, Kind.Single, list, options, null, 128, null);
    }

    public static /* synthetic */ BeanDefinition createFactory$default(Definitions definitions, Qualifier qualifier, Function2 function2, Options options, List list, Qualifier qualifier2, int i, Object obj) {
        Qualifier qualifier3 = (i & 1) != 0 ? null : qualifier;
        List emptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(emptyList, "secondaryTypes");
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, function2, kind, emptyList, options, null, 128, null);
    }

    public final /* synthetic */ BeanDefinition createFactory(Qualifier qualifier, Function2 function2, Options options, List list, Qualifier qualifier2) {
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list, options, null, 128, null);
    }
}
