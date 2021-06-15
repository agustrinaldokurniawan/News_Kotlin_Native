package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.koin.KoinExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ac\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000e¢\u0006\u0002\u0010\u000f\u001a]\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000eH\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001ah\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000eH\bø\u0001\u0000\u001an\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000e\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0015"}, d2 = {"getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelStoreOwner;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelStoreOwnerExt.kt */
public final class ViewModelStoreOwnerExtKt {
    public static /* synthetic */ Lazy viewModel$default(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ViewModelStoreOwnerExtKt$viewModel$1(viewModelStoreOwner, qualifier, function0, function02));
    }

    public static final /* synthetic */ Lazy viewModel(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function02) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ViewModelStoreOwnerExtKt$viewModel$1(viewModelStoreOwner, qualifier, function0, function02));
    }

    public static /* synthetic */ Lazy viewModel$default(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, KClass kClass, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function02, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function03 = (i & 2) != 0 ? null : function0;
        if ((i & 8) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        return viewModel(viewModelStoreOwner, qualifier2, function03, kClass, lazyThreadSafetyMode, (i & 16) != 0 ? null : function02);
    }

    public static final <T extends ViewModel> Lazy<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0<Bundle> function0, KClass<T> kClass, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function02) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ViewModelStoreOwnerExtKt$viewModel$2(viewModelStoreOwner, qualifier, function0, kClass, function02));
    }

    public static /* synthetic */ ViewModel getViewModel$default(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(viewModelStoreOwner, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function02);
    }

    public static final /* synthetic */ ViewModel getViewModel(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(viewModelStoreOwner, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function02);
    }

    public static /* synthetic */ ViewModel getViewModel$default(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0 function0, KClass kClass, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        return getViewModel(viewModelStoreOwner, qualifier, function0, kClass, function02);
    }

    public static final <T extends ViewModel> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0<Bundle> function0, KClass<T> kClass, Function0<? extends DefinitionParameters> function02) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) KoinExtKt.getViewModel(GlobalContext.INSTANCE.get(), qualifier, function0, new ViewModelStoreOwnerExtKt$getViewModel$1(viewModelStoreOwner), kClass, function02);
    }
}
