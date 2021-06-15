package com.tsuga.news.readnews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tsuga.news.WebViewActivity;
import com.tsuga.news.databinding.WebviewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tsuga/news/readnews/WebView;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/tsuga/news/databinding/WebviewBinding;", "detachFragment", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: WebView.kt */
public final class WebView extends Fragment {
    private WebviewBinding binding;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        WebviewBinding inflate = WebviewBinding.inflate(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getRoot();
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString(WebViewActivity.URL);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 == null ? null : arguments2.getString(WebViewActivity.TITLE);
        if (string != null) {
            WebviewBinding webviewBinding = this.binding;
            if (webviewBinding != null) {
                WebSettings settings = webviewBinding.webview.getSettings();
                Intrinsics.checkNotNullExpressionValue(settings, "binding.webview.settings");
                settings.setDomStorageEnabled(true);
                WebviewBinding webviewBinding2 = this.binding;
                if (webviewBinding2 != null) {
                    webviewBinding2.webview.setWebViewClient(new WebView$onViewCreated$1(this));
                    WebviewBinding webviewBinding3 = this.binding;
                    if (webviewBinding3 != null) {
                        webviewBinding3.webview.loadUrl(string);
                        WebviewBinding webviewBinding4 = this.binding;
                        if (webviewBinding4 != null) {
                            webviewBinding4.tvTitle.setText(string2);
                            WebviewBinding webviewBinding5 = this.binding;
                            if (webviewBinding5 != null) {
                                webviewBinding5.btnClose.setOnClickListener(new View.OnClickListener() {
                                    /* class com.tsuga.news.readnews.$$Lambda$WebView$vDbE0uCd40YCDWqicUmMn3uFVzQ */

                                    public final void onClick(View view) {
                                        WebView.m25onViewCreated$lambda0(WebView.this, view);
                                    }
                                });
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                throw null;
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            throw null;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
        } else {
            Toast.makeText(requireContext(), "Invalid Url!", 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m25onViewCreated$lambda0(WebView webView, View view) {
        Intrinsics.checkNotNullParameter(webView, "this$0");
        webView.detachFragment();
    }

    private final void detachFragment() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
