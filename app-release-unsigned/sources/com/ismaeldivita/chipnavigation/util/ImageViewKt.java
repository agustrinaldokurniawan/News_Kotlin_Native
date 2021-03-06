package com.ismaeldivita.chipnavigation.util;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a2\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"ICON_STATE_ANIMATOR_DURATION", "", "colorAnimator", "Landroid/animation/Animator;", "Landroid/widget/ImageView;", "from", "", "to", "mode", "Landroid/graphics/PorterDuff$Mode;", "durationInMillis", "setColorStateListAnimator", "", "color", "unselectedColor", "chip-navigation-bar_release"}, k = 2, mv = {1, 1, 15})
/* compiled from: ImageView.kt */
public final class ImageViewKt {
    private static final long ICON_STATE_ANIMATOR_DURATION = 350;

    public static final Animator colorAnimator(ImageView imageView, int i, int i2, PorterDuff.Mode mode, long j) {
        Intrinsics.checkParameterIsNotNull(imageView, "$this$colorAnimator");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new ImageViewKt$colorAnimator$$inlined$apply$lambda$1(ofObject, imageView, j, mode));
        Intrinsics.checkExpressionValueIsNotNull(ofObject, "ValueAnimator.ofObject(A…orFilter(color) }\n    }\n}");
        return ofObject;
    }

    public static final void setColorStateListAnimator(ImageView imageView, int i, int i2, PorterDuff.Mode mode) {
        Intrinsics.checkParameterIsNotNull(imageView, "$this$setColorStateListAnimator");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842913}, colorAnimator(imageView, i2, i, mode, ICON_STATE_ANIMATOR_DURATION));
        stateListAnimator.addState(new int[0], colorAnimator(imageView, i, i2, mode, ICON_STATE_ANIMATOR_DURATION));
        imageView.setStateListAnimator(stateListAnimator);
        imageView.refreshDrawableState();
    }
}
