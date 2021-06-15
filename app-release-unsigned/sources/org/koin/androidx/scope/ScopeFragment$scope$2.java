package org.koin.androidx.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/scope/Scope;", "invoke"}, k = 3, mv = {1, 1, 18})
/* compiled from: ScopeFragment.kt */
final class ScopeFragment$scope$2 extends Lambda implements Function0<Scope> {
    final /* synthetic */ ScopeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScopeFragment$scope$2(ScopeFragment scopeFragment) {
        super(0);
        this.this$0 = scopeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Scope invoke() {
        Scope fragmentScope = FragmentExtKt.fragmentScope(this.this$0);
        ScopeActivity scopeActivity = this.this$0.getScopeActivity();
        if (scopeActivity != null) {
            fragmentScope.linkTo(scopeActivity.getScope());
        }
        return fragmentScope;
    }
}
