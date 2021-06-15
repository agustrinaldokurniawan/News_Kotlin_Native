package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\b\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0004\u001a,\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007H\u0004¢\u0006\u0002\u0010\b\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u0002H\u0002`\fH\u0004¨\u0006\r"}, d2 = {"bind", "Lorg/koin/core/definition/BeanDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Lkotlin/reflect/KClass;", "binds", "classes", "", "(Lorg/koin/core/definition/BeanDefinition;[Lkotlin/reflect/KClass;)Lorg/koin/core/definition/BeanDefinition;", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "koin-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: DefinitionBinding.kt */
public final class DefinitionBindingKt {
    public static final <T> BeanDefinition<T> bind(BeanDefinition<T> beanDefinition, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection) beanDefinition.getSecondaryTypes(), (Object) kClass));
        return beanDefinition;
    }

    public static final /* synthetic */ BeanDefinition bind(BeanDefinition beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return bind(beanDefinition, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final BeanDefinition<?> binds(BeanDefinition<?> beanDefinition, KClass<?>[] kClassArr) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(kClassArr, "classes");
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection) beanDefinition.getSecondaryTypes(), (Object[]) kClassArr));
        return beanDefinition;
    }

    public static final <T> BeanDefinition<T> onClose(BeanDefinition<T> beanDefinition, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(function1, "onClose");
        beanDefinition.setCallbacks(new Callbacks<>(function1));
        return beanDefinition;
    }
}
