package com.tsuga.news.core.data;

import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: com.tsuga.news.core.data.-$$Lambda$NewsRepository$ghQIrpzLG8kVa6W9-l9DlzKttXM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$NewsRepository$ghQIrpzLG8kVa6W9l9DlzKttXM implements Function {
    public static final /* synthetic */ $$Lambda$NewsRepository$ghQIrpzLG8kVa6W9l9DlzKttXM INSTANCE = new $$Lambda$NewsRepository$ghQIrpzLG8kVa6W9l9DlzKttXM();

    private /* synthetic */ $$Lambda$NewsRepository$ghQIrpzLG8kVa6W9l9DlzKttXM() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return NewsRepository.m11getNewsByKeyword$lambda2((List) obj);
    }
}
