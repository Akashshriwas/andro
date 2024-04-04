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
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.f;

public class b
implements Parcelable.Creator {
    static void a(CameraPosition cameraPosition, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, cameraPosition.a());
        c.a(parcel, 2, cameraPosition.b, n2, false);
        c.a(parcel, 3, cameraPosition.c);
        c.a(parcel, 4, cameraPosition.d);
        c.a(parcel, 5, cameraPosition.e);
        c.a(parcel, n3);
    }

    public CameraPosition a(Parcel parcel) {
        float f2 = 0.0f;
        int n2 = a.b(parcel);
        int n3 = 0;
        LatLng latLng = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        block7 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block7;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block7;
                }
                case 2: {
                    latLng = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block7;
                }
                case 3: {
                    f4 = a.j(parcel, n4);
                    continue block7;
                }
                case 4: {
                    f3 = a.j(parcel, n4);
                    continue block7;
                }
                case 5: 
            }
            f2 = a.j(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new CameraPosition(n3, latLng, f4, f3, f2);
    }

    public CameraPosition[] a(int n2) {
        return new CameraPosition[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

