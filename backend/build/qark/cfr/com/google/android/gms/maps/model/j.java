/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.Tile;

public class j
implements Parcelable.Creator {
    static void a(Tile tile, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.b);
        c.a(parcel, 3, tile.c);
        c.a(parcel, 4, tile.d, false);
        c.a(parcel, n2);
    }

    public Tile a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        byte[] arrby = null;
        int n4 = 0;
        int n5 = 0;
        block6 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block6;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    continue block6;
                }
                case 2: {
                    n4 = a.g(parcel, n6);
                    continue block6;
                }
                case 3: {
                    n2 = a.g(parcel, n6);
                    continue block6;
                }
                case 4: 
            }
            arrby = a.p(parcel, n6);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new Tile(n5, n4, n2, arrby);
    }

    public Tile[] a(int n2) {
        return new Tile[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

