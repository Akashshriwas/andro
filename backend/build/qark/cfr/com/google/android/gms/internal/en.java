/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.em;

final class en
implements Runnable {
    final /* synthetic */ Context a;

    en(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object = em.d();
        synchronized (object) {
            em.b(em.c(this.a));
            em.d().notifyAll();
            return;
        }
    }
}

