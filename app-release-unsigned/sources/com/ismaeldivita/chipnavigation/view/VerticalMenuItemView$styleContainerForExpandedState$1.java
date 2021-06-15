package com.ismaeldivita.chipnavigation.view;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/ViewGroup$MarginLayoutParams;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: VerticalMenuItemView.kt */
public final class VerticalMenuItemView$styleContainerForExpandedState$1 extends Lambda implements Function1<ViewGroup.MarginLayoutParams, Unit> {
    public static final VerticalMenuItemView$styleContainerForExpandedState$1 INSTANCE = new VerticalMenuItemView$styleContainerForExpandedState$1();

    VerticalMenuItemView$styleContainerForExpandedState$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        invoke(marginLayoutParams);
        return Unit.INSTANCE;
    }

    public final void invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "$receiver");
        marginLayoutParams.setMarginStart(0);
    }
}
