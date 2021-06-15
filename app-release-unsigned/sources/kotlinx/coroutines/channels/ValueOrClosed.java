package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ValueOrClosed<T> {
    public static final Companion Companion = new Companion(null);
    private final Object holder;

    /* renamed from: box-impl */
    public static final /* synthetic */ ValueOrClosed m1429boximpl(Object obj) {
        return new ValueOrClosed(obj);
    }

    /* renamed from: constructor-impl */
    public static Object m1430constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl */
    public static boolean m1431equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ValueOrClosed) && Intrinsics.areEqual(obj, ((ValueOrClosed) obj2).m1439unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m1432equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static /* synthetic */ void getCloseCause$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m1436hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return m1431equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m1436hashCodeimpl(this.holder);
    }

    public String toString() {
        return m1438toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Object m1439unboximpl() {
        return this.holder;
    }

    private /* synthetic */ ValueOrClosed(Object obj) {
        this.holder = obj;
    }

    /* renamed from: isClosed-impl */
    public static final boolean m1437isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getValue-impl */
    public static final T m1434getValueimpl(Object obj) {
        if (!(obj instanceof Closed)) {
            return obj;
        }
        throw new IllegalStateException(ChannelsKt.DEFAULT_CLOSE_MESSAGE.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getValueOrNull-impl */
    public static final T m1435getValueOrNullimpl(Object obj) {
        if (obj instanceof Closed) {
            return null;
        }
        return obj;
    }

    /* renamed from: getCloseCause-impl */
    public static final Throwable m1433getCloseCauseimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).cause;
        }
        throw new IllegalStateException("Channel was not closed".toString());
    }

    /* renamed from: toString-impl */
    public static String m1438toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    public static final class Closed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: value-ZYPwvRU$kotlinx_coroutines_core */
        public final <E> Object m1441valueZYPwvRU$kotlinx_coroutines_core(E e) {
            return ValueOrClosed.m1430constructorimpl(e);
        }

        /* renamed from: closed-ZYPwvRU$kotlinx_coroutines_core */
        public final <E> Object m1440closedZYPwvRU$kotlinx_coroutines_core(Throwable th) {
            return ValueOrClosed.m1430constructorimpl(new Closed(th));
        }
    }
}
