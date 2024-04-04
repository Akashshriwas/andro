/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassLoader
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
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.List;

public class h
implements Parcelable.Creator {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, polygonOptions.a());
        c.b(parcel, 2, polygonOptions.c(), false);
        c.c(parcel, 3, polygonOptions.b(), false);
        c.a(parcel, 4, polygonOptions.d());
        c.a(parcel, 5, polygonOptions.e());
        c.a(parcel, 6, polygonOptions.f());
        c.a(parcel, 7, polygonOptions.g());
        c.a(parcel, 8, polygonOptions.h());
        c.a(parcel, 9, polygonOptions.i());
        c.a(parcel, n2);
    }

    public PolygonOptions a(Parcel parcel) {
        float f2 = 0.0f;
        boolean bl2 = false;
        int n2 = a.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = new ArrayList();
        boolean bl3 = false;
        int n3 = 0;
        int n4 = 0;
        float f3 = 0.0f;
        int n5 = 0;
        block11 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block11;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    continue block11;
                }
                case 2: {
                    arrayList = a.c(parcel, n6, LatLng.a);
                    continue block11;
                }
                case 3: {
                    a.a(parcel, n6, (List)arrayList2, this.getClass().getClassLoader());
                    continue block11;
                }
                case 4: {
                    f3 = a.j(parcel, n6);
                    continue block11;
                }
                case 5: {
                    n4 = a.g(parcel, n6);
                    continue block11;
                }
                case 6: {
                    n3 = a.g(parcel, n6);
                    continue block11;
                }
                case 7: {
                    f2 = a.j(parcel, n6);
                    continue block11;
                }
                case 8: {
                    bl3 = a.c(parcel, n6);
                    continue block11;
                }
                case 9: 
            }
            bl2 = a.c(parcel, n6);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new PolygonOptions(n5, (List)arrayList, (List)arrayList2, f3, n4, n3, f2, bl3, bl2);
    }

    public PolygonOptions[] a(int n2) {
        return new PolygonOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

