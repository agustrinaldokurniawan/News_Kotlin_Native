package com.tsuga.news.core.data.source.local.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.tsuga.news.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000f¨\u00062"}, d2 = {"Lcom/tsuga/news/core/data/source/local/entity/NewsEntity;", "Landroid/os/Parcelable;", "publishedAt", "", "author", "urlToImage", "description", "source", WebViewActivity.TITLE, WebViewActivity.URL, "content", "isBookmark", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAuthor", "()Ljava/lang/String;", "getContent", "getDescription", "()Z", "setBookmark", "(Z)V", "getPublishedAt", "setPublishedAt", "(Ljava/lang/String;)V", "getSource", "getTitle", "getUrl", "getUrlToImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsEntity.kt */
public final class NewsEntity implements Parcelable {
    public static final Parcelable.Creator<NewsEntity> CREATOR = new Creator();
    private final String author;
    private final String content;
    private final String description;
    private boolean isBookmark;
    private String publishedAt;
    private final String source;
    private final String title;
    private final String url;
    private final String urlToImage;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* compiled from: NewsEntity.kt */
    public static final class Creator implements Parcelable.Creator<NewsEntity> {
        @Override // android.os.Parcelable.Creator
        public final NewsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewsEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsEntity[] newArray(int i) {
            return new NewsEntity[i];
        }
    }

    public static /* synthetic */ NewsEntity copy$default(NewsEntity newsEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
        return newsEntity.copy((i & 1) != 0 ? newsEntity.publishedAt : str, (i & 2) != 0 ? newsEntity.author : str2, (i & 4) != 0 ? newsEntity.urlToImage : str3, (i & 8) != 0 ? newsEntity.description : str4, (i & 16) != 0 ? newsEntity.source : str5, (i & 32) != 0 ? newsEntity.title : str6, (i & 64) != 0 ? newsEntity.url : str7, (i & 128) != 0 ? newsEntity.content : str8, (i & 256) != 0 ? newsEntity.isBookmark : z);
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

    public final boolean component9() {
        return this.isBookmark;
    }

    public final NewsEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "publishedAt");
        Intrinsics.checkNotNullParameter(str2, "author");
        Intrinsics.checkNotNullParameter(str3, "urlToImage");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "source");
        Intrinsics.checkNotNullParameter(str6, WebViewActivity.TITLE);
        Intrinsics.checkNotNullParameter(str7, WebViewActivity.URL);
        Intrinsics.checkNotNullParameter(str8, "content");
        return new NewsEntity(str, str2, str3, str4, str5, str6, str7, str8, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsEntity)) {
            return false;
        }
        NewsEntity newsEntity = (NewsEntity) obj;
        return Intrinsics.areEqual(this.publishedAt, newsEntity.publishedAt) && Intrinsics.areEqual(this.author, newsEntity.author) && Intrinsics.areEqual(this.urlToImage, newsEntity.urlToImage) && Intrinsics.areEqual(this.description, newsEntity.description) && Intrinsics.areEqual(this.source, newsEntity.source) && Intrinsics.areEqual(this.title, newsEntity.title) && Intrinsics.areEqual(this.url, newsEntity.url) && Intrinsics.areEqual(this.content, newsEntity.content) && this.isBookmark == newsEntity.isBookmark;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.publishedAt.hashCode() * 31) + this.author.hashCode()) * 31) + this.urlToImage.hashCode()) * 31) + this.description.hashCode()) * 31) + this.source.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.content.hashCode()) * 31;
        boolean z = this.isBookmark;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "NewsEntity(publishedAt=" + this.publishedAt + ", author=" + this.author + ", urlToImage=" + this.urlToImage + ", description=" + this.description + ", source=" + this.source + ", title=" + this.title + ", url=" + this.url + ", content=" + this.content + ", isBookmark=" + this.isBookmark + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.publishedAt);
        parcel.writeString(this.author);
        parcel.writeString(this.urlToImage);
        parcel.writeString(this.description);
        parcel.writeString(this.source);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.content);
        parcel.writeInt(this.isBookmark ? 1 : 0);
    }

    public NewsEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
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
        this.isBookmark = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewsEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? false : z);
    }

    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final void setPublishedAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.publishedAt = str;
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

    public final boolean isBookmark() {
        return this.isBookmark;
    }

    public final void setBookmark(boolean z) {
        this.isBookmark = z;
    }
}
