package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;

interface DelegatingOpenHelper {
    SupportSQLiteOpenHelper getDelegate();
}
