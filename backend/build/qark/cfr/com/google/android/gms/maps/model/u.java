/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.util.List
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.List;

public class u {
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
}

