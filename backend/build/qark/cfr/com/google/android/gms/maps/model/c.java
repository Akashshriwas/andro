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
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.f;

public class c
implements Parcelable.Creator {
    static void a(CircleOptions circleOptions, Parcel parcel, int n2) {
        int n3 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, circleOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, circleOptions.b(), n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, circleOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, circleOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, circleOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, circleOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, circleOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, circleOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n3);
    }

    public CircleOptions a(Parcel parcel) {
        float f2 = 0.0f;
        boolean bl2 = false;
        int n2 = a.b(parcel);
        LatLng latLng = null;
        double d2 = 0.0;
        int n3 = 0;
        int n4 = 0;
        float f3 = 0.0f;
        int n5 = 0;
        block10 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block10;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    continue block10;
                }
                case 2: {
                    latLng = (LatLng)a.a(parcel, n6, LatLng.a);
                    continue block10;
                }
                case 3: {
                    d2 = a.k(parcel, n6);
                    continue block10;
                }
                case 4: {
                    f3 = a.j(parcel, n6);
                    continue block10;
                }
                case 5: {
                    n4 = a.g(parcel, n6);
                    continue block10;
                }
                case 6: {
                    n3 = a.g(parcel, n6);
                    continue block10;
                }
                case 7: {
                    f2 = a.j(parcel, n6);
                    continue block10;
                }
                case 8: 
            }
            bl2 = a.c(parcel, n6);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new CircleOptions(n5, latLng, d2, f3, n4, n3, f2, bl2);
    }

    public CircleOptions[] a(int n2) {
        return new CircleOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

