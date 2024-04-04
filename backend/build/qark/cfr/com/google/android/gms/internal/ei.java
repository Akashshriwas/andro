/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.el;
import com.google.android.gms.internal.et;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ei {
    private static final ThreadFactory a = new el();
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(true), a);

    public static void a(Runnable runnable) {
        try {
            b.execute((Runnable)new ej(runnable));
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            et.b("Too many background threads already running. Aborting task.", (Throwable)rejectedExecutionException);
            return;
        }
    }
}

