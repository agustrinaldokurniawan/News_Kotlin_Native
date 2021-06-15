package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lorg/koin/core/scope/KoinScopeComponent;", "Lorg/koin/core/component/KoinComponent;", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "closeScope", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinScopeComponent.kt */
public interface KoinScopeComponent extends KoinComponent {
    void closeScope();

    Scope getScope();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* compiled from: KoinScopeComponent.kt */
    public static final class DefaultImpls {
        public static Koin getKoin(KoinScopeComponent koinScopeComponent) {
            Intrinsics.checkNotNullParameter(koinScopeComponent, "this");
            return KoinComponent.DefaultImpls.getKoin(koinScopeComponent);
        }

        public static void closeScope(KoinScopeComponent koinScopeComponent) {
            Intrinsics.checkNotNullParameter(koinScopeComponent, "this");
            koinScopeComponent.getScope().close();
        }
    }
}
