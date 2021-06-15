package com.ismaeldivita.chipnavigation.util;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"TEXT_STATE_ANIMATOR_DURATION", "", "colorAnimator", "Landroid/animation/Animator;", "Landroid/widget/TextView;", "from", "", "to", "durationInMillis", "setColorStateListAnimator", "", "color", "unselectedColor", "chip-navigation-bar_release"}, k = 2, mv = {1, 1, 15})
/* compiled from: TextView.kt */
public final class TextViewKt {
    private static final long TEXT_STATE_ANIMATOR_DURATION = 350;

    public static final Animator colorAnimator(TextView textView, int i, int i2, long j) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$colorAnimator");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new TextViewKt$colorAnimator$$inlined$apply$lambda$1(textView, j));
        Intrinsics.checkExpressionValueIsNotNull(ofObject, "ValueAnimator.ofObject(A…atedValue as Int)\n    }\n}");
        return ofObject;
    }

    public static final void setColorStateListAnimator(TextView textView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setColorStateListAnimator");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842913}, colorAnimator(textView, i2, i, TEXT_STATE_ANIMATOR_DURATION));
        stateListAnimator.addState(new int[0], colorAnimator(textView, i, i2, TEXT_STATE_ANIMATOR_DURATION));
        textView.setStateListAnimator(stateListAnimator);
        textView.refreshDrawableState();
    }
}
