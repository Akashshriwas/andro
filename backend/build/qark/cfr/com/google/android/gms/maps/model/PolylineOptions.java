/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.v;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
implements SafeParcelable {
    public static final i a = new i();
    private final int b;
    private final List c;
    private float d = 10.0f;
    private int e = -16777216;
    private float f = 0.0f;
    private boolean g = true;
    private boolean h = false;

    public PolylineOptions() {
        this.b = 1;
        this.c = new ArrayList();
    }

    PolylineOptions(int n2, List list, float f2, int n3, float f3, boolean bl2, boolean bl3) {
        this.b = n2;
        this.c = list;
        this.d = f2;
        this.e = n3;
        this.f = f3;
        this.g = bl2;
        this.h = bl3;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            v.a(this, parcel, n2);
            return;
        }
        i.a(this, parcel, n2);
    }
}

