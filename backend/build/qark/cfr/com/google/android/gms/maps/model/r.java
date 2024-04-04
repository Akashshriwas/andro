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

public class r {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, latLngBounds.a());
        c.a(parcel, 2, latLngBounds.b, n2, false);
        c.a(parcel, 3, latLngBounds.c, n2, false);
        c.a(parcel, n3);
    }
}

