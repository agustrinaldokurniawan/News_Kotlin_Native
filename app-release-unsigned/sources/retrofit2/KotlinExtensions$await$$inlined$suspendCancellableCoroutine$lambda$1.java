package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$2$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke(th);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
