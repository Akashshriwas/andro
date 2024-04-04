// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ai implements SafeParcelable
{
    public static final q a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final int n;
    public final int o;
    public final String p;
    
    static {
        a = new q();
    }
    
    ai(final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final int j, final String k, final int l, final String m, final int n, final int o, final String p15) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p15;
    }
    
    public ai(final a a) {
        this.b = 1;
        this.c = a.a();
        this.d = a.b();
        this.e = a.c();
        this.f = a.d();
        this.g = a.e();
        this.h = a.f();
        this.i = a.g();
        this.j = a.h();
        this.k = a.i();
        this.l = a.j();
        this.m = a.k();
        this.n = a.l();
        this.o = a.m();
        this.p = a.n();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        q.a(this, parcel, n);
    }
}
