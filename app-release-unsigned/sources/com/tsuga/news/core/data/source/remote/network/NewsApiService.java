package com.tsuga.news.core.data.source.remote.network;

import io.reactivex.Flowable;
import kotlin.Metadata;
import retrofit2.http.GET;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/core/data/source/remote/network/NewsApiService;", "", "getTopHeadlines", "Lio/reactivex/Flowable;", "Lcom/tsuga/news/core/data/source/remote/network/NewsApiResponse;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsApiService.kt */
public interface NewsApiService {
    @GET("top-headlines?country=id&apiKey=e61bf8073e6d474fb27c45fc8bcdfccf")
    Flowable<NewsApiResponse> getTopHeadlines();
}
