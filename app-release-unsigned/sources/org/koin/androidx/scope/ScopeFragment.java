package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u000fH\b¢\u0006\u0002\u0010\u0011JB\u0010\u001b\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u001c*\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\b\n\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"H\b¢\u0006\u0002\u0010#JM\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u001a0%\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u001c*\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010&\u001a\u00020'2\u0016\b\n\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"H\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lorg/koin/androidx/scope/ScopeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/scope/KoinScopeComponent;", "contentLayoutId", "", "initialiseScope", "", "(IZ)V", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope$delegate", "Lkotlin/Lazy;", "scopeActivity", "Lorg/koin/androidx/scope/ScopeActivity;", "getScopeActivity", "()Lorg/koin/androidx/scope/ScopeActivity;", "onDestroy", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "requireScopeActivity", ExifInterface.GPS_DIRECTION_TRUE, "get", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/KoinScopeComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-androidx-scope_release"}, k = 1, mv = {1, 1, 18})
/* compiled from: ScopeFragment.kt */
public abstract class ScopeFragment extends Fragment implements KoinScopeComponent {
    private final boolean initialiseScope;
    private final Lazy scope$delegate;

    public ScopeFragment() {
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
    public /* synthetic */ ScopeFragment(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    public ScopeFragment(int i, boolean z) {
        super(i);
        this.initialiseScope = z;
        this.scope$delegate = LazyKt.lazy(new ScopeFragment$scope$2(this));
    }

    public final ScopeActivity getScopeActivity() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof ScopeActivity)) {
            activity = null;
        }
        return (ScopeActivity) activity;
    }

    public final /* synthetic */ <T extends ScopeActivity> T requireScopeActivity() {
        FragmentActivity activity = getActivity();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) ((ScopeActivity) activity);
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("can't get ScopeActivity ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb.append(Reflection.getOrCreateKotlinClass(ScopeActivity.class));
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.initialiseScope) {
            Logger logger = getKoin().getLogger();
            logger.debug("Open Fragment Scope: " + getScope());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getScope().close();
        super.onDestroy();
    }

    public static /* synthetic */ Lazy inject$default(ScopeFragment scopeFragment, KoinScopeComponent koinScopeComponent, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
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
            Intrinsics.checkParameterIsNotNull(koinScopeComponent, "$this$inject");
            Intrinsics.checkParameterIsNotNull(lazyThreadSafetyMode, "mode");
            Intrinsics.needClassReification();
            return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeFragment$inject$1(scopeFragment, koinScopeComponent, qualifier, function0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inject");
    }

    public final /* synthetic */ <T> Lazy<T> inject(KoinScopeComponent koinScopeComponent, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(koinScopeComponent, "$this$inject");
        Intrinsics.checkParameterIsNotNull(lazyThreadSafetyMode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ScopeFragment$inject$1(this, koinScopeComponent, qualifier, function0));
    }

    public static /* synthetic */ Object get$default(ScopeFragment scopeFragment, KoinScopeComponent koinScopeComponent, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                qualifier = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            Intrinsics.checkParameterIsNotNull(koinScopeComponent, "$this$get");
            Scope scope = koinScopeComponent.getScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    public final /* synthetic */ <T> T get(KoinScopeComponent koinScopeComponent, Qualifier qualifier, Function0<? extends DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(koinScopeComponent, "$this$get");
        Scope scope = koinScopeComponent.getScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
