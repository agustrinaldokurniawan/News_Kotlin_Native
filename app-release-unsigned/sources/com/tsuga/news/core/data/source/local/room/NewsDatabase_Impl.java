package com.tsuga.news.core.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.tsuga.news.WebViewActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class NewsDatabase_Impl extends NewsDatabase {
    private volatile NewsDao _newsDao;

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) {
            /* class com.tsuga.news.core.data.source.local.room.NewsDatabase_Impl.AnonymousClass1 */

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `news` (`publishedAt` TEXT NOT NULL, `author` TEXT NOT NULL, `urlToImage` TEXT NOT NULL, `description` TEXT NOT NULL, `source` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL, `content` TEXT NOT NULL, `isBookmark` INTEGER NOT NULL, PRIMARY KEY(`publishedAt`))");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4ece089b33ea022235baff3d6abd06cf')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `news`");
                if (NewsDatabase_Impl.this.mCallbacks != null) {
                    int size = NewsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) NewsDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (NewsDatabase_Impl.this.mCallbacks != null) {
                    int size = NewsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) NewsDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                NewsDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                NewsDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (NewsDatabase_Impl.this.mCallbacks != null) {
                    int size = NewsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) NewsDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(9);
                hashMap.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", true, 1, null, 1));
                hashMap.put("author", new TableInfo.Column("author", "TEXT", true, 0, null, 1));
                hashMap.put("urlToImage", new TableInfo.Column("urlToImage", "TEXT", true, 0, null, 1));
                hashMap.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
                hashMap.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
                hashMap.put(WebViewActivity.TITLE, new TableInfo.Column(WebViewActivity.TITLE, "TEXT", true, 0, null, 1));
                hashMap.put(WebViewActivity.URL, new TableInfo.Column(WebViewActivity.URL, "TEXT", true, 0, null, 1));
                hashMap.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, 1));
                hashMap.put("isBookmark", new TableInfo.Column("isBookmark", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("news", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "news");
                if (tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "news(com.tsuga.news.core.data.source.local.entity.NewsEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
        }, "4ece089b33ea022235baff3d6abd06cf", "4d38b93d1a903e2896d37b0a3293e797")).build());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "news");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `news`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(NewsDao.class, NewsDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDatabase
    public NewsDao newsDao() {
        NewsDao newsDao;
        if (this._newsDao != null) {
            return this._newsDao;
        }
        synchronized (this) {
            if (this._newsDao == null) {
                this._newsDao = new NewsDao_Impl(this);
            }
            newsDao = this._newsDao;
        }
        return newsDao;
    }
}
