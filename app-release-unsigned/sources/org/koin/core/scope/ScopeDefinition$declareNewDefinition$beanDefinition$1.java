package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.DefinitionParameters;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/DefinitionParameters;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: ScopeDefinition.kt */
public final class ScopeDefinition$declareNewDefinition$beanDefinition$1 extends Lambda implements Function2<Scope, DefinitionParameters, Object> {
    final /* synthetic */ T $instance;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopeDefinition$declareNewDefinition$beanDefinition$1(T t) {
        super(2);
        this.$instance = t;
    }

    public final Object invoke(Scope scope, DefinitionParameters definitionParameters) {
        Intrinsics.checkNotNullParameter(scope, "$this$createSingle");
        Intrinsics.checkNotNullParameter(definitionParameters, "it");
        return this.$instance;
    }
}
