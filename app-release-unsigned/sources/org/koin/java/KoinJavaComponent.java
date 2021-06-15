package org.koin.java;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\rJI\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0007JT\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0017\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¨\u0006\u001a"}, d2 = {"Lorg/koin/java/KoinJavaComponent;", "", "()V", "bind", ExifInterface.LATITUDE_SOUTH, "P", "primary", "Ljava/lang/Class;", "secondary", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Ljava/lang/Class;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinJavaComponent.kt */
public final class KoinJavaComponent {
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    @JvmStatic
    public static final <P, S> S bind(Class<P> cls, Class<S> cls2) {
        Intrinsics.checkNotNullParameter(cls, "primary");
        Intrinsics.checkNotNullParameter(cls2, "secondary");
        return (S) bind$default(cls, cls2, null, 4, null);
    }

    @JvmStatic
    public static final <T> T get(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) get$default(cls, null, null, 6, null);
    }

    @JvmStatic
    public static final <T> T get(Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) get$default(cls, qualifier, null, 4, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return inject$default(cls, null, null, null, 14, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return inject$default(cls, qualifier, null, null, 12, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<T> cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        return inject$default(cls, qualifier, lazyThreadSafetyMode, null, 8, null);
    }

    private KoinJavaComponent() {
    }

    public static /* synthetic */ Lazy inject$default(Class cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return inject(cls, qualifier, lazyThreadSafetyMode, function0);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<T> cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KoinJavaComponent$inject$1(cls, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return get(cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T> T get(Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        KClass<T> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
        T t = (T) getKoin().get(kotlinClass, qualifier, function0);
        return t == null ? (T) getKoin().get(kotlinClass, qualifier, function0) : t;
    }

    public static /* synthetic */ Object bind$default(Class cls, Class cls2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return bind(cls, cls2, function0);
    }

    @JvmStatic
    public static final <P, S> S bind(Class<P> cls, Class<S> cls2, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(cls, "primary");
        Intrinsics.checkNotNullParameter(cls2, "secondary");
        return (S) getKoin().bind(JvmClassMappingKt.getKotlinClass(cls), JvmClassMappingKt.getKotlinClass(cls2), function0);
    }

    @JvmStatic
    public static final Koin getKoin() {
        return GlobalContext.INSTANCE.get();
    }
}
