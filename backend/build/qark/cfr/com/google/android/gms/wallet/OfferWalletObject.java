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
import com.google.android.gms.wallet.k;

public final class OfferWalletObject
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new k();
    String a;
    String b;
    private final int c;

    OfferWalletObject() {
        this.c = 2;
    }

    OfferWalletObject(int n2, String string, String string2) {
        this.c = n2;
        this.a = string;
        this.b = string2;
    }

    public int a() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        k.a(this, parcel, n2);
    }
}

