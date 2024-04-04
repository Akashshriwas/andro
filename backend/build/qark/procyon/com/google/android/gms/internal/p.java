// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;

public final class p
{
    private final bk a;
    private a b;
    private e c;
    private com.google.android.gms.ads.e[] d;
    private String e;
    private ViewGroup f;
    private com.google.android.gms.ads.a.a g;
    
    public p(final ViewGroup f) {
        this.a = new bk();
        this.f = f;
    }
    
    private void d() {
        try {
            final com.google.android.gms.a.a a = this.c.a();
            if (a == null) {
                return;
            }
            this.f.addView((View)com.google.android.gms.a.d.a(a));
        }
        catch (RemoteException ex) {
            et.b("Failed to get an ad frame.", (Throwable)ex);
        }
    }
    
    private void e() {
        if ((this.d == null || this.e == null) && this.c == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        final Context context = this.f.getContext();
        this.c = jz.a(context, new x(context, this.d), this.e, this.a);
        if (this.b != null) {
            this.c.a(new jy(this.b));
        }
        if (this.g != null) {
            this.c.a(new kc(this.g));
        }
        this.d();
    }
    
    public a a() {
        return this.b;
    }
    
    public void a(final a b) {
        try {
            this.b = b;
            if (this.c != null) {
                final e c = this.c;
                jy jy;
                if (b != null) {
                    jy = new jy(b);
                }
                else {
                    jy = null;
                }
                c.a(jy);
            }
        }
        catch (RemoteException ex) {
            et.b("Failed to set the AdListener.", (Throwable)ex);
        }
    }
    
    public void a(final n n) {
        try {
            if (this.c == null) {
                this.e();
            }
            if (this.c.a(new v(this.f.getContext(), n))) {
                this.a.a(n.h());
            }
        }
        catch (RemoteException ex) {
            et.b("Failed to load ad.", (Throwable)ex);
        }
    }
    
    public void a(final String e) {
        if (this.e != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.e = e;
    }
    
    public void a(final com.google.android.gms.ads.e... array) {
        if (this.d != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.b(array);
    }
    
    public com.google.android.gms.ads.e b() {
        try {
            if (this.c != null) {
                return this.c.i().a();
            }
        }
        catch (RemoteException ex) {
            et.b("Failed to get the current AdSize.", (Throwable)ex);
        }
        if (this.d != null) {
            return this.d[0];
        }
        return null;
    }
    
    public void b(final com.google.android.gms.ads.e... d) {
        this.d = d;
        while (true) {
            try {
                if (this.c != null) {
                    this.c.a(new x(this.f.getContext(), this.d));
                }
                this.f.requestLayout();
            }
            catch (RemoteException ex) {
                et.b("Failed to set the ad size.", (Throwable)ex);
                continue;
            }
            break;
        }
    }
    
    public String c() {
        return this.e;
    }
}
