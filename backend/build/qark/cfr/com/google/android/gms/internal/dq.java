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
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.dr;

public abstract class dq
extends Binder
implements dp {
    public dq() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static dp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (iInterface != null && iInterface instanceof dp) {
            return (dp)iInterface;
        }
        return new dr(iBinder);
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
                parcel.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;
            }
            case 1: 
        }
        object.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        object = object.readInt() != 0 ? bz.a.a((Parcel)object) : null;
        object = this.a((bz)object);
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

