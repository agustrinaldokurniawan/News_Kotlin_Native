package com.tsuga.news.readnews;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ViewModelOwner;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "org/koin/androidx/viewmodel/ext/android/FragmentExtKt$viewModel$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: FragmentExt.kt */
public final class ReadNews$special$$inlined$viewModel$default$1 extends Lambda implements Function0<ViewModelOwner> {
    final /* synthetic */ Fragment $this_viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadNews$special$$inlined$viewModel$default$1(Fragment fragment) {
        super(0);
        this.$this_viewModel = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelOwner invoke() {
        ViewModelOwner.Companion companion = ViewModelOwner.Companion;
        Fragment fragment = this.$this_viewModel;
        return companion.from(fragment, fragment);
    }
}
