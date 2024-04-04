// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Context;

final class dt implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ bz b;
    final /* synthetic */ dv c;
    final /* synthetic */ String d;
    
    dt(final Context a, final bz b, final dv c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        final ev a = ev.a(this.a, new x(), false, false, null, this.b.l);
        a.setWillNotDraw(true);
        this.c.a(a);
        final ex e = a.e();
        e.a("/invalidRequest", this.c.a);
        e.a("/loadAdURL", this.c.b);
        e.a("/log", t.f);
        et.a("Getting the ad request URL.");
        a.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + this.d + ");</script></head><body></body></html>", "text/html", "UTF-8", (String)null);
    }
}
