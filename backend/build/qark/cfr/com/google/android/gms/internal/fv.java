/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 */
package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

public final class fv {
    public static void a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void a(String string) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.e((String)"Asserts", (String)("checkMainThread: current thread " + (Object)Thread.currentThread() + " IS NOT the main thread " + (Object)Looper.getMainLooper().getThread() + "!"));
            throw new IllegalStateException(string);
        }
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException();
        }
    }

    public static void b(String string) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Log.e((String)"Asserts", (String)("checkNotMainThread: current thread " + (Object)Thread.currentThread() + " IS the main thread " + (Object)Looper.getMainLooper().getThread() + "!"));
            throw new IllegalStateException(string);
        }
    }
}

