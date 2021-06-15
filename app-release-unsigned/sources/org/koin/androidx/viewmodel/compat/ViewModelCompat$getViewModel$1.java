package org.koin.androidx.viewmodel.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ViewModelOwner;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelCompat.kt */
final class ViewModelCompat$getViewModel$1 extends Lambda implements Function0<ViewModelOwner> {
    final /* synthetic */ ViewModelStoreOwner $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewModelCompat$getViewModel$1(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$owner = viewModelStoreOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelOwner invoke() {
        return ViewModelOwner.Companion.from$default(ViewModelOwner.Companion, this.$owner, (SavedStateRegistryOwner) null, 2, (Object) null);
    }
}
