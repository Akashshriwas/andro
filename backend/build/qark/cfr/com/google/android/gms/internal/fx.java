/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;

public abstract class fx
implements b,
gj {
    public static final String[] d = new String[]{"service_esmobile", "service_googleme"};
    final Handler a;
    boolean b = false;
    boolean c = false;
    private final Context e;
    private IInterface f;
    private final ArrayList g = new ArrayList();
    private ge h;
    private final String[] i;
    private final gh j;
    private final Object k = new Object();

    protected /* varargs */ fx(Context context, c c2, d d2, String ... arrstring) {
        this.e = (Context)hc.a((Object)context);
        this.j = new gh(context, this, null);
        this.a = new fy(this, context.getMainLooper());
        this.a(arrstring);
        this.i = arrstring;
        this.a((c)hc.a(c2));
        this.a((d)hc.a(d2));
    }

    static /* synthetic */ IInterface a(fx fx2, IInterface iInterface) {
        fx2.f = iInterface;
        return iInterface;
    }

    static /* synthetic */ ge a(fx fx2, ge ge2) {
        fx2.h = ge2;
        return ge2;
    }

    static /* synthetic */ gh a(fx fx2) {
        return fx2.j;
    }

    static /* synthetic */ Object b(fx fx2) {
        return fx2.k;
    }

    static /* synthetic */ ArrayList c(fx fx2) {
        return fx2.g;
    }

    static /* synthetic */ IInterface d(fx fx2) {
        return fx2.f;
    }

    static /* synthetic */ ge e(fx fx2) {
        return fx2.h;
    }

    static /* synthetic */ Context f(fx fx2) {
        return fx2.e;
    }

    protected abstract String a();

    protected void a(int n2, IBinder iBinder, Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, (Object)new gf(this, n2, iBinder, bundle)));
    }

    public void a(c c2) {
        this.j.a(c2);
    }

    public void a(d d2) {
        this.j.a(d2);
    }

    protected abstract void a(gr var1, gc var2);

    protected /* varargs */ void a(String ... arrstring) {
    }

    protected abstract IInterface b(IBinder var1);

    protected abstract String b();

    protected final void c(IBinder iBinder) {
        try {
            this.a(gt.a(iBinder), new gc(this));
            return;
        }
        catch (RemoteException remoteException) {
            Log.w((String)"GmsClient", (String)"service died");
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        this.b = true;
        Object object = this.k;
        synchronized (object) {
            this.c = true;
        }
        int n2 = g.a(this.e);
        if (n2 != 0) {
            this.a.sendMessage(this.a.obtainMessage(3, (Object)n2));
            return;
        } else {
            if (this.h != null) {
                Log.e((String)"GmsClient", (String)"Calling connect() while still connected, missing disconnect().");
                this.f = null;
                gk.a(this.e).b(this.a(), this.h);
            }
            this.h = new ge(this);
            if (gk.a(this.e).a(this.a(), this.h)) return;
            {
                Log.e((String)"GmsClient", (String)("unable to connect to service: " + this.a()));
                this.a.sendMessage(this.a.obtainMessage(3, (Object)9));
                return;
            }
        }
    }

    @Override
    public boolean e() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f() {
        Object object = this.k;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        this.b = false;
        Object object = this.k;
        synchronized (object) {
            this.c = false;
        }
        object = this.g;
        synchronized (object) {
            int n2 = this.g.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((ga)this.g.get(i2)).d();
            }
            this.g.clear();
        }
        this.f = null;
        if (this.h != null) {
            gk.a(this.e).b(this.a(), this.h);
            this.h = null;
        }
    }

    public final Context h() {
        return this.e;
    }

    protected final void i() {
        if (!this.e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @Override
    public Bundle j() {
        return null;
    }

    protected final IInterface k() {
        this.i();
        return this.f;
    }

    @Override
    public boolean l() {
        return this.b;
    }
}

