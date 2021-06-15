package com.tsuga.news.core.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.core.R;
import com.tsuga.news.core.databinding.NewsItemBinding;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.ui.NewsAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tsuga/news/core/ui/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tsuga/news/core/ui/NewsAdapter$ListViewHolder;", "()V", "listData", "Ljava/util/ArrayList;", "Lcom/tsuga/news/core/domain/model/News;", "Lkotlin/collections/ArrayList;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "news", "", "ListViewHolder", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsAdapter.kt */
public final class NewsAdapter extends RecyclerView.Adapter<ListViewHolder> {
    private ArrayList<News> listData = new ArrayList<>();
    private Function1<? super News, Unit> onItemClick;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.tsuga.news.core.domain.model.News, kotlin.Unit>, kotlin.jvm.functions.Function1<com.tsuga.news.core.domain.model.News, kotlin.Unit> */
    public final Function1<News, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Function1<? super News, Unit> function1) {
        this.onItemClick = function1;
    }

    public final void setData(List<News> list) {
        if (list != null) {
            this.listData.clear();
            this.listData.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_item, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inflate(R.layout.news_item, parent, false)");
        return new ListViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listData.size();
    }

    public void onBindViewHolder(ListViewHolder listViewHolder, int i) {
        Intrinsics.checkNotNullParameter(listViewHolder, "holder");
        News news = this.listData.get(i);
        Intrinsics.checkNotNullExpressionValue(news, "listData[position]");
        listViewHolder.bind(news);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tsuga/news/core/ui/NewsAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tsuga/news/core/ui/NewsAdapter;Landroid/view/View;)V", "binding", "Lcom/tsuga/news/core/databinding/NewsItemBinding;", "bind", "", ReadNewsActivity.DATA, "Lcom/tsuga/news/core/domain/model/News;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: NewsAdapter.kt */
    public final class ListViewHolder extends RecyclerView.ViewHolder {
        private final NewsItemBinding binding;
        final /* synthetic */ NewsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListViewHolder(NewsAdapter newsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(newsAdapter, "this$0");
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = newsAdapter;
            NewsItemBinding bind = NewsItemBinding.bind(view);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(itemView)");
            this.binding = bind;
            bind.getRoot().setOnClickListener(new View.OnClickListener(this) {
                /* class com.tsuga.news.core.ui.$$Lambda$NewsAdapter$ListViewHolder$mkGAE6UjLT1Jm9MZ4Op27JzlKg */
                public final /* synthetic */ NewsAdapter.ListViewHolder f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    NewsAdapter.ListViewHolder.m18lambda$mkGAE6UjLT1Jm9MZ4Op27JzlKg(NewsAdapter.this, this.f$1, view);
                }
            });
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0024 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Integer] */
        public final void bind(News news) {
            Intrinsics.checkNotNullParameter(news, ReadNewsActivity.DATA);
            NewsItemBinding newsItemBinding = this.binding;
            RequestManager with = Glide.with(this.itemView);
            String urlToImage = news.getUrlToImage();
            String str = "";
            if (urlToImage == null) {
                urlToImage = str;
            }
            String str2 = urlToImage;
            boolean z = true;
            if (str2.length() == 0) {
                str2 = Integer.valueOf(R.drawable.empty_news);
            }
            ((RequestBuilder) with.load(str2).placeholder(R.drawable.empty_news)).apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(13))).into(newsItemBinding.ivImage);
            TextView textView = newsItemBinding.tvTitle;
            String title = news.getTitle();
            if (title == null) {
                title = str;
            }
            String str3 = title;
            if (str3.length() == 0) {
                str3 = "[Empty Title]";
            }
            textView.setText(str3);
            TextView textView2 = newsItemBinding.tvContent;
            String description = news.getDescription();
            if (description != null) {
                str = description;
            }
            String str4 = str;
            if (str4.length() != 0) {
                z = false;
            }
            if (z) {
                str4 = "[Empty Description]";
            }
            textView2.setText(str4);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: _init_$lambda-4  reason: not valid java name */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m17_init_$lambda4(com.tsuga.news.core.ui.NewsAdapter r0, com.tsuga.news.core.ui.NewsAdapter.ListViewHolder r1, android.view.View r2) {
            /*
                java.lang.String r2 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
                java.lang.String r2 = "this$1"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                kotlin.jvm.functions.Function1 r2 = r0.getOnItemClick()
                if (r2 != 0) goto L_0x0011
                goto L_0x0025
            L_0x0011:
                java.util.ArrayList r0 = com.tsuga.news.core.ui.NewsAdapter.access$getListData$p(r0)
                int r1 = r1.getAbsoluteAdapterPosition()
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "listData[absoluteAdapterPosition]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.invoke(r0)
            L_0x0025:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.core.ui.NewsAdapter.ListViewHolder.m17_init_$lambda4(com.tsuga.news.core.ui.NewsAdapter, com.tsuga.news.core.ui.NewsAdapter$ListViewHolder, android.view.View):void");
        }
    }
}
