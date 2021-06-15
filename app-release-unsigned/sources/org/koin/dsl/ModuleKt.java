package org.koin.dsl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.module.Module;

public final class ModuleKt {
    public static /* synthetic */ Module module$default(boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return module(z, z2, function1);
    }

    public static final Module module(boolean z, boolean z2, Function1<? super Module, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "moduleDeclaration");
        Module module = new Module(z, z2);
        function1.invoke(module);
        return module;
    }
}
