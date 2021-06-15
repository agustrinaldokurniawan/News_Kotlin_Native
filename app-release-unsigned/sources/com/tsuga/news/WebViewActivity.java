package com.tsuga.news;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tsuga.news.databinding.ActivityWebViewBinding;
import com.tsuga.news.readnews.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tsuga/news/WebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/tsuga/news/databinding/ActivityWebViewBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: WebViewActivity.kt */
public final class WebViewActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    public static final String TITLE = "title";
    public static final String URL = "url";
    private ActivityWebViewBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tsuga/news/WebViewActivity$Companion;", "", "()V", "TITLE", "", "URL", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: WebViewActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityWebViewBinding inflate = ActivityWebViewBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate != null) {
            setContentView(inflate.getRoot());
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
            getWindow().setFlags(67108864, 67108864);
            String stringExtra = getIntent().getStringExtra(URL);
            String stringExtra2 = getIntent().getStringExtra(TITLE);
            Bundle bundle2 = new Bundle();
            bundle2.putString(URL, stringExtra);
            bundle2.putString(TITLE, stringExtra2);
            WebView webView = new WebView();
            webView.setArguments(bundle2);
            getSupportFragmentManager().beginTransaction().replace(R.id.webview_fragment_container_view, webView).commit();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }
}
