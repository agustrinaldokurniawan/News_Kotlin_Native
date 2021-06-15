package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.DefinitionParameters;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "", "_koin", "Lorg/koin/core/Koin;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "drop", "", "get", "isCreated", "", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: InstanceFactory.kt */
public abstract class InstanceFactory<T> {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_SEPARATOR = "\n\t";
    private final Koin _koin;
    private final BeanDefinition<T> beanDefinition;

    public abstract void drop();

    public abstract T get(InstanceContext instanceContext);

    public abstract boolean isCreated();

    public InstanceFactory(Koin koin, BeanDefinition<T> beanDefinition2) {
        Intrinsics.checkNotNullParameter(koin, "_koin");
        Intrinsics.checkNotNullParameter(beanDefinition2, "beanDefinition");
        this._koin = koin;
        this.beanDefinition = beanDefinition2;
    }

    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public T create(InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(instanceContext, "context");
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            this._koin.getLogger().debug(Intrinsics.stringPlus("| create instance for ", this.beanDefinition));
        }
        try {
            DefinitionParameters parameters = instanceContext.getParameters();
            instanceContext.getScope().addParameters(parameters);
            T invoke = this.beanDefinition.getDefinition().invoke(instanceContext.getScope(), parameters);
            instanceContext.getScope().clearParameters();
            return invoke;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append(ERROR_SEPARATOR);
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            StackTraceElement[] stackTraceElementArr = stackTrace;
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                if (!(!StringsKt.contains$default((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, ERROR_SEPARATOR, null, null, 0, null, null, 62, null));
            this._koin.getLogger().error("Instance creation error : could not create instance for " + this.beanDefinition + ": " + sb.toString());
            throw new InstanceCreationException(Intrinsics.stringPlus("Could not create instance for ", this.beanDefinition), e);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/instance/InstanceFactory$Companion;", "", "()V", "ERROR_SEPARATOR", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: InstanceFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
