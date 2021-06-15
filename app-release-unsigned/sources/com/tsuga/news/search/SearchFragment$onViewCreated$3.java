package com.tsuga.news.search;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.Observer;
import com.tsuga.news.core.ui.NewsAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/tsuga/news/search/SearchFragment$onViewCreated$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: SearchFragment.kt */
public final class SearchFragment$onViewCreated$3 implements TextWatcher {
    final /* synthetic */ NewsAdapter $newsAdapter;
    final /* synthetic */ SearchFragment this$0;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    SearchFragment$onViewCreated$3(SearchFragment searchFragment, NewsAdapter newsAdapter) {
        this.this$0 = searchFragment;
        this.$newsAdapter = newsAdapter;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.this$0.getViewModel().searchNews(String.valueOf(charSequence)).observe(this.this$0.getViewLifecycleOwner(), new Observer() {
            /* class com.tsuga.news.search.$$Lambda$SearchFragment$onViewCreated$3$DL_Qkwzv_hZI7xnUcYU00MEzhfM */

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchFragment$onViewCreated$3.m28onTextChanged$lambda1(NewsAdapter.this, (List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: onTextChanged$lambda-1  reason: not valid java name */
    public static final void m28onTextChanged$lambda1(NewsAdapter newsAdapter, List list) {
        Intrinsics.checkNotNullParameter(newsAdapter, "$newsAdapter");
        newsAdapter.setData(list);
    }
}
