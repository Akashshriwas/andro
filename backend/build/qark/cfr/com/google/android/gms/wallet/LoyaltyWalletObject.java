/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.g;

public final class LoyaltyWalletObject
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new g();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    private final int i;

    LoyaltyWalletObject() {
        this.i = 3;
    }

    LoyaltyWalletObject(int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.i = n2;
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
        this.h = string8;
    }

    public int a() {
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        g.a(this, parcel, n2);
    }
}

