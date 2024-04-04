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
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.h;

public final class MaskedWallet
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new h();
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    private final int i;

    MaskedWallet() {
        this.i = 2;
    }

    MaskedWallet(int n2, String string, String string2, String[] arrstring, String string3, Address address, Address address2, LoyaltyWalletObject[] arrloyaltyWalletObject, OfferWalletObject[] arrofferWalletObject) {
        this.i = n2;
        this.a = string;
        this.b = string2;
        this.c = arrstring;
        this.d = string3;
        this.e = address;
        this.f = address2;
        this.g = arrloyaltyWalletObject;
        this.h = arrofferWalletObject;
    }

    public int a() {
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        h.a(this, parcel, n2);
    }
}

