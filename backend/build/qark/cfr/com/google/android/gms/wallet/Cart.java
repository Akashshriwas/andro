/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.b;
import java.util.ArrayList;

public final class Cart
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    String a;
    String b;
    ArrayList c;
    private final int d;

    Cart() {
        this.d = 1;
        this.c = new ArrayList();
    }

    Cart(int n2, String string, String string2, ArrayList arrayList) {
        this.d = n2;
        this.a = string;
        this.b = string2;
        this.c = arrayList;
    }

    public int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

