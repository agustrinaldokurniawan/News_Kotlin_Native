package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectClause1;

public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, Function1<? super ReceiveChannel<? extends E>, ? extends R> function1) {
        ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            return (R) function1.invoke(openSubscription);
        } finally {
            InlineMarker.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) openSubscription, (CancellationException) null, 1, (Object) null);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <E> Object receiveOrNull(ReceiveChannel<? extends E> receiveChannel, Continuation<? super E> continuation) {
        Objects.requireNonNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E?>");
        return receiveChannel.receiveOrNull(continuation);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: kotlinx.coroutines.selects.SelectClause1<? extends E>, kotlinx.coroutines.selects.SelectClause1<E> */
    public static final <E> SelectClause1<E> onReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
        Objects.requireNonNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E?>");
        return (SelectClause1<? extends E>) receiveChannel.getOnReceiveOrNull();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Function1<Throwable, Unit> consumes(ReceiveChannel<?> receiveChannel) {
        return new ChannelsKt__Channels_commonKt$consumes$1(receiveChannel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.concurrent.CancellationException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            cancellationException = cancellationException;
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(cancellationException);
    }

    public static final Function1<Throwable, Unit> consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new ChannelsKt__Channels_commonKt$consumesAll$1(receiveChannelArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r3) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch:{ all -> 0x0012 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r3
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object consumeEachIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.jvm.functions.Function1<? super kotlin.collections.IndexedValue<? extends E>, kotlin.Unit> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEachIndexed(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r16, int r17, kotlin.coroutines.Continuation<? super E> r18) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object elementAtOrElse(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends E> r13, kotlin.coroutines.Continuation<? super E> r14) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAtOrElse(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, int r12, kotlin.coroutines.Continuation<? super E> r13) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object find(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r18, kotlin.coroutines.Continuation<? super E> r19) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.find(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9 A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object findLast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r14, kotlin.coroutines.Continuation<? super E> r15) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.findLast(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, kotlin.coroutines.Continuation<? super E> r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.first(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r12, kotlin.coroutines.Continuation<? super E> r13) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.first(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, kotlin.coroutines.Continuation<? super E> r7) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.firstOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super E> r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.firstOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, E r13, kotlin.coroutines.Continuation<? super java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object indexOfFirst(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfFirst(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object indexOfLast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfLast(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.Continuation<? super E> r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.last(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r14, kotlin.coroutines.Continuation<? super E> r15) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.last(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[Catch:{ all -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2 A[Catch:{ all -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb A[Catch:{ all -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, E r13, kotlin.coroutines.Continuation<? super java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.Continuation<? super E> r10) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r14, kotlin.coroutines.Continuation<? super E> r15) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, kotlin.coroutines.Continuation<? super E> r9) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.single(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[Catch:{ all -> 0x00f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ all -> 0x00f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r14, kotlin.coroutines.Continuation<? super E> r15) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.single(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.Continuation<? super E> r10) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.singleOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r18, kotlin.coroutines.Continuation<? super E> r19) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.singleOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.drop(receiveChannel, i, coroutineContext);
    }

    public static final <E> ReceiveChannel<E> drop(ReceiveChannel<? extends E> receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$drop$1(receiveChannel, i, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.dropWhile(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> dropWhile(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$dropWhile$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$filter$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filterIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E> ReceiveChannel<E> filterIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function3<? super Integer, ? super E, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$filterIndexed$1(receiveChannel, function3, null), 6, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9 A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, C r18, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, java.lang.Boolean> r19, kotlin.coroutines.Continuation<? super C> r20) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r13v11, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e3 A[Catch:{ all -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fe A[Catch:{ all -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r19, C r20, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, java.lang.Boolean> r21, kotlin.coroutines.Continuation<? super C> r22) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filterNot(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> filterNot(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ChannelsKt.filter(receiveChannel, coroutineContext, new ChannelsKt__Channels_commonKt$filterNot$1(function2, null));
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannel2 = filter$default(receiveChannel, null, new ChannelsKt__Channels_commonKt$filterNotNull$1(null), 1, null);
        Objects.requireNonNull(receiveChannel2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E>");
        return receiveChannel2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, C r11, kotlin.coroutines.Continuation<? super C> r12) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, C r13, kotlin.coroutines.Continuation<? super C> r14) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterNotTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super C> r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterNotTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, C r18, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r19, kotlin.coroutines.Continuation<? super C> r20) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super C> r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, C r18, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r19, kotlin.coroutines.Continuation<? super C> r20) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.take(receiveChannel, i, coroutineContext);
    }

    public static final <E> ReceiveChannel<E> take(ReceiveChannel<? extends E> receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$take$1(receiveChannel, i, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.takeWhile(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> takeWhile(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$takeWhile$1(receiveChannel, function2, null), 6, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object associate(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> r14, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends V>> r15) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associate(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associate$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x0044 }
        L_0x000f:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r7.invoke(r4)     // Catch:{ all -> 0x0044 }
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r4.getFirst()     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r4.getSecond()     // Catch:{ all -> 0x0044 }
            r0.put(r5, r4)     // Catch:{ all -> 0x0044 }
            goto L_0x000f
        L_0x0038:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x0044:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associate$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9 A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K> java.lang.Object associateBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, ? extends K> r14, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends E>> r15) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associateBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x003a }
        L_0x000f:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x003a }
            r0.put(r5, r4)     // Catch:{ all -> 0x003a }
            goto L_0x000f
        L_0x002e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x003a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003c }
        L_0x003c:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object associateBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function1<? super E, ? extends K> r13, kotlin.jvm.functions.Function1<? super E, ? extends V> r14, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends V>> r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associateBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x003e }
        L_0x000f:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object r4 = r3.hasNext(r9)     // Catch:{ all -> 0x003e }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003e }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x003e }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object r4 = r8.invoke(r4)     // Catch:{ all -> 0x003e }
            r0.put(r5, r4)     // Catch:{ all -> 0x003e }
            goto L_0x000f
        L_0x0032:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003e }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x003e:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, M extends java.util.Map<? super K, ? super E>> java.lang.Object associateByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, M r12, kotlin.jvm.functions.Function1<? super E, ? extends K> r13, kotlin.coroutines.Continuation<? super M> r14) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object associateByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, M r12, kotlin.jvm.functions.Function1<? super E, ? extends K> r13, kotlin.jvm.functions.Function1<? super E, ? extends V> r14, kotlin.coroutines.Continuation<? super M> r15) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object associateTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, M r12, kotlin.jvm.functions.Function1<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> r13, kotlin.coroutines.Continuation<? super M> r14) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[Catch:{ all -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be A[Catch:{ all -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, C r11, kotlin.coroutines.Continuation<? super C> r12) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, C r11, kotlin.coroutines.Continuation<? super C> r12) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, Continuation<? super List<? extends E>> continuation) {
        return ChannelsKt.toMutableList(receiveChannel, continuation);
    }

    public static final <K, V> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, Continuation<? super Map<K, ? extends V>> continuation) {
        return ChannelsKt.toMap(receiveChannel, new LinkedHashMap(), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r11, M r12, kotlin.coroutines.Continuation<? super M> r13) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> Object toMutableList(ReceiveChannel<? extends E> receiveChannel, Continuation<? super List<E>> continuation) {
        return ChannelsKt.toCollection(receiveChannel, new ArrayList(), continuation);
    }

    public static final <E> Object toSet(ReceiveChannel<? extends E> receiveChannel, Continuation<? super Set<? extends E>> continuation) {
        return ChannelsKt.toMutableSet(receiveChannel, continuation);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.flatMap(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> ReceiveChannel<R> flatMap(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super ReceiveChannel<? extends R>>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$flatMap$1(receiveChannel, function2, null), 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K> java.lang.Object groupBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.jvm.functions.Function1<? super E, ? extends K> r18, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends java.util.List<? extends E>>> r19) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object groupBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r7.iterator()     // Catch:{ all -> 0x004c }
        L_0x000f:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x004c }
            java.lang.Object r4 = r3.hasNext(r9)     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004c }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = r8.invoke(r4)     // Catch:{ all -> 0x004c }
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x004c }
            if (r6 != 0) goto L_0x003a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            r6.<init>()     // Catch:{ all -> 0x004c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x004c }
            r0.put(r5, r6)     // Catch:{ all -> 0x004c }
        L_0x003a:
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x004c }
            r6.add(r4)     // Catch:{ all -> 0x004c }
            goto L_0x000f
        L_0x0040:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x004c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x004e }
        L_0x004e:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v2, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab A[Catch:{ all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[Catch:{ all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db A[Catch:{ all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object groupBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.jvm.functions.Function1<? super E, ? extends K> r18, kotlin.jvm.functions.Function1<? super E, ? extends V> r19, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends java.util.List<? extends V>>> r20) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object groupBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r7.iterator()     // Catch:{ all -> 0x0050 }
        L_0x000f:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r3.hasNext(r10)     // Catch:{ all -> 0x0050 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r8.invoke(r4)     // Catch:{ all -> 0x0050 }
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x003a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r6.<init>()     // Catch:{ all -> 0x0050 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0050 }
            r0.put(r5, r6)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r9.invoke(r4)     // Catch:{ all -> 0x0050 }
            r6.add(r4)     // Catch:{ all -> 0x0050 }
            goto L_0x000f
        L_0x0044:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0050 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x0050:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, M extends java.util.Map<? super K, java.util.List<E>>> java.lang.Object groupByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, M r13, kotlin.jvm.functions.Function1<? super E, ? extends K> r14, kotlin.coroutines.Continuation<? super M> r15) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, java.util.List<V>>> java.lang.Object groupByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r18, M r19, kotlin.jvm.functions.Function1<? super E, ? extends K> r20, kotlin.jvm.functions.Function1<? super E, ? extends V> r21, kotlin.coroutines.Continuation<? super M> r22) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$map$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$mapIndexed$1(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexedNotNull(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9 A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, C r18, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> r19, kotlin.coroutines.Continuation<? super C> r20) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r13v11, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e5 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r19, C r20, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> r21, kotlin.coroutines.Continuation<? super C> r22) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9 A[Catch:{ all -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[Catch:{ all -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r18, C r19, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> r20, kotlin.coroutines.Continuation<? super C> r21) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r12v8, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e5 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0102 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r20, C r21, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> r22, kotlin.coroutines.Continuation<? super C> r23) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapNotNull(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> ReceiveChannel<R> mapNotNull(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, C r11, kotlin.jvm.functions.Function1<? super E, ? extends R> r12, kotlin.coroutines.Continuation<? super C> r13) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r15v6. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0109 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, C r13, kotlin.jvm.functions.Function1<? super E, ? extends R> r14, kotlin.coroutines.Continuation<? super C> r15) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, C r11, kotlin.jvm.functions.Function1<? super E, ? extends R> r12, kotlin.coroutines.Continuation<? super C> r13) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r15v5. Raw type applied. Possible types: ? super E, java.lang.Object */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, C r13, kotlin.jvm.functions.Function1<? super E, ? extends R> r14, kotlin.coroutines.Continuation<? super C> r15) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.withIndex(receiveChannel, coroutineContext);
    }

    public static final <E> ReceiveChannel<IndexedValue<E>> withIndex(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static final <E> ReceiveChannel<E> distinct(ReceiveChannel<? extends E> receiveChannel) {
        return distinctBy$default(receiveChannel, null, new ChannelsKt__Channels_commonKt$distinct$1(null), 1, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__Channels_commonKt$distinctBy$1(receiveChannel, function2, null), 6, null);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, Continuation<? super Set<E>> continuation) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object all(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.all(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.any(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.any(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, kotlin.coroutines.Continuation<? super java.lang.Integer> r12) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.count(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r13, kotlin.coroutines.Continuation<? super java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.count(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[Catch:{ all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0 A[Catch:{ all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> java.lang.Object fold(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, R r18, kotlin.jvm.functions.Function2<? super R, ? super E, ? extends R> r19, kotlin.coroutines.Continuation<? super R> r20) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.fold(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> java.lang.Object foldIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r18, R r19, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super E, ? extends R> r20, kotlin.coroutines.Continuation<? super R> r21) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.foldIndexed(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object maxBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r16, kotlin.jvm.functions.Function1<? super E, ? extends R> r17, kotlin.coroutines.Continuation<? super E> r18) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.maxBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, java.util.Comparator<? super E> r11, kotlin.coroutines.Continuation<? super E> r12) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object minBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r16, kotlin.jvm.functions.Function1<? super E, ? extends R> r17, kotlin.coroutines.Continuation<? super E> r18) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.minBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, java.util.Comparator<? super E> r11, kotlin.coroutines.Continuation<? super E> r12) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ all -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[Catch:{ all -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.none(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.none(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, E extends S> java.lang.Object reduce(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, kotlin.jvm.functions.Function2<? super S, ? super E, ? extends S> r11, kotlin.coroutines.Continuation<? super S> r12) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduce(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, E extends S> java.lang.Object reduceIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r12, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super E, ? extends S> r13, kotlin.coroutines.Continuation<? super S> r14) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduceIndexed(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object sumBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Integer> r14, kotlin.coroutines.Continuation<? super java.lang.Integer> r15) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumBy(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object sumByDouble(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r18, kotlin.jvm.functions.Function1<? super E, java.lang.Double> r19, kotlin.coroutines.Continuation<? super java.lang.Double> r20) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumByDouble(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> requireNoNulls(ReceiveChannel<? extends E> receiveChannel) {
        return map$default(receiveChannel, null, new ChannelsKt__Channels_commonKt$requireNoNulls$1(receiveChannel, null), 1, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object partition(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r13, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r14, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<? extends E>, ? extends java.util.List<? extends E>>> r15) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.partition(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object partition$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 1
            kotlinx.coroutines.channels.ChannelIterator r4 = r7.iterator()     // Catch:{ all -> 0x004e }
        L_0x0012:
            r5 = 0
            kotlin.jvm.internal.InlineMarker.mark(r5)     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r4.hasNext(r9)     // Catch:{ all -> 0x004e }
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x004e }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = r8.invoke(r5)     // Catch:{ all -> 0x004e }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x004e }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x004e }
            if (r6 == 0) goto L_0x0039
            r0.add(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0012
        L_0x0039:
            r1.add(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0012
        L_0x003d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004e }
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r0, r1)
            return r7
        L_0x004e:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.partition$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<Pair<E, R>> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2) {
        return zip$default(receiveChannel, receiveChannel2, null, ChannelsKt__Channels_commonKt$zip$1.INSTANCE, 2, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, CoroutineContext coroutineContext, Function2<? super E, ? super R, ? extends V> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new ChannelsKt__Channels_commonKt$zip$2(receiveChannel, receiveChannel2, function2, null), 6, null);
    }

    private static final Object consumeEach$$forInline(BroadcastChannel broadcastChannel, Function1 function1, Continuation continuation) {
        ReceiveChannel openSubscription = broadcastChannel.openSubscription();
        try {
            ChannelIterator it = openSubscription.iterator();
            while (true) {
                InlineMarker.mark(0);
                Object hasNext = it.hasNext(continuation);
                InlineMarker.mark(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    return Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } finally {
            InlineMarker.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default(openSubscription, (CancellationException) null, 1, (Object) null);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel r4, kotlin.jvm.functions.Function1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r4.iterator()     // Catch:{ all -> 0x002f }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.hasNext(r6)     // Catch:{ all -> 0x002f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x002f }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x002f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x002f }
            r5.invoke(r3)     // Catch:{ all -> 0x002f }
            goto L_0x0008
        L_0x0023:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002f }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r5
        L_0x002f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object consumeEachIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch:{ all -> 0x003a }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r2.hasNext(r10)     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x003a }
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue     // Catch:{ all -> 0x003a }
            int r7 = r4 + 1
            r6.<init>(r4, r5)     // Catch:{ all -> 0x003a }
            r9.invoke(r6)     // Catch:{ all -> 0x003a }
            r4 = r7
            goto L_0x000a
        L_0x002c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x003a:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x003c }
        L_0x003c:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEachIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object elementAtOrElse$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, int r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            if (r8 >= 0) goto L_0x0019
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0053 }
            java.lang.Object r8 = r9.invoke(r8)     // Catch:{ all -> 0x0053 }
            r9 = 4
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
        L_0x0012:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
            return r8
        L_0x0019:
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()
            r3 = 0
            r4 = r3
        L_0x001f:
            kotlin.jvm.internal.InlineMarker.mark(r3)
            java.lang.Object r5 = r2.hasNext(r10)
            kotlin.jvm.internal.InlineMarker.mark(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r2.next()
            int r6 = r4 + 1
            if (r8 != r4) goto L_0x0044
            r8 = 3
            kotlin.jvm.internal.InlineMarker.finallyStart(r8)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r8)
            return r5
        L_0x0044:
            r4 = r6
            goto L_0x001f
        L_0x0046:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.invoke(r8)
            r9 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            goto L_0x0012
        L_0x0053:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAtOrElse$$forInline(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object find$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0009:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0044 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x0009
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            r0 = r4
            goto L_0x0043
        L_0x0038:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
        L_0x0043:
            return r0
        L_0x0044:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.find$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object findLast$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x003a }
        L_0x0009:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0009
            r0 = r4
            goto L_0x0009
        L_0x002e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x003a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003c }
        L_0x003c:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.findLast$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object first$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x004b }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004b }
            java.lang.Object r3 = r2.hasNext(r7)     // Catch:{ all -> 0x004b }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x004b }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x004b }
            java.lang.Object r4 = r6.invoke(r3)     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0008
            r6 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return r3
        L_0x0036:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "ReceiveChannel contains no element matching the predicate."
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x004b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004d }
        L_0x004d:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.first$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object firstOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0009:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0043 }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x0043 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0037
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0043 }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0043 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0009
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r4
        L_0x0037:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x0043:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.firstOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object indexOfFirst$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x004f }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r2.hasNext(r8)     // Catch:{ all -> 0x004f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x004f }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r7.invoke(r5)     // Catch:{ all -> 0x004f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x004f }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x003b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004f }
            r8 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r8)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r8)
            return r7
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x003e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L_0x004f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfFirst$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object indexOfLast$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x0040 }
            r3 = 0
            r4 = -1
            r5 = r3
        L_0x000b:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = r2.hasNext(r9)     // Catch:{ all -> 0x0040 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0040 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0040 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x0030
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = r8.invoke(r6)     // Catch:{ all -> 0x0040 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0040 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x002e
            r4 = r5
        L_0x002e:
            int r5 = r5 + r1
            goto L_0x000b
        L_0x0030:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0040 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            return r7
        L_0x0040:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfLast$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object last$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r8.iterator()     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = r4
        L_0x000b:
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0048 }
            java.lang.Object r6 = r3.hasNext(r10)     // Catch:{ all -> 0x0048 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0048 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0030
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0048 }
            java.lang.Object r7 = r9.invoke(r6)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0048 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x000b
            r5 = r2
            r0 = r6
            goto L_0x000b
        L_0x0030:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            if (r5 == 0) goto L_0x003e
            return r0
        L_0x003e:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "ReceiveChannel contains no element matching the predicate."
            r8.<init>(r9)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0048:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x004a }
        L_0x004a:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.last$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object lastOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r6.iterator()     // Catch:{ all -> 0x003a }
        L_0x0009:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.hasNext(r8)     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r7.invoke(r4)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0009
            r0 = r4
            goto L_0x0009
        L_0x002e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r0
        L_0x003a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003c }
        L_0x003c:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object single$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r8.iterator()     // Catch:{ all -> 0x0054 }
            r4 = 0
            r5 = r4
        L_0x000b:
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r6 = r3.hasNext(r10)     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0054 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0054 }
            java.lang.Object r7 = r9.invoke(r6)     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0054 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x000b
            if (r5 != 0) goto L_0x0032
            r5 = r2
            r0 = r6
            goto L_0x000b
        L_0x0032:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0054 }
            java.lang.String r10 = "ReceiveChannel contains more than one matching element."
            r9.<init>(r10)     // Catch:{ all -> 0x0054 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x003c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            if (r5 == 0) goto L_0x004a
            return r0
        L_0x004a:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "ReceiveChannel contains no element matching the predicate."
            r8.<init>(r9)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0054:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.single$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r10);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object singleOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.Continuation r11) {
        /*
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            kotlinx.coroutines.channels.ChannelIterator r3 = r9.iterator()     // Catch:{ all -> 0x004d }
            r4 = 0
            r6 = r0
            r5 = r4
        L_0x000c:
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x004d }
            java.lang.Object r7 = r3.hasNext(r11)     // Catch:{ all -> 0x004d }
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch:{ all -> 0x004d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x004d }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x004d }
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x004d }
            java.lang.Object r8 = r10.invoke(r7)     // Catch:{ all -> 0x004d }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004d }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004d }
            if (r8 == 0) goto L_0x000c
            if (r5 == 0) goto L_0x003b
            r10 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r10)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r10)
            return r0
        L_0x003b:
            r5 = r2
            r6 = r7
            goto L_0x000c
        L_0x003e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            if (r5 != 0) goto L_0x004c
            return r0
        L_0x004c:
            return r6
        L_0x004d:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x004f }
        L_0x004f:
            r11 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r10)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.singleOrNull$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Collection r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch:{ all -> 0x0050 }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r2.hasNext(r11)     // Catch:{ all -> 0x0050 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0050 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0050 }
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue     // Catch:{ all -> 0x0050 }
            int r7 = r4 + 1
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0050 }
            int r4 = r6.component1()     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r6.component2()     // Catch:{ all -> 0x0050 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r10.invoke(r4, r5)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0042
            r9.add(r5)     // Catch:{ all -> 0x0050 }
        L_0x0042:
            r4 = r7
            goto L_0x000a
        L_0x0044:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0050 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r9
        L_0x0050:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlinx.coroutines.channels.SendChannel r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterNotTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x003b }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r2.hasNext(r8)     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x003b }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r7.invoke(r3)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0008
            r6.add(r3)     // Catch:{ all -> 0x003b }
            goto L_0x0008
        L_0x002f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x003b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003d }
        L_0x003d:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterNotTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x0045 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r2.hasNext(r9)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0045 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r8.invoke(r4)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0045 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0008
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            r7.send(r4, r9)     // Catch:{ all -> 0x0045 }
            r3 = 2
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0008
        L_0x0039:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r7
        L_0x0045:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x003b }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r2.hasNext(r8)     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x003b }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r7.invoke(r3)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0008
            r6.add(r3)     // Catch:{ all -> 0x003b }
            goto L_0x0008
        L_0x002f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x003b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003d }
        L_0x003d:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object filterTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x0045 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r2.hasNext(r9)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0045 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r8.invoke(r4)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0045 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0008
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            r7.send(r4, r9)     // Catch:{ all -> 0x0045 }
            r3 = 2
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0008
        L_0x0039:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r7
        L_0x0045:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associateByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Map r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r2.hasNext(r8)     // Catch:{ all -> 0x0033 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0033 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0033 }
            java.lang.Object r4 = r7.invoke(r3)     // Catch:{ all -> 0x0033 }
            r6.put(r4, r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0008
        L_0x0027:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0033 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x0033:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associateByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Map r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r2.hasNext(r9)     // Catch:{ all -> 0x0037 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0037 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0037 }
            java.lang.Object r4 = r7.invoke(r3)     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r8.invoke(r3)     // Catch:{ all -> 0x0037 }
            r6.put(r4, r3)     // Catch:{ all -> 0x0037 }
            goto L_0x0008
        L_0x002b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0037 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x0037:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object associateTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Map r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x003d }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003d }
            java.lang.Object r3 = r2.hasNext(r8)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x003d }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x003d }
            java.lang.Object r3 = r7.invoke(r3)     // Catch:{ all -> 0x003d }
            kotlin.Pair r3 = (kotlin.Pair) r3     // Catch:{ all -> 0x003d }
            java.lang.Object r4 = r3.getFirst()     // Catch:{ all -> 0x003d }
            java.lang.Object r3 = r3.getSecond()     // Catch:{ all -> 0x003d }
            r6.put(r4, r3)     // Catch:{ all -> 0x003d }
            goto L_0x0008
        L_0x0031:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x003d:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003f }
        L_0x003f:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object groupByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Map r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x0045 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r2.hasNext(r9)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r8.invoke(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r7.get(r4)     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0033
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0045 }
            r5.<init>()     // Catch:{ all -> 0x0045 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0045 }
            r7.put(r4, r5)     // Catch:{ all -> 0x0045 }
        L_0x0033:
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0045 }
            r5.add(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0008
        L_0x0039:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r7
        L_0x0045:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object groupByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Map r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x0049 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0049 }
            java.lang.Object r3 = r2.hasNext(r10)     // Catch:{ all -> 0x0049 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0049 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0049 }
            java.lang.Object r4 = r8.invoke(r3)     // Catch:{ all -> 0x0049 }
            java.lang.Object r5 = r7.get(r4)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x0033
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            r5.<init>()     // Catch:{ all -> 0x0049 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0049 }
            r7.put(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0033:
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0049 }
            java.lang.Object r3 = r9.invoke(r3)     // Catch:{ all -> 0x0049 }
            r5.add(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0008
        L_0x003d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0049 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r7
        L_0x0049:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x004b }
        L_0x004b:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapIndexedNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Collection r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch:{ all -> 0x004a }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r2.hasNext(r11)     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x004a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x004a }
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue     // Catch:{ all -> 0x004a }
            int r7 = r4 + 1
            r6.<init>(r4, r5)     // Catch:{ all -> 0x004a }
            int r4 = r6.component1()     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r6.component2()     // Catch:{ all -> 0x004a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r10.invoke(r4, r5)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x003c
            r9.add(r4)     // Catch:{ all -> 0x004a }
        L_0x003c:
            r4 = r7
            goto L_0x000a
        L_0x003e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r9
        L_0x004a:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x004c }
        L_0x004c:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapIndexedNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlinx.coroutines.channels.SendChannel r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0054 }
            java.lang.Object r5 = r2.hasNext(r11)     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0054 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0054 }
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue     // Catch:{ all -> 0x0054 }
            int r7 = r4 + 1
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0054 }
            int r4 = r6.component1()     // Catch:{ all -> 0x0054 }
            java.lang.Object r5 = r6.component2()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r4 = r10.invoke(r4, r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0046
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0054 }
            r9.send(r4, r11)     // Catch:{ all -> 0x0054 }
            r4 = 2
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0054 }
        L_0x0046:
            r4 = r7
            goto L_0x000a
        L_0x0048:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r9
        L_0x0054:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, java.util.Collection r8, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x003b }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r2.hasNext(r10)     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003b }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x003b }
            int r6 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r9.invoke(r4, r5)     // Catch:{ all -> 0x003b }
            r8.add(r4)     // Catch:{ all -> 0x003b }
            r4 = r6
            goto L_0x000a
        L_0x002f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003b }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r8
        L_0x003b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003d }
        L_0x003d:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.SendChannel r8, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x0045 }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r2.hasNext(r10)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0045 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0045 }
            int r6 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r9.invoke(r4, r5)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0045 }
            r8.send(r4, r10)     // Catch:{ all -> 0x0045 }
            r4 = 2
            kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0045 }
            r4 = r6
            goto L_0x000a
        L_0x0039:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r8
        L_0x0045:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r4, java.util.Collection r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r4.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r2.hasNext(r7)     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0035 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r6.invoke(r3)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0008
            r5.add(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0008
        L_0x0029:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r5
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlinx.coroutines.channels.SendChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x003f }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r2.hasNext(r8)     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003f }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0033
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r7.invoke(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0008
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003f }
            r6.send(r4, r8)     // Catch:{ all -> 0x003f }
            r3 = 2
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003f }
            goto L_0x0008
        L_0x0033:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x003f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r4, java.util.Collection r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r4.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r2.hasNext(r7)     // Catch:{ all -> 0x0033 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0033 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r6.invoke(r3)     // Catch:{ all -> 0x0033 }
            r5.add(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0008
        L_0x0027:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0033 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r5
        L_0x0033:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object mapTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlinx.coroutines.channels.SendChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x003d }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003d }
            java.lang.Object r4 = r2.hasNext(r8)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003d }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x003d }
            java.lang.Object r4 = r7.invoke(r4)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003d }
            r6.send(r4, r8)     // Catch:{ all -> 0x003d }
            r3 = 2
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003d }
            goto L_0x0008
        L_0x0031:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r6
        L_0x003d:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003f }
        L_0x003f:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object all$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r2.hasNext(r7)     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r6.invoke(r4)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0008
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004a }
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r6
        L_0x003a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x004a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004c }
        L_0x004c:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.all$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object any$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r2.hasNext(r7)     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x003a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x004a }
            java.lang.Object r3 = r6.invoke(r3)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0008
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x004a }
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r6
        L_0x003a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x004a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004c }
        L_0x004c:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.any$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object count$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x003f }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r5 = r2.hasNext(r8)     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003f }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x003f }
            java.lang.Object r5 = r7.invoke(r5)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003f }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x000a
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            return r6
        L_0x003f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.count$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object fold$$forInline(kotlinx.coroutines.channels.ReceiveChannel r4, java.lang.Object r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0030 }
            java.lang.Object r3 = r2.hasNext(r7)     // Catch:{ all -> 0x0030 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0030 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0030 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0024
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0030 }
            java.lang.Object r5 = r6.invoke(r5, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x0008
        L_0x0024:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0030 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r5
        L_0x0030:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.fold$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object foldIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.jvm.functions.Function3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x0038 }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r2.hasNext(r10)     // Catch:{ all -> 0x0038 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0038 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0038 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0038 }
            int r6 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0038 }
            java.lang.Object r8 = r9.invoke(r4, r8, r5)     // Catch:{ all -> 0x0038 }
            r4 = r6
            goto L_0x000a
        L_0x002c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0038 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r8
        L_0x0038:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003a }
        L_0x003a:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.foldIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r10);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object maxBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.Continuation r11) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.maxBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r10);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object minBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.Continuation r11) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.minBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object none$$forInline(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0008:
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r2.hasNext(r7)     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = r6.invoke(r4)     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0008
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004a }
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r6
        L_0x003a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x004a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004c }
        L_0x004c:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.none$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object reduce$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x004f }
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004f }
            java.lang.Object r4 = r2.hasNext(r8)     // Catch:{ all -> 0x004f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004f }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x004f }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004f }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x004f }
        L_0x001f:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r2.hasNext(r8)     // Catch:{ all -> 0x004f }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x004f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x004f }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x004f }
            java.lang.Object r4 = r7.invoke(r4, r5)     // Catch:{ all -> 0x004f }
            goto L_0x001f
        L_0x003a:
            r7 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r4
        L_0x0045:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Empty channel can't be reduced."
            r7.<init>(r8)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x004f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduce$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object reduceIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.jvm.functions.Function3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch:{ all -> 0x0056 }
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0056 }
            java.lang.Object r4 = r2.hasNext(r10)     // Catch:{ all -> 0x0056 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0056 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0056 }
            r5 = r1
        L_0x0020:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x0056 }
            java.lang.Object r6 = r2.hasNext(r10)     // Catch:{ all -> 0x0056 }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0056 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0041
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0056 }
            int r5 = r5 + 1
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0056 }
            java.lang.Object r4 = r9.invoke(r6, r4, r7)     // Catch:{ all -> 0x0056 }
            goto L_0x0020
        L_0x0041:
            r9 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
            return r4
        L_0x004c:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "Empty channel can't be reduced."
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0056:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r10 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduceIndexed$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object sumBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x003c }
            r3 = 0
            r4 = r3
        L_0x000a:
            kotlin.jvm.internal.InlineMarker.mark(r3)     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r2.hasNext(r8)     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003c }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003c }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r7.invoke(r5)     // Catch:{ all -> 0x003c }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x003c }
            int r5 = r5.intValue()     // Catch:{ all -> 0x003c }
            int r4 = r4 + r5
            goto L_0x000a
        L_0x002c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            return r6
        L_0x003c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003e }
        L_0x003e:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumBy$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object sumByDouble$$forInline(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 1
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x003d }
            r3 = 0
        L_0x000a:
            r5 = 0
            kotlin.jvm.internal.InlineMarker.mark(r5)     // Catch:{ all -> 0x003d }
            java.lang.Object r5 = r2.hasNext(r9)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x003d }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x002d
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x003d }
            java.lang.Object r5 = r8.invoke(r5)     // Catch:{ all -> 0x003d }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x003d }
            double r5 = r5.doubleValue()     // Catch:{ all -> 0x003d }
            double r3 = r3 + r5
            goto L_0x000a
        L_0x002d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r3)
            return r7
        L_0x003d:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003f }
        L_0x003f:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumByDouble$$forInline(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
