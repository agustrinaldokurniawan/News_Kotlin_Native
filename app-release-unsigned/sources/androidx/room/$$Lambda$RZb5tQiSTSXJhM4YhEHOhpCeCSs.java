package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* renamed from: androidx.room.-$$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs implements Function {
    public static final /* synthetic */ $$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs INSTANCE = new $$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs();

    private /* synthetic */ $$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).simpleQueryForLong());
    }
}
