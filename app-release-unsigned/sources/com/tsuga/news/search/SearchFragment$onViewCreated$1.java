package com.tsuga.news.search;

import android.content.Intent;
import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.core.domain.model.News;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/tsuga/news/core/domain/model/News;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: SearchFragment.kt */
final class SearchFragment$onViewCreated$1 extends Lambda implements Function1<News, Unit> {
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFragment$onViewCreated$1(SearchFragment searchFragment) {
        super(1);
        this.this$0 = searchFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(News news) {
        invoke(news);
        return Unit.INSTANCE;
    }

    public final void invoke(News news) {
        Intrinsics.checkNotNullParameter(news, "it");
        Intent intent = new Intent(this.this$0.getActivity(), ReadNewsActivity.class);
        intent.putExtra(ReadNewsActivity.DATA, news);
        this.this$0.startActivity(intent);
    }
}
