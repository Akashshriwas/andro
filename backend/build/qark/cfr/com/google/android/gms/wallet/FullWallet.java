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
import com.google.android.gms.wallet.ProxyCard;
import com.google.android.gms.wallet.d;

public final class FullWallet
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    private final int h;

    FullWallet() {
        this.h = 1;
    }

    FullWallet(int n2, String string, String string2, ProxyCard proxyCard, String string3, Address address, Address address2, String[] arrstring) {
        this.h = n2;
        this.a = string;
        this.b = string2;
        this.c = proxyCard;
        this.d = string3;
        this.e = address;
        this.f = address2;
        this.g = arrstring;
    }

    public int a() {
        return this.h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        d.a(this, parcel, n2);
    }
}

