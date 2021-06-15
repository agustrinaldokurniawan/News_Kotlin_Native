package org.koin.androidx.viewmodel.parameter;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J'\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0016¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lorg/koin/androidx/viewmodel/parameter/StateDefinitionParameter;", "Lorg/koin/core/parameter/DefinitionParameters;", "state", "Landroidx/lifecycle/SavedStateHandle;", "values", "", "", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/List;)V", "getState", "()Landroidx/lifecycle/SavedStateHandle;", "getOrNull", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Companion", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: StateDefinitionParameter.kt */
public final class StateDefinitionParameter extends DefinitionParameters {
    public static final Companion Companion = new Companion(null);
    private final SavedStateHandle state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateDefinitionParameter(SavedStateHandle savedStateHandle, List<? extends Object> list) {
        super(list);
        Intrinsics.checkNotNullParameter(savedStateHandle, "state");
        Intrinsics.checkNotNullParameter(list, "values");
        this.state = savedStateHandle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateDefinitionParameter(SavedStateHandle savedStateHandle, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final SavedStateHandle getState() {
        return this.state;
    }

    @Override // org.koin.core.parameter.DefinitionParameters
    public <T> T getOrNull(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(SavedStateHandle.class)) ? (T) this.state : (T) super.getOrNull(kClass);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lorg/koin/androidx/viewmodel/parameter/StateDefinitionParameter$Companion;", "", "()V", "from", "Lorg/koin/androidx/viewmodel/parameter/StateDefinitionParameter;", "state", "Landroidx/lifecycle/SavedStateHandle;", "params", "Lorg/koin/core/parameter/DefinitionParameters;", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: StateDefinitionParameter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateDefinitionParameter from(SavedStateHandle savedStateHandle, DefinitionParameters definitionParameters) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "state");
            Intrinsics.checkNotNullParameter(definitionParameters, "params");
            return new StateDefinitionParameter(savedStateHandle, definitionParameters.getValues());
        }
    }
}
