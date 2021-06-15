package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
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
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.koin.KoinExtKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aw\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011¢\u0006\u0002\u0010\u0012\u001aq\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\n\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\u0016\b\n\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001ax\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011\u001ar\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\n\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\u0016\b\n\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0016"}, d2 = {"getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "owner", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ActivityExt.kt */
public final class ActivityExtKt {
    public static /* synthetic */ Lazy viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ActivityExtKt$viewModel$1(componentActivity);
        }
        Function0 function05 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ActivityExtKt$viewModel$2(componentActivity, qualifier2, function04, function02, function05));
    }

    public static final /* synthetic */ Lazy viewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ActivityExtKt$viewModel$2(componentActivity, qualifier, function0, function02, function03));
    }

    public static /* synthetic */ Lazy viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ActivityExtKt$viewModel$3(componentActivity);
        }
        return viewModel(componentActivity, qualifier2, function04, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> Lazy<T> viewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ActivityExtKt$viewModel$4(componentActivity, qualifier, function0, function02, kClass, function03));
    }

    public static /* synthetic */ ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = new ActivityExtKt$getViewModel$1(componentActivity);
        }
        Function0 function04 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(componentActivity, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function04);
    }

    public static final /* synthetic */ ViewModel getViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(componentActivity, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function03);
    }

    public static /* synthetic */ ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ActivityExtKt$getViewModel$2(componentActivity);
        }
        return getViewModel(componentActivity, qualifier2, function04, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> T getViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) KoinExtKt.getViewModel(ComponentCallbackExtKt.getKoin(componentActivity), qualifier, function0, function02, kClass, function03);
    }
}
