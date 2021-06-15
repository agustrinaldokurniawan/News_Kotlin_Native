package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic implements Function {
    public static final /* synthetic */ $$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic INSTANCE = new $$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic();

    private /* synthetic */ $$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
    }
}
