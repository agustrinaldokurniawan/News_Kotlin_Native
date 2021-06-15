package com.tsuga.news.core.data.source.local.room;

import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/tsuga/news/core/data/source/local/room/NewsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lcom/tsuga/news/core/data/source/local/room/NewsDao;", "Companion", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: NewsDatabase.kt */
public abstract class NewsDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);
    private static volatile NewsDatabase INSTANCE;

    public abstract NewsDao newsDao();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tsuga/news/core/data/source/local/room/NewsDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/tsuga/news/core/data/source/local/room/NewsDatabase;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: NewsDatabase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
