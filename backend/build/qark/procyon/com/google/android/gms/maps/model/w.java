// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;

public class w
{
    static void a(final Tile tile, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.b);
        c.a(parcel, 3, tile.c);
        c.a(parcel, 4, tile.d, false);
        c.a(parcel, a);
    }
}
