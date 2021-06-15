package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lorg/koin/core/instance/SingleInstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceFactory;", "koin", "Lorg/koin/core/Koin;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/definition/BeanDefinition;)V", "value", "Ljava/lang/Object;", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "drop", "", "get", "isCreated", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: SingleInstanceFactory.kt */
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {
    private T value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(Koin koin, BeanDefinition<T> beanDefinition) {
        super(koin, beanDefinition);
        Intrinsics.checkNotNullParameter(koin, "koin");
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated() {
        return this.value != null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop() {
        Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(this.value);
        }
        this.value = null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(instanceContext, "context");
        T t = this.value;
        if (t == null) {
            return (T) super.create(instanceContext);
        }
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(instanceContext, "context");
        synchronized (this) {
            if (!isCreated()) {
                this.value = create(instanceContext);
            }
            Unit unit = Unit.INSTANCE;
        }
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
