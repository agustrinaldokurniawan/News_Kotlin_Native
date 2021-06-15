package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.tsuga.news.R;

public final class ActivityMainBinding implements ViewBinding {
    public final ChipNavigationBar cnb;
    public final FragmentContainerView homeFragmentContainer;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, ChipNavigationBar chipNavigationBar, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.cnb = chipNavigationBar;
        this.homeFragmentContainer = fragmentContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.cnb;
        ChipNavigationBar chipNavigationBar = (ChipNavigationBar) view.findViewById(R.id.cnb);
        if (chipNavigationBar != null) {
            i = R.id.home_fragment_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.home_fragment_container);
            if (fragmentContainerView != null) {
                return new ActivityMainBinding((ConstraintLayout) view, chipNavigationBar, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
