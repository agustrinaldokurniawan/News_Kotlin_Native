package com.tsuga.news.readnews;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "org/koin/androidx/viewmodel/ext/android/FragmentExtKt$viewModel$2"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: FragmentExt.kt */
public final class ReadNews$special$$inlined$viewModel$default$2 extends Lambda implements Function0<ReadNewsViewModel> {
    final /* synthetic */ Function0 $owner;
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Function0 $state;
    final /* synthetic */ Fragment $this_viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadNews$special$$inlined$viewModel$default$2(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03) {
        super(0);
        this.$this_viewModel = fragment;
        this.$qualifier = qualifier;
        this.$state = function0;
        this.$owner = function02;
        this.$parameters = function03;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tsuga.news.readnews.ReadNewsViewModel, androidx.lifecycle.ViewModel] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // kotlin.jvm.functions.Function0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tsuga.news.readnews.ReadNewsViewModel invoke() {
        /*
            r6 = this;
            androidx.fragment.app.Fragment r0 = r6.$this_viewModel
            org.koin.core.qualifier.Qualifier r1 = r6.$qualifier
            kotlin.jvm.functions.Function0 r2 = r6.$state
            kotlin.jvm.functions.Function0 r3 = r6.$owner
            kotlin.jvm.functions.Function0 r5 = r6.$parameters
            java.lang.Class<com.tsuga.news.readnews.ReadNewsViewModel> r4 = com.tsuga.news.readnews.ReadNewsViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r4)
            androidx.lifecycle.ViewModel r0 = org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getViewModel(r0, r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.readnews.ReadNews$special$$inlined$viewModel$default$2.invoke():androidx.lifecycle.ViewModel");
    }
}
