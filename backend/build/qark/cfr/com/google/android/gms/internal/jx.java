/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.v;
import java.lang.ref.WeakReference;

class jx
implements Runnable {
    final /* synthetic */ ju a;
    final /* synthetic */ jw b;
    private final WeakReference c;

    jx(jw jw2, ju ju2) {
        this.b = jw2;
        this.a = ju2;
        this.c = new WeakReference((Object)this.a);
    }

    public void run() {
        jw.a(this.b, false);
        ju ju2 = (ju)this.c.get();
        if (ju2 != null) {
            ju2.b(jw.a(this.b));
        }
    }
}

