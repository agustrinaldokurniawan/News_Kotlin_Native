package com.ismaeldivita.chipnavigation.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.ismaeldivita.chipnavigation.R;
import com.ismaeldivita.chipnavigation.model.MenuItem;
import com.ismaeldivita.chipnavigation.model.MenuParser;
import com.ismaeldivita.chipnavigation.util.ImageViewKt;
import com.ismaeldivita.chipnavigation.util.TextViewKt;
import com.ismaeldivita.chipnavigation.util.ViewGroupKt;
import com.ismaeldivita.chipnavigation.util.ViewKt;
import com.tsuga.news.WebViewActivity;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0006\u0010)\u001a\u00020&J\b\u0010*\u001a\u00020&H\u0016J\u0006\u0010+\u001a\u00020&J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\bH\u0016J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\u001c\u00104\u001a\u000205*\u00020\u00112\u0006\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020!H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R#\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R#\u0010\"\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b#\u0010\u0016¨\u00069"}, d2 = {"Lcom/ismaeldivita/chipnavigation/view/VerticalMenuItemView;", "Lcom/ismaeldivita/chipnavigation/view/MenuItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "badgeCount", "", "container", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getContainer", "()Landroid/view/View;", "container$delegate", "Lkotlin/Lazy;", "containerBackground", "Landroid/graphics/drawable/GradientDrawable;", "containerForeground", "countLabel", "Landroid/widget/TextView;", "getCountLabel", "()Landroid/widget/TextView;", "countLabel$delegate", "doubleSpace", "icon", "Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;", "getIcon", "()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;", "icon$delegate", "originalTypeFace", "Landroid/graphics/Typeface;", "radius", "", WebViewActivity.TITLE, "getTitle", "title$delegate", "bind", "", MenuParser.XML_MENU_ITEM_TAG, "Lcom/ismaeldivita/chipnavigation/model/MenuItem;", "collapse", "dismissBadge", "expand", "isExpanded", "", "setEnabled", "enabled", "showBadge", "count", "styleContainerForCollapseState", "styleContainerForExpandedState", "cornerAnimation", "Landroid/animation/Animator;", "from", "to", "Companion", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
/* compiled from: VerticalMenuItemView.kt */
public final class VerticalMenuItemView extends MenuItemView {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VerticalMenuItemView.class), WebViewActivity.TITLE, "getTitle()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VerticalMenuItemView.class), "icon", "getIcon()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VerticalMenuItemView.class), "countLabel", "getCountLabel()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VerticalMenuItemView.class), "container", "getContainer()Landroid/view/View;"))};
    private static final long BACKGROUND_CORNER_ANIMATION_DURATION = 250;
    private static final char BULLET = 11044;
    @Deprecated
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private int badgeCount;
    private final Lazy container$delegate;
    private final GradientDrawable containerBackground;
    private final GradientDrawable containerForeground;
    private final Lazy countLabel$delegate;
    private final int doubleSpace;
    private final Lazy icon$delegate;
    private final Typeface originalTypeFace;
    private float radius;
    private final Lazy title$delegate;

    public VerticalMenuItemView(Context context) {
        this(context, null, 2, null);
    }

    private final View getContainer() {
        Lazy lazy = this.container$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (View) lazy.getValue();
    }

    private final TextView getCountLabel() {
        Lazy lazy = this.countLabel$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (TextView) lazy.getValue();
    }

    private final BadgeImageView getIcon() {
        Lazy lazy = this.icon$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (BadgeImageView) lazy.getValue();
    }

    private final TextView getTitle() {
        Lazy lazy = this.title$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (TextView) lazy.getValue();
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerticalMenuItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.title$delegate = LazyKt.lazy(new VerticalMenuItemView$title$2(this));
        this.icon$delegate = LazyKt.lazy(new VerticalMenuItemView$icon$2(this));
        this.countLabel$delegate = LazyKt.lazy(new VerticalMenuItemView$countLabel$2(this));
        this.container$delegate = LazyKt.lazy(new VerticalMenuItemView$container$2(this));
        this.containerBackground = new GradientDrawable();
        this.containerForeground = new GradientDrawable();
        this.doubleSpace = (int) getResources().getDimension(R.dimen.cnb_space_2);
        this.badgeCount = -1;
        View.inflate(getContext(), R.layout.cnb_vertical_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView countLabel = getCountLabel();
        Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
        Typeface typeface = countLabel.getTypeface();
        Intrinsics.checkExpressionValueIsNotNull(typeface, "countLabel.typeface");
        this.originalTypeFace = typeface;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\f\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ismaeldivita/chipnavigation/view/VerticalMenuItemView$Companion;", "", "()V", "BACKGROUND_CORNER_ANIMATION_DURATION", "", "BULLET", "", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
    /* compiled from: VerticalMenuItemView.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void bind(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, MenuParser.XML_MENU_ITEM_TAG);
        setId(menuItem.getId());
        setEnabled(menuItem.getEnabled());
        this.radius = menuItem.getMenuStyle().getRadius();
        setImportantForAccessibility(1);
        CharSequence contentDescription = menuItem.getContentDescription();
        if (contentDescription == null) {
            contentDescription = menuItem.getTitle();
        }
        setContentDescription(contentDescription);
        Integer textAppearance = menuItem.getMenuStyle().getTextAppearance();
        if (textAppearance != null) {
            getTitle().setTextAppearance(textAppearance.intValue());
        }
        TextView title = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
        title.setText(menuItem.getTitle());
        TextView title2 = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, WebViewActivity.TITLE);
        TextViewKt.setColorStateListAnimator(title2, menuItem.getTextColor(), menuItem.getMenuStyle().getUnselectedColor());
        Integer textAppearance2 = menuItem.getMenuStyle().getTextAppearance();
        if (textAppearance2 != null) {
            getCountLabel().setTextAppearance(textAppearance2.intValue());
        }
        TextView countLabel = getCountLabel();
        Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
        TextViewKt.setColorStateListAnimator(countLabel, menuItem.getTextColor(), menuItem.getMenuStyle().getUnselectedColor());
        BadgeImageView icon = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "icon");
        icon.getLayoutParams().width = menuItem.getMenuStyle().getIconSize();
        BadgeImageView icon2 = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon2, "icon");
        icon2.getLayoutParams().height = menuItem.getMenuStyle().getIconSize();
        getIcon().setBadgeColor(menuItem.getMenuStyle().getBadgeColor());
        getIcon().setImageResource(menuItem.getIcon());
        BadgeImageView icon3 = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon3, "icon");
        ImageViewKt.setColorStateListAnimator(icon3, menuItem.getIconColor(), menuItem.getMenuStyle().getUnselectedColor(), menuItem.getTintMode());
        this.containerBackground.setTint(menuItem.getBackgroundColor());
        this.containerForeground.setTint(ViewCompat.MEASURED_STATE_MASK);
        styleContainerForCollapseState();
        View container = getContainer();
        Intrinsics.checkExpressionValueIsNotNull(container, "container");
        ViewKt.setCustomRipple(container, this.containerBackground, this.containerForeground);
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void showBadge(int i) {
        this.badgeCount = i;
        if (i > 0) {
            TextView countLabel = getCountLabel();
            Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
            countLabel.setTypeface(this.originalTypeFace);
            TextView countLabel2 = getCountLabel();
            Intrinsics.checkExpressionValueIsNotNull(countLabel2, "countLabel");
            countLabel2.setText(String.valueOf(this.badgeCount));
        } else {
            TextView countLabel3 = getCountLabel();
            Intrinsics.checkExpressionValueIsNotNull(countLabel3, "countLabel");
            countLabel3.setTypeface(Typeface.DEFAULT);
            TextView countLabel4 = getCountLabel();
            Intrinsics.checkExpressionValueIsNotNull(countLabel4, "countLabel");
            countLabel4.setText(String.valueOf((char) BULLET));
        }
        if (!isExpanded()) {
            getIcon().showBadge(this.badgeCount);
        }
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void dismissBadge() {
        this.badgeCount = -1;
        getIcon().dismissBadge();
        TextView countLabel = getCountLabel();
        Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
        countLabel.setText("");
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z && isSelected()) {
            setSelected(false);
        }
    }

    public final void expand() {
        styleContainerForExpandedState();
        if (this.badgeCount >= 0) {
            getIcon().dismissBadge();
        }
    }

    public final void collapse() {
        styleContainerForCollapseState();
        if (this.badgeCount >= 0) {
            getIcon().showBadge(this.badgeCount);
        }
    }

    private final boolean isExpanded() {
        TextView title = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
        return title.getVisibility() == 0;
    }

    private final void styleContainerForCollapseState() {
        TextView title = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
        title.setVisibility(8);
        TextView countLabel = getCountLabel();
        Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
        countLabel.setVisibility(8);
        this.containerForeground.setCornerRadius(this.radius);
        View container = getContainer();
        Intrinsics.checkExpressionValueIsNotNull(container, "container");
        ViewGroupKt.updateLayoutParams(container, new VerticalMenuItemView$styleContainerForCollapseState$1(this));
        BadgeImageView icon = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "icon");
        ViewGroupKt.updateLayoutParams(icon, VerticalMenuItemView$styleContainerForCollapseState$2.INSTANCE);
        if (isSelected()) {
            cornerAnimation(this.containerBackground, 0.0f, this.radius).start();
        } else {
            this.containerBackground.setCornerRadius(this.radius);
        }
    }

    private final void styleContainerForExpandedState() {
        float[] fArr;
        if (getLayoutDirection() == 0) {
            float f = this.radius;
            fArr = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        } else {
            float f2 = this.radius;
            fArr = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
        }
        TextView title = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
        title.setAlpha(0.0f);
        TextView title2 = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, WebViewActivity.TITLE);
        title2.setVisibility(0);
        getTitle().animate().alpha(1.0f).setStartDelay(200).start();
        TextView countLabel = getCountLabel();
        Intrinsics.checkExpressionValueIsNotNull(countLabel, "countLabel");
        countLabel.setVisibility(0);
        View container = getContainer();
        Intrinsics.checkExpressionValueIsNotNull(container, "container");
        ViewGroupKt.updateLayoutParams(container, VerticalMenuItemView$styleContainerForExpandedState$1.INSTANCE);
        BadgeImageView icon = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "icon");
        ViewGroupKt.updateLayoutParams(icon, new VerticalMenuItemView$styleContainerForExpandedState$2(this));
        this.containerForeground.setCornerRadii(fArr);
        if (isSelected()) {
            cornerAnimation(this.containerBackground, this.radius, 0.0f).start();
        } else {
            this.containerBackground.setCornerRadii(fArr);
        }
    }

    private final Animator cornerAnimation(GradientDrawable gradientDrawable, float f, float f2) {
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new VerticalMenuItemView$cornerAnimation$$inlined$apply$lambda$1(this, gradientDrawable));
        ofFloat.setDuration(BACKGROUND_CORNER_ANIMATION_DURATION);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(f…MATION_DURATION\n        }");
        return ofFloat;
    }
}
