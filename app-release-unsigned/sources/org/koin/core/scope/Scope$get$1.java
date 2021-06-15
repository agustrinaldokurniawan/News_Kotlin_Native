package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

/* access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: Scope.kt */
public final class Scope$get$1 extends Lambda implements Function0<T> {
    final /* synthetic */ KClass<T> $clazz;
    final /* synthetic */ Function0<DefinitionParameters> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Scope$get$1(Scope scope, Qualifier qualifier, KClass<T> kClass, Function0<? extends DefinitionParameters> function0) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$clazz = kClass;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return (T) this.this$0.resolveInstance(this.$qualifier, this.$clazz, this.$parameters);
    }
}
