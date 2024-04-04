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
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.DetectedActivity;

public class b
implements Parcelable.Creator {
    static void a(DetectedActivity detectedActivity, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, detectedActivity.b);
        c.a(parcel, 1000, detectedActivity.b());
        c.a(parcel, 2, detectedActivity.c);
        c.a(parcel, n2);
    }

    public DetectedActivity a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        int n4 = 0;
        int n5 = 0;
        block5 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block5;
                }
                case 1: {
                    n4 = a.g(parcel, n6);
                    continue block5;
                }
                case 1000: {
                    n5 = a.g(parcel, n6);
                    continue block5;
                }
                case 2: 
            }
            n2 = a.g(parcel, n6);
        }
        if (parcel.dataPosition() != n3) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n3, parcel);
        }
        return new DetectedActivity(n5, n4, n2);
    }

    public DetectedActivity[] a(int n2) {
        return new DetectedActivity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

