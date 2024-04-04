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
import com.google.android.gms.wallet.j;

public final class NotifyTransactionStatusRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    final int a;
    String b;
    int c;
    String d;

    NotifyTransactionStatusRequest() {
        this.a = 1;
    }

    NotifyTransactionStatusRequest(int n2, String string, int n3, String string2) {
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = string2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        j.a(this, parcel, n2);
    }
}

