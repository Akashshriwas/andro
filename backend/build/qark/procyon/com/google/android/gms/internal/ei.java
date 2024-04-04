// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class ei
{
    private static final ThreadFactory a;
    private static final ThreadPoolExecutor b;
    
    static {
        a = new el();
        b = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(true), ei.a);
    }
    
    public static void a(final Runnable runnable) {
        try {
            ei.b.execute(new ej(runnable));
        }
        catch (RejectedExecutionException ex) {
            et.b("Too many background threads already running. Aborting task.", ex);
        }
    }
}
