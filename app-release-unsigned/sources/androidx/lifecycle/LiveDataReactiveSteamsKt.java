package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\b\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\b¨\u0006\u0007"}, d2 = {"toLiveData", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/reactivestreams/Publisher;", "toPublisher", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle-reactivestreams-ktx_release"}, k = 2, mv = {1, 1, 15})
/* compiled from: LiveDataReactiveSteams.kt */
public final class LiveDataReactiveSteamsKt {
    public static final <T> Publisher<T> toPublisher(LiveData<T> liveData, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(liveData, "$this$toPublisher");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycle");
        Publisher<T> publisher = LiveDataReactiveStreams.toPublisher(lifecycleOwner, liveData);
        Intrinsics.checkExpressionValueIsNotNull(publisher, "LiveDataReactiveStreams.…ublisher(lifecycle, this)");
        return publisher;
    }

    public static final <T> LiveData<T> toLiveData(Publisher<T> publisher) {
        Intrinsics.checkParameterIsNotNull(publisher, "$this$toLiveData");
        LiveData<T> fromPublisher = LiveDataReactiveStreams.fromPublisher(publisher);
        Intrinsics.checkExpressionValueIsNotNull(fromPublisher, "LiveDataReactiveStreams.fromPublisher(this)");
        return fromPublisher;
    }
}
