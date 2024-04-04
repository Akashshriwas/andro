/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public class q {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, groundOverlayOptions.b());
        c.a(parcel, 2, groundOverlayOptions.a(), false);
        c.a(parcel, 3, groundOverlayOptions.c(), n2, false);
        c.a(parcel, 4, groundOverlayOptions.d());
        c.a(parcel, 5, groundOverlayOptions.e());
        c.a(parcel, 6, groundOverlayOptions.f(), n2, false);
        c.a(parcel, 7, groundOverlayOptions.g());
        c.a(parcel, 8, groundOverlayOptions.h());
        c.a(parcel, 9, groundOverlayOptions.l());
        c.a(parcel, 10, groundOverlayOptions.i());
        c.a(parcel, 11, groundOverlayOptions.j());
        c.a(parcel, 12, groundOverlayOptions.k());
        c.a(parcel, n3);
    }
}

