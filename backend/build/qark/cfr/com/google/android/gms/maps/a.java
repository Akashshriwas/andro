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
package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.b;

public class a
implements Parcelable.Creator {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, googleMapOptions.a());
        c.a(parcel, 2, googleMapOptions.b());
        c.a(parcel, 3, googleMapOptions.c());
        c.a(parcel, 4, googleMapOptions.j());
        c.a(parcel, 5, googleMapOptions.k(), n2, false);
        c.a(parcel, 6, googleMapOptions.d());
        c.a(parcel, 7, googleMapOptions.e());
        c.a(parcel, 8, googleMapOptions.f());
        c.a(parcel, 9, googleMapOptions.g());
        c.a(parcel, 10, googleMapOptions.h());
        c.a(parcel, 11, googleMapOptions.i());
        c.a(parcel, n3);
    }

    public GoogleMapOptions a(Parcel parcel) {
        byte by2 = 0;
        int n2 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CameraPosition cameraPosition = null;
        byte by3 = 0;
        byte by4 = 0;
        byte by5 = 0;
        byte by6 = 0;
        byte by7 = 0;
        int n3 = 0;
        byte by8 = 0;
        byte by9 = 0;
        int n4 = 0;
        block13 : while (parcel.dataPosition() < n2) {
            int n5 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n5)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n5);
                    continue block13;
                }
                case 1: {
                    n4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n5);
                    continue block13;
                }
                case 2: {
                    by9 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 3: {
                    by8 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 4: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n5);
                    continue block13;
                }
                case 5: {
                    cameraPosition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n5, CameraPosition.a);
                    continue block13;
                }
                case 6: {
                    by7 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 7: {
                    by6 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 8: {
                    by5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 9: {
                    by4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 10: {
                    by3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
                    continue block13;
                }
                case 11: 
            }
            by2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, n5);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new GoogleMapOptions(n4, by9, by8, n3, cameraPosition, by7, by6, by5, by4, by3, by2);
    }

    public GoogleMapOptions[] a(int n2) {
        return new GoogleMapOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

