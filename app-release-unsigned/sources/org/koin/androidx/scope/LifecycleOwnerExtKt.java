package org.koin.androidx.scope;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"currentScope", "Lorg/koin/core/scope/Scope;", "Landroidx/lifecycle/LifecycleOwner;", "currentScope$annotations", "(Landroidx/lifecycle/LifecycleOwner;)V", "getCurrentScope", "(Landroidx/lifecycle/LifecycleOwner;)Lorg/koin/core/scope/Scope;", "lifecycleScope", "lifecycleScope$annotations", "getLifecycleScope", "scope", "scope$annotations", "getScope", "koin-androidx-scope_release"}, k = 2, mv = {1, 1, 18})
/* compiled from: LifecycleOwnerExt.kt */
public final class LifecycleOwnerExtKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void currentScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void lifecycleScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void scope$annotations(LifecycleOwner lifecycleOwner) {
    }

    public static final Scope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$lifecycleScope");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    public static final Scope getScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$scope");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    public static final Scope getCurrentScope(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$currentScope");
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }
}
