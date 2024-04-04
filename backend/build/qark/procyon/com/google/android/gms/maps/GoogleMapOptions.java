// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GoogleMapOptions implements SafeParcelable
{
    public static final a a;
    private final int b;
    private Boolean c;
    private Boolean d;
    private int e;
    private CameraPosition f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    
    static {
        a = new a();
    }
    
    public GoogleMapOptions() {
        this.e = -1;
        this.b = 1;
    }
    
    GoogleMapOptions(final int b, final byte b2, final byte b3, final int e, final CameraPosition f, final byte b4, final byte b5, final byte b6, final byte b7, final byte b8, final byte b9) {
        this.e = -1;
        this.b = b;
        this.c = com.google.android.gms.maps.a.a.a(b2);
        this.d = com.google.android.gms.maps.a.a.a(b3);
        this.e = e;
        this.f = f;
        this.g = com.google.android.gms.maps.a.a.a(b4);
        this.h = com.google.android.gms.maps.a.a.a(b5);
        this.i = com.google.android.gms.maps.a.a.a(b6);
        this.j = com.google.android.gms.maps.a.a.a(b7);
        this.k = com.google.android.gms.maps.a.a.a(b8);
        this.l = com.google.android.gms.maps.a.a.a(b9);
    }
    
    int a() {
        return this.b;
    }
    
    byte b() {
        return com.google.android.gms.maps.a.a.a(this.c);
    }
    
    byte c() {
        return com.google.android.gms.maps.a.a.a(this.d);
    }
    
    byte d() {
        return com.google.android.gms.maps.a.a.a(this.g);
    }
    
    public int describeContents() {
        return 0;
    }
    
    byte e() {
        return com.google.android.gms.maps.a.a.a(this.h);
    }
    
    byte f() {
        return com.google.android.gms.maps.a.a.a(this.i);
    }
    
    byte g() {
        return com.google.android.gms.maps.a.a.a(this.j);
    }
    
    byte h() {
        return com.google.android.gms.maps.a.a.a(this.k);
    }
    
    byte i() {
        return com.google.android.gms.maps.a.a.a(this.l);
    }
    
    public int j() {
        return this.e;
    }
    
    public CameraPosition k() {
        return this.f;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            com.google.android.gms.maps.b.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.a.a(this, parcel, n);
    }
}
