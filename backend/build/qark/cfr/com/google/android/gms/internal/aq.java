/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.as;

class aq
implements Runnable {
    final /* synthetic */ ao a;
    final /* synthetic */ ap b;

    aq(ap ap2, ao ao2) {
        this.b = ap2;
        this.a = ao2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object = ap.a(this.b);
        synchronized (object) {
            if (ap.b(this.b) != -2) {
                return;
            }
            ap.a(this.b, ap.c(this.b));
            if (ap.d(this.b) == null) {
                this.b.a(4);
                return;
            }
            this.a.a(this.b);
            ap.a(this.b, this.a);
            return;
        }
    }
}

