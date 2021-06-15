package org.koin.core.parameter;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.error.NoParameterFoundException;
import org.koin.ext.KClassExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001J\u0016\u0010\t\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001H\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001H\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\r\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001H\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001H\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001H\n¢\u0006\u0002\u0010\u000bJ'\u0010\u0010\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u0002H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u0016\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ!\u0010\u001f\u001a\u00020 \"\u0004\b\u0000\u0010\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u0002H\n¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0012J\b\u0010$\u001a\u00020%H\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006'"}, d2 = {"Lorg/koin/core/parameter/DefinitionParameters;", "", "values", "", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "add", "value", "component1", ExifInterface.GPS_DIRECTION_TRUE, "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "elementAt", "i", "", "clazz", "Lkotlin/reflect/KClass;", "(ILkotlin/reflect/KClass;)Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "getOrNull", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "insert", "index", "isEmpty", "", "isNotEmpty", "set", "", "t", "(ILjava/lang/Object;)V", "size", "toString", "", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: DefinitionParameters.kt */
public class DefinitionParameters {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_PARAMS = 5;
    private final List<Object> values;

    public DefinitionParameters() {
        this(null, 1, null);
    }

    public DefinitionParameters(List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "values");
        this.values = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefinitionParameters(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Object> getValues() {
        return this.values;
    }

    public <T> T elementAt(int i, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        if (this.values.size() > i) {
            return (T) this.values.get(i);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i + " from " + this + " for type '" + KClassExtKt.getFullName(kClass) + '\'');
    }

    public final /* synthetic */ Object component1() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return elementAt(0, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ Object component2() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return elementAt(1, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ Object component3() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return elementAt(2, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ Object component4() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return elementAt(3, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ Object component5() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return elementAt(4, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> T get(int i) {
        return (T) this.values.get(i);
    }

    public final <T> void set(int i, T t) {
        List mutableList = CollectionsKt.toMutableList((Collection) this.values);
        Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
        mutableList.set(i, t);
    }

    public final int size() {
        return this.values.size();
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final DefinitionParameters insert(int i, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : this.values) {
            if (getValues().indexOf(t) < i) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new DefinitionParameters(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) ((List) pair.component1()), obj), (Iterable) ((List) pair.component2())));
    }

    public final DefinitionParameters add(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        return insert(size(), obj);
    }

    public final /* synthetic */ Object get() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object orNull = getOrNull(Reflection.getOrCreateKotlinClass(Object.class));
        if (orNull != null) {
            return orNull;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No value found for type '");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
        sb.append('\'');
        throw new DefinitionParameterException(sb.toString());
    }

    public <T> T getOrNull(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        ArrayList arrayList = new ArrayList();
        for (T t : CollectionsKt.filterNotNull(this.values)) {
            if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(t.getClass()), kClass)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (T) CollectionsKt.first((List) arrayList2);
        }
        throw new DefinitionParameterException("Ambiguous parameter injection: more than one value of type '" + KClassExtKt.getFullName(kClass) + "' to get from " + this + ". Check your injection parameters");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/parameter/DefinitionParameters$Companion;", "", "()V", "MAX_PARAMS", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: DefinitionParameters.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public String toString() {
        return Intrinsics.stringPlus("DefinitionParameters", CollectionsKt.toList(this.values));
    }
}
