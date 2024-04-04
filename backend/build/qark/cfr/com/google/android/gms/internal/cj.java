/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.ck;
import com.google.android.gms.internal.es;

final class cj {
    private final Runnable a;
    private volatile boolean b = false;

    public cj(ci ci2) {
        this.a = new ck(this, ci2);
    }

    static /* synthetic */ boolean a(cj cj2) {
        return cj2.b;
    }

    public void a() {
        this.b = true;
        es.a.removeCallbacks(this.a);
    }

    public void b() {
        es.a.postDelayed(this.a, 250L);
    }
}

