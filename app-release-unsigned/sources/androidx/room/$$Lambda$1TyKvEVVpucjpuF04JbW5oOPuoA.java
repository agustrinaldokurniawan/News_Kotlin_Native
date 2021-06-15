package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA implements Function {
    public static final /* synthetic */ $$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA INSTANCE = new $$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA();

    private /* synthetic */ $$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
    }
}
