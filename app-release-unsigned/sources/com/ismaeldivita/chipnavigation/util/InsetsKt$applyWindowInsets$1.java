package com.ismaeldivita.chipnavigation.util;

import android.view.View;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "windowInsets", "Landroid/view/WindowInsets;", "initialPadding", "Lcom/ismaeldivita/chipnavigation/util/InitialPadding;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: Insets.kt */
public final class InsetsKt$applyWindowInsets$1 extends Lambda implements Function3<View, WindowInsets, InitialPadding, Unit> {
    final /* synthetic */ boolean $bottom;
    final /* synthetic */ boolean $left;
    final /* synthetic */ boolean $right;
    final /* synthetic */ boolean $top;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InsetsKt$applyWindowInsets$1(boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.$left = z;
        this.$top = z2;
        this.$right = z3;
        this.$bottom = z4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(View view, WindowInsets windowInsets, InitialPadding initialPadding) {
        invoke(view, windowInsets, initialPadding);
        return Unit.INSTANCE;
    }

    public final void invoke(View view, WindowInsets windowInsets, InitialPadding initialPadding) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(windowInsets, "windowInsets");
        Intrinsics.checkParameterIsNotNull(initialPadding, "initialPadding");
        int left = initialPadding.getLeft();
        Integer valueOf = Integer.valueOf(windowInsets.getSystemWindowInsetLeft());
        valueOf.intValue();
        Integer num = null;
        if (!this.$left) {
            valueOf = null;
        }
        int i = 0;
        int intValue = left + (valueOf != null ? valueOf.intValue() : 0);
        int top = initialPadding.getTop();
        Integer valueOf2 = Integer.valueOf(windowInsets.getSystemWindowInsetTop());
        valueOf2.intValue();
        if (!this.$top) {
            valueOf2 = null;
        }
        int intValue2 = top + (valueOf2 != null ? valueOf2.intValue() : 0);
        int right = initialPadding.getRight();
        Integer valueOf3 = Integer.valueOf(windowInsets.getSystemWindowInsetRight());
        valueOf3.intValue();
        if (!this.$right) {
            valueOf3 = null;
        }
        int intValue3 = right + (valueOf3 != null ? valueOf3.intValue() : 0);
        int bottom = initialPadding.getBottom();
        Integer valueOf4 = Integer.valueOf(windowInsets.getSystemWindowInsetBottom());
        valueOf4.intValue();
        if (this.$bottom) {
            num = valueOf4;
        }
        if (num != null) {
            i = num.intValue();
        }
        view.setPadding(intValue, intValue2, intValue3, bottom + i);
    }
}
