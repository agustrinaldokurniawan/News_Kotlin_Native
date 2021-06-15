package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.androidx.viewmodel.ViewModelResolverKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u001a'\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\u0002\u0010\n\u001au\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u00032\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0001j\u0002`\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015¢\u0006\u0002\u0010\u0016\u001aq\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u00032\u0012\b\b\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0001j\u0002`\u00102\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015H\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a|\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0019\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u00032\u0012\b\b\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0001j\u0002`\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015H\bø\u0001\u0000*\u0016\u0010\u001c\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0016\u0010\u001d\"\b\u0012\u0004\u0012\u00020\u001e0\u00012\b\u0012\u0004\u0012\u00020\u001e0\u0001*\u0016\u0010\u001f\"\b\u0012\u0004\u0012\u00020 0\u00012\b\u0012\u0004\u0012\u00020 0\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006!"}, d2 = {"emptyState", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "viewModelParameters", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "owner", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "BundleDefinition", "SavedStateRegistryOwnerDefinition", "Landroidx/savedstate/SavedStateRegistryOwner;", "ViewModelStoreDefinition", "Landroidx/lifecycle/ViewModelStore;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeExt.kt */
public final class ScopeExtKt {
    public static final Function0<Bundle> emptyState() {
        return ScopeExtKt$emptyState$1.INSTANCE;
    }

    public static /* synthetic */ Lazy viewModel$default(Scope scope, Qualifier qualifier, Function0 function0, Function0 function02, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 8) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        Function0 function05 = (i & 16) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeExtKt$viewModel$1(scope, qualifier2, function04, function02, function05));
    }

    public static final /* synthetic */ Lazy viewModel(Scope scope, Qualifier qualifier, Function0 function0, Function0 function02, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function03) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeExtKt$viewModel$1(scope, qualifier, function0, function02, function03));
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        Function0 function05 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(scope, qualifier2, function04, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function05);
    }

    public static final /* synthetic */ ViewModel getViewModel(Scope scope, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(scope, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function03);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        return getViewModel(scope, (i & 1) != 0 ? null : qualifier, (i & 2) != 0 ? null : function0, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> T getViewModel(Scope scope, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        ViewModelOwner invoke = function02.invoke();
        if (function0 == null) {
            bundle = null;
        } else {
            bundle = function0.invoke();
        }
        return (T) getViewModel(scope, new ViewModelParameter(kClass, qualifier, function03, bundle, invoke.getStore(), invoke.getStateRegistry()));
    }

    public static final <T extends ViewModel> T getViewModel(Scope scope, ViewModelParameter<T> viewModelParameter) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameter, "viewModelParameters");
        return (T) ViewModelResolverKt.resolveInstance(ViewModelResolverKt.createViewModelProvider(scope, viewModelParameter), viewModelParameter);
    }
}
