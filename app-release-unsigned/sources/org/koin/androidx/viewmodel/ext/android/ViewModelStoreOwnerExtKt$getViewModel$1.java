package org.koin.androidx.viewmodel.ext.android;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ViewModelOwner;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelStoreOwnerExt.kt */
final class ViewModelStoreOwnerExtKt$getViewModel$1 extends Lambda implements Function0<ViewModelOwner> {
    final /* synthetic */ ViewModelStoreOwner $this_getViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewModelStoreOwnerExtKt$getViewModel$1(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$this_getViewModel = viewModelStoreOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelOwner invoke() {
        return ViewModelOwner.Companion.from(this.$this_getViewModel, (SavedStateRegistryOwner) null);
    }
}
