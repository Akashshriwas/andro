// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PolygonOptions implements SafeParcelable
{
    public static final h a;
    private final int b;
    private final List c;
    private final List d;
    private float e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private boolean j;
    
    static {
        a = new h();
    }
    
    public PolygonOptions() {
        this.e = 10.0f;
        this.f = -16777216;
        this.g = 0;
        this.h = 0.0f;
        this.i = true;
        this.j = false;
        this.b = 1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
    
    PolygonOptions(final int b, final List c, final List d, final float e, final int f, final int g, final float h, final boolean i, final boolean j) {
        this.e = 10.0f;
        this.f = -16777216;
        this.g = 0;
        this.h = 0.0f;
        this.i = true;
        this.j = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    int a() {
        return this.b;
    }
    
    List b() {
        return this.d;
    }
    
    public List c() {
        return this.c;
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
    
    public boolean i() {
        return this.j;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            u.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.model.h.a(this, parcel, n);
    }
}
