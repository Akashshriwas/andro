/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.j;

class c
implements a {
    private IBinder a;

    c(IBinder iBinder) {
        this.a = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Tile a(int n2, int n3, int n4) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            parcel.writeInt(n2);
            parcel.writeInt(n3);
            parcel.writeInt(n4);
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            Tile tile = parcel2.readInt() != 0 ? Tile.a.a(parcel2) : null;
            return tile;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}

