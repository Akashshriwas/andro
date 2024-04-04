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
import com.google.android.gms.maps.model.Tile;

public class w {
    static void a(Tile tile, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.b);
        c.a(parcel, 3, tile.c);
        c.a(parcel, 4, tile.d, false);
        c.a(parcel, n2);
    }
}

