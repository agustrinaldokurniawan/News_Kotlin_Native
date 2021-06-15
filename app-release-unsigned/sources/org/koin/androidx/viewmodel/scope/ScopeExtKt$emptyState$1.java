package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/os/Bundle;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeExt.kt */
final class ScopeExtKt$emptyState$1 extends Lambda implements Function0<Bundle> {
    public static final ScopeExtKt$emptyState$1 INSTANCE = new ScopeExtKt$emptyState$1();

    ScopeExtKt$emptyState$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bundle invoke() {
        return new Bundle();
    }
}
