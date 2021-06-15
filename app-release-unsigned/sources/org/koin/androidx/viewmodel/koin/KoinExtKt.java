package org.koin.androidx.viewmodel.koin;

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
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\u0010\u0006\u001au\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nj\u0004\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0015\u001aq\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\n\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f2\u0012\b\b\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\u0016\b\n\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nj\u0004\u0018\u0001`\u0014H\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a|\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0018\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\n\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f2\u0012\b\b\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0016\b\n\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nj\u0004\u0018\u0001`\u0014H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, d2 = {"getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/Koin;", "viewModelParameters", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "(Lorg/koin/core/Koin;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "owner", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Lorg/koin/core/Koin;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinExt.kt */
public final class KoinExtKt {
    public static /* synthetic */ Lazy viewModel$default(Koin koin, Qualifier qualifier, Function0 function0, Function0 function02, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 8) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        Function0 function05 = (i & 16) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KoinExtKt$viewModel$1(koin, qualifier2, function04, function02, function05));
    }

    public static final /* synthetic */ Lazy viewModel(Koin koin, Qualifier qualifier, Function0 function0, Function0 function02, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function03) {
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KoinExtKt$viewModel$1(koin, qualifier, function0, function02, function03));
    }

    public static /* synthetic */ ViewModel getViewModel$default(Koin koin, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        Function0 function05 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(koin, qualifier2, function04, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function05);
    }

    public static final /* synthetic */ ViewModel getViewModel(Koin koin, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(koin, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function03);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Koin koin, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        return getViewModel(koin, (i & 1) != 0 ? null : qualifier, (i & 2) != 0 ? null : function0, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> T getViewModel(Koin koin, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) ScopeExtKt.getViewModel(koin.getScopeRegistry().getRootScope(), qualifier, function0, function02, kClass, function03);
    }

    public static final <T extends ViewModel> T getViewModel(Koin koin, ViewModelParameter<T> viewModelParameter) {
        Intrinsics.checkNotNullParameter(koin, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameter, "viewModelParameters");
        return (T) ScopeExtKt.getViewModel(koin.getScopeRegistry().getRootScope(), viewModelParameter);
    }
}
