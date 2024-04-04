/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.cj;
import java.lang.ref.WeakReference;

class ck
implements Runnable {
    final /* synthetic */ ci a;
    final /* synthetic */ cj b;
    private final WeakReference c;

    ck(cj cj2, ci ci2) {
        this.b = cj2;
        this.a = ci2;
        this.c = new WeakReference((Object)this.a);
    }

    public void run() {
        ci ci2 = (ci)((Object)this.c.get());
        if (!cj.a(this.b) && ci2 != null) {
            ci2.e();
            this.b.b();
        }
    }
}

