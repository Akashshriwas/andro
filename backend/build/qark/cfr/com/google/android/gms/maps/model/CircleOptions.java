/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.p;

public final class CircleOptions
implements SafeParcelable {
    public static final c a = new c();
    private final int b;
    private LatLng c = null;
    private double d = 0.0;
    private float e = 10.0f;
    private int f = -16777216;
    private int g = 0;
    private float h = 0.0f;
    private boolean i = true;

    public CircleOptions() {
        this.b = 1;
    }

    CircleOptions(int n2, LatLng latLng, double d2, float f2, int n3, int n4, float f3, boolean bl2) {
        this.b = n2;
        this.c = latLng;
        this.d = d2;
        this.e = f2;
        this.f = n3;
        this.g = n4;
        this.h = f3;
        this.i = bl2;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            p.a(this, parcel, n2);
            return;
        }
        c.a(this, parcel, n2);
    }
}

