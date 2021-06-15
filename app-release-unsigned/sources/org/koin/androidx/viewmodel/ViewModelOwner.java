package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "", "store", "Landroidx/lifecycle/ViewModelStore;", "stateRegistry", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getStateRegistry", "()Landroidx/savedstate/SavedStateRegistryOwner;", "getStore", "()Landroidx/lifecycle/ViewModelStore;", "Companion", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: ViewModelOwner.kt */
public final class ViewModelOwner {
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner stateRegistry;
    private final ViewModelStore store;

    public ViewModelOwner(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(viewModelStore, "store");
        this.store = viewModelStore;
        this.stateRegistry = savedStateRegistryOwner;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelOwner(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, (i & 2) != 0 ? null : savedStateRegistryOwner);
    }

    public final ViewModelStore getStore() {
        return this.store;
    }

    public final SavedStateRegistryOwner getStateRegistry() {
        return this.stateRegistry;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001¨\u0006\r"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner$Companion;", "", "()V", "from", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "store", "Landroidx/lifecycle/ViewModelStore;", "stateRegistry", "Landroidx/savedstate/SavedStateRegistryOwner;", "storeOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "fromAny", "owner", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* compiled from: ViewModelOwner.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, int i, Object obj) {
            if ((i & 2) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStore, savedStateRegistryOwner);
        }

        public final ViewModelOwner from(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(viewModelStore, "store");
            return new ViewModelOwner(viewModelStore, savedStateRegistryOwner);
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i, Object obj) {
            if ((i & 2) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStoreOwner, savedStateRegistryOwner);
        }

        public final ViewModelOwner from(ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "storeOwner");
            ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "storeOwner.viewModelStore");
            return new ViewModelOwner(viewModelStore, savedStateRegistryOwner);
        }

        public final ViewModelOwner fromAny(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "owner");
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) obj).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner as ViewModelStoreOwner).viewModelStore");
            return new ViewModelOwner(viewModelStore, obj instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) obj : null);
        }
    }
}
