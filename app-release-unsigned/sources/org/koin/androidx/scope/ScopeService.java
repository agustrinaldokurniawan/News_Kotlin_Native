package org.koin.androidx.scope;

import android.app.Service;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.KoinScopeComponent;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J>\u0010\f\u001a\u0002H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\b¢\u0006\u0002\u0010\u0015JI\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\r0\u0017\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lorg/koin/androidx/scope/ScopeService;", "Landroid/app/Service;", "Lorg/koin/core/scope/KoinScopeComponent;", "initialiseScope", "", "(Z)V", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope$delegate", "Lkotlin/Lazy;", "get", ExifInterface.GPS_DIRECTION_TRUE, "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "onCreate", "", "onDestroy", "koin-androidx-scope_release"}, k = 1, mv = {1, 1, 18})
/* compiled from: ScopeService.kt */
public abstract class ScopeService extends Service implements KoinScopeComponent {
    private final boolean initialiseScope;
    private final Lazy scope$delegate;

    public ScopeService() {
        this(false, 1, null);
    }

    @Override // org.koin.core.scope.KoinScopeComponent
    public Scope getScope() {
        return (Scope) this.scope$delegate.getValue();
    }

    @Override // org.koin.core.scope.KoinScopeComponent
    public void closeScope() {
        KoinScopeComponent.DefaultImpls.closeScope(this);
    }

    @Override // org.koin.core.component.KoinComponent
    public Koin getKoin() {
        return KoinScopeComponent.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScopeService(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public ScopeService(boolean z) {
        this.initialiseScope = z;
        this.scope$delegate = LazyKt.lazy(new ScopeService$scope$2(this));
    }

    public void onCreate() {
        super.onCreate();
        if (this.initialiseScope) {
            Logger logger = getKoin().getLogger();
            logger.debug("Open Service Scope: " + getScope());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Logger logger = getKoin().getLogger();
        logger.debug("Close service scope: " + getScope());
        getScope().close();
    }

    public static /* synthetic */ Lazy inject$default(ScopeService scopeService, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                qualifier = null;
            }
            if ((i & 2) != 0) {
                lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            Intrinsics.checkParameterIsNotNull(lazyThreadSafetyMode, "mode");
            Intrinsics.needClassReification();
            return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeService$inject$1(scopeService, qualifier, function0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inject");
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeService$inject$1(this, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(ScopeService scopeService, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                qualifier = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            Scope scope = scopeService.getScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Scope scope = getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
