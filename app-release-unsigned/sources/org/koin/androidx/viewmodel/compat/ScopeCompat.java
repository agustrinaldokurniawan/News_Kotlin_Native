package org.koin.androidx.viewmodel.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JY\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0007¢\u0006\u0002\u0010\u0012Jd\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0014\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0007¨\u0006\u0017"}, d2 = {"Lorg/koin/androidx/viewmodel/compat/ScopeCompat;", "", "()V", "getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "scope", "Lorg/koin/core/scope/Scope;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "clazz", "Ljava/lang/Class;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeCompat.kt */
public final class ScopeCompat {
    public static final ScopeCompat INSTANCE = new ScopeCompat();

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, null, null, 24, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, 16, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return viewModel$default(scope, viewModelStoreOwner, cls, null, null, null, 56, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return viewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, null, 48, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        return viewModel$default(scope, viewModelStoreOwner, cls, qualifier, lazyThreadSafetyMode, null, 32, null);
    }

    private ScopeCompat() {
    }

    public static /* synthetic */ Lazy viewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        Qualifier qualifier2 = (i & 8) != 0 ? null : qualifier;
        if ((i & 16) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        return viewModel(scope, viewModelStoreOwner, cls, qualifier2, lazyThreadSafetyMode, (i & 32) != 0 ? null : function0);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeCompat$viewModel$1(scope, qualifier, cls, function0, viewModelStoreOwner));
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            qualifier = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        return getViewModel(scope, viewModelStoreOwner, cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) ScopeExtKt.getViewModel(scope, qualifier, null, new ScopeCompat$getViewModel$1(viewModelStoreOwner), JvmClassMappingKt.getKotlinClass(cls), function0);
    }
}
