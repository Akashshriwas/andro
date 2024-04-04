// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.a.b;
import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MarkerOptions implements SafeParcelable
{
    public static final g a;
    private final int b;
    private LatLng c;
    private String d;
    private String e;
    private a f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    
    static {
        a = new g();
    }
    
    public MarkerOptions() {
        this.g = 0.5f;
        this.h = 1.0f;
        this.j = true;
        this.k = false;
        this.l = 0.0f;
        this.m = 0.5f;
        this.n = 0.0f;
        this.o = 1.0f;
        this.b = 1;
    }
    
    MarkerOptions(final int b, final LatLng c, final String d, final String e, final IBinder binder, final float g, final float h, final boolean i, final boolean j, final boolean k, final float l, final float m, final float n, final float o) {
        this.g = 0.5f;
        this.h = 1.0f;
        this.j = true;
        this.k = false;
        this.l = 0.0f;
        this.m = 0.5f;
        this.n = 0.0f;
        this.o = 1.0f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        a f;
        if (binder == null) {
            f = null;
        }
        else {
            f = new a(com.google.android.gms.a.b.a(binder));
        }
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
    }
    
    int a() {
        return this.b;
    }
    
    IBinder b() {
        if (this.f == null) {
            return null;
        }
        return this.f.a().asBinder();
    }
    
    public LatLng c() {
        return this.c;
    }
    
    public String d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.e;
    }
    
    public float f() {
        return this.g;
    }
    
    public float g() {
        return this.h;
    }
    
    public boolean h() {
        return this.i;
    }
    
    public boolean i() {
        return this.j;
    }
    
    public boolean j() {
        return this.k;
    }
    
    public float k() {
        return this.l;
    }
    
    public float l() {
        return this.m;
    }
    
    public float m() {
        return this.n;
    }
    
    public float n() {
        return this.o;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            t.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.model.g.a(this, parcel, n);
    }
}
