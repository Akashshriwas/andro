/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.hk;

public class eh$b
implements SafeParcelable {
    public static final hk a = new hk();
    final int b;
    final String c;
    final ee$a d;

    eh$b(int n2, String string, ee$a ee$a) {
        this.b = n2;
        this.c = string;
        this.d = ee$a;
    }

    eh$b(String string, ee$a ee$a) {
        this.b = 1;
        this.c = string;
        this.d = ee$a;
    }

    public int describeContents() {
        hk hk2 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hk hk2 = a;
        hk.a(this, parcel, n2);
    }
}

