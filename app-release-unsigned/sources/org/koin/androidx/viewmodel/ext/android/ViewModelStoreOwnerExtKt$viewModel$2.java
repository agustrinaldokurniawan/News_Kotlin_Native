package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelStoreOwnerExt.kt */
final class ViewModelStoreOwnerExtKt$viewModel$2 extends Lambda implements Function0<T> {
    final /* synthetic */ KClass<T> $clazz;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Function0<Bundle> $state;
    final /* synthetic */ ViewModelStoreOwner $this_viewModel;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewModelStoreOwnerExtKt$viewModel$2(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, Function0<Bundle> function0, KClass<T> kClass, Function0<? extends DefinitionParameters> function02) {
        super(0);
        this.$this_viewModel = viewModelStoreOwner;
        this.$qualifier = qualifier;
        this.$state = function0;
        this.$clazz = kClass;
        this.$parameters = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return (T) ViewModelStoreOwnerExtKt.getViewModel(this.$this_viewModel, this.$qualifier, this.$state, this.$clazz, this.$parameters);
    }
}
