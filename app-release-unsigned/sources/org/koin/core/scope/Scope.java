package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Options;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.time.MeasureKt;
import org.koin.ext.KClassExtKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0011J?\u0010.\u001a\u0002H/\"\u0004\b\u0000\u0010/2\n\u00100\u001a\u0006\u0012\u0002\b\u0003012\n\u00102\u001a\u0006\u0012\u0002\b\u0003012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4¢\u0006\u0002\u00105J9\u0010.\u001a\u0002H/\"\u0006\b\u0000\u0010/\u0018\u0001\"\u0006\b\u0001\u00106\u0018\u00012\u0016\b\n\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\bø\u0001\u0000¢\u0006\u0002\u00107J\r\u00108\u001a\u00020,H\u0000¢\u0006\u0002\b9J\u0006\u0010:\u001a\u00020,J\u0006\u0010;\u001a\u00020,J\r\u0010<\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\bHÂ\u0003J+\u0010?\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u001b\u0010@\u001a\u00020,2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000BH\u0000¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020,H\u0000¢\u0006\u0002\bEJN\u0010F\u001a\u00020,\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u00012\u0006\u0010H\u001a\u0002HG2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0014\b\u0002\u0010K\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u000301\u0018\u00010B2\b\b\u0002\u0010L\u001a\u00020\u000fH\b¢\u0006\u0002\u0010MJ\u0012\u0010N\u001a\u00020,2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PJ\u0013\u0010Q\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003JG\u0010S\u001a\u0004\u0018\u0001HG\"\b\b\u0000\u0010G*\u00020\u00012\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HG012\b\u0010I\u001a\u0004\u0018\u00010J2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\u0002¢\u0006\u0002\u0010UJI\u0010V\u001a\u0002HG\"\b\b\u0000\u0010G*\u00020\u00012\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HG0W2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\u0007¢\u0006\u0002\u0010XJG\u0010V\u001a\u0002HG\"\b\b\u0000\u0010G*\u00020\u00012\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HG012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4¢\u0006\u0002\u0010UJA\u0010V\u001a\u0002HG\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u00012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0016\b\n\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\bø\u0001\u0000¢\u0006\u0002\u0010YJ\u001b\u0010Z\u001a\b\u0012\u0004\u0012\u0002HG0B\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u0001H\bJ\"\u0010Z\u001a\b\u0012\u0004\u0012\u0002HG0B\"\b\b\u0000\u0010G*\u00020\u00012\n\u0010T\u001a\u0006\u0012\u0002\b\u000301J!\u0010[\u001a\u0004\u0018\u0001HG\"\u0004\b\u0000\u0010G2\n\u0010T\u001a\u0006\u0012\u0002\b\u000301H\u0002¢\u0006\u0002\u0010\\J\u0006\u0010]\u001a\u00020\bJK\u0010^\u001a\u0004\u0018\u0001HG\"\b\b\u0000\u0010G*\u00020\u00012\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HG012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\u0007¢\u0006\u0002\u0010UJC\u0010^\u001a\u0004\u0018\u0001HG\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u00012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u0016\b\n\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\bø\u0001\u0000¢\u0006\u0002\u0010YJ\u000e\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u0003J\u0016\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u00032\u0006\u0010`\u001a\u00020\u0003J\u0012\u0010c\u001a\u00020\u00002\n\u0010d\u001a\u00060\u0003j\u0002`\u0004J\u001a\u0010e\u001a\u0002HG\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\u0019J\t\u0010f\u001a\u00020gHÖ\u0001JL\u0010h\u001a\b\u0012\u0004\u0012\u0002HG0i\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u00012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\b\b\u0002\u0010j\u001a\u00020k2\u0016\b\n\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\bø\u0001\u0000JN\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HG0i\"\n\b\u0000\u0010G\u0018\u0001*\u00020\u00012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\b\b\u0002\u0010j\u001a\u00020k2\u0016\b\n\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\bø\u0001\u0000J\u001f\u0010m\u001a\u00020,2\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000o\"\u00020\u0000¢\u0006\u0002\u0010pJ\u0012\u0010q\u001a\u00020,2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PJ\u000e\u0010r\u001a\u00020,2\u0006\u0010s\u001a\u00020\fJE\u0010t\u001a\u0002HG\"\b\b\u0000\u0010G*\u00020\u00012\b\u0010I\u001a\u0004\u0018\u00010J2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HG012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u000103j\u0004\u0018\u0001`4H\u0002¢\u0006\u0002\u0010uJ\u0012\u0010v\u001a\u00020,2\b\u0010w\u001a\u0004\u0018\u00010\u0001H\u0007J\u001e\u0010x\u001a\u00020y2\b\u0010I\u001a\u0004\u0018\u00010J2\n\u0010T\u001a\u0006\u0012\u0002\b\u000301H\u0002J\b\u0010z\u001a\u00020\u0003H\u0016J\u001f\u0010{\u001a\u00020,2\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000o\"\u00020\u0000¢\u0006\u0002\u0010pR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u00020\"8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R\u001e\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u000bj\b\u0012\u0004\u0012\u00020\u0000`\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u0002\u0007\n\u0005\b20\u0001¨\u0006|"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "id", "", "Lorg/koin/core/scope/ScopeID;", "_scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "_koin", "Lorg/koin/core/Koin;", "(Ljava/lang/String;Lorg/koin/core/scope/ScopeDefinition;Lorg/koin/core/Koin;)V", "_callbacks", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/ArrayList;", "_closed", "", "_parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "get_scopeDefinition$annotations", "()V", "get_scopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "_source", "get_source$annotations", "get_source", "()Ljava/lang/Object;", "set_source", "(Ljava/lang/Object;)V", "closed", "getClosed", "()Z", "getId", "()Ljava/lang/String;", "instanceRegistry", "Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry$annotations", "getInstanceRegistry", "()Lorg/koin/core/registry/InstanceRegistry;", "linkedScope", "logger", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "addParameters", "", "parameters", "bind", ExifInterface.LATITUDE_SOUTH, "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clear", "clear$koin_core", "clearParameters", "close", "component1", "component2", "component3", "copy", "create", "links", "", "create$koin_core", "createEagerInstances", "createEagerInstances$koin_core", "declare", ExifInterface.GPS_DIRECTION_TRUE, "instance", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "override", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "dropInstance", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "equals", "other", "findInOtherScope", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "Ljava/lang/Class;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getFromSource", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getKoin", "getOrNull", "getProperty", "key", "defaultValue", "getPropertyOrNull", "getScope", "scopeID", "getSource", "hashCode", "", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "injectOrNull", "linkTo", "scopes", "", "([Lorg/koin/core/scope/Scope;)V", "loadDefinition", "registerCallback", "callback", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "setSource", "t", "throwDefinitionNotFound", "", "toString", "unlink", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: Scope.kt */
public final class Scope {
    private final ArrayList<ScopeCallback> _callbacks;
    private boolean _closed;
    private final Koin _koin;
    private DefinitionParameters _parameters;
    private final ScopeDefinition _scopeDefinition;
    private Object _source;
    private final String id;
    private final InstanceRegistry instanceRegistry;
    private final ArrayList<Scope> linkedScope = new ArrayList<>();
    private final Logger logger;

    private final Koin component3() {
        return this._koin;
    }

    public static /* synthetic */ Scope copy$default(Scope scope, String str, ScopeDefinition scopeDefinition, Koin koin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scope.id;
        }
        if ((i & 2) != 0) {
            scopeDefinition = scope._scopeDefinition;
        }
        if ((i & 4) != 0) {
            koin = scope._koin;
        }
        return scope.copy(str, scopeDefinition, koin);
    }

    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    public static /* synthetic */ void get_scopeDefinition$annotations() {
    }

    public static /* synthetic */ void get_source$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final ScopeDefinition component2() {
        return this._scopeDefinition;
    }

    public final Scope copy(String str, ScopeDefinition scopeDefinition, Koin koin) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(scopeDefinition, "_scopeDefinition");
        Intrinsics.checkNotNullParameter(koin, "_koin");
        return new Scope(str, scopeDefinition, koin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        return Intrinsics.areEqual(this.id, scope.id) && Intrinsics.areEqual(this._scopeDefinition, scope._scopeDefinition) && Intrinsics.areEqual(this._koin, scope._koin);
    }

    public final <T> T get(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) get$default(this, cls, (Qualifier) null, (Function0) null, 6, (Object) null);
    }

    public final <T> T get(Class<T> cls, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) get$default(this, cls, qualifier, (Function0) null, 4, (Object) null);
    }

    public final <T> T getOrNull(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) getOrNull$default(this, kClass, null, null, 6, null);
    }

    public final <T> T getOrNull(KClass<T> kClass, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return (T) getOrNull$default(this, kClass, qualifier, null, 4, null);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this._scopeDefinition.hashCode()) * 31) + this._koin.hashCode();
    }

    public Scope(String str, ScopeDefinition scopeDefinition, Koin koin) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(scopeDefinition, "_scopeDefinition");
        Intrinsics.checkNotNullParameter(koin, "_koin");
        this.id = str;
        this._scopeDefinition = scopeDefinition;
        this._koin = koin;
        this.instanceRegistry = new InstanceRegistry(koin, this);
        this._callbacks = new ArrayList<>();
        this.logger = koin.getLogger();
    }

    public final String getId() {
        return this.id;
    }

    public final ScopeDefinition get_scopeDefinition() {
        return this._scopeDefinition;
    }

    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    public final Object get_source() {
        return this._source;
    }

    public final void set_source(Object obj) {
        this._source = obj;
    }

    public final boolean getClosed() {
        return this._closed;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final void create$koin_core(List<Scope> list) {
        Intrinsics.checkNotNullParameter(list, "links");
        this.instanceRegistry.create$koin_core(this._scopeDefinition.getDefinitions());
        this.linkedScope.addAll(list);
    }

    public final /* synthetic */ Object getSource() {
        Object obj = get_source();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        Object obj2 = obj;
        if (obj2 != null) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't use Scope source for ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
        sb.append(" - source is:");
        sb.append(get_source());
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void setSource(Object obj) {
        this._source = obj;
    }

    public final void linkTo(Scope... scopeArr) {
        Intrinsics.checkNotNullParameter(scopeArr, "scopes");
        if (!this._scopeDefinition.isRoot()) {
            CollectionsKt.addAll(this.linkedScope, scopeArr);
            return;
        }
        throw new IllegalStateException("Can't add scope link to a root scope".toString());
    }

    public final void unlink(Scope... scopeArr) {
        Intrinsics.checkNotNullParameter(scopeArr, "scopes");
        if (!this._scopeDefinition.isRoot()) {
            CollectionsKt.removeAll(this.linkedScope, scopeArr);
            return;
        }
        throw new IllegalStateException("Can't remove scope link to a root scope".toString());
    }

    public static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$inject$1(scope, qualifier, function0));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$inject$1(this, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$injectOrNull$1(scope, qualifier, function0));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$injectOrNull$1(this, qualifier, function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ Object get(Qualifier qualifier, Function0 function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ Object getOrNull(Qualifier qualifier, Function0 function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.getOrNull(kClass, qualifier, function0);
    }

    public final <T> T getOrNull(KClass<T> kClass, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        try {
            return (T) get(kClass, qualifier, function0);
        } catch (ClosedScopeException unused) {
            Logger logger2 = this._koin.getLogger();
            logger2.debug("Koin.getOrNull - scope closed - no instance found for " + KClassExtKt.getFullName(kClass) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            Logger logger3 = this._koin.getLogger();
            logger3.debug("Koin.getOrNull - no instance found for " + KClassExtKt.getFullName(kClass) + " on scope " + this);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get(kClass, qualifier, function0);
    }

    public final <T> T get(KClass<T> kClass, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        if (!this._koin.getLogger().isAt(Level.DEBUG)) {
            return (T) resolveInstance(qualifier, kClass, function0);
        }
        String str = "";
        if (qualifier != null) {
            String str2 = " with qualifier '" + qualifier + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        this._koin.getLogger().debug("+- '" + KClassExtKt.getFullName(kClass) + '\'' + str);
        Pair measureDurationForResult = MeasureKt.measureDurationForResult(new Scope$get$1(this, qualifier, kClass, function0));
        T t = (T) measureDurationForResult.component1();
        double doubleValue = ((Number) measureDurationForResult.component2()).doubleValue();
        this._koin.getLogger().debug("|- '" + KClassExtKt.getFullName(kClass) + "' in " + doubleValue + " ms");
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get(cls, qualifier, function0);
    }

    public final <T> T get(Class<T> cls, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) get(JvmClassMappingKt.getKotlinClass(cls), qualifier, function0);
    }

    /* access modifiers changed from: private */
    public final <T> T resolveInstance(Qualifier qualifier, KClass<T> kClass, Function0<? extends DefinitionParameters> function0) {
        if (!this._closed) {
            T t = (T) this.instanceRegistry.resolveInstance$koin_core(BeanDefinitionKt.indexKey(kClass, qualifier), function0);
            if (t == null) {
                Scope scope = this;
                Logger logger2 = scope._koin.getLogger();
                logger2.debug('\'' + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' not found in current scope");
                Object fromSource = scope.getFromSource(kClass);
                if (fromSource == null) {
                    Logger logger3 = scope._koin.getLogger();
                    logger3.debug('\'' + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' not found in current scope's source");
                    DefinitionParameters definitionParameters = scope._parameters;
                    t = definitionParameters == null ? null : (T) definitionParameters.getOrNull(kClass);
                } else {
                    t = (T) fromSource;
                }
            }
            if (t != null) {
                return t;
            }
            Scope scope2 = this;
            Logger logger4 = scope2._koin.getLogger();
            logger4.debug('\'' + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' not found in injected parameters");
            T t2 = (T) scope2.findInOtherScope(kClass, qualifier, function0);
            if (t2 != null) {
                return t2;
            }
            Logger logger5 = scope2._koin.getLogger();
            logger5.debug('\'' + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' not found in linked scopes");
            scope2.throwDefinitionNotFound(qualifier, kClass);
            throw new KotlinNothingValueException();
        }
        throw new ClosedScopeException("Scope '" + this.id + "' is closed");
    }

    private final <T> T getFromSource(KClass<?> kClass) {
        if (kClass.isInstance(this._source)) {
            return (T) this._source;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T findInOtherScope(kotlin.reflect.KClass<T> r4, org.koin.core.qualifier.Qualifier r5, kotlin.jvm.functions.Function0<? extends org.koin.core.parameter.DefinitionParameters> r6) {
        /*
            r3 = this;
            java.util.ArrayList<org.koin.core.scope.Scope> r0 = r3.linkedScope
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            org.koin.core.scope.Scope r1 = (org.koin.core.scope.Scope) r1
            java.lang.Object r1 = r1.getOrNull(r4, r5, r6)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.findInOtherScope(kotlin.reflect.KClass, org.koin.core.qualifier.Qualifier, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    private final Void throwDefinitionNotFound(Qualifier qualifier, KClass<?> kClass) {
        String str = "";
        if (qualifier != null) {
            String str2 = " & qualifier:'" + qualifier + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        throw new NoBeanDefFoundException("No definition found for class:'" + KClassExtKt.getFullName(kClass) + '\'' + str + ". Check your definitions!");
    }

    public final void createEagerInstances$koin_core() {
        if (this._scopeDefinition.isRoot()) {
            this.instanceRegistry.createEagerInstances$koin_core();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: org.koin.core.definition.Definitions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z, int i, Object obj2) {
        T t = null;
        Qualifier qualifier2 = (i & 2) != 0 ? null : qualifier;
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(obj, "instance");
        synchronized (scope) {
            try {
                ScopeDefinition scopeDefinition = scope.get_scopeDefinition();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                Iterator<T> it = scopeDefinition.getDefinitions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.is(orCreateKotlinClass, qualifier2, scopeDefinition.getQualifier())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (z) {
                        scopeDefinition.remove(t2);
                    } else {
                        throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
                    }
                }
                BeanDefinition<?> createSingle = Definitions.INSTANCE.createSingle(orCreateKotlinClass, qualifier2, new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj), new Options(false, z, true), list == null ? CollectionsKt.emptyList() : list, scopeDefinition.getQualifier());
                scopeDefinition.save(createSingle, z);
                scope.getInstanceRegistry().saveDefinition(createSingle, true);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: org.koin.core.definition.Definitions */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void declare(Object obj, Qualifier qualifier, List list, boolean z) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "instance");
        synchronized (this) {
            try {
                ScopeDefinition scopeDefinition = get_scopeDefinition();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                Iterator<T> it = scopeDefinition.getDefinitions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t.is(orCreateKotlinClass, qualifier, scopeDefinition.getQualifier())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (z) {
                        scopeDefinition.remove(t2);
                    } else {
                        throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
                    }
                }
                Definitions definitions = Definitions.INSTANCE;
                ScopeDefinition$declareNewDefinition$beanDefinition$1 scopeDefinition$declareNewDefinition$beanDefinition$1 = new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj);
                Options options = new Options(false, z, true);
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                BeanDefinition<?> createSingle = definitions.createSingle(orCreateKotlinClass, qualifier, scopeDefinition$declareNewDefinition$beanDefinition$1, options, list, scopeDefinition.getQualifier());
                scopeDefinition.save(createSingle, z);
                getInstanceRegistry().saveDefinition(createSingle, true);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final Koin getKoin() {
        return this._koin;
    }

    public final Scope getScope(String str) {
        Intrinsics.checkNotNullParameter(str, "scopeID");
        return getKoin().getScope(str);
    }

    public final void registerCallback(ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(scopeCallback, "callback");
        this._callbacks.add(scopeCallback);
    }

    public final /* synthetic */ List getAll() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> List<T> getAll(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return this.instanceRegistry.getAll$koin_core(kClass);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.scope.Scope */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object bind$default(Scope scope, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "P");
        return scope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    public final /* synthetic */ Object bind(Function0 function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "P");
        return bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    public final <S> S bind(KClass<?> kClass, KClass<?> kClass2, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkNotNullParameter(kClass, "primaryType");
        Intrinsics.checkNotNullParameter(kClass2, "secondaryType");
        S s = (S) this.instanceRegistry.bind$koin_core(kClass, kClass2, function0);
        if (s != null) {
            return s;
        }
        throw new NoBeanDefFoundException("No definition found to bind class:'" + KClassExtKt.getFullName(kClass) + "' & secondary type:'" + KClassExtKt.getFullName(kClass2) + "'. Check your definitions!");
    }

    public final String getProperty(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "defaultValue");
        return (String) this._koin.getProperty(str, str2);
    }

    public final String getPropertyOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return (String) this._koin.getProperty(str);
    }

    public final String getProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        String str2 = (String) this._koin.getProperty(str);
        if (str2 != null) {
            return str2;
        }
        throw new MissingPropertyException("Property '" + str + "' not found");
    }

    public final void close() {
        synchronized (this) {
            clear$koin_core();
            this._koin.getScopeRegistry().deleteScope(this);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clear$koin_core() {
        this._closed = true;
        this._source = null;
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            Logger logger2 = this._koin.getLogger();
            logger2.info("closing scope:'" + this.id + '\'');
        }
        Iterator<T> it = this._callbacks.iterator();
        while (it.hasNext()) {
            it.next().onScopeClose(this);
        }
        this._callbacks.clear();
        this.instanceRegistry.close$koin_core();
    }

    public String toString() {
        return "['" + this.id + "']";
    }

    public final void dropInstance(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.instanceRegistry.dropDefinition$koin_core(beanDefinition);
    }

    public final void loadDefinition(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.instanceRegistry.createDefinition$koin_core(beanDefinition);
    }

    public final void addParameters(DefinitionParameters definitionParameters) {
        Intrinsics.checkNotNullParameter(definitionParameters, "parameters");
        this._parameters = definitionParameters;
    }

    public final void clearParameters() {
        this._parameters = null;
    }

    public final /* synthetic */ Lazy inject() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$inject$$inlined$inject$default$3(this, null, null));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$inject$$inlined$inject$default$2(this, qualifier, null));
    }

    public final /* synthetic */ Lazy inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$inject$$inlined$inject$default$1(this, qualifier, null));
    }

    public final /* synthetic */ Lazy injectOrNull() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$injectOrNull$$inlined$injectOrNull$default$3(this, null, null));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$injectOrNull$$inlined$injectOrNull$default$2(this, qualifier, null));
    }

    public final /* synthetic */ Lazy injectOrNull(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode) {
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Scope$injectOrNull$$inlined$injectOrNull$default$1(this, qualifier, null));
    }

    public final /* synthetic */ Object get() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return get(Reflection.getOrCreateKotlinClass(Object.class), (Qualifier) null, (Function0<? extends DefinitionParameters>) null);
    }

    public final /* synthetic */ Object get(Qualifier qualifier) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<? extends DefinitionParameters>) null);
    }

    public final /* synthetic */ Object getOrNull() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getOrNull(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    public final /* synthetic */ Object getOrNull(Qualifier qualifier) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }
}
