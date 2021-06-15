package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeExt.kt */
public final class ScopeExtKt$viewModel$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0<ViewModelOwner> $owner;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Function0<Bundle> $state;
    final /* synthetic */ Scope $this_viewModel;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopeExtKt$viewModel$1(Scope scope, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, Function0<? extends DefinitionParameters> function03) {
        super(0);
        this.$this_viewModel = scope;
        this.$qualifier = qualifier;
        this.$state = function0;
        this.$owner = function02;
        this.$parameters = function03;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        Scope scope = this.$this_viewModel;
        Qualifier qualifier = this.$qualifier;
        Function0<Bundle> function0 = this.$state;
        Function0<ViewModelOwner> function02 = this.$owner;
        Function0<DefinitionParameters> function03 = this.$parameters;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) ScopeExtKt.getViewModel(scope, qualifier, function0, function02, Reflection.getOrCreateKotlinClass(ViewModel.class), function03);
    }
}
