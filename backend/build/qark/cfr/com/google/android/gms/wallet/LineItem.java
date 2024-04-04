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
import com.google.android.gms.wallet.f;

public final class LineItem
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new f();
    String a;
    String b;
    String c;
    String d;
    int e;
    String f;
    private final int g;

    LineItem() {
        this.g = 1;
        this.e = 0;
    }

    LineItem(int n2, String string, String string2, String string3, String string4, int n3, String string5) {
        this.g = n2;
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n3;
        this.f = string5;
    }

    public int a() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        f.a(this, parcel, n2);
    }
}

