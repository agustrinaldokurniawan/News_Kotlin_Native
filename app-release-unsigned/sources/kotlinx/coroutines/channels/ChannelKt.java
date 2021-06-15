package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class ChannelKt {
    public static /* synthetic */ Channel Channel$default(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return Channel(i, bufferOverflow, function1);
    }

    public static final <E> Channel<E> Channel(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        ArrayChannel arrayChannel;
        ArrayChannel arrayChannel2;
        int i2 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                i2 = Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core();
            }
            return new ArrayChannel(i2, bufferOverflow, function1);
        } else if (i == -1) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new ConflatedChannel(function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i == 0) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                arrayChannel = new RendezvousChannel(function1);
            } else {
                arrayChannel = new ArrayChannel(1, bufferOverflow, function1);
            }
            return arrayChannel;
        } else if (i == Integer.MAX_VALUE) {
            return new LinkedListChannel(function1);
        } else {
            if (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                arrayChannel2 = new ConflatedChannel(function1);
            } else {
                arrayChannel2 = new ArrayChannel(i, bufferOverflow, function1);
            }
            return arrayChannel2;
        }
    }

    public static /* synthetic */ Channel Channel$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel$default(i, null, null, 6, null);
    }
}
