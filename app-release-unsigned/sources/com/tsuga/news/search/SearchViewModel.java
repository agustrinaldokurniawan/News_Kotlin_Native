package com.tsuga.news.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.domain.usecase.NewsUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tsuga/news/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCase", "Lcom/tsuga/news/core/domain/usecase/NewsUseCase;", "(Lcom/tsuga/news/core/domain/usecase/NewsUseCase;)V", "searchNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/tsuga/news/core/domain/model/News;", "keyword", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: SearchViewModel.kt */
public final class SearchViewModel extends ViewModel {
    private final NewsUseCase newsUseCase;

    public SearchViewModel(NewsUseCase newsUseCase2) {
        Intrinsics.checkNotNullParameter(newsUseCase2, "newsUseCase");
        this.newsUseCase = newsUseCase2;
    }

    public final LiveData<List<News>> searchNews(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        LiveData<List<News>> fromPublisher = LiveDataReactiveStreams.fromPublisher(this.newsUseCase.getNewsByKeyword(str));
        Intrinsics.checkNotNullExpressionValue(fromPublisher, "fromPublisher(newsUseCase.getNewsByKeyword(keyword))");
        return fromPublisher;
    }
}
