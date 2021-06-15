package com.bumptech.glide.manager;

import android.app.Activity;

/* access modifiers changed from: package-private */
public final class DoNothingFirstFrameWaiter implements FrameWaiter {
    @Override // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(Activity activity) {
    }

    DoNothingFirstFrameWaiter() {
    }
}
