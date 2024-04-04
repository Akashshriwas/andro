// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.SystemClock;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import android.content.Context;

public final class ap implements as
{
    private final String a;
    private final bl b;
    private final long c;
    private final al d;
    private final v e;
    private final x f;
    private final Context g;
    private final Object h;
    private bp i;
    private int j;
    
    public ap(final Context g, final String a, final bl b, final am am, final al d, final v e, final x f) {
        this.h = new Object();
        this.j = -2;
        this.g = g;
        this.a = a;
        this.b = b;
        long b2;
        if (am.b != -1L) {
            b2 = am.b;
        }
        else {
            b2 = 10000L;
        }
        this.c = b2;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private void a(final long n, final long n2, final long n3, final long n4) {
        while (this.j == -2) {
            this.b(n, n2, n3, n4);
        }
    }
    
    private void a(final ao ao) {
        try {
            if (this.f.f) {
                this.i.a(com.google.android.gms.a.d.a(this.g), this.e, this.d.f, this.d.a, ao);
                return;
            }
            this.i.a(com.google.android.gms.a.d.a(this.g), this.f, this.e, this.d.f, this.d.a, ao);
        }
        catch (RemoteException ex) {
            et.b("Could not request ad from mediation adapter.", (Throwable)ex);
            this.a(5);
        }
    }
    
    private bp b() {
        et.c("Instantiating mediation adapter: " + this.a);
        try {
            return this.b.a(this.a);
        }
        catch (RemoteException ex) {
            et.a("Could not instantiate mediation adapter: " + this.a, (Throwable)ex);
            return null;
        }
    }
    
    private void b(long a, long b, final long n, final long n2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        a = b - (elapsedRealtime - a);
        b = n2 - (elapsedRealtime - n);
        if (a <= 0L || b <= 0L) {
            et.c("Timed out waiting for adapter.");
            this.j = 3;
            return;
        }
        try {
            this.h.wait(Math.min(a, b));
        }
        catch (InterruptedException ex) {
            this.j = -1;
        }
    }
    
    public ar a(final long n, final long n2) {
        synchronized (this.h) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final ao ao = new ao();
            es.a.post((Runnable)new aq(this, ao));
            this.a(elapsedRealtime, this.c, n, n2);
            return new ar(this.d, this.i, this.a, ao, this.j);
        }
    }
    
    public void a() {
        synchronized (this.h) {
            while (true) {
                try {
                    if (this.i != null) {
                        this.i.c();
                    }
                    this.j = -1;
                    this.h.notify();
                }
                catch (RemoteException ex) {
                    et.b("Could not destroy mediation adapter.", (Throwable)ex);
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final int j) {
        synchronized (this.h) {
            this.j = j;
            this.h.notify();
        }
    }
}
