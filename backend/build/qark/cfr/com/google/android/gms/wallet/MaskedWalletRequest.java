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
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.i;

public final class MaskedWalletRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    boolean l;
    boolean m;
    private final int n;

    MaskedWalletRequest() {
        this.n = 3;
        this.l = true;
        this.m = true;
    }

    MaskedWalletRequest(int n2, String string, boolean bl2, boolean bl3, boolean bl4, String string2, String string3, String string4, Cart cart, boolean bl5, boolean bl6, CountrySpecification[] arrcountrySpecification, boolean bl7, boolean bl8) {
        this.n = n2;
        this.a = string;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        this.e = string2;
        this.f = string3;
        this.g = string4;
        this.h = cart;
        this.i = bl5;
        this.j = bl6;
        this.k = arrcountrySpecification;
        this.l = bl7;
        this.m = bl8;
    }

    public int a() {
        return this.n;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        i.a(this, parcel, n2);
    }
}

