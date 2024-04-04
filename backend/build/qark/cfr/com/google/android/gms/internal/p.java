/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.d;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.jz;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.n;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.Map;

public final class p {
    private final bk a = new bk();
    private com.google.android.gms.ads.a b;
    private e c;
    private com.google.android.gms.ads.e[] d;
    private String e;
    private ViewGroup f;
    private a g;

    public p(ViewGroup viewGroup) {
        this.f = viewGroup;
    }

    private void d() {
        com.google.android.gms.a.a a2;
        block3 : {
            try {
                a2 = this.c.a();
                if (a2 != null) break block3;
                return;
            }
            catch (RemoteException remoteException) {
                et.b("Failed to get an ad frame.", (Throwable)remoteException);
                return;
            }
        }
        this.f.addView((View)d.a(a2));
    }

    private void e() {
        if ((this.d == null || this.e == null) && this.c == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context = this.f.getContext();
        this.c = jz.a(context, new x(context, this.d), this.e, this.a);
        if (this.b != null) {
            this.c.a(new jy(this.b));
        }
        if (this.g != null) {
            this.c.a(new kc(this.g));
        }
        this.d();
    }

    public com.google.android.gms.ads.a a() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(com.google.android.gms.ads.a object) {
        try {
            this.b = object;
            if (this.c != null) {
                e e2 = this.c;
                object = object != null ? new jy((com.google.android.gms.ads.a)object) : null;
                e2.a((b)object);
            }
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Failed to set the AdListener.", (Throwable)remoteException);
            return;
        }
    }

    public void a(n n2) {
        try {
            if (this.c == null) {
                this.e();
            }
            if (this.c.a(new v(this.f.getContext(), n2))) {
                this.a.a(n2.h());
            }
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Failed to load ad.", (Throwable)remoteException);
            return;
        }
    }

    public void a(String string) {
        if (this.e != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.e = string;
    }

    public /* varargs */ void a(com.google.android.gms.ads.e ... arre) {
        if (this.d != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.b(arre);
    }

    public com.google.android.gms.ads.e b() {
        try {
            if (this.c != null) {
                com.google.android.gms.ads.e e2 = this.c.i().a();
                return e2;
            }
        }
        catch (RemoteException remoteException) {
            et.b("Failed to get the current AdSize.", (Throwable)remoteException);
        }
        if (this.d != null) {
            return this.d[0];
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public /* varargs */ void b(com.google.android.gms.ads.e ... arre) {
        this.d = arre;
        try {
            if (this.c != null) {
                this.c.a(new x(this.f.getContext(), this.d));
            }
        }
        catch (RemoteException remoteException) {
            et.b("Failed to set the ad size.", (Throwable)remoteException);
        }
        this.f.requestLayout();
    }

    public String c() {
        return this.e;
    }
}

