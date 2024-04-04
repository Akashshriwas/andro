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
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;

public class n
implements Parcelable.Creator {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, visibleRegion.a());
        c.a(parcel, 2, visibleRegion.b, n2, false);
        c.a(parcel, 3, visibleRegion.c, n2, false);
        c.a(parcel, 4, visibleRegion.d, n2, false);
        c.a(parcel, 5, visibleRegion.e, n2, false);
        c.a(parcel, 6, visibleRegion.f, n2, false);
        c.a(parcel, n3);
    }

    public VisibleRegion a(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        block8 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block8;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block8;
                }
                case 2: {
                    latLng4 = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block8;
                }
                case 3: {
                    latLng3 = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block8;
                }
                case 4: {
                    latLng2 = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block8;
                }
                case 5: {
                    latLng = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block8;
                }
                case 6: 
            }
            latLngBounds = (LatLngBounds)a.a(parcel, n4, LatLngBounds.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new VisibleRegion(n3, latLng4, latLng3, latLng2, latLng, latLngBounds);
    }

    public VisibleRegion[] a(int n2) {
        return new VisibleRegion[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

