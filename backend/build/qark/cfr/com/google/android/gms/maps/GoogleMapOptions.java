/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
implements SafeParcelable {
    public static final com.google.android.gms.maps.a a = new com.google.android.gms.maps.a();
    private final int b;
    private Boolean c;
    private Boolean d;
    private int e = -1;
    private CameraPosition f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;

    public GoogleMapOptions() {
        this.b = 1;
    }

    GoogleMapOptions(int n2, byte by2, byte by3, int n3, CameraPosition cameraPosition, byte by4, byte by5, byte by6, byte by7, byte by8, byte by9) {
        this.b = n2;
        this.c = a.a(by2);
        this.d = a.a(by3);
        this.e = n3;
        this.f = cameraPosition;
        this.g = a.a(by4);
        this.h = a.a(by5);
        this.i = a.a(by6);
        this.j = a.a(by7);
        this.k = a.a(by8);
        this.l = a.a(by9);
    }

    int a() {
        return this.b;
    }

    byte b() {
        return a.a(this.c);
    }

    byte c() {
        return a.a(this.d);
    }

    byte d() {
        return a.a(this.g);
    }

    public int describeContents() {
        return 0;
    }

    byte e() {
        return a.a(this.h);
    }

    byte f() {
        return a.a(this.i);
    }

    byte g() {
        return a.a(this.j);
    }

    byte h() {
        return a.a(this.k);
    }

    byte i() {
        return a.a(this.l);
    }

    public int j() {
        return this.e;
    }

    public CameraPosition k() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            com.google.android.gms.maps.b.a(this, parcel, n2);
            return;
        }
        com.google.android.gms.maps.a.a(this, parcel, n2);
    }
}

