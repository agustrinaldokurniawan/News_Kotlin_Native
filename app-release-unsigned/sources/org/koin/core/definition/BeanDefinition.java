package org.koin.core.definition;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.ext.KClassExtKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B~\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012'\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010.\u001a\u00020/2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u00101\u001a\u0006\u0012\u0002\b\u00030\u0006J\t\u00102\u001a\u00020\u0004HÆ\u0003J\r\u00103\u001a\u0006\u0012\u0002\b\u00030\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J*\u00105\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u0013\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0015HÆ\u0003J\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042)\b\u0002\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010;\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010=\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u0006J\b\u0010?\u001a\u00020@H\u0016J$\u0010A\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010B\u001a\u00020\u0004J\b\u0010C\u001a\u00020DH\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R$\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006E"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "", "scopeQualifier", "Lorg/koin/core/qualifier/Qualifier;", "primaryType", "Lkotlin/reflect/KClass;", "qualifier", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "kind", "Lorg/koin/core/definition/Kind;", "secondaryTypes", "", "options", "Lorg/koin/core/definition/Options;", "properties", "Lorg/koin/core/definition/Properties;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function2;Lorg/koin/core/definition/Kind;Ljava/util/List;Lorg/koin/core/definition/Options;Lorg/koin/core/definition/Properties;)V", "callbacks", "Lorg/koin/core/definition/Callbacks;", "getCallbacks", "()Lorg/koin/core/definition/Callbacks;", "setCallbacks", "(Lorg/koin/core/definition/Callbacks;)V", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "getKind", "()Lorg/koin/core/definition/Kind;", "getOptions", "()Lorg/koin/core/definition/Options;", "getPrimaryType", "()Lkotlin/reflect/KClass;", "getProperties", "()Lorg/koin/core/definition/Properties;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "getSecondaryTypes", "()Ljava/util/List;", "setSecondaryTypes", "(Ljava/util/List;)V", "canBind", "", "primary", "secondary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hasType", "clazz", "hashCode", "", "is", "scopeDefinition", "toString", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: BeanDefinition.kt */
public final class BeanDefinition<T> {
    private Callbacks<T> callbacks;
    private final Function2<Scope, DefinitionParameters, T> definition;
    private final Kind kind;
    private final Options options;
    private final KClass<?> primaryType;
    private final Properties properties;
    private final Qualifier qualifier;
    private final Qualifier scopeQualifier;
    private List<? extends KClass<?>> secondaryTypes;

    public static /* synthetic */ BeanDefinition copy$default(BeanDefinition beanDefinition, Qualifier qualifier2, KClass kClass, Qualifier qualifier3, Function2 function2, Kind kind2, List list, Options options2, Properties properties2, int i, Object obj) {
        return beanDefinition.copy((i & 1) != 0 ? beanDefinition.scopeQualifier : qualifier2, (i & 2) != 0 ? beanDefinition.primaryType : kClass, (i & 4) != 0 ? beanDefinition.qualifier : qualifier3, (i & 8) != 0 ? beanDefinition.definition : function2, (i & 16) != 0 ? beanDefinition.kind : kind2, (i & 32) != 0 ? beanDefinition.secondaryTypes : list, (i & 64) != 0 ? beanDefinition.options : options2, (i & 128) != 0 ? beanDefinition.properties : properties2);
    }

    public final Qualifier component1() {
        return this.scopeQualifier;
    }

    public final KClass<?> component2() {
        return this.primaryType;
    }

    public final Qualifier component3() {
        return this.qualifier;
    }

    public final Function2<Scope, DefinitionParameters, T> component4() {
        return this.definition;
    }

    public final Kind component5() {
        return this.kind;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends kotlin.reflect.KClass<?>>, java.util.List<kotlin.reflect.KClass<?>> */
    public final List<KClass<?>> component6() {
        return this.secondaryTypes;
    }

    public final Options component7() {
        return this.options;
    }

    public final Properties component8() {
        return this.properties;
    }

    public final BeanDefinition<T> copy(Qualifier qualifier2, KClass<?> kClass, Qualifier qualifier3, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2, Kind kind2, List<? extends KClass<?>> list, Options options2, Properties properties2) {
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Intrinsics.checkNotNullParameter(kClass, "primaryType");
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(kind2, "kind");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.checkNotNullParameter(options2, "options");
        Intrinsics.checkNotNullParameter(properties2, "properties");
        return new BeanDefinition<>(qualifier2, kClass, qualifier3, function2, kind2, list, options2, properties2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(Qualifier qualifier2, KClass<?> kClass, Qualifier qualifier3, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2, Kind kind2, List<? extends KClass<?>> list, Options options2, Properties properties2) {
        Intrinsics.checkNotNullParameter(qualifier2, "scopeQualifier");
        Intrinsics.checkNotNullParameter(kClass, "primaryType");
        Intrinsics.checkNotNullParameter(function2, "definition");
        Intrinsics.checkNotNullParameter(kind2, "kind");
        Intrinsics.checkNotNullParameter(list, "secondaryTypes");
        Intrinsics.checkNotNullParameter(options2, "options");
        Intrinsics.checkNotNullParameter(properties2, "properties");
        this.scopeQualifier = qualifier2;
        this.primaryType = kClass;
        this.qualifier = qualifier3;
        this.definition = function2;
        this.kind = kind2;
        this.secondaryTypes = list;
        this.options = options2;
        this.properties = properties2;
        this.callbacks = new Callbacks<>(null, 1, null);
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final KClass<?> getPrimaryType() {
        return this.primaryType;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Function2<Scope, DefinitionParameters, T> getDefinition() {
        return this.definition;
    }

    public final Kind getKind() {
        return this.kind;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeanDefinition(Qualifier qualifier2, KClass kClass, Qualifier qualifier3, Function2 function2, Kind kind2, List list, Options options2, Properties properties2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier2, kClass, (i & 4) != 0 ? null : qualifier3, function2, kind2, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? new Options(false, false, false, 7, null) : options2, (i & 128) != 0 ? new Properties(null, 1, null) : properties2);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends kotlin.reflect.KClass<?>>, java.util.List<kotlin.reflect.KClass<?>> */
    public final List<KClass<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final void setSecondaryTypes(List<? extends KClass<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.secondaryTypes = list;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final Properties getProperties() {
        return this.properties;
    }

    public final Callbacks<T> getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks<T> callbacks2) {
        Intrinsics.checkNotNullParameter(callbacks2, "<set-?>");
        this.callbacks = callbacks2;
    }

    public String toString() {
        String str;
        String kind2 = this.kind.toString();
        String str2 = '\'' + KClassExtKt.getFullName(this.primaryType) + '\'';
        String str3 = "";
        if (this.qualifier == null || (str = Intrinsics.stringPlus(",qualifier:", getQualifier())) == null) {
            str = str3;
        }
        String stringPlus = Intrinsics.areEqual(this.scopeQualifier, ScopeDefinition.Companion.getROOT_SCOPE_QUALIFIER()) ? str3 : Intrinsics.stringPlus(",scope:", getScopeQualifier());
        if (!this.secondaryTypes.isEmpty()) {
            str3 = Intrinsics.stringPlus(",binds:", CollectionsKt.joinToString$default(this.secondaryTypes, ",", null, null, 0, null, BeanDefinition$toString$defOtherTypes$typesAsString$1.INSTANCE, 30, null));
        }
        return '[' + kind2 + ':' + str2 + str + stringPlus + str3 + ']';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        if (Intrinsics.areEqual(this.primaryType, beanDefinition.primaryType) && Intrinsics.areEqual(this.qualifier, beanDefinition.qualifier) && Intrinsics.areEqual(this.scopeQualifier, beanDefinition.scopeQualifier)) {
            return true;
        }
        return false;
    }

    public final boolean hasType(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return Intrinsics.areEqual(this.primaryType, kClass) || this.secondaryTypes.contains(kClass);
    }

    public final boolean is(KClass<?> kClass, Qualifier qualifier2, Qualifier qualifier3) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        Intrinsics.checkNotNullParameter(qualifier3, "scopeDefinition");
        return hasType(kClass) && Intrinsics.areEqual(this.qualifier, qualifier2) && Intrinsics.areEqual(this.scopeQualifier, qualifier3);
    }

    public final boolean canBind(KClass<?> kClass, KClass<?> kClass2) {
        Intrinsics.checkNotNullParameter(kClass, "primary");
        Intrinsics.checkNotNullParameter(kClass2, "secondary");
        return Intrinsics.areEqual(this.primaryType, kClass) && this.secondaryTypes.contains(kClass2);
    }

    public int hashCode() {
        Qualifier qualifier2 = this.qualifier;
        return ((((qualifier2 == null ? 0 : qualifier2.hashCode()) * 31) + this.primaryType.hashCode()) * 31) + this.scopeQualifier.hashCode();
    }
}
