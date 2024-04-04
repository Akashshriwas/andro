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
package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;

public class f
implements Parcelable.Creator {
    static void a(LatLng latLng, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, latLng.a());
        c.a(parcel, 2, latLng.b);
        c.a(parcel, 3, latLng.c);
        c.a(parcel, n2);
    }

    public LatLng a(Parcel parcel) {
        double d2 = 0.0;
        int n2 = a.b(parcel);
        int n3 = 0;
        double d3 = 0.0;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: {
                    d3 = a.k(parcel, n4);
                    continue block5;
                }
                case 3: 
            }
            d2 = a.k(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new LatLng(n3, d3, d2);
    }

    public LatLng[] a(int n2) {
        return new LatLng[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

