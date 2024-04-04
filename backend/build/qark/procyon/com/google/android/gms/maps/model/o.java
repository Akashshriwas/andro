// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;

public class o
{
    static void a(final CameraPosition cameraPosition, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, cameraPosition.a());
        c.a(parcel, 2, (Parcelable)cameraPosition.b, n, false);
        c.a(parcel, 3, cameraPosition.c);
        c.a(parcel, 4, cameraPosition.d);
        c.a(parcel, 5, cameraPosition.e);
        c.a(parcel, a);
    }
}
