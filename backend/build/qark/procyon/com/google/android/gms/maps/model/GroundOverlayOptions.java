// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.a.b;
import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GroundOverlayOptions implements SafeParcelable
{
    public static final d a;
    private final int b;
    private a c;
    private LatLng d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    
    static {
        a = new d();
    }
    
    public GroundOverlayOptions() {
        this.j = true;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.b = 1;
    }
    
    GroundOverlayOptions(final int b, final IBinder binder, final LatLng d, final float e, final float f, final LatLngBounds g, final float h, final float i, final boolean j, final float k, final float l, final float m) {
        this.j = true;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.b = b;
        this.c = new a(com.google.android.gms.a.b.a(binder));
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
    }
    
    IBinder a() {
        return this.c.a().asBinder();
    }
    
    int b() {
        return this.b;
    }
    
    public LatLng c() {
        return this.d;
    }
    
    public float d() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public float e() {
        return this.f;
    }
    
    public LatLngBounds f() {
        return this.g;
    }
    
    public float g() {
        return this.h;
    }
    
    public float h() {
        return this.i;
    }
    
    public float i() {
        return this.k;
    }
    
    public float j() {
        return this.l;
    }
    
    public float k() {
        return this.m;
    }
    
    public boolean l() {
        return this.j;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            q.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.model.d.a(this, parcel, n);
    }
}
