package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class DurationKt {
    public static final long MAX_MILLIS;
    public static final long MAX_NANOS;
    private static final long MAX_NANOS_IN_MILLIS;
    public static final int NANOS_IN_MILLIS;

    public static /* synthetic */ void getDays$annotations(double d) {
    }

    public static /* synthetic */ void getDays$annotations(int i) {
    }

    public static /* synthetic */ void getDays$annotations(long j) {
    }

    public static /* synthetic */ void getHours$annotations(double d) {
    }

    public static /* synthetic */ void getHours$annotations(int i) {
    }

    public static /* synthetic */ void getHours$annotations(long j) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(int i) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(long j) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(int i) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(long j) {
    }

    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    public static /* synthetic */ void getMinutes$annotations(int i) {
    }

    public static /* synthetic */ void getMinutes$annotations(long j) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(int i) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(long j) {
    }

    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    public static /* synthetic */ void getSeconds$annotations(int i) {
    }

    public static /* synthetic */ void getSeconds$annotations(long j) {
    }

    public static final long millisToNanos(long j) {
        return j * ((long) NANOS_IN_MILLIS);
    }

    public static final long toDuration(int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        if (timeUnit.compareTo((Enum) TimeUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow((long) i, timeUnit, TimeUnit.NANOSECONDS));
        }
        return toDuration((long) i, timeUnit);
    }

    public static final long toDuration(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        long convertDurationUnitOverflow = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, TimeUnit.NANOSECONDS, timeUnit);
        if ((-convertDurationUnitOverflow) <= j && convertDurationUnitOverflow >= j) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(j, timeUnit, TimeUnit.NANOSECONDS));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(j, timeUnit, TimeUnit.MILLISECONDS), -4611686018427387903L, (long) MAX_MILLIS));
    }

    public static final long toDuration(double d, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        double convertDurationUnit = DurationUnitKt.convertDurationUnit(d, timeUnit, TimeUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long j = (long) convertDurationUnit;
            if (-4611686018426999999L <= j && MAX_NANOS >= j) {
                return durationOfNanos(j);
            }
            return durationOfMillisNormalized((long) DurationUnitKt.convertDurationUnit(d, timeUnit, TimeUnit.MILLISECONDS));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long getNanoseconds(int i) {
        return toDuration(i, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(long j) {
        return toDuration(j, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(double d) {
        return toDuration(d, TimeUnit.NANOSECONDS);
    }

    public static final long getMicroseconds(int i) {
        return toDuration(i, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(long j) {
        return toDuration(j, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(double d) {
        return toDuration(d, TimeUnit.MICROSECONDS);
    }

    public static final long getMilliseconds(int i) {
        return toDuration(i, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(long j) {
        return toDuration(j, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(double d) {
        return toDuration(d, TimeUnit.MILLISECONDS);
    }

    public static final long getSeconds(int i) {
        return toDuration(i, TimeUnit.SECONDS);
    }

    public static final long getSeconds(long j) {
        return toDuration(j, TimeUnit.SECONDS);
    }

    public static final long getSeconds(double d) {
        return toDuration(d, TimeUnit.SECONDS);
    }

    public static final long getMinutes(int i) {
        return toDuration(i, TimeUnit.MINUTES);
    }

    public static final long getMinutes(long j) {
        return toDuration(j, TimeUnit.MINUTES);
    }

    public static final long getMinutes(double d) {
        return toDuration(d, TimeUnit.MINUTES);
    }

    public static final long getHours(int i) {
        return toDuration(i, TimeUnit.HOURS);
    }

    public static final long getHours(long j) {
        return toDuration(j, TimeUnit.HOURS);
    }

    public static final long getHours(double d) {
        return toDuration(d, TimeUnit.HOURS);
    }

    public static final long getDays(int i) {
        return toDuration(i, TimeUnit.DAYS);
    }

    public static final long getDays(long j) {
        return toDuration(j, TimeUnit.DAYS);
    }

    public static final long getDays(double d) {
        return toDuration(d, TimeUnit.DAYS);
    }

    /* renamed from: times-mvk6XK0 */
    private static final long m1409timesmvk6XK0(int i, long j) {
        return Duration.m1367timesUwyO8pc(j, i);
    }

    /* renamed from: times-kIfJnKk */
    private static final long m1408timeskIfJnKk(double d, long j) {
        return Duration.m1366timesUwyO8pc(j, d);
    }

    public static final long nanosToMillis(long j) {
        return j / ((long) NANOS_IN_MILLIS);
    }

    public static final long durationOfNanos(long j) {
        return Duration.m1328constructorimpl(j << 1);
    }

    public static final long durationOfMillis(long j) {
        return Duration.m1328constructorimpl((j << 1) + 1);
    }

    public static final long durationOf(long j, int i) {
        return Duration.m1328constructorimpl((j << 1) + ((long) i));
    }

    public static final long durationOfNanosNormalized(long j) {
        if (-4611686018426999999L <= j && MAX_NANOS >= j) {
            return durationOfNanos(j);
        }
        return durationOfMillis(nanosToMillis(j));
    }

    public static final long durationOfMillisNormalized(long j) {
        if (-4611686018426L <= j && MAX_NANOS_IN_MILLIS >= j) {
            return durationOfNanos(millisToNanos(j));
        }
        return durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, (long) MAX_MILLIS));
    }
}
