// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;

public class s
{
    static void a(final LatLng latLng, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, latLng.a());
        c.a(parcel, 2, latLng.b);
        c.a(parcel, 3, latLng.c);
        c.a(parcel, a);
    }
}
