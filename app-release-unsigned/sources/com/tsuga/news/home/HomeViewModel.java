package com.tsuga.news.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.domain.usecase.NewsUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R7\u0010\u0005\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b \n*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tsuga/news/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCase", "Lcom/tsuga/news/core/domain/usecase/NewsUseCase;", "(Lcom/tsuga/news/core/domain/usecase/NewsUseCase;)V", "news", "Landroidx/lifecycle/LiveData;", "Lcom/tsuga/news/core/data/Resource;", "", "Lcom/tsuga/news/core/domain/model/News;", "kotlin.jvm.PlatformType", "getNews", "()Landroidx/lifecycle/LiveData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends ViewModel {
    private final LiveData<Resource<List<News>>> news;

    public HomeViewModel(NewsUseCase newsUseCase) {
        Intrinsics.checkNotNullParameter(newsUseCase, "newsUseCase");
        LiveData<Resource<List<News>>> fromPublisher = LiveDataReactiveStreams.fromPublisher(newsUseCase.getAllNews());
        Intrinsics.checkNotNullExpressionValue(fromPublisher, "fromPublisher(newsUseCase.getAllNews())");
        this.news = fromPublisher;
    }

    public final LiveData<Resource<List<News>>> getNews() {
        return this.news;
    }
}
