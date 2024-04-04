/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.aq;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

public final class ap
implements as {
    private final String a;
    private final bl b;
    private final long c;
    private final al d;
    private final v e;
    private final x f;
    private final Context g;
    private final Object h = new Object();
    private bp i;
    private int j = -2;

    /*
     * Enabled aggressive block sorting
     */
    public ap(Context context, String string, bl bl2, am am2, al al2, v v2, x x2) {
        this.g = context;
        this.a = string;
        this.b = bl2;
        long l2 = am2.b != -1L ? am2.b : 10000L;
        this.c = l2;
        this.d = al2;
        this.e = v2;
        this.f = x2;
    }

    static /* synthetic */ bp a(ap ap2, bp bp2) {
        ap2.i = bp2;
        return bp2;
    }

    static /* synthetic */ Object a(ap ap2) {
        return ap2.h;
    }

    private void a(long l2, long l3, long l4, long l5) {
        while (this.j == -2) {
            this.b(l2, l3, l4, l5);
        }
        return;
    }

    private void a(ao ao2) {
        try {
            if (this.f.f) {
                this.i.a(d.a((Object)this.g), this.e, this.d.f, this.d.a, (bs)ao2);
                return;
            }
            this.i.a(d.a((Object)this.g), this.f, this.e, this.d.f, this.d.a, ao2);
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not request ad from mediation adapter.", (Throwable)remoteException);
            this.a(5);
            return;
        }
    }

    static /* synthetic */ void a(ap ap2, ao ao2) {
        ap2.a(ao2);
    }

    static /* synthetic */ int b(ap ap2) {
        return ap2.j;
    }

    private bp b() {
        et.c("Instantiating mediation adapter: " + this.a);
        try {
            bp bp2 = this.b.a(this.a);
            return bp2;
        }
        catch (RemoteException remoteException) {
            et.a("Could not instantiate mediation adapter: " + this.a, (Throwable)remoteException);
            return null;
        }
    }

    private void b(long l2, long l3, long l4, long l5) {
        long l6 = SystemClock.elapsedRealtime();
        l2 = l3 - (l6 - l2);
        l3 = l5 - (l6 - l4);
        if (l2 <= 0L || l3 <= 0L) {
            et.c("Timed out waiting for adapter.");
            this.j = 3;
            return;
        }
        try {
            this.h.wait(Math.min((long)l2, (long)l3));
            return;
        }
        catch (InterruptedException interruptedException) {
            this.j = -1;
            return;
        }
    }

    static /* synthetic */ bp c(ap ap2) {
        return ap2.b();
    }

    static /* synthetic */ bp d(ap ap2) {
        return ap2.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ar a(long l2, long l3) {
        Object object = this.h;
        synchronized (object) {
            long l4 = SystemClock.elapsedRealtime();
            ao ao2 = new ao();
            es.a.post((Runnable)new aq(this, ao2));
            this.a(l4, this.c, l2, l3);
            return new ar(this.d, this.i, this.a, ao2, this.j);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object = this.h;
        synchronized (object) {
            try {
                if (this.i != null) {
                    this.i.c();
                }
            }
            catch (RemoteException remoteException) {
                et.b("Could not destroy mediation adapter.", (Throwable)remoteException);
            }
            this.j = -1;
            this.h.notify();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(int n2) {
        Object object = this.h;
        synchronized (object) {
            this.j = n2;
            this.h.notify();
            return;
        }
    }
}

