package org.koin.androidx.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.factory.DefaultViewModelFactory;
import org.koin.androidx.viewmodel.factory.StateViewModelFactory;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001aA\u0010\u0007\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000bH\u0000¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0002\u001a)\u0010\u000f\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"createViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "viewModelParameters", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "get", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "javaClass", "Ljava/lang/Class;", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameter;Lorg/koin/core/qualifier/Qualifier;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pickFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "resolveInstance", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelResolver.kt */
public final class ViewModelResolverKt {
    public static final <T extends ViewModel> T resolveInstance(ViewModelProvider viewModelProvider, ViewModelParameter<T> viewModelParameter) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameter, "viewModelParameters");
        return (T) get(viewModelProvider, viewModelParameter, viewModelParameter.getQualifier(), JvmClassMappingKt.getJavaClass((KClass) viewModelParameter.getClazz()));
    }

    public static final <T extends ViewModel> T get(ViewModelProvider viewModelProvider, ViewModelParameter<T> viewModelParameter, Qualifier qualifier, Class<T> cls) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameter, "viewModelParameters");
        Intrinsics.checkNotNullParameter(cls, "javaClass");
        if (viewModelParameter.getQualifier() != null) {
            T t = (T) viewModelProvider.get(String.valueOf(qualifier), cls);
            Intrinsics.checkNotNullExpressionValue(t, "{\n        get(qualifier.toString(), javaClass)\n    }");
            return t;
        }
        T t2 = (T) viewModelProvider.get(cls);
        Intrinsics.checkNotNullExpressionValue(t2, "{\n        get(javaClass)\n    }");
        return t2;
    }

    public static final <T extends ViewModel> ViewModelProvider createViewModelProvider(Scope scope, ViewModelParameter<T> viewModelParameter) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameter, "viewModelParameters");
        return new ViewModelProvider(viewModelParameter.getViewModelStore(), pickFactory(scope, viewModelParameter));
    }

    private static final <T extends ViewModel> ViewModelProvider.Factory pickFactory(Scope scope, ViewModelParameter<T> viewModelParameter) {
        if (viewModelParameter.getRegistryOwner() == null || viewModelParameter.getInitialState() == null) {
            return new DefaultViewModelFactory(scope, viewModelParameter);
        }
        return new StateViewModelFactory(scope, viewModelParameter);
    }
}
