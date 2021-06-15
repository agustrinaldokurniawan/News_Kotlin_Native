package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

/* access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: SharedViewModelExt.kt */
public final class SharedViewModelExtKt$sharedViewModel$4 extends Lambda implements Function0<T> {
    final /* synthetic */ KClass<T> $clazz;
    final /* synthetic */ Function0<ViewModelOwner> $owner;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Function0<Bundle> $state;
    final /* synthetic */ Fragment $this_sharedViewModel;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedViewModelExtKt$sharedViewModel$4(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<ViewModelOwner> function02, KClass<T> kClass, Function0<? extends DefinitionParameters> function03) {
        super(0);
        this.$this_sharedViewModel = fragment;
        this.$qualifier = qualifier;
        this.$state = function0;
        this.$owner = function02;
        this.$clazz = kClass;
        this.$parameters = function03;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return (T) FragmentExtKt.getViewModel(this.$this_sharedViewModel, this.$qualifier, this.$state, this.$owner, this.$clazz, this.$parameters);
    }
}
