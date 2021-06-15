package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"fragmentScope", "Lorg/koin/core/scope/Scope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Lorg/koin/core/scope/Scope;", "getScopeId", "", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "getScopeName", "Lorg/koin/core/qualifier/TypeQualifier;", "(Landroidx/fragment/app/Fragment;)Lorg/koin/core/qualifier/TypeQualifier;", "newScope", "source", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "koin-androidx-scope_release"}, k = 2, mv = {1, 1, 18})
/* compiled from: FragmentExt.kt */
public final class FragmentExtKt {
    public static final <T extends Fragment> Scope fragmentScope(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$fragmentScope");
        return newScope(t, t);
    }

    public static final <T extends Fragment> String getScopeId(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$getScopeId");
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t.getClass())) + "@" + System.identityHashCode(t);
    }

    public static final <T extends Fragment> TypeQualifier getScopeName(T t) {
        Intrinsics.checkParameterIsNotNull(t, "$this$getScopeName");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t.getClass()));
    }

    public static /* synthetic */ Scope newScope$default(Fragment fragment, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return newScope(fragment, obj);
    }

    public static final <T extends Fragment> Scope newScope(T t, Object obj) {
        Intrinsics.checkParameterIsNotNull(t, "$this$newScope");
        return ComponentCallbackExtKt.getKoin(t).createScope(getScopeId(t), getScopeName(t), obj);
    }
}
