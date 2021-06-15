package com.tsuga.news.readnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
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
import com.tsuga.news.WebViewActivity;
import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.ui.NewsAdapter;
import com.tsuga.news.databinding.ReadNewsFragmentBinding;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/tsuga/news/readnews/ReadNews;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/tsuga/news/databinding/ReadNewsFragmentBinding;", "viewModel", "Lcom/tsuga/news/readnews/ReadNewsViewModel;", "getViewModel", "()Lcom/tsuga/news/readnews/ReadNewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "openUrl", WebViewActivity.URL, "", WebViewActivity.TITLE, "setBookmark", "statusBookmark", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ReadNews.kt */
public final class ReadNews extends Fragment {
    private ReadNewsFragmentBinding binding;
    private final Lazy viewModel$delegate;

    public ReadNews() {
        ReadNews readNews = this;
        this.viewModel$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ReadNews$special$$inlined$viewModel$default$2(readNews, null, null, new ReadNews$special$$inlined$viewModel$default$1(readNews), null));
    }

    private final ReadNewsViewModel getViewModel() {
        return (ReadNewsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ReadNewsFragmentBinding inflate = ReadNewsFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        if (inflate != null) {
            ScrollView root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            return root;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0055 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Integer] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        NewsAdapter newsAdapter = new NewsAdapter();
        newsAdapter.setOnItemClick(new ReadNews$onViewCreated$1(this));
        Bundle arguments = getArguments();
        News news = arguments == null ? null : (News) arguments.getParcelable(ReadNewsActivity.DATA);
        if (news != null) {
            setBookmark(news.isBookmark());
        }
        ReadNewsFragmentBinding readNewsFragmentBinding = this.binding;
        if (readNewsFragmentBinding != null) {
            RequestManager with = Glide.with(view);
            if (news == null) {
                str = null;
            } else {
                str = news.getUrlToImage();
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (str3.length() == 0) {
                str3 = Integer.valueOf((int) R.drawable.empty_news);
            }
            with.load(str3).apply(new RequestOptions().transform(new CenterCrop(), new GranularRoundedCorners(0.0f, 0.0f, 50.0f, 40.0f))).into(readNewsFragmentBinding.ivImage);
            readNewsFragmentBinding.tvTitle.setText(news == null ? null : news.getTitle());
            readNewsFragmentBinding.tvSource.setText(news == null ? null : news.getSource());
            readNewsFragmentBinding.tvContent.setText(news == null ? null : news.getContent());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM yyyy");
            if (news == null) {
                str2 = null;
            } else {
                str2 = news.getPublishedAt();
            }
            readNewsFragmentBinding.tvDate.setText(simpleDateFormat2.format(simpleDateFormat.parse(str2)).toString());
            readNewsFragmentBinding.btnBookmark.setOnClickListener(new View.OnClickListener(this) {
                /* class com.tsuga.news.readnews.$$Lambda$ReadNews$FEBZoOX1solKlIePyHza_b7rRiA */
                public final /* synthetic */ ReadNews f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    ReadNews.m22onViewCreated$lambda3$lambda1(News.this, this.f$1, view);
                }
            });
            readNewsFragmentBinding.btnReadMore.setOnClickListener(new View.OnClickListener(news) {
                /* class com.tsuga.news.readnews.$$Lambda$ReadNews$ebRLDm4Xu_xoVWxy2mrnbJIimSg */
                public final /* synthetic */ News f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    ReadNews.m23onViewCreated$lambda3$lambda2(ReadNews.this, this.f$1, view);
                }
            });
            getViewModel().getNews().observe(getViewLifecycleOwner(), new Observer() {
                /* class com.tsuga.news.readnews.$$Lambda$ReadNews$GKydYrxGto6yqloKykxNV8r8 */

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    ReadNews.m24onViewCreated$lambda4(NewsAdapter.this, (Resource) obj);
                }
            });
            ReadNewsFragmentBinding readNewsFragmentBinding2 = this.binding;
            if (readNewsFragmentBinding2 != null) {
                RecyclerView recyclerView = readNewsFragmentBinding2.rvNews;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(newsAdapter);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    public static final void m22onViewCreated$lambda3$lambda1(News news, ReadNews readNews, View view) {
        Intrinsics.checkNotNullParameter(readNews, "this$0");
        Boolean valueOf = news == null ? null : Boolean.valueOf(news.isBookmark());
        Intrinsics.checkNotNull(valueOf);
        boolean z = !valueOf.booleanValue();
        readNews.getViewModel().setBookmarkNews(news, z);
        readNews.setBookmark(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m23onViewCreated$lambda3$lambda2(ReadNews readNews, News news, View view) {
        Intrinsics.checkNotNullParameter(readNews, "this$0");
        String str = null;
        String url = news == null ? null : news.getUrl();
        if (news != null) {
            str = news.getTitle();
        }
        readNews.openUrl(url, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m24onViewCreated$lambda4(NewsAdapter newsAdapter, Resource resource) {
        Intrinsics.checkNotNullParameter(newsAdapter, "$newsAdapter");
        if (resource != null && !(resource instanceof Resource.Loading)) {
            if (resource instanceof Resource.Success) {
                newsAdapter.setData((List) resource.getData());
            } else {
                boolean z = resource instanceof Resource.Error;
            }
        }
    }

    private final void openUrl(String str, String str2) {
        Intent intent = new Intent(getActivity(), WebViewActivity.class);
        intent.putExtra(WebViewActivity.URL, str);
        intent.putExtra(WebViewActivity.TITLE, str2);
        startActivity(intent);
    }

    private final void setBookmark(boolean z) {
        if (z) {
            ReadNewsFragmentBinding readNewsFragmentBinding = this.binding;
            if (readNewsFragmentBinding != null) {
                readNewsFragmentBinding.btnBookmark.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_bookmark_24_white));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
        } else {
            ReadNewsFragmentBinding readNewsFragmentBinding2 = this.binding;
            if (readNewsFragmentBinding2 != null) {
                readNewsFragmentBinding2.btnBookmark.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_bookmark_border_24));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
        }
    }
}
