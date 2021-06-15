package com.tsuga.news.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tsuga.news.WebViewActivity;
import com.tsuga.news.core.data.source.local.entity.NewsEntity;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class NewsDao_Impl implements NewsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<NewsEntity> __insertionAdapterOfNewsEntity;
    private final EntityDeletionOrUpdateAdapter<NewsEntity> __updateAdapterOfNewsEntity;

    public NewsDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfNewsEntity = new EntityInsertionAdapter<NewsEntity>(roomDatabase) {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass1 */

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `news` (`publishedAt`,`author`,`urlToImage`,`description`,`source`,`title`,`url`,`content`,`isBookmark`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, NewsEntity newsEntity) {
                if (newsEntity.getPublishedAt() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, newsEntity.getPublishedAt());
                }
                if (newsEntity.getAuthor() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, newsEntity.getAuthor());
                }
                if (newsEntity.getUrlToImage() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, newsEntity.getUrlToImage());
                }
                if (newsEntity.getDescription() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, newsEntity.getDescription());
                }
                if (newsEntity.getSource() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, newsEntity.getSource());
                }
                if (newsEntity.getTitle() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, newsEntity.getTitle());
                }
                if (newsEntity.getUrl() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, newsEntity.getUrl());
                }
                if (newsEntity.getContent() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, newsEntity.getContent());
                }
                supportSQLiteStatement.bindLong(9, newsEntity.isBookmark() ? 1 : 0);
            }
        };
        this.__updateAdapterOfNewsEntity = new EntityDeletionOrUpdateAdapter<NewsEntity>(roomDatabase) {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass2 */

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `news` SET `publishedAt` = ?,`author` = ?,`urlToImage` = ?,`description` = ?,`source` = ?,`title` = ?,`url` = ?,`content` = ?,`isBookmark` = ? WHERE `publishedAt` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, NewsEntity newsEntity) {
                if (newsEntity.getPublishedAt() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, newsEntity.getPublishedAt());
                }
                if (newsEntity.getAuthor() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, newsEntity.getAuthor());
                }
                if (newsEntity.getUrlToImage() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, newsEntity.getUrlToImage());
                }
                if (newsEntity.getDescription() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, newsEntity.getDescription());
                }
                if (newsEntity.getSource() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, newsEntity.getSource());
                }
                if (newsEntity.getTitle() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, newsEntity.getTitle());
                }
                if (newsEntity.getUrl() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, newsEntity.getUrl());
                }
                if (newsEntity.getContent() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, newsEntity.getContent());
                }
                supportSQLiteStatement.bindLong(9, newsEntity.isBookmark() ? 1 : 0);
                if (newsEntity.getPublishedAt() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, newsEntity.getPublishedAt());
                }
            }
        };
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public Completable insertNews(final List<NewsEntity> list) {
        return Completable.fromCallable(new Callable<Void>() {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass3 */

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                NewsDao_Impl.this.__db.beginTransaction();
                try {
                    NewsDao_Impl.this.__insertionAdapterOfNewsEntity.insert((Iterable) list);
                    NewsDao_Impl.this.__db.setTransactionSuccessful();
                    return null;
                } finally {
                    NewsDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public void updateBookmarkNews(NewsEntity newsEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfNewsEntity.handle(newsEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public Flowable<List<NewsEntity>> getAllNews() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from news", 0);
        return RxRoom.createFlowable(this.__db, false, new String[]{"news"}, new Callable<List<NewsEntity>>() {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass4 */

            @Override // java.util.concurrent.Callable
            public List<NewsEntity> call() throws Exception {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor query = DBUtil.query(NewsDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "publishedAt");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "author");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "urlToImage");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.TITLE);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.URL);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isBookmark");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(columnIndexOrThrow)) {
                            str = null;
                        } else {
                            str = query.getString(columnIndexOrThrow);
                        }
                        if (query.isNull(columnIndexOrThrow2)) {
                            str2 = null;
                        } else {
                            str2 = query.getString(columnIndexOrThrow2);
                        }
                        if (query.isNull(columnIndexOrThrow3)) {
                            str3 = null;
                        } else {
                            str3 = query.getString(columnIndexOrThrow3);
                        }
                        if (query.isNull(columnIndexOrThrow4)) {
                            str4 = null;
                        } else {
                            str4 = query.getString(columnIndexOrThrow4);
                        }
                        if (query.isNull(columnIndexOrThrow5)) {
                            str5 = null;
                        } else {
                            str5 = query.getString(columnIndexOrThrow5);
                        }
                        if (query.isNull(columnIndexOrThrow6)) {
                            str6 = null;
                        } else {
                            str6 = query.getString(columnIndexOrThrow6);
                        }
                        if (query.isNull(columnIndexOrThrow7)) {
                            str7 = null;
                        } else {
                            str7 = query.getString(columnIndexOrThrow7);
                        }
                        if (query.isNull(columnIndexOrThrow8)) {
                            str8 = null;
                        } else {
                            str8 = query.getString(columnIndexOrThrow8);
                        }
                        arrayList.add(new NewsEntity(str, str2, str3, str4, str5, str6, str7, str8, query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            @Override // java.lang.Object
            public void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public Flowable<List<NewsEntity>> getBookmark() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from news where isBookmark = 1", 0);
        return RxRoom.createFlowable(this.__db, false, new String[]{"news"}, new Callable<List<NewsEntity>>() {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass5 */

            @Override // java.util.concurrent.Callable
            public List<NewsEntity> call() throws Exception {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor query = DBUtil.query(NewsDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "publishedAt");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "author");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "urlToImage");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.TITLE);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.URL);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isBookmark");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(columnIndexOrThrow)) {
                            str = null;
                        } else {
                            str = query.getString(columnIndexOrThrow);
                        }
                        if (query.isNull(columnIndexOrThrow2)) {
                            str2 = null;
                        } else {
                            str2 = query.getString(columnIndexOrThrow2);
                        }
                        if (query.isNull(columnIndexOrThrow3)) {
                            str3 = null;
                        } else {
                            str3 = query.getString(columnIndexOrThrow3);
                        }
                        if (query.isNull(columnIndexOrThrow4)) {
                            str4 = null;
                        } else {
                            str4 = query.getString(columnIndexOrThrow4);
                        }
                        if (query.isNull(columnIndexOrThrow5)) {
                            str5 = null;
                        } else {
                            str5 = query.getString(columnIndexOrThrow5);
                        }
                        if (query.isNull(columnIndexOrThrow6)) {
                            str6 = null;
                        } else {
                            str6 = query.getString(columnIndexOrThrow6);
                        }
                        if (query.isNull(columnIndexOrThrow7)) {
                            str7 = null;
                        } else {
                            str7 = query.getString(columnIndexOrThrow7);
                        }
                        if (query.isNull(columnIndexOrThrow8)) {
                            str8 = null;
                        } else {
                            str8 = query.getString(columnIndexOrThrow8);
                        }
                        arrayList.add(new NewsEntity(str, str2, str3, str4, str5, str6, str7, str8, query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            @Override // java.lang.Object
            public void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public Flowable<List<NewsEntity>> getNewsByKeyword(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from news where title like ? or content like ? or description like ? or author like ? or source like ?", 5);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        if (str == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, str);
        }
        if (str == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindString(4, str);
        }
        if (str == null) {
            acquire.bindNull(5);
        } else {
            acquire.bindString(5, str);
        }
        return RxRoom.createFlowable(this.__db, false, new String[]{"news"}, new Callable<List<NewsEntity>>() {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass6 */

            @Override // java.util.concurrent.Callable
            public List<NewsEntity> call() throws Exception {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor query = DBUtil.query(NewsDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "publishedAt");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "author");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "urlToImage");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.TITLE);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.URL);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isBookmark");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(columnIndexOrThrow)) {
                            str = null;
                        } else {
                            str = query.getString(columnIndexOrThrow);
                        }
                        if (query.isNull(columnIndexOrThrow2)) {
                            str2 = null;
                        } else {
                            str2 = query.getString(columnIndexOrThrow2);
                        }
                        if (query.isNull(columnIndexOrThrow3)) {
                            str3 = null;
                        } else {
                            str3 = query.getString(columnIndexOrThrow3);
                        }
                        if (query.isNull(columnIndexOrThrow4)) {
                            str4 = null;
                        } else {
                            str4 = query.getString(columnIndexOrThrow4);
                        }
                        if (query.isNull(columnIndexOrThrow5)) {
                            str5 = null;
                        } else {
                            str5 = query.getString(columnIndexOrThrow5);
                        }
                        if (query.isNull(columnIndexOrThrow6)) {
                            str6 = null;
                        } else {
                            str6 = query.getString(columnIndexOrThrow6);
                        }
                        if (query.isNull(columnIndexOrThrow7)) {
                            str7 = null;
                        } else {
                            str7 = query.getString(columnIndexOrThrow7);
                        }
                        if (query.isNull(columnIndexOrThrow8)) {
                            str8 = null;
                        } else {
                            str8 = query.getString(columnIndexOrThrow8);
                        }
                        arrayList.add(new NewsEntity(str, str2, str3, str4, str5, str6, str7, str8, query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            @Override // java.lang.Object
            public void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDao
    public Flowable<List<NewsEntity>> getBookmarkByKeyword(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from news where isBookmark=1 and (title like ? or content like ? or description like ? or author like ? or source like ?)", 5);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        if (str == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, str);
        }
        if (str == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindString(4, str);
        }
        if (str == null) {
            acquire.bindNull(5);
        } else {
            acquire.bindString(5, str);
        }
        return RxRoom.createFlowable(this.__db, false, new String[]{"news"}, new Callable<List<NewsEntity>>() {
            /* class com.tsuga.news.core.data.source.local.room.NewsDao_Impl.AnonymousClass7 */

            @Override // java.util.concurrent.Callable
            public List<NewsEntity> call() throws Exception {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor query = DBUtil.query(NewsDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "publishedAt");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "author");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "urlToImage");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.TITLE);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, WebViewActivity.URL);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isBookmark");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(columnIndexOrThrow)) {
                            str = null;
                        } else {
                            str = query.getString(columnIndexOrThrow);
                        }
                        if (query.isNull(columnIndexOrThrow2)) {
                            str2 = null;
                        } else {
                            str2 = query.getString(columnIndexOrThrow2);
                        }
                        if (query.isNull(columnIndexOrThrow3)) {
                            str3 = null;
                        } else {
                            str3 = query.getString(columnIndexOrThrow3);
                        }
                        if (query.isNull(columnIndexOrThrow4)) {
                            str4 = null;
                        } else {
                            str4 = query.getString(columnIndexOrThrow4);
                        }
                        if (query.isNull(columnIndexOrThrow5)) {
                            str5 = null;
                        } else {
                            str5 = query.getString(columnIndexOrThrow5);
                        }
                        if (query.isNull(columnIndexOrThrow6)) {
                            str6 = null;
                        } else {
                            str6 = query.getString(columnIndexOrThrow6);
                        }
                        if (query.isNull(columnIndexOrThrow7)) {
                            str7 = null;
                        } else {
                            str7 = query.getString(columnIndexOrThrow7);
                        }
                        if (query.isNull(columnIndexOrThrow8)) {
                            str8 = null;
                        } else {
                            str8 = query.getString(columnIndexOrThrow8);
                        }
                        arrayList.add(new NewsEntity(str, str2, str3, str4, str5, str6, str7, str8, query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            @Override // java.lang.Object
            public void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
