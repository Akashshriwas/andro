/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ef;

class eg
implements Runnable {
    final /* synthetic */ ef a;

    eg(ef ef2) {
        this.a = ef2;
    }

    public final void run() {
        ef.a(this.a, Thread.currentThread());
        this.a.a();
    }
}

