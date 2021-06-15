package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\n\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lorg/koin/core/definition/Options;", "", "isCreatedAtStart", "", "override", "isExtraDefinition", "(ZZZ)V", "()Z", "setCreatedAtStart", "(Z)V", "setExtraDefinition", "getOverride", "setOverride", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: Options.kt */
public final class Options {
    private boolean isCreatedAtStart;
    private boolean isExtraDefinition;
    private boolean override;

    public Options() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ Options copy$default(Options options, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = options.isCreatedAtStart;
        }
        if ((i & 2) != 0) {
            z2 = options.override;
        }
        if ((i & 4) != 0) {
            z3 = options.isExtraDefinition;
        }
        return options.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.isCreatedAtStart;
    }

    public final boolean component2() {
        return this.override;
    }

    public final boolean component3() {
        return this.isExtraDefinition;
    }

    public final Options copy(boolean z, boolean z2, boolean z3) {
        return new Options(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.isCreatedAtStart == options.isCreatedAtStart && this.override == options.override && this.isExtraDefinition == options.isExtraDefinition;
    }

    public int hashCode() {
        boolean z = this.isCreatedAtStart;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.override;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isExtraDefinition;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i9 + i;
    }

    public String toString() {
        return "Options(isCreatedAtStart=" + this.isCreatedAtStart + ", override=" + this.override + ", isExtraDefinition=" + this.isExtraDefinition + ')';
    }

    public Options(boolean z, boolean z2, boolean z3) {
        this.isCreatedAtStart = z;
        this.override = z2;
        this.isExtraDefinition = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Options(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean getOverride() {
        return this.override;
    }

    public final boolean isCreatedAtStart() {
        return this.isCreatedAtStart;
    }

    public final boolean isExtraDefinition() {
        return this.isExtraDefinition;
    }

    public final void setCreatedAtStart(boolean z) {
        this.isCreatedAtStart = z;
    }

    public final void setExtraDefinition(boolean z) {
        this.isExtraDefinition = z;
    }

    public final void setOverride(boolean z) {
        this.override = z;
    }
}
