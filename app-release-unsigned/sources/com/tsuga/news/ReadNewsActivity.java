package com.tsuga.news;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.databinding.ActivityReadNewsBinding;
import com.tsuga.news.readnews.ReadNews;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tsuga/news/ReadNewsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/tsuga/news/databinding/ActivityReadNewsBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ReadNewsActivity.kt */
public final class ReadNewsActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    public static final String DATA = "data";
    private ActivityReadNewsBinding binding;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/ReadNewsActivity$Companion;", "", "()V", "DATA", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: ReadNewsActivity.kt */
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
        ActivityReadNewsBinding inflate = ActivityReadNewsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate != null) {
            setContentView(inflate.getRoot());
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
            getWindow().setFlags(67108864, 67108864);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(DATA, (News) getIntent().getParcelableExtra(DATA));
            ReadNews readNews = new ReadNews();
            readNews.setArguments(bundle2);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_read_container_view, readNews).commit();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }
}
