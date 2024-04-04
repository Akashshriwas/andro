/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public class p {
    static void a(CircleOptions circleOptions, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, circleOptions.a());
        c.a(parcel, 2, circleOptions.b(), n2, false);
        c.a(parcel, 3, circleOptions.c());
        c.a(parcel, 4, circleOptions.d());
        c.a(parcel, 5, circleOptions.e());
        c.a(parcel, 6, circleOptions.f());
        c.a(parcel, 7, circleOptions.g());
        c.a(parcel, 8, circleOptions.h());
        c.a(parcel, n3);
    }
}

