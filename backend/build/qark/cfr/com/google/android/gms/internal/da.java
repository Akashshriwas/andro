/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.ec;

class da
implements Runnable {
    final /* synthetic */ ec a;
    final /* synthetic */ cy b;

    da(cy cy2, ec ec2) {
        this.b = cy2;
        this.a = ec2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object = cy.a(this.b);
        synchronized (object) {
            cy.b(this.b).a(this.a);
            return;
        }
    }
}

