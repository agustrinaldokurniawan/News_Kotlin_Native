package org.koin.androidx.viewmodel.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0004\u001ac\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032)\b\b\u0010\u000e\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\b0\u000fj\b\u0012\u0004\u0012\u0002H\b`\u0012¢\u0006\u0002\b\u0013H\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"ATTRIBUTE_VIEW_MODEL", "", ModuleExtKt.ATTRIBUTE_VIEW_MODEL, "", "Lorg/koin/core/definition/BeanDefinition;", "setIsViewModel", "", "viewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/module/Module;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "override", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ModuleExt.kt */
public final class ModuleExtKt {
    public static final String ATTRIBUTE_VIEW_MODEL = "isViewModel";

    public static /* synthetic */ BeanDefinition viewModel$default(Module module, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        boolean z2 = (i & 2) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions$default = Module.makeOptions$default(module, z2, false, 2, null);
        Definitions definitions = Definitions.INSTANCE;
        Qualifier rootScope = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, function2, kind, emptyList, makeOptions$default, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }

    public static final void setIsViewModel(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        beanDefinition.getProperties().set(ATTRIBUTE_VIEW_MODEL, true);
    }

    public static final boolean isViewModel(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Boolean bool = (Boolean) beanDefinition.getProperties().getOrNull(ATTRIBUTE_VIEW_MODEL);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final /* synthetic */ BeanDefinition viewModel(Module module, Qualifier qualifier, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(function2, "definition");
        Options makeOptions$default = Module.makeOptions$default(module, z, false, 2, null);
        Definitions definitions = Definitions.INSTANCE;
        Qualifier rootScope = module.getRootScope();
        List emptyList = CollectionsKt.emptyList();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScope, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, emptyList, makeOptions$default, null, 128, null);
        ModuleKt.addDefinition(module.getDefinitions(), beanDefinition);
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }
}
