/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.c;

public abstract class b
extends Binder
implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (iInterface != null && iInterface instanceof a) {
            return (a)iInterface;
        }
        return new c(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
        switch (n2) {
            default: {
                return super.onTransact(n2, (Parcel)object, parcel, n3);
            }
            case 1598968902: {
                parcel.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                return true;
            }
            case 1: 
        }
        object.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        object = this.a(object.readInt(), object.readInt(), object.readInt());
        parcel.writeNoException();
        if (object != null) {
            parcel.writeInt(1);
            object.writeToParcel(parcel, 1);
            return true;
        }
        parcel.writeInt(0);
        return true;
    }
}

