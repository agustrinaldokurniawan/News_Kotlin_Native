package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J>\u0010\u000e\u001a\u0002H\u000f\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0004\u0018\u0001`\u0016H\b¢\u0006\u0002\u0010\u0017JI\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0019\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0004\u0018\u0001`\u0016H\bJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, d2 = {"Lorg/koin/androidx/scope/ScopeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/scope/KoinScopeComponent;", "contentLayoutId", "", "initialiseScope", "", "(IZ)V", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope$delegate", "Lkotlin/Lazy;", "get", ExifInterface.GPS_DIRECTION_TRUE, "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "koin-androidx-scope_release"}, k = 1, mv = {1, 1, 18})
/* compiled from: ScopeActivity.kt */
public abstract class ScopeActivity extends AppCompatActivity implements KoinScopeComponent {
    private final boolean initialiseScope;
    private final Lazy scope$delegate;

    public ScopeActivity() {
        this(0, false, 3, null);
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
    public /* synthetic */ ScopeActivity(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    public ScopeActivity(int i, boolean z) {
        super(i);
        this.initialiseScope = z;
        this.scope$delegate = LazyKt.lazy(new ScopeActivity$scope$2(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.initialiseScope) {
            Logger logger = getKoin().getLogger();
            logger.debug("Open Activity Scope: " + getScope());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        getScope().close();
        super.onDestroy();
    }

    public static /* synthetic */ Lazy inject$default(ScopeActivity scopeActivity, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
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
            return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeActivity$inject$1(scopeActivity, qualifier, function0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inject");
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeActivity$inject$1(this, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(ScopeActivity scopeActivity, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                qualifier = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            Scope scope = scopeActivity.getScope();
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
