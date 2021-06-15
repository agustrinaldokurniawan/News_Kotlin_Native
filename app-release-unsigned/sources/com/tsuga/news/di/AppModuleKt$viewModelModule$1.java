package com.tsuga.news.di;

import com.tsuga.news.home.HomeViewModel;
import com.tsuga.news.readnews.ReadNewsViewModel;
import com.tsuga.news.search.SearchViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.viewmodel.dsl.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* compiled from: AppModule.kt */
final class AppModuleKt$viewModelModule$1 extends Lambda implements Function1<Module, Unit> {
    public static final AppModuleKt$viewModelModule$1 INSTANCE = new AppModuleKt$viewModelModule$1();

    AppModuleKt$viewModelModule$1() {
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
        Options makeOptions$default = Module.makeOptions$default(module, false, false, 2, null);
        Definitions definitions = Definitions.INSTANCE;
        Qualifier rootScope = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        BeanDefinition beanDefinition = new BeanDefinition(rootScope, Reflection.getOrCreateKotlinClass(HomeViewModel.class), null, AnonymousClass1.INSTANCE, kind, emptyList, makeOptions$default, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        ModuleExtKt.setIsViewModel(beanDefinition);
        AnonymousClass2 r19 = AnonymousClass2.INSTANCE;
        Options makeOptions$default2 = Module.makeOptions$default(module, false, false, 2, null);
        Definitions definitions2 = Definitions.INSTANCE;
        Qualifier rootScope2 = module.getRootScope();
        List emptyList2 = CollectionsKt.emptyList();
        BeanDefinition beanDefinition2 = new BeanDefinition(rootScope2, Reflection.getOrCreateKotlinClass(ReadNewsViewModel.class), null, r19, Kind.Factory, emptyList2, makeOptions$default2, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition2);
        ModuleExtKt.setIsViewModel(beanDefinition2);
        Options makeOptions$default3 = Module.makeOptions$default(module, false, false, 2, null);
        Definitions definitions3 = Definitions.INSTANCE;
        Qualifier rootScope3 = module.getRootScope();
        List emptyList3 = CollectionsKt.emptyList();
        Kind kind2 = Kind.Factory;
        BeanDefinition beanDefinition3 = new BeanDefinition(rootScope3, Reflection.getOrCreateKotlinClass(SearchViewModel.class), null, AnonymousClass3.INSTANCE, kind2, emptyList3, makeOptions$default3, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition3);
        ModuleExtKt.setIsViewModel(beanDefinition3);
    }
}
