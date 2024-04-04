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
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.u;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
implements SafeParcelable {
    public static final h a = new h();
    private final int b;
    private final List c;
    private final List d;
    private float e = 10.0f;
    private int f = -16777216;
    private int g = 0;
    private float h = 0.0f;
    private boolean i = true;
    private boolean j = false;

    public PolygonOptions() {
        this.b = 1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    PolygonOptions(int n2, List list, List list2, float f2, int n3, int n4, float f3, boolean bl2, boolean bl3) {
        this.b = n2;
        this.c = list;
        this.d = list2;
        this.e = f2;
        this.f = n3;
        this.g = n4;
        this.h = f3;
        this.i = bl2;
        this.j = bl3;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            u.a(this, parcel, n2);
            return;
        }
        h.a(this, parcel, n2);
    }
}

