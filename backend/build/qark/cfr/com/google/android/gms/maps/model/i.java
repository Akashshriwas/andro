/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.List;

public class i
implements Parcelable.Creator {
    static void a(PolylineOptions polylineOptions, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, polylineOptions.a());
        c.b(parcel, 2, polylineOptions.b(), false);
        c.a(parcel, 3, polylineOptions.c());
        c.a(parcel, 4, polylineOptions.d());
        c.a(parcel, 5, polylineOptions.e());
        c.a(parcel, 6, polylineOptions.f());
        c.a(parcel, 7, polylineOptions.g());
        c.a(parcel, n2);
    }

    public PolylineOptions a(Parcel parcel) {
        float f2 = 0.0f;
        boolean bl2 = false;
        int n2 = a.b(parcel);
        ArrayList arrayList = null;
        boolean bl3 = false;
        int n3 = 0;
        float f3 = 0.0f;
        int n4 = 0;
        block9 : while (parcel.dataPosition() < n2) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block9;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block9;
                }
                case 2: {
                    arrayList = a.c(parcel, n5, LatLng.a);
                    continue block9;
                }
                case 3: {
                    f3 = a.j(parcel, n5);
                    continue block9;
                }
                case 4: {
                    n3 = a.g(parcel, n5);
                    continue block9;
                }
                case 5: {
                    f2 = a.j(parcel, n5);
                    continue block9;
                }
                case 6: {
                    bl3 = a.c(parcel, n5);
                    continue block9;
                }
                case 7: 
            }
            bl2 = a.c(parcel, n5);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new PolylineOptions(n4, (List)arrayList, f3, n3, f2, bl3, bl2);
    }

    public PolylineOptions[] a(int n2) {
        return new PolylineOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

