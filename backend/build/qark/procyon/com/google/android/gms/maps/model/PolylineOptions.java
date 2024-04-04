// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PolylineOptions implements SafeParcelable
{
    public static final i a;
    private final int b;
    private final List c;
    private float d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    
    static {
        a = new i();
    }
    
    public PolylineOptions() {
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.b = 1;
        this.c = new ArrayList();
    }
    
    PolylineOptions(final int b, final List c, final float d, final int e, final float f, final boolean g, final boolean h) {
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    int a() {
        return this.b;
    }
    
    public List b() {
        return this.c;
    }
    
    public float c() {
        return this.d;
    }
    
    public int d() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public float e() {
        return this.f;
    }
    
    public boolean f() {
        return this.g;
    }
    
    public boolean g() {
        return this.h;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            v.a(this, parcel, n);
            return;
        }
        i.a(this, parcel, n);
    }
}
