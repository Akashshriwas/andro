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
import com.google.android.gms.wallet.e;

public final class FullWalletRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    String a;
    String b;
    Cart c;
    private final int d;

    FullWalletRequest() {
        this.d = 1;
    }

    FullWalletRequest(int n2, String string, String string2, Cart cart) {
        this.d = n2;
        this.a = string;
        this.b = string2;
        this.c = cart;
    }

    public int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        e.a(this, parcel, n2);
    }
}

