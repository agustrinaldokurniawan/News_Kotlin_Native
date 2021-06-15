package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class LiveDataReactiveStreams {
    private LiveDataReactiveStreams() {
    }

    public static <T> Publisher<T> toPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }

    private static final class LiveDataPublisher<T> implements Publisher<T> {
        final LifecycleOwner mLifecycle;
        final LiveData<T> mLiveData;

        LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            subscriber.onSubscribe(new LiveDataSubscription(subscriber, this.mLifecycle, this.mLiveData));
        }

        static final class LiveDataSubscription<T> implements Subscription, Observer<T> {
            volatile boolean mCanceled;
            T mLatest;
            final LifecycleOwner mLifecycle;
            final LiveData<T> mLiveData;
            boolean mObserving;
            long mRequested;
            final Subscriber<? super T> mSubscriber;

            LiveDataSubscription(Subscriber<? super T> subscriber, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = subscriber;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(T t) {
                if (!this.mCanceled) {
                    if (this.mRequested > 0) {
                        this.mLatest = null;
                        this.mSubscriber.onNext(t);
                        long j = this.mRequested;
                        if (j != LongCompanionObject.MAX_VALUE) {
                            this.mRequested = j - 1;
                            return;
                        }
                        return;
                    }
                    this.mLatest = t;
                }
            }

            @Override // org.reactivestreams.Subscription
            public void request(final long j) {
                if (!this.mCanceled) {
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        /* class androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.AnonymousClass1 */

                        public void run() {
                            if (!LiveDataSubscription.this.mCanceled) {
                                if (j <= 0) {
                                    LiveDataSubscription.this.mCanceled = true;
                                    if (LiveDataSubscription.this.mObserving) {
                                        LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                        LiveDataSubscription.this.mObserving = false;
                                    }
                                    LiveDataSubscription.this.mLatest = null;
                                    LiveDataSubscription.this.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                                    return;
                                }
                                LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                                liveDataSubscription.mRequested = liveDataSubscription.mRequested + j >= LiveDataSubscription.this.mRequested ? LiveDataSubscription.this.mRequested + j : LongCompanionObject.MAX_VALUE;
                                if (!LiveDataSubscription.this.mObserving) {
                                    LiveDataSubscription.this.mObserving = true;
                                    LiveDataSubscription.this.mLiveData.observe(LiveDataSubscription.this.mLifecycle, LiveDataSubscription.this);
                                } else if (LiveDataSubscription.this.mLatest != null) {
                                    LiveDataSubscription liveDataSubscription2 = LiveDataSubscription.this;
                                    liveDataSubscription2.onChanged(liveDataSubscription2.mLatest);
                                    LiveDataSubscription.this.mLatest = null;
                                }
                            }
                        }
                    });
                }
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                if (!this.mCanceled) {
                    this.mCanceled = true;
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        /* class androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.AnonymousClass2 */

                        public void run() {
                            if (LiveDataSubscription.this.mObserving) {
                                LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription.this.mLatest = null;
                        }
                    });
                }
            }
        }
    }

    public static <T> LiveData<T> fromPublisher(Publisher<T> publisher) {
        return new PublisherLiveData(publisher);
    }

    private static class PublisherLiveData<T> extends LiveData<T> {
        private final Publisher<T> mPublisher;
        final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> mSubscriber = new AtomicReference<>();

        PublisherLiveData(Publisher<T> publisher) {
            this.mPublisher = publisher;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            PublisherLiveData<T>.LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
            if (andSet != null) {
                andSet.cancelSubscription();
            }
        }

        final class LiveDataSubscriber extends AtomicReference<Subscription> implements Subscriber<T> {
            LiveDataSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onSubscribe(Subscription subscription) {
                if (compareAndSet(null, subscription)) {
                    subscription.request(LongCompanionObject.MAX_VALUE);
                } else {
                    subscription.cancel();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(final Throwable th) {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                    /* class androidx.lifecycle.LiveDataReactiveStreams.PublisherLiveData.LiveDataSubscriber.AnonymousClass1 */

                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
            }

            public void cancelSubscription() {
                Subscription subscription = (Subscription) get();
                if (subscription != null) {
                    subscription.cancel();
                }
            }
        }
    }
}
