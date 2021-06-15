package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelLazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"activityRetainedScope", "Lorg/koin/core/scope/Scope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;)Lorg/koin/core/scope/Scope;", "activityScope", "getScopeId", "", "(Landroidx/activity/ComponentActivity;)Ljava/lang/String;", "getScopeName", "Lorg/koin/core/qualifier/TypeQualifier;", "(Landroidx/activity/ComponentActivity;)Lorg/koin/core/qualifier/TypeQualifier;", "newScope", "source", "", "(Landroidx/activity/ComponentActivity;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "koin-androidx-scope_release"}, k = 2, mv = {1, 1, 18})
/* compiled from: ComponentActivityExt.kt */
public final class ComponentActivityExtKt {
    public static final <T extends ComponentActivity> Scope activityScope(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$activityScope");
        return newScope(t, t);
    }

    public static final <T extends ComponentActivity> String getScopeId(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$getScopeId");
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t.getClass())) + "@" + System.identityHashCode(t);
    }

    public static final <T extends ComponentActivity> TypeQualifier getScopeName(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$getScopeName");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t.getClass()));
    }

    public static /* synthetic */ Scope newScope$default(ComponentActivity componentActivity, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return newScope(componentActivity, obj);
    }

    public static final <T extends ComponentActivity> Scope newScope(T t, Object obj) {
        Intrinsics.checkParameterIsNotNull(t, "$this$newScope");
        return ComponentCallbackExtKt.getKoin(t).createScope(getScopeId(t), getScopeName(t), obj);
    }

    public static final <T extends ComponentActivity> Scope activityRetainedScope(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$activityRetainedScope");
        ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new ComponentActivityExtKt$activityRetainedScope$$inlined$viewModels$2(t), new ComponentActivityExtKt$activityRetainedScope$$inlined$viewModels$1(t)).getValue();
        if (scopeHandlerViewModel.getScope() == null) {
            scopeHandlerViewModel.setScope(newScope$default(t, null, 1, null));
        }
        Scope scope = scopeHandlerViewModel.getScope();
        if (scope == null) {
            Intrinsics.throwNpe();
        }
        return scope;
    }
}
