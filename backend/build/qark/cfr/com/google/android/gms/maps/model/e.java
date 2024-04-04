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
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;

public class e
implements Parcelable.Creator {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, latLngBounds.a());
        c.a(parcel, 2, latLngBounds.b, n2, false);
        c.a(parcel, 3, latLngBounds.c, n2, false);
        c.a(parcel, n3);
    }

    public LatLngBounds a(Parcel parcel) {
        LatLng latLng = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        LatLng latLng2 = null;
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
                    latLng2 = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block5;
                }
                case 3: 
            }
            latLng = (LatLng)a.a(parcel, n4, LatLng.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new LatLngBounds(n3, latLng2, latLng);
    }

    public LatLngBounds[] a(int n2) {
        return new LatLngBounds[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

