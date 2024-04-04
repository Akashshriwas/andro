/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class el
implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    el() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker #" + this.a.getAndIncrement());
    }
}

