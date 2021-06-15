package org.koin.core.module;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.DefinitionOverrideException;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"addDefinition", "", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "bean", "plus", "", "Lorg/koin/core/module/Module;", "module", "koin-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: Module.kt */
public final class ModuleKt {
    public static final void addDefinition(HashSet<BeanDefinition<?>> hashSet, BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        Intrinsics.checkNotNullParameter(beanDefinition, "bean");
        boolean add = hashSet.add(beanDefinition);
        if (!add && !beanDefinition.getOptions().getOverride()) {
            throw new DefinitionOverrideException("Definition '" + beanDefinition + "' try to override existing definition. Please use override option to fix it");
        } else if (!add && beanDefinition.getOptions().getOverride()) {
            hashSet.remove(beanDefinition);
            hashSet.add(beanDefinition);
        }
    }

    public static final List<Module> plus(List<Module> list, Module module) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        return CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(module));
    }
}
