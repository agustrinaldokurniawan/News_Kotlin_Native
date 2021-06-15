package com.tsuga.news.readnews;

import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tsuga.news.WebViewActivity;
import com.tsuga.news.databinding.WebviewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"com/tsuga/news/readnews/WebView$onViewCreated$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", WebViewActivity.URL, "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: WebView.kt */
public final class WebView$onViewCreated$1 extends WebViewClient {
    final /* synthetic */ WebView this$0;

    WebView$onViewCreated$1(WebView webView) {
        this.this$0 = webView;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebviewBinding webviewBinding = this.this$0.binding;
        if (webviewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        } else if (webviewBinding.pg.getVisibility() == 0) {
            WebviewBinding webviewBinding2 = this.this$0.binding;
            if (webviewBinding2 != null) {
                webviewBinding2.pg.setVisibility(8);
                Log.d("webview", "finish");
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        WebviewBinding webviewBinding = this.this$0.binding;
        if (webviewBinding != null) {
            webviewBinding.tvError.setVisibility(0);
            Log.d("webview", "error");
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }
}
