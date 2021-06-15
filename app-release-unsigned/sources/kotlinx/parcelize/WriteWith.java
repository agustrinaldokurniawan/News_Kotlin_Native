package kotlinx.parcelize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlinx.parcelize.Parceler;

@Target({})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0000¨\u0006\u0004"}, d2 = {"Lkotlinx/parcelize/WriteWith;", "P", "Lkotlinx/parcelize/Parceler;", "", "parcelize-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* compiled from: WriteWith.kt */
public @interface WriteWith<P extends Parceler<?>> {
}
