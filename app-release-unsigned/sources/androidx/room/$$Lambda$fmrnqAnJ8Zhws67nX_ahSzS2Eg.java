package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: androidx.room.-$$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2-Eg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2Eg implements Function {
    public static final /* synthetic */ $$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2Eg INSTANCE = new $$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2Eg();

    private /* synthetic */ $$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2Eg() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
