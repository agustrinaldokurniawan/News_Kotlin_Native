package org.koin.androidx.viewmodel.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.androidx.viewmodel.koin.KoinExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fH\u0007¢\u0006\u0002\u0010\u0010JR\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0012\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fH\u0007¨\u0006\u0013"}, d2 = {"Lorg/koin/androidx/viewmodel/compat/ViewModelCompat;", "", "()V", "getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "clazz", "Ljava/lang/Class;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelCompat.kt */
public final class ViewModelCompat {
    public static final ViewModelCompat INSTANCE = new ViewModelCompat();

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) getViewModel$default(viewModelStoreOwner, cls, null, null, 12, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) getViewModel$default(viewModelStoreOwner, cls, qualifier, null, 8, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return viewModel$default(viewModelStoreOwner, cls, null, null, 12, null);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return viewModel$default(viewModelStoreOwner, cls, qualifier, null, 8, null);
    }

    private ViewModelCompat() {
    }

    public static /* synthetic */ Lazy viewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return viewModel(viewModelStoreOwner, cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T extends ViewModel> Lazy<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return LazyKt.lazy(new ViewModelCompat$viewModel$1(viewModelStoreOwner, cls, qualifier, function0));
    }

    public static /* synthetic */ ViewModel getViewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return getViewModel(viewModelStoreOwner, cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T extends ViewModel> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "owner");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) KoinExtKt.getViewModel(GlobalContext.INSTANCE.get(), qualifier, null, new ViewModelCompat$getViewModel$1(viewModelStoreOwner), JvmClassMappingKt.getKotlinClass(cls), function0);
    }
}
