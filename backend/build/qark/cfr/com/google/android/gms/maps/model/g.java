/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.f;

public class g
implements Parcelable.Creator {
    static void a(MarkerOptions markerOptions, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, markerOptions.a());
        c.a(parcel, 2, markerOptions.c(), n2, false);
        c.a(parcel, 3, markerOptions.d(), false);
        c.a(parcel, 4, markerOptions.e(), false);
        c.a(parcel, 5, markerOptions.b(), false);
        c.a(parcel, 6, markerOptions.f());
        c.a(parcel, 7, markerOptions.g());
        c.a(parcel, 8, markerOptions.h());
        c.a(parcel, 9, markerOptions.i());
        c.a(parcel, 10, markerOptions.j());
        c.a(parcel, 11, markerOptions.k());
        c.a(parcel, 12, markerOptions.l());
        c.a(parcel, 13, markerOptions.m());
        c.a(parcel, 14, markerOptions.n());
        c.a(parcel, n3);
    }

    public MarkerOptions a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        LatLng latLng = null;
        String string = null;
        String string2 = null;
        IBinder iBinder = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.0f;
        float f7 = 1.0f;
        block16 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block16;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block16;
                }
                case 2: {
                    latLng = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block16;
                }
                case 3: {
                    string = a.m(parcel, n4);
                    continue block16;
                }
                case 4: {
                    string2 = a.m(parcel, n4);
                    continue block16;
                }
                case 5: {
                    iBinder = a.n(parcel, n4);
                    continue block16;
                }
                case 6: {
                    f2 = a.j(parcel, n4);
                    continue block16;
                }
                case 7: {
                    f3 = a.j(parcel, n4);
                    continue block16;
                }
                case 8: {
                    bl2 = a.c(parcel, n4);
                    continue block16;
                }
                case 9: {
                    bl3 = a.c(parcel, n4);
                    continue block16;
                }
                case 10: {
                    bl4 = a.c(parcel, n4);
                    continue block16;
                }
                case 11: {
                    f4 = a.j(parcel, n4);
                    continue block16;
                }
                case 12: {
                    f5 = a.j(parcel, n4);
                    continue block16;
                }
                case 13: {
                    f6 = a.j(parcel, n4);
                    continue block16;
                }
                case 14: 
            }
            f7 = a.j(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new MarkerOptions(n3, latLng, string, string2, iBinder, f2, f3, bl2, bl3, bl4, f4, f5, f6, f7);
    }

    public MarkerOptions[] a(int n2) {
        return new MarkerOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

