package com.ismaeldivita.chipnavigation.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n \t*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ismaeldivita/chipnavigation/view/HorizontalMenuItemView;", "Lcom/ismaeldivita/chipnavigation/view/MenuItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getContainer", "()Landroid/view/View;", "container$delegate", "Lkotlin/Lazy;", "icon", "Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;", "getIcon", "()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;", "icon$delegate", "mask", "Landroid/graphics/drawable/Drawable;", WebViewActivity.TITLE, "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title$delegate", "bind", "", MenuParser.XML_MENU_ITEM_TAG, "Lcom/ismaeldivita/chipnavigation/model/MenuItem;", "dismissBadge", "setEnabled", "enabled", "", "setSelected", "selected", "showBadge", "count", "", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
/* compiled from: HorizontalMenuItemView.kt */
public final class HorizontalMenuItemView extends MenuItemView {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HorizontalMenuItemView.class), WebViewActivity.TITLE, "getTitle()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HorizontalMenuItemView.class), "icon", "getIcon()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HorizontalMenuItemView.class), "container", "getContainer()Landroid/view/View;"))};
    private HashMap _$_findViewCache;
    private final Lazy container$delegate;
    private final Lazy icon$delegate;
    private Drawable mask;
    private final Lazy title$delegate;

    public HorizontalMenuItemView(Context context) {
        this(context, null, 2, null);
    }

    private final View getContainer() {
        Lazy lazy = this.container$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (View) lazy.getValue();
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
    public /* synthetic */ HorizontalMenuItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.title$delegate = LazyKt.lazy(new HorizontalMenuItemView$title$2(this));
        this.icon$delegate = LazyKt.lazy(new HorizontalMenuItemView$icon$2(this));
        this.container$delegate = LazyKt.lazy(new HorizontalMenuItemView$container$2(this));
        View.inflate(getContext(), R.layout.cnb_horizontal_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void bind(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, MenuParser.XML_MENU_ITEM_TAG);
        setId(menuItem.getId());
        setImportantForAccessibility(1);
        CharSequence contentDescription = menuItem.getContentDescription();
        if (contentDescription == null) {
            contentDescription = menuItem.getTitle();
        }
        setContentDescription(contentDescription);
        setEnabled(menuItem.getEnabled());
        Integer textAppearance = menuItem.getMenuStyle().getTextAppearance();
        if (textAppearance != null) {
            getTitle().setTextAppearance(textAppearance.intValue());
        }
        TextView title = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
        title.setText(menuItem.getTitle());
        getTitle().setTextColor(menuItem.getTextColor());
        TextView title2 = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, WebViewActivity.TITLE);
        TextViewKt.setColorStateListAnimator(title2, menuItem.getTextColor(), menuItem.getMenuStyle().getUnselectedColor());
        BadgeImageView icon = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "icon");
        icon.getLayoutParams().width = menuItem.getMenuStyle().getIconSize();
        BadgeImageView icon2 = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon2, "icon");
        icon2.getLayoutParams().height = menuItem.getMenuStyle().getIconSize();
        getIcon().setImageResource(menuItem.getIcon());
        getIcon().setBadgeColor(menuItem.getMenuStyle().getBadgeColor());
        BadgeImageView icon3 = getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon3, "icon");
        ImageViewKt.setColorStateListAnimator(icon3, menuItem.getIconColor(), menuItem.getMenuStyle().getUnselectedColor(), menuItem.getTintMode());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(menuItem.getMenuStyle().getRadius());
        gradientDrawable.setTint(menuItem.getBackgroundColor());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(menuItem.getMenuStyle().getRadius());
        gradientDrawable2.setTint(ViewCompat.MEASURED_STATE_MASK);
        this.mask = gradientDrawable2;
        View container = getContainer();
        Intrinsics.checkExpressionValueIsNotNull(container, "container");
        GradientDrawable gradientDrawable3 = gradientDrawable;
        Drawable drawable = this.mask;
        if (drawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mask");
        }
        ViewKt.setCustomRipple(container, gradientDrawable3, drawable);
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void showBadge(int i) {
        getIcon().showBadge(i);
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void dismissBadge() {
        getIcon().dismissBadge();
    }

    @Override // com.ismaeldivita.chipnavigation.view.MenuItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z && isSelected()) {
            setSelected(false);
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            View container = getContainer();
            Intrinsics.checkExpressionValueIsNotNull(container, "container");
            container.setVisibility(8);
            Drawable drawable = this.mask;
            if (drawable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mask");
            }
            drawable.jumpToCurrentState();
            View container2 = getContainer();
            Intrinsics.checkExpressionValueIsNotNull(container2, "container");
            container2.setVisibility(0);
            TextView title = getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, WebViewActivity.TITLE);
            title.setVisibility(0);
            return;
        }
        TextView title2 = getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title2, WebViewActivity.TITLE);
        title2.setVisibility(8);
    }
}
