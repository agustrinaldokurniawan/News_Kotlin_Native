package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") {
        /* class com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.AnonymousClass2 */

        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.getAnimationFraction());
        }

        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };
    private static final int DURATION_PER_CYCLE_IN_MS = 333;
    private static final int TOTAL_DURATION_IN_MS = 667;
    private float animationFraction;
    private ObjectAnimator animator;
    private final BaseProgressIndicatorSpec baseSpec;
    private boolean dirtyColors;
    private FastOutSlowInInterpolator interpolator;
    private int newIndicatorColorIndex = 1;

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(333L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.AnonymousClass1 */

                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = (linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    LinearIndeterminateContiguousAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    private void updateSegmentPositions(int i) {
        this.segmentPositions[0] = 0.0f;
        float fractionInRange = getFractionInRange(i, 0, TOTAL_DURATION_IN_MS);
        float[] fArr = this.segmentPositions;
        float[] fArr2 = this.segmentPositions;
        float interpolation = this.interpolator.getInterpolation(fractionInRange);
        fArr2[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr3 = this.segmentPositions;
        float[] fArr4 = this.segmentPositions;
        float interpolation2 = this.interpolator.getInterpolation(fractionInRange + 0.49925038f);
        fArr4[4] = interpolation2;
        fArr3[3] = interpolation2;
        this.segmentPositions[5] = 1.0f;
    }

    private void maybeUpdateSegmentColors() {
        if (this.dirtyColors && this.segmentPositions[3] < 1.0f) {
            this.segmentColors[2] = this.segmentColors[1];
            this.segmentColors[1] = this.segmentColors[0];
            this.segmentColors[0] = MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[this.newIndicatorColorIndex], this.drawable.getAlpha());
            this.dirtyColors = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void resetPropertiesForNewStart() {
        this.dirtyColors = true;
        this.newIndicatorColorIndex = 1;
        Arrays.fill(this.segmentColors, MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], this.drawable.getAlpha()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getAnimationFraction() {
        return this.animationFraction;
    }

    /* access modifiers changed from: package-private */
    public void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 333.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }
}