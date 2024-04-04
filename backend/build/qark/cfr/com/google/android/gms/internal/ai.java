/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.q;

public final class ai
implements SafeParcelable {
    public static final q a = new q();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final int n;
    public final int o;
    public final String p;

    ai(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, String string, int n11, String string2, int n12, int n13, String string3) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
        this.h = n8;
        this.i = n9;
        this.j = n10;
        this.k = string;
        this.l = n11;
        this.m = string2;
        this.n = n12;
        this.o = n13;
        this.p = string3;
    }

    public ai(a a2) {
        this.b = 1;
        this.c = a2.a();
        this.d = a2.b();
        this.e = a2.c();
        this.f = a2.d();
        this.g = a2.e();
        this.h = a2.f();
        this.i = a2.g();
        this.j = a2.h();
        this.k = a2.i();
        this.l = a2.j();
        this.m = a2.k();
        this.n = a2.l();
        this.o = a2.m();
        this.p = a2.n();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        q.a(this, parcel, n2);
    }
}

