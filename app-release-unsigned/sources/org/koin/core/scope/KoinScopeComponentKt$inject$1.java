package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinScopeComponent.kt */
public final class KoinScopeComponentKt$inject$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ KoinScopeComponent $this_inject;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KoinScopeComponentKt$inject$1(KoinScopeComponent koinScopeComponent, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        super(0);
        this.$this_inject = koinScopeComponent;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        KoinScopeComponent koinScopeComponent = this.$this_inject;
        Qualifier qualifier = this.$qualifier;
        Function0<DefinitionParameters> function0 = this.$parameters;
        Scope scope = koinScopeComponent.getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
