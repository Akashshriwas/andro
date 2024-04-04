// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Iterator;
import android.content.Context;

public final class aj
{
    private final bz a;
    private final bl b;
    private final Context c;
    private final Object d;
    private final am e;
    private boolean f;
    private ap g;
    
    public aj(final Context c, final bz a, final bl b, final am e) {
        this.d = new Object();
        this.f = false;
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public ar a(final long n, final long n2) {
        et.a("Starting mediation.");
        for (final al al : this.e.a) {
            et.c("Trying mediation network: " + al.b);
            for (final String s : al.c) {
                Object o = this.d;
                synchronized (o) {
                    if (this.f) {
                        return new ar(-1);
                    }
                    this.g = new ap(this.c, s, this.b, this.e, al, this.a.d, this.a.e);
                    // monitorexit(o)
                    o = this.g.a(n, n2);
                    if (((ar)o).a == 0) {
                        et.a("Adapter succeeded.");
                        return (ar)o;
                    }
                }
                if (((ar)o).c != null) {
                    es.a.post((Runnable)new ak(this, (ar)o));
                }
            }
        }
        return new ar(1);
    }
    
    public void a() {
        synchronized (this.d) {
            this.f = true;
            if (this.g != null) {
                this.g.a();
            }
        }
    }
}
