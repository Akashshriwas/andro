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
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public class o {
    static void a(CameraPosition cameraPosition, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, cameraPosition.a());
        c.a(parcel, 2, cameraPosition.b, n2, false);
        c.a(parcel, 3, cameraPosition.c);
        c.a(parcel, 4, cameraPosition.d);
        c.a(parcel, 5, cameraPosition.e);
        c.a(parcel, n3);
    }
}

