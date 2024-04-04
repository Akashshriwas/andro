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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ca;

public final class bj
implements SafeParcelable {
    public static final ca a = new ca();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public bj(int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.b = n2;
        this.c = string;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = string6;
        this.i = string7;
    }

    public bj(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        this(1, string, string2, string3, string4, string5, string6, string7);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ca.a(this, parcel, n2);
    }
}

