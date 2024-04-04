// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;

public class x
{
    static void a(final TileOverlayOptions tileOverlayOptions, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, tileOverlayOptions.a());
        c.a(parcel, 2, tileOverlayOptions.b(), false);
        c.a(parcel, 3, tileOverlayOptions.d());
        c.a(parcel, 4, tileOverlayOptions.c());
        c.a(parcel, a);
    }
}
