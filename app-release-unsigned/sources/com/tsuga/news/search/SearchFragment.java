package com.tsuga.news.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tsuga.news.core.ui.NewsAdapter;
import com.tsuga.news.databinding.SearchFragmentBinding;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tsuga/news/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/tsuga/news/databinding/SearchFragmentBinding;", "binding", "getBinding", "()Lcom/tsuga/news/databinding/SearchFragmentBinding;", "viewModel", "Lcom/tsuga/news/search/SearchViewModel;", "getViewModel", "()Lcom/tsuga/news/search/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: SearchFragment.kt */
public final class SearchFragment extends Fragment {
    private SearchFragmentBinding _binding;
    private final Lazy viewModel$delegate;

    public SearchFragment() {
        SearchFragment searchFragment = this;
        this.viewModel$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new SearchFragment$special$$inlined$viewModel$default$2(searchFragment, null, null, new SearchFragment$special$$inlined$viewModel$default$1(searchFragment), null));
    }

    private final SearchFragmentBinding getBinding() {
        SearchFragmentBinding searchFragmentBinding = this._binding;
        Intrinsics.checkNotNull(searchFragmentBinding);
        return searchFragmentBinding;
    }

    /* access modifiers changed from: private */
    public final SearchViewModel getViewModel() {
        return (SearchViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this._binding = SearchFragmentBinding.inflate(getLayoutInflater(), viewGroup, false);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            NewsAdapter newsAdapter = new NewsAdapter();
            newsAdapter.setOnItemClick(new SearchFragment$onViewCreated$1(this));
            getViewModel().searchNews("").observe(getViewLifecycleOwner(), new Observer() {
                /* class com.tsuga.news.search.$$Lambda$SearchFragment$lsvLWsTo2eU_CajOnig6bn5wao */

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SearchFragment.m27onViewCreated$lambda0(NewsAdapter.this, (List) obj);
                }
            });
            getBinding().etNews.addTextChangedListener(new SearchFragment$onViewCreated$3(this, newsAdapter));
            RecyclerView recyclerView = getBinding().rvNews;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(newsAdapter);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m27onViewCreated$lambda0(NewsAdapter newsAdapter, List list) {
        Intrinsics.checkNotNullParameter(newsAdapter, "$newsAdapter");
        if (list != null) {
            newsAdapter.setData(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this._binding = null;
    }
}
