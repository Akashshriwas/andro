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
import com.google.android.gms.internal.hh;

public final class eb$a
implements SafeParcelable {
    public static final hh a = new hh();
    final int b;
    final String c;
    final int d;

    eb$a(int n2, String string, int n3) {
        this.b = n2;
        this.c = string;
        this.d = n3;
    }

    eb$a(String string, int n2) {
        this.b = 1;
        this.c = string;
        this.d = n2;
    }

    public int describeContents() {
        hh hh2 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hh hh2 = a;
        hh.a(this, parcel, n2);
    }
}

