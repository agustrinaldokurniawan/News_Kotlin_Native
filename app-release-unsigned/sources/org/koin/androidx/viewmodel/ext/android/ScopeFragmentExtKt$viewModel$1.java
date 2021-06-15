package org.koin.androidx.viewmodel.ext.android;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.scope.ScopeFragment;
import org.koin.androidx.viewmodel.ViewModelOwner;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeFragmentExt.kt */
public final class ScopeFragmentExtKt$viewModel$1 extends Lambda implements Function0<ViewModelOwner> {
    final /* synthetic */ ScopeFragment $this_viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopeFragmentExtKt$viewModel$1(ScopeFragment scopeFragment) {
        super(0);
        this.$this_viewModel = scopeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelOwner invoke() {
        ViewModelOwner.Companion companion = ViewModelOwner.Companion;
        ScopeFragment scopeFragment = this.$this_viewModel;
        return companion.from(scopeFragment, scopeFragment);
    }
}
