/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.hf;
import com.google.android.gms.internal.hi;

public class dz
implements SafeParcelable {
    public static final hf a = new hf();
    private final int b;
    private final eb c;

    dz(int n2, eb eb2) {
        this.b = n2;
        this.c = eb2;
    }

    private dz(eb eb2) {
        this.b = 1;
        this.c = eb2;
    }

    public static dz a(hi hi2) {
        if (hi2 instanceof eb) {
            return new dz((eb)hi2);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    int a() {
        return this.b;
    }

    eb b() {
        return this.c;
    }

    public hi c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        hf hf2 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hf hf2 = a;
        hf.a(this, parcel, n2);
    }
}

