package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.tsuga.news.R;

public final class WebviewBinding implements ViewBinding {
    public final ImageButton btnClose;
    public final ProgressBar pg;
    private final ConstraintLayout rootView;
    public final TextView tvError;
    public final TextView tvTitle;
    public final WebView webview;

    private WebviewBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ProgressBar progressBar, TextView textView, TextView textView2, WebView webView) {
        this.rootView = constraintLayout;
        this.btnClose = imageButton;
        this.pg = progressBar;
        this.tvError = textView;
        this.tvTitle = textView2;
        this.webview = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static WebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static WebviewBinding bind(View view) {
        int i = R.id.btn_close;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btn_close);
        if (imageButton != null) {
            i = R.id.pg;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pg);
            if (progressBar != null) {
                i = R.id.tv_error;
                TextView textView = (TextView) view.findViewById(R.id.tv_error);
                if (textView != null) {
                    i = R.id.tv_title;
                    TextView textView2 = (TextView) view.findViewById(R.id.tv_title);
                    if (textView2 != null) {
                        i = R.id.webview;
                        WebView webView = (WebView) view.findViewById(R.id.webview);
                        if (webView != null) {
                            return new WebviewBinding((ConstraintLayout) view, imageButton, progressBar, textView, textView2, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
