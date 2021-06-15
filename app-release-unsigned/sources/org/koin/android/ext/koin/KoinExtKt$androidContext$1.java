package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;

/* access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: KoinExt.kt */
public final class KoinExtKt$androidContext$1 extends Lambda implements Function1<Module, Unit> {
    final /* synthetic */ Context $androidContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KoinExtKt$androidContext$1(Context context) {
        super(1);
        this.$androidContext = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Module module) {
        invoke(module);
        return Unit.INSTANCE;
    }

    public final void invoke(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        final Context context = this.$androidContext;
        AnonymousClass1 r6 = new Function2<Scope, DefinitionParameters, Context>() {
            /* class org.koin.android.ext.koin.KoinExtKt$androidContext$1.AnonymousClass1 */

            public final Context invoke(Scope scope, DefinitionParameters definitionParameters) {
                Intrinsics.checkNotNullParameter(scope, "$this$single");
                Intrinsics.checkNotNullParameter(definitionParameters, "it");
                return context;
            }
        };
        Options makeOptions = module.makeOptions(false, false);
        Definitions definitions = Definitions.INSTANCE;
        Qualifier rootScope = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        BeanDefinition beanDefinition = new BeanDefinition(rootScope, Reflection.getOrCreateKotlinClass(Context.class), null, r6, Kind.Single, emptyList, makeOptions, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        DefinitionBindingKt.bind(beanDefinition, Reflection.getOrCreateKotlinClass(Application.class));
    }
}
