// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

final class el implements ThreadFactory
{
    private final AtomicInteger a;
    
    el() {
        this.a = new AtomicInteger(1);
    }
    
    @Override
    public Thread newThread(final Runnable target) {
        return new Thread(target, "AdWorker #" + this.a.getAndIncrement());
    }
}
