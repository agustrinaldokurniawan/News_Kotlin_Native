package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* renamed from: androidx.room.-$$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ implements Function {
    public static final /* synthetic */ $$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ INSTANCE = new $$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ();

    private /* synthetic */ $$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ((SupportSQLiteStatement) obj).simpleQueryForString();
    }
}
