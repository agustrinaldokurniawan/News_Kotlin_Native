package com.tsuga.news.core.data.source.remote.response;

import com.google.gson.annotations.SerializedName;
import com.tsuga.news.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/tsuga/news/core/data/source/remote/response/NewsResponse;", "", "publishedAt", "", "author", "urlToImage", "description", "source", WebViewActivity.TITLE, WebViewActivity.URL, "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getContent", "getDescription", "getPublishedAt", "getSource", "getTitle", "getUrl", "getUrlToImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsResponse.kt */
public final class NewsResponse {
    @SerializedName("author")
    private final String author;
    @SerializedName("content")
    private final String content;
    @SerializedName("description")
    private final String description;
    @SerializedName("publishedAt")
    private final String publishedAt;
    @SerializedName("source")
    private final String source;
    @SerializedName(WebViewActivity.TITLE)
    private final String title;
    @SerializedName(WebViewActivity.URL)
    private final String url;
    @SerializedName("urlToImage")
    private final String urlToImage;

    public static /* synthetic */ NewsResponse copy$default(NewsResponse newsResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        return newsResponse.copy((i & 1) != 0 ? newsResponse.publishedAt : str, (i & 2) != 0 ? newsResponse.author : str2, (i & 4) != 0 ? newsResponse.urlToImage : str3, (i & 8) != 0 ? newsResponse.description : str4, (i & 16) != 0 ? newsResponse.source : str5, (i & 32) != 0 ? newsResponse.title : str6, (i & 64) != 0 ? newsResponse.url : str7, (i & 128) != 0 ? newsResponse.content : str8);
    }

    public final String component1() {
        return this.publishedAt;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.urlToImage;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.source;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.content;
    }

    public final NewsResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "publishedAt");
        Intrinsics.checkNotNullParameter(str2, "author");
        Intrinsics.checkNotNullParameter(str3, "urlToImage");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "source");
        Intrinsics.checkNotNullParameter(str6, WebViewActivity.TITLE);
        Intrinsics.checkNotNullParameter(str7, WebViewActivity.URL);
        Intrinsics.checkNotNullParameter(str8, "content");
        return new NewsResponse(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsResponse)) {
            return false;
        }
        NewsResponse newsResponse = (NewsResponse) obj;
        return Intrinsics.areEqual(this.publishedAt, newsResponse.publishedAt) && Intrinsics.areEqual(this.author, newsResponse.author) && Intrinsics.areEqual(this.urlToImage, newsResponse.urlToImage) && Intrinsics.areEqual(this.description, newsResponse.description) && Intrinsics.areEqual(this.source, newsResponse.source) && Intrinsics.areEqual(this.title, newsResponse.title) && Intrinsics.areEqual(this.url, newsResponse.url) && Intrinsics.areEqual(this.content, newsResponse.content);
    }

    public int hashCode() {
        return (((((((((((((this.publishedAt.hashCode() * 31) + this.author.hashCode()) * 31) + this.urlToImage.hashCode()) * 31) + this.description.hashCode()) * 31) + this.source.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "NewsResponse(publishedAt=" + this.publishedAt + ", author=" + this.author + ", urlToImage=" + this.urlToImage + ", description=" + this.description + ", source=" + this.source + ", title=" + this.title + ", url=" + this.url + ", content=" + this.content + ')';
    }

    public NewsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "publishedAt");
        Intrinsics.checkNotNullParameter(str2, "author");
        Intrinsics.checkNotNullParameter(str3, "urlToImage");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "source");
        Intrinsics.checkNotNullParameter(str6, WebViewActivity.TITLE);
        Intrinsics.checkNotNullParameter(str7, WebViewActivity.URL);
        Intrinsics.checkNotNullParameter(str8, "content");
        this.publishedAt = str;
        this.author = str2;
        this.urlToImage = str3;
        this.description = str4;
        this.source = str5;
        this.title = str6;
        this.url = str7;
        this.content = str8;
    }

    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getUrlToImage() {
        return this.urlToImage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getContent() {
        return this.content;
    }
}
