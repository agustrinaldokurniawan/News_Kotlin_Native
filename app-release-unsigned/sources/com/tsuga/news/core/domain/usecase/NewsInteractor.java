package com.tsuga.news.core.domain.usecase;

import com.tsuga.news.core.data.Resource;
import com.tsuga.news.core.domain.model.News;
import com.tsuga.news.core.domain.repository.INewsRepository;
import io.reactivex.Flowable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tsuga/news/core/domain/usecase/NewsInteractor;", "Lcom/tsuga/news/core/domain/usecase/NewsUseCase;", "newsRepository", "Lcom/tsuga/news/core/domain/repository/INewsRepository;", "(Lcom/tsuga/news/core/domain/repository/INewsRepository;)V", "getAllNews", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/Resource;", "", "Lcom/tsuga/news/core/domain/model/News;", "getBookmarkByKeyword", "keyword", "", "getFavoriteNews", "getNewsByKeyword", "setBookmarkNews", "", "news", "state", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsInteractor.kt */
public final class NewsInteractor implements NewsUseCase {
    private final INewsRepository newsRepository;

    public NewsInteractor(INewsRepository iNewsRepository) {
        Intrinsics.checkNotNullParameter(iNewsRepository, "newsRepository");
        this.newsRepository = iNewsRepository;
    }

    @Override // com.tsuga.news.core.domain.usecase.NewsUseCase
    public Flowable<Resource<List<News>>> getAllNews() {
        return this.newsRepository.getAllNews();
    }

    @Override // com.tsuga.news.core.domain.usecase.NewsUseCase
    public Flowable<List<News>> getFavoriteNews() {
        return this.newsRepository.getFavoriteNews();
    }

    @Override // com.tsuga.news.core.domain.usecase.NewsUseCase
    public void setBookmarkNews(News news, boolean z) {
        Intrinsics.checkNotNullParameter(news, "news");
        this.newsRepository.setBookmarkNews(news, z);
    }

    @Override // com.tsuga.news.core.domain.usecase.NewsUseCase
    public Flowable<List<News>> getNewsByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        return this.newsRepository.getNewsByKeyword(str);
    }

    @Override // com.tsuga.news.core.domain.usecase.NewsUseCase
    public Flowable<List<News>> getBookmarkByKeyword(String str) {
        Intrinsics.checkNotNullParameter(str, "keyword");
        return this.newsRepository.getBookmarkByKeyword(str);
    }
}
