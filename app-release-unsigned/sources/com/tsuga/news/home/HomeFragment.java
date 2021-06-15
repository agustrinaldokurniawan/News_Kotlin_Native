package com.tsuga.news.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.tsuga.news.R;
import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.ui.NewsAdapter;
import com.tsuga.news.databinding.HomeFragmentBinding;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/tsuga/news/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/tsuga/news/databinding/HomeFragmentBinding;", "binding", "getBinding", "()Lcom/tsuga/news/databinding/HomeFragmentBinding;", "homeViewModel", "Lcom/tsuga/news/home/HomeViewModel;", "getHomeViewModel", "()Lcom/tsuga/news/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "startRead", "it", "Lcom/tsuga/news/core/domain/model/News;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: HomeFragment.kt */
public final class HomeFragment extends Fragment {
    private HomeFragmentBinding _binding;
    private final Lazy homeViewModel$delegate;

    public HomeFragment() {
        HomeFragment homeFragment = this;
        this.homeViewModel$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new HomeFragment$special$$inlined$viewModel$default$2(homeFragment, null, null, new HomeFragment$special$$inlined$viewModel$default$1(homeFragment), null));
    }

    private final HomeFragmentBinding getBinding() {
        HomeFragmentBinding homeFragmentBinding = this._binding;
        Intrinsics.checkNotNull(homeFragmentBinding);
        return homeFragmentBinding;
    }

    private final HomeViewModel getHomeViewModel() {
        return (HomeViewModel) this.homeViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this._binding = HomeFragmentBinding.inflate(layoutInflater, viewGroup, false);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            NewsAdapter newsAdapter = new NewsAdapter();
            newsAdapter.setOnItemClick(new HomeFragment$onViewCreated$1(this));
            getHomeViewModel().getNews().observe(getViewLifecycleOwner(), new Observer(newsAdapter, view) {
                /* class com.tsuga.news.home.$$Lambda$HomeFragment$5ONwYSMD_mUidBLnfX0ONq9zT_I */
                public final /* synthetic */ NewsAdapter f$1;
                public final /* synthetic */ View f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    HomeFragment.m19onViewCreated$lambda2(HomeFragment.this, this.f$1, this.f$2, (Resource) obj);
                }
            });
            RecyclerView recyclerView = getBinding().rvNews;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(newsAdapter);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0082 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Integer] */
    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m19onViewCreated$lambda2(HomeFragment homeFragment, NewsAdapter newsAdapter, View view, Resource resource) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Intrinsics.checkNotNullParameter(newsAdapter, "$newsAdapter");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (resource == null) {
            return;
        }
        if (resource instanceof Resource.Loading) {
            homeFragment.getBinding().pg.setVisibility(0);
        } else if (resource instanceof Resource.Success) {
            homeFragment.getBinding().pg.setVisibility(8);
            newsAdapter.setData((List) resource.getData());
            if (resource.getData() != null) {
                List list = (List) resource.getData();
                Intrinsics.checkNotNull(list);
                int random = RangesKt.random(new IntRange(0, list.size() - 1), Random.Default);
                RequestManager with = Glide.with(view);
                List list2 = (List) resource.getData();
                Intrinsics.checkNotNull(list2);
                String urlToImage = ((News) list2.get(random)).getUrlToImage();
                if (urlToImage == null) {
                    urlToImage = "";
                }
                String str = urlToImage;
                if (str.length() == 0) {
                    str = Integer.valueOf((int) R.drawable.empty_news);
                }
                with.load(str).apply(new RequestOptions().transform(new CenterCrop(), new GranularRoundedCorners(0.0f, 0.0f, 50.0f, 40.0f))).into(homeFragment.getBinding().ivImage);
                TextView textView = homeFragment.getBinding().tvTitle;
                List list3 = (List) resource.getData();
                Intrinsics.checkNotNull(list3);
                textView.setText(((News) list3.get(random)).getTitle());
                TextView textView2 = homeFragment.getBinding().tvSource;
                List list4 = (List) resource.getData();
                Intrinsics.checkNotNull(list4);
                textView2.setText(((News) list4.get(random)).getSource());
                homeFragment.getBinding().btnReadMore.setOnClickListener(new View.OnClickListener(resource, random) {
                    /* class com.tsuga.news.home.$$Lambda$HomeFragment$vS9dL1HFICqVt6cA11pD9cocWaQ */
                    public final /* synthetic */ Resource f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        HomeFragment.m20onViewCreated$lambda2$lambda1(HomeFragment.this, this.f$1, this.f$2, view);
                    }
                });
            }
        } else if (resource instanceof Resource.Error) {
            homeFragment.getBinding().pg.setVisibility(8);
            homeFragment.getBinding().tvError.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m20onViewCreated$lambda2$lambda1(HomeFragment homeFragment, Resource resource, int i, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        List list = (List) resource.getData();
        Intrinsics.checkNotNull(list);
        homeFragment.startRead((News) list.get(i));
    }

    /* access modifiers changed from: private */
    public final void startRead(News news) {
        Intent intent = new Intent(getActivity(), ReadNewsActivity.class);
        intent.putExtra(ReadNewsActivity.DATA, news);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this._binding = null;
    }
}
