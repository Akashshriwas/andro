/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.b;

public class DetectedActivity
implements SafeParcelable {
    public static final b a = new b();
    int b;
    int c;
    private final int d;

    public DetectedActivity(int n2, int n3, int n4) {
        this.d = n2;
        this.b = n3;
        this.c = n4;
    }

    private int a(int n2) {
        int n3 = n2;
        if (n2 > 6) {
            n3 = 4;
        }
        return n3;
    }

    public int a() {
        return this.a(this.b);
    }

    public int b() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DetectedActivity [type=" + this.a() + ", confidence=" + this.c + "]";
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

