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
import com.google.android.gms.wallet.l;

public final class ProxyCard
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new l();
    String a;
    String b;
    int c;
    int d;
    private final int e;

    ProxyCard(int n2, String string, String string2, int n3, int n4) {
        this.e = n2;
        this.a = string;
        this.b = string2;
        this.c = n3;
        this.d = n4;
    }

    public int a() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        l.a(this, parcel, n2);
    }
}

