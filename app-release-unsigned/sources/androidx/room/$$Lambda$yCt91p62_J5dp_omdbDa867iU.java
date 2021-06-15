package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* renamed from: androidx.room.-$$Lambda$yCt91-p62_J5dp-_omdbDa867iU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$yCt91p62_J5dp_omdbDa867iU implements Function {
    public static final /* synthetic */ $$Lambda$yCt91p62_J5dp_omdbDa867iU INSTANCE = new $$Lambda$yCt91p62_J5dp_omdbDa867iU();

    private /* synthetic */ $$Lambda$yCt91p62_J5dp_omdbDa867iU() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
    }
}
