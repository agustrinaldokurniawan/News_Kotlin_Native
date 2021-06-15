package org.koin.androidx.viewmodel.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeCompat.kt */
final class ScopeCompat$viewModel$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Class<T> $clazz;
    final /* synthetic */ ViewModelStoreOwner $owner;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope $scope;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScopeCompat$viewModel$1(Scope scope, Qualifier qualifier, Class<T> cls, Function0<? extends DefinitionParameters> function0, ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$scope = scope;
        this.$qualifier = qualifier;
        this.$clazz = cls;
        this.$parameters = function0;
        this.$owner = viewModelStoreOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        Scope scope = this.$scope;
        Qualifier qualifier = this.$qualifier;
        final ViewModelStoreOwner viewModelStoreOwner = this.$owner;
        return (T) ScopeExtKt.getViewModel(scope, qualifier, null, new Function0<ViewModelOwner>() {
            /* class org.koin.androidx.viewmodel.compat.ScopeCompat$viewModel$1.AnonymousClass1 */

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelOwner invoke() {
                return ViewModelOwner.Companion.from$default(ViewModelOwner.Companion, viewModelStoreOwner, (SavedStateRegistryOwner) null, 2, (Object) null);
            }
        }, JvmClassMappingKt.getKotlinClass(this.$clazz), this.$parameters);
    }
}
