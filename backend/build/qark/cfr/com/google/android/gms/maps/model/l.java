/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.TileOverlayOptions;

public class l
implements Parcelable.Creator {
    static void a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, tileOverlayOptions.a());
        c.a(parcel, 2, tileOverlayOptions.b(), false);
        c.a(parcel, 3, tileOverlayOptions.d());
        c.a(parcel, 4, tileOverlayOptions.c());
        c.a(parcel, 5, tileOverlayOptions.e());
        c.a(parcel, n2);
    }

    public TileOverlayOptions a(Parcel parcel) {
        boolean bl2 = false;
        int n2 = a.b(parcel);
        IBinder iBinder = null;
        float f2 = 0.0f;
        boolean bl3 = true;
        int n3 = 0;
        block7 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block7;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block7;
                }
                case 2: {
                    iBinder = a.n(parcel, n4);
                    continue block7;
                }
                case 3: {
                    bl2 = a.c(parcel, n4);
                    continue block7;
                }
                case 4: {
                    f2 = a.j(parcel, n4);
                    continue block7;
                }
                case 5: 
            }
            bl3 = a.c(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new TileOverlayOptions(n3, iBinder, bl2, f2, bl3);
    }

    public TileOverlayOptions[] a(int n2) {
        return new TileOverlayOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

