package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.ext.KClassExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0003*\u0002H\u0001¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0003*\u0002H\u0001¢\u0006\u0002\u0010\u0010\u001aP\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\bø\u0001\u0000\u001a%\u0010\u0015\u001a\u00020\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0003*\u0002H\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0018\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0019"}, d2 = {"get", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/scope/KoinScopeComponent;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/KoinScopeComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getScopeId", "", "(Lorg/koin/core/scope/KoinScopeComponent;)Ljava/lang/String;", "getScopeName", "Lorg/koin/core/qualifier/TypeQualifier;", "(Lorg/koin/core/scope/KoinScopeComponent;)Lorg/koin/core/qualifier/TypeQualifier;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "newScope", "Lorg/koin/core/scope/Scope;", "source", "(Lorg/koin/core/scope/KoinScopeComponent;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "koin-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinScopeComponent.kt */
public final class KoinScopeComponentKt {
    public static final <T extends KoinScopeComponent> String getScopeId(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t.getClass())) + '@' + System.identityHashCode(t);
    }

    public static final <T extends KoinScopeComponent> TypeQualifier getScopeName(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t.getClass()));
    }

    public static /* synthetic */ Scope newScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return newScope(koinScopeComponent, obj);
    }

    public static final <T extends KoinScopeComponent> Scope newScope(T t, Object obj) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return t.getKoin().createScope(getScopeId(t), getScopeName(t), obj);
    }

    public static /* synthetic */ Lazy inject$default(KoinScopeComponent koinScopeComponent, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinScopeComponent, "<this>");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KoinScopeComponentKt$inject$1(koinScopeComponent, qualifier, function0));
    }

    public static final /* synthetic */ Lazy inject(KoinScopeComponent koinScopeComponent, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0) {
        Intrinsics.checkNotNullParameter(koinScopeComponent, "<this>");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KoinScopeComponentKt$inject$1(koinScopeComponent, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(KoinScopeComponent koinScopeComponent, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinScopeComponent, "<this>");
        Scope scope = koinScopeComponent.getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static final /* synthetic */ Object get(KoinScopeComponent koinScopeComponent, Qualifier qualifier, Function0 function0) {
        Intrinsics.checkNotNullParameter(koinScopeComponent, "<this>");
        Scope scope = koinScopeComponent.getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
