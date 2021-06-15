package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.tsuga.news.R;

public final class ActivityWebViewBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final FragmentContainerView webviewFragmentContainerView;

    private ActivityWebViewBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.webviewFragmentContainerView = fragmentContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWebViewBinding bind(View view) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.webview_fragment_container_view);
        if (fragmentContainerView != null) {
            return new ActivityWebViewBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webview_fragment_container_view)));
    }
}
