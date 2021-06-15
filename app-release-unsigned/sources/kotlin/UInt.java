package kotlin;

import com.tsuga.news.ReadNewsActivity;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001yB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0000H\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u000fJ\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u001dJ\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0016\u0010+\u001a\u00020\u0000H\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010\u0005J\u0016\u0010-\u001a\u00020\u0000H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\u0005J\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b0\u0010\u000fJ\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u000bJ\u001b\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b2\u0010\u001dJ\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0016J\u001b\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\bø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u001dJ\u001b\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b>\u0010\u000fJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b?\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u001dJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0016J\u001b\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\bG\u0010\u000fJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010F\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u001dJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0016J\u001e\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0003H\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010\u000bJ\u001e\u0010N\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0003H\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000fJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u001dJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bT\u0010\u0016J\u0010\u0010U\u001a\u00020VH\b¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020ZH\b¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020^H\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020dH\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0016\u0010o\u001a\u00020\rH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010XJ\u0016\u0010q\u001a\u00020\u0000H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010\u0005J\u0016\u0010s\u001a\u00020\u0011H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010fJ\u0016\u0010u\u001a\u00020\u0014H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010jJ\u001b\u0010w\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\bx\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0001\u0002\u0001\u00020\u0003ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006z"}, d2 = {"Lkotlin/UInt;", "", ReadNewsActivity.DATA, "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
@JvmInline
/* compiled from: UInt.kt */
public final class UInt implements Comparable<UInt> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UInt m122boximpl(int i) {
        return new UInt(i);
    }

    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private int m125compareToWZ4Q5Ns(int i) {
        return m126compareToWZ4Q5Ns(this.data, i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m128constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m134equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m179unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m135equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m140hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m167toByteimpl(int i) {
        return (byte) i;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m170toIntimpl(int i) {
        return i;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m171toLongimpl(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m172toShortimpl(int i) {
        return (short) i;
    }

    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m175toUIntpVg5ArA(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m134equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m140hashCodeimpl(this.data);
    }

    public String toString() {
        return m173toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m179unboximpl() {
        return this.data;
    }

    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return m125compareToWZ4Q5Ns(uInt.m179unboximpl());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UInt.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m123compareTo7apg3OU(int i, byte b) {
        return UnsignedKt.uintCompare(i, m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m127compareToxj2QHRw(int i, short s) {
        return UnsignedKt.uintCompare(i, m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static int m126compareToWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2);
    }

    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m124compareToVKZWuLQ(int i, long j) {
        return UnsignedKt.ulongCompare(ULong.m206constructorimpl(((long) i) & 4294967295L), j);
    }

    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m152plus7apg3OU(int i, byte b) {
        return m128constructorimpl(i + m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m155plusxj2QHRw(int i, short s) {
        return m128constructorimpl(i + m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m154plusWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i + i2);
    }

    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m153plusVKZWuLQ(int i, long j) {
        return ULong.m206constructorimpl(ULong.m206constructorimpl(((long) i) & 4294967295L) + j);
    }

    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m143minus7apg3OU(int i, byte b) {
        return m128constructorimpl(i - m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m146minusxj2QHRw(int i, short s) {
        return m128constructorimpl(i - m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m145minusWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i - i2);
    }

    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m144minusVKZWuLQ(int i, long j) {
        return ULong.m206constructorimpl(ULong.m206constructorimpl(((long) i) & 4294967295L) - j);
    }

    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m163times7apg3OU(int i, byte b) {
        return m128constructorimpl(i * m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m166timesxj2QHRw(int i, short s) {
        return m128constructorimpl(i * m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m165timesWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i * i2);
    }

    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m164timesVKZWuLQ(int i, long j) {
        return ULong.m206constructorimpl(ULong.m206constructorimpl(((long) i) & 4294967295L) * j);
    }

    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m130div7apg3OU(int i, byte b) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m133divxj2QHRw(int i, short s) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m132divWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, i2);
    }

    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m131divVKZWuLQ(int i, long j) {
        return UnsignedKt.m383ulongDivideeb3DHEI(ULong.m206constructorimpl(((long) i) & 4294967295L), j);
    }

    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m157rem7apg3OU(int i, byte b) {
        return UnsignedKt.m382uintRemainderJ1ME1BU(i, m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m160remxj2QHRw(int i, short s) {
        return UnsignedKt.m382uintRemainderJ1ME1BU(i, m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m159remWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m382uintRemainderJ1ME1BU(i, i2);
    }

    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m158remVKZWuLQ(int i, long j) {
        return UnsignedKt.m384ulongRemaindereb3DHEI(ULong.m206constructorimpl(((long) i) & 4294967295L), j);
    }

    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m136floorDiv7apg3OU(int i, byte b) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, m128constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m139floorDivxj2QHRw(int i, short s) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, m128constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m138floorDivWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m381uintDivideJ1ME1BU(i, i2);
    }

    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m137floorDivVKZWuLQ(int i, long j) {
        return UnsignedKt.m383ulongDivideeb3DHEI(ULong.m206constructorimpl(((long) i) & 4294967295L), j);
    }

    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m147mod7apg3OU(int i, byte b) {
        return UByte.m52constructorimpl((byte) UnsignedKt.m382uintRemainderJ1ME1BU(i, m128constructorimpl(b & UByte.MAX_VALUE)));
    }

    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m150modxj2QHRw(int i, short s) {
        return UShort.m312constructorimpl((short) UnsignedKt.m382uintRemainderJ1ME1BU(i, m128constructorimpl(s & UShort.MAX_VALUE)));
    }

    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m149modWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m382uintRemainderJ1ME1BU(i, i2);
    }

    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m148modVKZWuLQ(int i, long j) {
        return UnsignedKt.m384ulongRemaindereb3DHEI(ULong.m206constructorimpl(((long) i) & 4294967295L), j);
    }

    /* renamed from: inc-pVg5ArA  reason: not valid java name */
    private static final int m141incpVg5ArA(int i) {
        return m128constructorimpl(i + 1);
    }

    /* renamed from: dec-pVg5ArA  reason: not valid java name */
    private static final int m129decpVg5ArA(int i) {
        return m128constructorimpl(i - 1);
    }

    /* renamed from: rangeTo-WZ4Q5Ns  reason: not valid java name */
    private static final UIntRange m156rangeToWZ4Q5Ns(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    /* renamed from: shl-pVg5ArA  reason: not valid java name */
    private static final int m161shlpVg5ArA(int i, int i2) {
        return m128constructorimpl(i << i2);
    }

    /* renamed from: shr-pVg5ArA  reason: not valid java name */
    private static final int m162shrpVg5ArA(int i, int i2) {
        return m128constructorimpl(i >>> i2);
    }

    /* renamed from: and-WZ4Q5Ns  reason: not valid java name */
    private static final int m121andWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i & i2);
    }

    /* renamed from: or-WZ4Q5Ns  reason: not valid java name */
    private static final int m151orWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i | i2);
    }

    /* renamed from: xor-WZ4Q5Ns  reason: not valid java name */
    private static final int m178xorWZ4Q5Ns(int i, int i2) {
        return m128constructorimpl(i ^ i2);
    }

    /* renamed from: inv-pVg5ArA  reason: not valid java name */
    private static final int m142invpVg5ArA(int i) {
        return m128constructorimpl(~i);
    }

    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m174toUBytew2LRezQ(int i) {
        return UByte.m52constructorimpl((byte) i);
    }

    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m177toUShortMh2AYeg(int i) {
        return UShort.m312constructorimpl((short) i);
    }

    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m176toULongsVKNKU(int i) {
        return ULong.m206constructorimpl(((long) i) & 4294967295L);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m169toFloatimpl(int i) {
        return (float) UnsignedKt.uintToDouble(i);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m168toDoubleimpl(int i) {
        return UnsignedKt.uintToDouble(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m173toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }
}
