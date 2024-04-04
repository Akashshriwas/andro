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
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.v;

public final class jw {
    private final Runnable a;
    private v b;
    private boolean c = false;

    public jw(ju ju2) {
        this.a = new jx(this, ju2);
    }

    static /* synthetic */ v a(jw jw2) {
        return jw2.b;
    }

    static /* synthetic */ boolean a(jw jw2, boolean bl2) {
        jw2.c = bl2;
        return bl2;
    }

    public void a() {
        es.a.removeCallbacks(this.a);
    }

    public void a(v v2) {
        this.a(v2, 60000L);
    }

    public void a(v v2, long l2) {
        if (this.c) {
            et.e("An ad refresh is already scheduled.");
            return;
        }
        et.c("Scheduling ad refresh " + l2 + " milliseconds from now.");
        this.b = v2;
        this.c = true;
        es.a.postDelayed(this.a, l2);
    }
}

