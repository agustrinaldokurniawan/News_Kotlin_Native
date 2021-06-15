package com.ismaeldivita.chipnavigation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import com.ismaeldivita.chipnavigation.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010$\u001a\u00020\bJ\u0012\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lcom/ismaeldivita/chipnavigation/view/BadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "value", "", "count", "getCount", "()I", "setCount", "(I)V", "parentBounds", "Landroid/graphics/Rect;", "shapeDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getShapeDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "shapeDrawable$delegate", "Lkotlin/Lazy;", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint$delegate", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawText", "getOpacity", "setAlpha", "alpha", "setColor", "color", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "updateBadgeBounds", "Companion", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
/* compiled from: BadgeDrawable.kt */
public final class BadgeDrawable extends Drawable {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BadgeDrawable.class), "shapeDrawable", "getShapeDrawable()Landroid/graphics/drawable/GradientDrawable;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BadgeDrawable.class), "textPaint", "getTextPaint()Landroid/text/TextPaint;"))};
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BADGE_COUNT = 99;
    private final Context context;
    private int count;
    private Rect parentBounds;
    private final Lazy shapeDrawable$delegate = LazyKt.lazy(BadgeDrawable$shapeDrawable$2.INSTANCE);
    private final Lazy textPaint$delegate = LazyKt.lazy(new BadgeDrawable$textPaint$2(this));

    private final GradientDrawable getShapeDrawable() {
        Lazy lazy = this.shapeDrawable$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (GradientDrawable) lazy.getValue();
    }

    private final TextPaint getTextPaint() {
        Lazy lazy = this.textPaint$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (TextPaint) lazy.getValue();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BadgeDrawable(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ismaeldivita/chipnavigation/view/BadgeDrawable$Companion;", "", "()V", "MAX_BADGE_COUNT", "", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
    /* compiled from: BadgeDrawable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
        Rect rect = this.parentBounds;
        if (rect != null) {
            updateBadgeBounds(rect);
        }
    }

    public final void setColor(int i) {
        getShapeDrawable().setColor(i);
    }

    public final void updateBadgeBounds(Rect rect) {
        int i;
        Intrinsics.checkParameterIsNotNull(rect, "parentBounds");
        this.parentBounds = rect;
        if (this.count > 0) {
            i = this.context.getResources().getDimensionPixelSize(R.dimen.cnb_badge_size);
        } else {
            i = this.context.getResources().getDimensionPixelSize(R.dimen.cnb_badge_size_numberless);
        }
        double d = this.count > 99 ? 1.5d : 1.0d;
        getShapeDrawable().setCornerRadius(((float) rect.height()) * 0.5f);
        getShapeDrawable().setBounds(rect.right - MathKt.roundToInt(((double) i) * d), 0, rect.right, rect.top + i);
    }

    public void setAlpha(int i) {
        getShapeDrawable().setAlpha(i);
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect bounds = getShapeDrawable().getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "shapeDrawable.bounds");
        if (!bounds.isEmpty()) {
            getShapeDrawable().draw(canvas);
            if (this.count > 0) {
                drawText(canvas);
            }
        }
    }

    private final void drawText(Canvas canvas) {
        String str;
        Rect rect = new Rect();
        int i = this.count;
        if (i > 99) {
            str = "99+";
        } else {
            str = String.valueOf(i);
        }
        getTextPaint().getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, getShapeDrawable().getBounds().exactCenterX() - rect.exactCenterX(), getShapeDrawable().getBounds().exactCenterY() + ((float) (rect.height() / 2)), getTextPaint());
    }
}
