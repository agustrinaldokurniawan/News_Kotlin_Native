package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI implements Function {
    public static final /* synthetic */ $$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI INSTANCE = new $$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI();

    private /* synthetic */ $$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
    }
}
