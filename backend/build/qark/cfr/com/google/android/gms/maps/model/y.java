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
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public class y {
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
}

