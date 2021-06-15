package com.tsuga.news.core.data;

import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: com.tsuga.news.core.data.-$$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o implements Function {
    public static final /* synthetic */ $$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o INSTANCE = new $$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o();

    private /* synthetic */ $$Lambda$NewsRepository$GH6KhajyylI8AunbemFZPPLsk5o() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return NewsRepository.m10getFavoriteNews$lambda0((List) obj);
    }
}
