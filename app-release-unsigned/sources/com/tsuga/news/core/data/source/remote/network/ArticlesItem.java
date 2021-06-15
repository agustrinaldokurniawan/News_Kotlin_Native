package com.tsuga.news.core.data.source.remote.network;

import com.google.gson.annotations.SerializedName;
import com.tsuga.news.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/tsuga/news/core/data/source/remote/network/ArticlesItem;", "", "publishedAt", "", "author", "urlToImage", "description", "source", "Lcom/tsuga/news/core/data/source/remote/network/Source;", WebViewActivity.TITLE, WebViewActivity.URL, "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tsuga/news/core/data/source/remote/network/Source;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getContent", "getDescription", "getPublishedAt", "getSource", "()Lcom/tsuga/news/core/data/source/remote/network/Source;", "getTitle", "getUrl", "getUrlToImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsApiResponse.kt */
public final class ArticlesItem {
    @SerializedName("author")
    private final String author;
    @SerializedName("content")
    private final String content;
    @SerializedName("description")
    private final String description;
    @SerializedName("publishedAt")
    private final String publishedAt;
    @SerializedName("source")
    private final Source source;
    @SerializedName(WebViewActivity.TITLE)
    private final String title;
    @SerializedName(WebViewActivity.URL)
    private final String url;
    @SerializedName("urlToImage")
    private final String urlToImage;

    public ArticlesItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ArticlesItem copy$default(ArticlesItem articlesItem, String str, String str2, String str3, String str4, Source source2, String str5, String str6, String str7, int i, Object obj) {
        return articlesItem.copy((i & 1) != 0 ? articlesItem.publishedAt : str, (i & 2) != 0 ? articlesItem.author : str2, (i & 4) != 0 ? articlesItem.urlToImage : str3, (i & 8) != 0 ? articlesItem.description : str4, (i & 16) != 0 ? articlesItem.source : source2, (i & 32) != 0 ? articlesItem.title : str5, (i & 64) != 0 ? articlesItem.url : str6, (i & 128) != 0 ? articlesItem.content : str7);
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

    public final Source component5() {
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

    public final ArticlesItem copy(String str, String str2, String str3, String str4, Source source2, String str5, String str6, String str7) {
        return new ArticlesItem(str, str2, str3, str4, source2, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesItem)) {
            return false;
        }
        ArticlesItem articlesItem = (ArticlesItem) obj;
        return Intrinsics.areEqual(this.publishedAt, articlesItem.publishedAt) && Intrinsics.areEqual(this.author, articlesItem.author) && Intrinsics.areEqual(this.urlToImage, articlesItem.urlToImage) && Intrinsics.areEqual(this.description, articlesItem.description) && Intrinsics.areEqual(this.source, articlesItem.source) && Intrinsics.areEqual(this.title, articlesItem.title) && Intrinsics.areEqual(this.url, articlesItem.url) && Intrinsics.areEqual(this.content, articlesItem.content);
    }

    public int hashCode() {
        String str = this.publishedAt;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.author;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.urlToImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Source source2 = this.source;
        int hashCode5 = (hashCode4 + (source2 == null ? 0 : source2.hashCode())) * 31;
        String str5 = this.title;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.content;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "ArticlesItem(publishedAt=" + ((Object) this.publishedAt) + ", author=" + ((Object) this.author) + ", urlToImage=" + ((Object) this.urlToImage) + ", description=" + ((Object) this.description) + ", source=" + this.source + ", title=" + ((Object) this.title) + ", url=" + ((Object) this.url) + ", content=" + ((Object) this.content) + ')';
    }

    public ArticlesItem(String str, String str2, String str3, String str4, Source source2, String str5, String str6, String str7) {
        this.publishedAt = str;
        this.author = str2;
        this.urlToImage = str3;
        this.description = str4;
        this.source = source2;
        this.title = str5;
        this.url = str6;
        this.content = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlesItem(String str, String str2, String str3, String str4, Source source2, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : source2, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
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

    public final Source getSource() {
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
