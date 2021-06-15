package org.koin.androidx.viewmodel.factory;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.parameter.StateDefinitionParameter;
import org.koin.core.parameter.DefinitionParameters;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: StateViewModelFactory.kt */
final class StateViewModelFactory$create$1 extends Lambda implements Function0<DefinitionParameters> {
    final /* synthetic */ SavedStateHandle $handle;
    final /* synthetic */ StateViewModelFactory<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateViewModelFactory$create$1(StateViewModelFactory<T> stateViewModelFactory, SavedStateHandle savedStateHandle) {
        super(0);
        this.this$0 = stateViewModelFactory;
        this.$handle = savedStateHandle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DefinitionParameters invoke() {
        Function0<DefinitionParameters> parameters = this.this$0.getParameters().getParameters();
        DefinitionParameters invoke = parameters == null ? null : parameters.invoke();
        if (invoke == null) {
            invoke = new DefinitionParameters(null, 1, null);
        }
        return StateDefinitionParameter.Companion.from(this.$handle, invoke);
    }
}
