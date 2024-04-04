/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.internal;

import android.os.Process;

final class ej
implements Runnable {
    final /* synthetic */ Runnable a;

    ej(Runnable runnable) {
        this.a = runnable;
    }

    public void run() {
        Process.setThreadPriority((int)10);
        this.a.run();
    }
}

