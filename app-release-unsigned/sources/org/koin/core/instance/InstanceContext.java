package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.parameter.DefinitionParametersKt;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "_parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)V", "getKoin", "()Lorg/koin/core/Koin;", "parameters", "getParameters", "()Lorg/koin/core/parameter/DefinitionParameters;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: InstanceContext.kt */
public final class InstanceContext {
    private final Function0<DefinitionParameters> _parameters;
    private final Koin koin;
    private final DefinitionParameters parameters;
    private final Scope scope;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    public InstanceContext(Koin koin2, Scope scope2, Function0<? extends DefinitionParameters> function0) {
        DefinitionParameters definitionParameters;
        Intrinsics.checkNotNullParameter(koin2, "koin");
        Intrinsics.checkNotNullParameter(scope2, "scope");
        this.koin = koin2;
        this.scope = scope2;
        this._parameters = function0;
        if (function0 == 0) {
            definitionParameters = null;
        } else {
            definitionParameters = (DefinitionParameters) function0.invoke();
        }
        this.parameters = definitionParameters == null ? DefinitionParametersKt.emptyParametersHolder() : definitionParameters;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstanceContext(Koin koin2, Scope scope2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(koin2, scope2, (i & 4) != 0 ? null : function0);
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final Scope getScope() {
        return this.scope;
    }

    public final DefinitionParameters getParameters() {
        return this.parameters;
    }
}
