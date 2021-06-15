package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4 implements Function {
    public static final /* synthetic */ $$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4 INSTANCE = new $$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4();

    private /* synthetic */ $$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
    }
}
