package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI implements Function {
    public static final /* synthetic */ $$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI INSTANCE = new $$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI();

    private /* synthetic */ $$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
    }
}
