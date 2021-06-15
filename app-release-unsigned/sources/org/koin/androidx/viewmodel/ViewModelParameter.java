package org.koin.androidx.viewmodel;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002BW\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelParameter;", ExifInterface.GPS_DIRECTION_TRUE, "", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "initialState", "Landroid/os/Bundle;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "registryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Landroid/os/Bundle;Landroidx/lifecycle/ViewModelStore;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getClazz", "()Lkotlin/reflect/KClass;", "getInitialState", "()Landroid/os/Bundle;", "getParameters", "()Lkotlin/jvm/functions/Function0;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelParameter.kt */
public final class ViewModelParameter<T> {
    private final KClass<T> clazz;
    private final Bundle initialState;
    private final Function0<DefinitionParameters> parameters;
    private final Qualifier qualifier;
    private final SavedStateRegistryOwner registryOwner;
    private final ViewModelStore viewModelStore;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelParameter(KClass<T> kClass, Qualifier qualifier2, Function0<? extends DefinitionParameters> function0, Bundle bundle, ViewModelStore viewModelStore2, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        Intrinsics.checkNotNullParameter(viewModelStore2, "viewModelStore");
        this.clazz = kClass;
        this.qualifier = qualifier2;
        this.parameters = function0;
        this.initialState = bundle;
        this.viewModelStore = viewModelStore2;
        this.registryOwner = savedStateRegistryOwner;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelParameter(KClass kClass, Qualifier qualifier2, Function0 function0, Bundle bundle, ViewModelStore viewModelStore2, SavedStateRegistryOwner savedStateRegistryOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i & 2) != 0 ? null : qualifier2, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : bundle, viewModelStore2, (i & 32) != 0 ? null : savedStateRegistryOwner);
    }

    public final KClass<T> getClazz() {
        return this.clazz;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Function0<DefinitionParameters> getParameters() {
        return this.parameters;
    }

    public final Bundle getInitialState() {
        return this.initialState;
    }

    public final ViewModelStore getViewModelStore() {
        return this.viewModelStore;
    }

    public final SavedStateRegistryOwner getRegistryOwner() {
        return this.registryOwner;
    }
}
