/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.t;

public final class MarkerOptions
implements SafeParcelable {
    public static final g a = new g();
    private final int b;
    private LatLng c;
    private String d;
    private String e;
    private a f;
    private float g = 0.5f;
    private float h = 1.0f;
    private boolean i;
    private boolean j = true;
    private boolean k = false;
    private float l = 0.0f;
    private float m = 0.5f;
    private float n = 0.0f;
    private float o = 1.0f;

    public MarkerOptions() {
        this.b = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    MarkerOptions(int n2, LatLng object, String string, String string2, IBinder iBinder, float f2, float f3, boolean bl2, boolean bl3, boolean bl4, float f4, float f5, float f6, float f7) {
        this.b = n2;
        this.c = object;
        this.d = string;
        this.e = string2;
        object = iBinder == null ? null : new a(com.google.android.gms.a.b.a(iBinder));
        this.f = object;
        this.g = f2;
        this.h = f3;
        this.i = bl2;
        this.j = bl3;
        this.k = bl4;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.o = f7;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            t.a(this, parcel, n2);
            return;
        }
        g.a(this, parcel, n2);
    }
}

