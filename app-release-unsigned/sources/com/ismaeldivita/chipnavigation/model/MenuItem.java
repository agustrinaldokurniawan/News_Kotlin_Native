package com.ismaeldivita.chipnavigation.model;

import android.graphics.PorterDuff;
import com.tsuga.news.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"Lcom/ismaeldivita/chipnavigation/model/MenuItem;", "", "id", "", WebViewActivity.TITLE, "", "contentDescription", "icon", "enabled", "", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "iconColor", "textColor", "backgroundColor", "menuStyle", "Lcom/ismaeldivita/chipnavigation/model/MenuStyle;", "(ILjava/lang/CharSequence;Ljava/lang/CharSequence;IZLandroid/graphics/PorterDuff$Mode;IIILcom/ismaeldivita/chipnavigation/model/MenuStyle;)V", "getBackgroundColor", "()I", "getContentDescription", "()Ljava/lang/CharSequence;", "getEnabled", "()Z", "getIcon", "getIconColor", "getId", "getMenuStyle", "()Lcom/ismaeldivita/chipnavigation/model/MenuStyle;", "getTextColor", "getTintMode", "()Landroid/graphics/PorterDuff$Mode;", "getTitle", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
/* compiled from: MenuItem.kt */
public final class MenuItem {
    private final int backgroundColor;
    private final CharSequence contentDescription;
    private final boolean enabled;
    private final int icon;
    private final int iconColor;
    private final int id;
    private final MenuStyle menuStyle;
    private final int textColor;
    private final PorterDuff.Mode tintMode;
    private final CharSequence title;

    public MenuItem(int i, CharSequence charSequence, CharSequence charSequence2, int i2, boolean z, PorterDuff.Mode mode, int i3, int i4, int i5, MenuStyle menuStyle2) {
        Intrinsics.checkParameterIsNotNull(charSequence, WebViewActivity.TITLE);
        Intrinsics.checkParameterIsNotNull(menuStyle2, "menuStyle");
        this.id = i;
        this.title = charSequence;
        this.contentDescription = charSequence2;
        this.icon = i2;
        this.enabled = z;
        this.tintMode = mode;
        this.iconColor = i3;
        this.textColor = i4;
        this.backgroundColor = i5;
        this.menuStyle = menuStyle2;
    }

    public final int getId() {
        return this.id;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getContentDescription() {
        return this.contentDescription;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final PorterDuff.Mode getTintMode() {
        return this.tintMode;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final MenuStyle getMenuStyle() {
        return this.menuStyle;
    }
}
