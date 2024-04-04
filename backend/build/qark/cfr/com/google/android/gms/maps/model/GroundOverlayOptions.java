/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.q;

public final class GroundOverlayOptions
implements SafeParcelable {
    public static final d a = new d();
    private final int b;
    private a c;
    private LatLng d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private boolean j = true;
    private float k = 0.0f;
    private float l = 0.5f;
    private float m = 0.5f;

    public GroundOverlayOptions() {
        this.b = 1;
    }

    GroundOverlayOptions(int n2, IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean bl2, float f6, float f7, float f8) {
        this.b = n2;
        this.c = new a(com.google.android.gms.a.b.a(iBinder));
        this.d = latLng;
        this.e = f2;
        this.f = f3;
        this.g = latLngBounds;
        this.h = f4;
        this.i = f5;
        this.j = bl2;
        this.k = f6;
        this.l = f7;
        this.m = f8;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            q.a(this, parcel, n2);
            return;
        }
        d.a(this, parcel, n2);
    }
}

