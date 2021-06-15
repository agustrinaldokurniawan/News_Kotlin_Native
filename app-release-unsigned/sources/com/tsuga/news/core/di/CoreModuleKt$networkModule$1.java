package com.tsuga.news.core.di;

import com.tsuga.news.core.data.source.remote.network.NewsApiService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: CoreModule.kt */
final class CoreModuleKt$networkModule$1 extends Lambda implements Function1<Module, Unit> {
    public static final CoreModuleKt$networkModule$1 INSTANCE = new CoreModuleKt$networkModule$1();

    CoreModuleKt$networkModule$1() {
        super(1);
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
        Options makeOptions = module.makeOptions(false, false);
        Definitions definitions = Definitions.INSTANCE;
        Qualifier rootScope = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Single;
        ModuleKt.addDefinition(module.getDefinitions(), new BeanDefinition(rootScope, Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, AnonymousClass1.INSTANCE, kind, emptyList, makeOptions, null, 128, null));
        Options makeOptions2 = module.makeOptions(false, false);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = module.getRootScope();
        List emptyList2 = CollectionsKt.emptyList();
        Kind kind2 = Kind.Single;
        ModuleKt.addDefinition(module.getDefinitions(), new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(NewsApiService.class), null, AnonymousClass2.INSTANCE, kind2, emptyList2, makeOptions2, null, 128, null));
    }
}
