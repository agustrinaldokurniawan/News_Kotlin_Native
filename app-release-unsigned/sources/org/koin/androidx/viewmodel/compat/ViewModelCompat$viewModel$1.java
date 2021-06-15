package org.koin.androidx.viewmodel.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelCompat.kt */
final class ViewModelCompat$viewModel$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Class<T> $clazz;
    final /* synthetic */ ViewModelStoreOwner $owner;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewModelCompat$viewModel$1(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        super(0);
        this.$owner = viewModelStoreOwner;
        this.$clazz = cls;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ViewModelCompat viewModelCompat = ViewModelCompat.INSTANCE;
        return (T) ViewModelCompat.getViewModel(this.$owner, this.$clazz, this.$qualifier, this.$parameters);
    }
}
