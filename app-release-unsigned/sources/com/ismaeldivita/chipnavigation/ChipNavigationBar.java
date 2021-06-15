package com.ismaeldivita.chipnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ismaeldivita.chipnavigation.model.Menu;
import com.ismaeldivita.chipnavigation.model.MenuItem;
import com.ismaeldivita.chipnavigation.model.MenuParser;
import com.ismaeldivita.chipnavigation.model.MenuStyle;
import com.ismaeldivita.chipnavigation.util.InsetsKt;
import com.ismaeldivita.chipnavigation.util.ViewGroupKt;
import com.ismaeldivita.chipnavigation.view.HorizontalMenuItemView;
import com.ismaeldivita.chipnavigation.view.MenuItemView;
import com.ismaeldivita.chipnavigation.view.VerticalMenuItemView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

public final class ChipNavigationBar extends ConstraintLayout {
    private HashMap _$_findViewCache;
    private final Map<Integer, Integer> badgesState;
    private boolean isExpanded;
    private OnItemSelectedListener listener;
    private int menuRes;
    private final MenuStyle menuStyle;
    private int minimumExpandedWidth;
    private MenuOrientation orientationMode;

    public enum MenuOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public interface OnItemSelectedListener {
        void onItemSelected(int i);
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MenuOrientation.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MenuOrientation.HORIZONTAL.ordinal()] = 1;
            iArr[MenuOrientation.VERTICAL.ordinal()] = 2;
            int[] iArr2 = new int[MenuOrientation.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[MenuOrientation.VERTICAL.ordinal()] = 1;
            iArr2[MenuOrientation.HORIZONTAL.ordinal()] = 2;
            int[] iArr3 = new int[MenuOrientation.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[MenuOrientation.HORIZONTAL.ordinal()] = 1;
            iArr3[MenuOrientation.VERTICAL.ordinal()] = 2;
        }
    }

    public ChipNavigationBar(Context context) {
        this(context, null, 2, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

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
    public /* synthetic */ ChipNavigationBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipNavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MenuOrientation menuOrientation;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.menuRes = -1;
        this.badgesState = new LinkedHashMap();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ChipNavigationBar);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ChipNavigationBar_cnb_menuResource, -1);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.ChipNavigationBar_cnb_minExpandedWidth, 0.0f);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.ChipNavigationBar_cnb_addLeftInset, false);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.ChipNavigationBar_cnb_addTopInset, false);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.ChipNavigationBar_cnb_addRightInset, false);
        boolean z4 = obtainStyledAttributes.getBoolean(R.styleable.ChipNavigationBar_cnb_addBottomInset, false);
        int i = obtainStyledAttributes.getInt(R.styleable.ChipNavigationBar_cnb_orientationMode, 0);
        if (i == 0) {
            menuOrientation = MenuOrientation.HORIZONTAL;
        } else if (i != 1) {
            menuOrientation = MenuOrientation.HORIZONTAL;
        } else {
            menuOrientation = MenuOrientation.VERTICAL;
        }
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "a");
        this.menuStyle = new MenuStyle(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setMenuOrientation(menuOrientation);
        if (resourceId >= 0) {
            setMenuResource(resourceId);
        }
        setMinimumExpandedWidth((int) dimension);
        InsetsKt.applyWindowInsets(this, z, z2, z3, z4);
        collapse();
        setClickable(true);
    }

    public final void setMenuResource(int i) {
        Flow flow;
        this.menuRes = i;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Menu parse = new MenuParser(context).parse(i, this.menuStyle);
        ChipNavigationBar$setMenuResource$childListener$1 chipNavigationBar$setMenuResource$childListener$1 = new ChipNavigationBar$setMenuResource$childListener$1(this);
        removeAllViews();
        Iterator<T> it = parse.getItems().iterator();
        while (it.hasNext()) {
            MenuItemView createMenuItem = createMenuItem();
            createMenuItem.bind(it.next());
            createMenuItem.setOnClickListener(new ChipNavigationBar$sam$i$android_view_View_OnClickListener$0(chipNavigationBar$setMenuResource$childListener$1));
            addView(createMenuItem);
        }
        MenuOrientation menuOrientation = this.orientationMode;
        if (menuOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationMode");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[menuOrientation.ordinal()];
        if (i2 == 1) {
            flow = getHorizontalFlow();
        } else if (i2 == 2) {
            flow = getVerticalFlow();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        List<MenuItem> items = parse.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getId()));
        }
        flow.setReferencedIds(CollectionsKt.toIntArray(arrayList));
        addView(flow);
    }

    public final void setMenuOrientation(MenuOrientation menuOrientation) {
        Intrinsics.checkParameterIsNotNull(menuOrientation, "menuOrientation");
        this.orientationMode = menuOrientation;
    }

    public final void setItemEnabled(int i, boolean z) {
        MenuItemView itemById = getItemById(i);
        if (itemById != null) {
            itemById.setEnabled(z);
        }
    }

    public static /* synthetic */ void setItemSelected$default(ChipNavigationBar chipNavigationBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        chipNavigationBar.setItemSelected(i, z);
    }

    public final void setItemSelected(int i, boolean z) {
        setItemSelected(i, z, true);
    }

    public final void setMinimumExpandedWidth(int i) {
        this.minimumExpandedWidth = i;
    }

    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        Intrinsics.checkParameterIsNotNull(onItemSelectedListener, "listener");
        this.listener = onItemSelectedListener;
    }

    public final void setOnItemSelectedListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        setOnItemSelectedListener(new ChipNavigationBar$setOnItemSelectedListener$1(function1));
    }

    public final void showBadge(int i) {
        this.badgesState.put(Integer.valueOf(i), 0);
        MenuItemView itemById = getItemById(i);
        if (itemById != null) {
            MenuItemView.showBadge$default(itemById, 0, 1, null);
        }
    }

    public final void showBadge(int i, int i2) {
        this.badgesState.put(Integer.valueOf(i), Integer.valueOf(i2));
        MenuItemView itemById = getItemById(i);
        if (itemById != null) {
            itemById.showBadge(i2);
        }
    }

    public final void dismissBadge(int i) {
        this.badgesState.remove(Integer.valueOf(i));
        MenuItemView itemById = getItemById(i);
        if (itemById != null) {
            itemById.dismissBadge();
        }
    }

    public final void collapse() {
        this.isExpanded = false;
        MenuOrientation menuOrientation = this.orientationMode;
        if (menuOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationMode");
        }
        if (menuOrientation == MenuOrientation.VERTICAL) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(i)");
                childAt.setMinimumWidth(0);
                if (!(childAt instanceof VerticalMenuItemView)) {
                    childAt = null;
                }
                VerticalMenuItemView verticalMenuItemView = (VerticalMenuItemView) childAt;
                if (verticalMenuItemView != null) {
                    verticalMenuItemView.collapse();
                }
            }
        }
    }

    public final void expand() {
        this.isExpanded = true;
        MenuOrientation menuOrientation = this.orientationMode;
        if (menuOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationMode");
        }
        if (menuOrientation == MenuOrientation.VERTICAL) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(i)");
                childAt.setMinimumWidth(this.minimumExpandedWidth);
                if (!(childAt instanceof VerticalMenuItemView)) {
                    childAt = null;
                }
                VerticalMenuItemView verticalMenuItemView = (VerticalMenuItemView) childAt;
                if (verticalMenuItemView != null) {
                    verticalMenuItemView.expand();
                }
            }
        }
    }

    public final boolean isExpanded() {
        MenuOrientation menuOrientation = this.orientationMode;
        if (menuOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationMode");
        }
        int i = WhenMappings.$EnumSwitchMapping$1[menuOrientation.ordinal()];
        if (i == 1) {
            return this.isExpanded;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getSelectedItemId() {
        View selectedItem = getSelectedItem();
        if (selectedItem != null) {
            return selectedItem.getId();
        }
        return -1;
    }

    private final void setItemSelected(int i, boolean z, boolean z2) {
        MenuItemView itemById;
        OnItemSelectedListener onItemSelectedListener;
        View selectedItem = getSelectedItem();
        if (z && (selectedItem == null || selectedItem.getId() != i)) {
            if (selectedItem != null) {
                selectedItem.setSelected(false);
            }
            MenuItemView itemById2 = getItemById(i);
            if (itemById2 != null) {
                TransitionManager.beginDelayedTransition(this);
                itemById2.setSelected(true);
                if (z2 && (onItemSelectedListener = this.listener) != null) {
                    onItemSelectedListener.onItemSelected(i);
                }
            }
        } else if (!z && (itemById = getItemById(i)) != null) {
            TransitionManager.beginDelayedTransition(this);
            itemById.setSelected(false);
        }
    }

    private final View getSelectedItem() {
        View view;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            view = it.next();
            if (view.isSelected()) {
                break;
            }
        }
        return view;
    }

    private final MenuItemView getItemById(int i) {
        Object obj;
        boolean z;
        Sequence filter = SequencesKt.filter(ViewGroupKt.getChildren(this), ChipNavigationBar$getItemById$$inlined$filterIsInstance$1.INSTANCE);
        if (filter != null) {
            Iterator it = filter.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MenuItemView) obj).getId() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return (MenuItemView) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
    }

    private final MenuItemView createMenuItem() {
        MenuOrientation menuOrientation = this.orientationMode;
        if (menuOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationMode");
        }
        int i = WhenMappings.$EnumSwitchMapping$2[menuOrientation.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return new HorizontalMenuItemView(context, null, 2, null);
        } else if (i == 2) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            return new VerticalMenuItemView(context2, null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final Flow getHorizontalFlow() {
        Flow flow = new Flow(getContext());
        flow.setOrientation(0);
        flow.setHorizontalStyle(0);
        flow.setHorizontalAlign(0);
        flow.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return flow;
    }

    private final Flow getVerticalFlow() {
        Flow flow = new Flow(getContext());
        flow.setOrientation(1);
        flow.setHorizontalAlign(0);
        flow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return flow;
    }

    public Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState(), new Bundle());
        state.setMenuId(this.menuRes);
        state.setSelectedItem(getSelectedItemId());
        state.setBadges(this.badgesState);
        state.setExpanded(this.isExpanded);
        state.setEnabled(MapsKt.toMap(SequencesKt.map(ViewGroupKt.getChildren(this), ChipNavigationBar$onSaveInstanceState$1$1.INSTANCE)));
        return state;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemView itemById;
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            if (state.getMenuId() != -1) {
                setMenuResource(state.getMenuId());
            }
            if (state.getSelectedItem() != -1) {
                setItemSelected(state.getSelectedItem(), true, false);
            }
            if (state.getExpanded()) {
                expand();
            } else {
                collapse();
            }
            for (Map.Entry<Integer, Integer> entry : state.getBadges().entrySet()) {
                int intValue = entry.getKey().intValue();
                int intValue2 = entry.getValue().intValue();
                if (intValue2 > 0) {
                    showBadge(intValue, intValue2);
                } else {
                    showBadge(intValue);
                }
            }
            for (Map.Entry<Integer, Boolean> entry2 : state.getEnabled().entrySet()) {
                int intValue3 = entry2.getKey().intValue();
                boolean booleanValue = entry2.getValue().booleanValue();
                if (!booleanValue && (itemById = getItemById(intValue3)) != null) {
                    itemById.setEnabled(booleanValue);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
