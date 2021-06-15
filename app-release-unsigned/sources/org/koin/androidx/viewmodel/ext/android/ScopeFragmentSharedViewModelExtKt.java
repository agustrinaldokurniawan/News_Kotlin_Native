package org.koin.androidx.viewmodel.ext.android;

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
import org.koin.androidx.scope.ScopeFragment;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aw\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011¢\u0006\u0002\u0010\u0012\u001aq\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\n\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\u0016\b\n\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001ax\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011\u001ar\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0012\b\n\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\u0016\b\n\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007j\u0004\u0018\u0001`\u0011H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0016"}, d2 = {"getSharedViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/androidx/scope/ScopeFragment;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "owner", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/androidx/scope/ScopeFragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Lorg/koin/androidx/scope/ScopeFragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "sharedViewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeFragmentSharedViewModelExt.kt */
public final class ScopeFragmentSharedViewModelExtKt {
    public static /* synthetic */ Lazy sharedViewModel$default(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ScopeFragmentSharedViewModelExtKt$sharedViewModel$1(scopeFragment);
        }
        Function0 function05 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeFragmentSharedViewModelExtKt$sharedViewModel$2(scopeFragment, qualifier2, function04, function02, function05));
    }

    public static final /* synthetic */ Lazy sharedViewModel(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeFragmentSharedViewModelExtKt$sharedViewModel$2(scopeFragment, qualifier, function0, function02, function03));
    }

    public static /* synthetic */ Lazy sharedViewModel$default(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ScopeFragmentSharedViewModelExtKt$sharedViewModel$3(scopeFragment);
        }
        return sharedViewModel(scopeFragment, qualifier2, function04, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> Lazy<T> sharedViewModel(ScopeFragment scopeFragment, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ScopeFragmentSharedViewModelExtKt$sharedViewModel$4(scopeFragment, qualifier, function0, function02, kClass, function03));
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = new ScopeFragmentSharedViewModelExtKt$getSharedViewModel$1(scopeFragment);
        }
        Function0 function04 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ScopeFragmentExtKt.getViewModel(scopeFragment, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function04);
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function04 = (i & 2) != 0 ? null : function0;
        if ((i & 4) != 0) {
            function02 = new ScopeFragmentSharedViewModelExtKt$getSharedViewModel$2(scopeFragment);
        }
        return getSharedViewModel(scopeFragment, qualifier2, function04, function02, kClass, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> T getSharedViewModel(ScopeFragment scopeFragment, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) ScopeExtKt.getViewModel(scopeFragment.getScope(), qualifier, function0, function02, kClass, function03);
    }

    public static final /* synthetic */ ViewModel getSharedViewModel(ScopeFragment scopeFragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(scopeFragment, "<this>");
        Intrinsics.checkNotNullParameter(function02, "owner");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ScopeFragmentExtKt.getViewModel(scopeFragment, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function03);
    }
}
