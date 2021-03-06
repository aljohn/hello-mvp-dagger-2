package com.example.bradcampbell.util;

import rx.Observer;

public abstract class EndObserver<T> implements Observer<T> {
    public abstract void onEnd();

    @Override public void onCompleted() {
        onEnd();
    }

    @Override public void onError(Throwable e) {
        onEnd();
    }
}
