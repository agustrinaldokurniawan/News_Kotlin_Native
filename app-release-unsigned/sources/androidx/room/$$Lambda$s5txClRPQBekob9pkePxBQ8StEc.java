package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$s5txClRPQBekob9pkePxBQ8StEc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$s5txClRPQBekob9pkePxBQ8StEc implements Function {
    public static final /* synthetic */ $$Lambda$s5txClRPQBekob9pkePxBQ8StEc INSTANCE = new $$Lambda$s5txClRPQBekob9pkePxBQ8StEc();

    private /* synthetic */ $$Lambda$s5txClRPQBekob9pkePxBQ8StEc() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).getAttachedDbs();
    }
}
