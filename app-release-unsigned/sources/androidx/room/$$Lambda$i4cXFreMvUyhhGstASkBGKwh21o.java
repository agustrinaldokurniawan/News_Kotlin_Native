package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* renamed from: androidx.room.-$$Lambda$i4cXFreMvUyhhGstASkBGKwh21o  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$i4cXFreMvUyhhGstASkBGKwh21o implements Function {
    public static final /* synthetic */ $$Lambda$i4cXFreMvUyhhGstASkBGKwh21o INSTANCE = new $$Lambda$i4cXFreMvUyhhGstASkBGKwh21o();

    private /* synthetic */ $$Lambda$i4cXFreMvUyhhGstASkBGKwh21o() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).executeInsert());
    }
}
