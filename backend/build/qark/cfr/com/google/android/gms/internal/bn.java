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
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bo;
import com.google.android.gms.internal.bp;

public abstract class bn
extends Binder
implements bl {
    public bn() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static bl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (iInterface != null && iInterface instanceof bl) {
            return (bl)iInterface;
        }
        return new bo(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
        switch (n2) {
            default: {
                return super.onTransact(n2, (Parcel)object, parcel, n3);
            }
            case 1598968902: {
                parcel.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                return true;
            }
            case 1: 
        }
        object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        object = this.a(object.readString());
        parcel.writeNoException();
        object = object != null ? object.asBinder() : null;
        parcel.writeStrongBinder((IBinder)object);
        return true;
    }
}

