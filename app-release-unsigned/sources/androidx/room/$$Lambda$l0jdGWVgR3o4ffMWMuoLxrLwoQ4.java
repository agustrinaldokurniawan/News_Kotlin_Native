package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4 implements Function {
    public static final /* synthetic */ $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4 INSTANCE = new $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4();

    private /* synthetic */ $$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}
