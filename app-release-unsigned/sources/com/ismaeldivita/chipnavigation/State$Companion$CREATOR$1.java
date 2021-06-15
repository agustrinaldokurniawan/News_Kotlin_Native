package com.ismaeldivita.chipnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"com/ismaeldivita/chipnavigation/State$Companion$CREATOR$1", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lcom/ismaeldivita/chipnavigation/State;", "createFromParcel", "source", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "newArray", "", "size", "", "(I)[Lcom/ismaeldivita/chipnavigation/State;", "chip-navigation-bar_release"}, k = 1, mv = {1, 1, 15})
/* compiled from: State.kt */
public final class State$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<State> {
    @Override // android.os.Parcelable.Creator
    public State[] newArray(int i) {
        return new State[0];
    }

    State$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public State createFromParcel(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "source");
        return new State(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public State createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Intrinsics.checkParameterIsNotNull(parcel, "source");
        Intrinsics.checkParameterIsNotNull(classLoader, "loader");
        return new State(parcel, classLoader);
    }
}
