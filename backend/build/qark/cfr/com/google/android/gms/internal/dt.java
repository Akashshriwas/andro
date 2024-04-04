/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.x;

final class dt
implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ bz b;
    final /* synthetic */ dv c;
    final /* synthetic */ String d;

    dt(Context context, bz bz2, dv dv2, String string) {
        this.a = context;
        this.b = bz2;
        this.c = dv2;
        this.d = string;
    }

    public void run() {
        ev ev2 = ev.a(this.a, new x(), false, false, null, this.b.l);
        ev2.setWillNotDraw(true);
        this.c.a(ev2);
        ex ex2 = ev2.e();
        ex2.a("/invalidRequest", this.c.a);
        ex2.a("/loadAdURL", this.c.b);
        ex2.a("/log", t.f);
        et.a("Getting the ad request URL.");
        ev2.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + this.d + ");</script></head><body></body></html>", "text/html", "UTF-8", null);
    }
}

