package com.tsuga.news.core.data.source.remote.network;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tsuga/news/core/data/source/remote/network/NewsApiResponse;", "", "totalResults", "", "articles", "", "Lcom/tsuga/news/core/data/source/remote/network/ArticlesItem;", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getArticles", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getTotalResults", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/tsuga/news/core/data/source/remote/network/NewsApiResponse;", "equals", "", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsApiResponse.kt */
public final class NewsApiResponse {
    @SerializedName("articles")
    private final List<ArticlesItem> articles;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;
    @SerializedName("totalResults")
    private final Integer totalResults;

    public NewsApiResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.tsuga.news.core.data.source.remote.network.NewsApiResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsApiResponse copy$default(NewsApiResponse newsApiResponse, Integer num, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newsApiResponse.totalResults;
        }
        if ((i & 2) != 0) {
            list = newsApiResponse.articles;
        }
        if ((i & 4) != 0) {
            str = newsApiResponse.status;
        }
        return newsApiResponse.copy(num, list, str);
    }

    public final Integer component1() {
        return this.totalResults;
    }

    public final List<ArticlesItem> component2() {
        return this.articles;
    }

    public final String component3() {
        return this.status;
    }

    public final NewsApiResponse copy(Integer num, List<ArticlesItem> list, String str) {
        return new NewsApiResponse(num, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsApiResponse)) {
            return false;
        }
        NewsApiResponse newsApiResponse = (NewsApiResponse) obj;
        return Intrinsics.areEqual(this.totalResults, newsApiResponse.totalResults) && Intrinsics.areEqual(this.articles, newsApiResponse.articles) && Intrinsics.areEqual(this.status, newsApiResponse.status);
    }

    public int hashCode() {
        Integer num = this.totalResults;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ArticlesItem> list = this.articles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.status;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "NewsApiResponse(totalResults=" + this.totalResults + ", articles=" + this.articles + ", status=" + ((Object) this.status) + ')';
    }

    public NewsApiResponse(Integer num, List<ArticlesItem> list, String str) {
        this.totalResults = num;
        this.articles = list;
        this.status = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewsApiResponse(Integer num, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }

    public final Integer getTotalResults() {
        return this.totalResults;
    }

    public final List<ArticlesItem> getArticles() {
        return this.articles;
    }

    public final String getStatus() {
        return this.status;
    }
}
