// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CircleOptions implements SafeParcelable
{
    public static final c a;
    private final int b;
    private LatLng c;
    private double d;
    private float e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    
    static {
        a = new c();
    }
    
    public CircleOptions() {
        this.c = null;
        this.d = 0.0;
        this.e = 10.0f;
        this.f = -16777216;
        this.g = 0;
        this.h = 0.0f;
        this.i = true;
        this.b = 1;
    }
    
    CircleOptions(final int b, final LatLng c, final double d, final float e, final int f, final int g, final float h, final boolean i) {
        this.c = null;
        this.d = 0.0;
        this.e = 10.0f;
        this.f = -16777216;
        this.g = 0;
        this.h = 0.0f;
        this.i = true;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    int a() {
        return this.b;
    }
    
    public LatLng b() {
        return this.c;
    }
    
    public double c() {
        return this.d;
    }
    
    public float d() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.f;
    }
    
    public int f() {
        return this.g;
    }
    
    public float g() {
        return this.h;
    }
    
    public boolean h() {
        return this.i;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            p.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.model.c.a(this, parcel, n);
    }
}
