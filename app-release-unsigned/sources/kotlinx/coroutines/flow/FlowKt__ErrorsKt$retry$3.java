package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {0, 0, 0}, l = {124}, m = "invokeSuspend", n = {"$this$retryWhen", "cause", "attempt"}, s = {"L$0", "L$1", "J$0"})
/* compiled from: Errors.kt */
public final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Function2 $predicate;
    final /* synthetic */ long $retries;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    private FlowCollector p$;
    private Throwable p$0;
    private long p$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__ErrorsKt$retry$3(long j, Function2 function2, Continuation continuation) {
        super(4, continuation);
        this.$retries = j;
        this.$predicate = function2;
    }

    public final Continuation<Unit> create(FlowCollector<? super T> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, continuation);
        flowKt__ErrorsKt$retry$3.p$ = flowCollector;
        flowKt__ErrorsKt$retry$3.p$0 = th;
        flowKt__ErrorsKt$retry$3.p$1 = j;
        return flowKt__ErrorsKt$retry$3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Throwable th, Long l, Continuation<? super Boolean> continuation) {
        return ((FlowKt__ErrorsKt$retry$3) create((FlowCollector) obj, th, l.longValue(), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0049;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r7.L$1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x003f
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.FlowCollector r8 = r7.p$
            java.lang.Throwable r1 = r7.p$0
            long r3 = r7.p$1
            long r5 = r7.$retries
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0048
            kotlin.jvm.functions.Function2 r5 = r7.$predicate
            r7.L$0 = r8
            r7.L$1 = r1
            r7.J$0 = r3
            r7.label = r2
            java.lang.Object r8 = r5.invoke(r1, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        L_0x003f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
