package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$OXfnp_C5bscCOg9K3v5hKMB-lik  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OXfnp_C5bscCOg9K3v5hKMBlik implements Function {
    public static final /* synthetic */ $$Lambda$OXfnp_C5bscCOg9K3v5hKMBlik INSTANCE = new $$Lambda$OXfnp_C5bscCOg9K3v5hKMBlik();

    private /* synthetic */ $$Lambda$OXfnp_C5bscCOg9K3v5hKMBlik() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).inTransaction());
    }
}
