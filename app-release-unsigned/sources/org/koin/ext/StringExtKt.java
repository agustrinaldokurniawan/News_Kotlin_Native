package org.koin.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"quoted", "", "koin-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* compiled from: StringExt.kt */
public final class StringExtKt {
    public static final String quoted(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(str, "\"", "", false, 4, (Object) null);
    }
}
