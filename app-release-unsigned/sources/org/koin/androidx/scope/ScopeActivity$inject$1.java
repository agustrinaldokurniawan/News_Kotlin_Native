package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 18})
/* compiled from: ScopeActivity.kt */
public final class ScopeActivity$inject$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ScopeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopeActivity$inject$1(ScopeActivity scopeActivity, Qualifier qualifier, Function0 function0) {
        super(0);
        this.this$0 = scopeActivity;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ScopeActivity scopeActivity = this.this$0;
        Qualifier qualifier = this.$qualifier;
        Function0<? extends DefinitionParameters> function0 = this.$parameters;
        Scope scope = scopeActivity.getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
