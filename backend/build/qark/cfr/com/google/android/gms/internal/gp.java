/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gq;

public abstract class gp
extends Binder
implements go {
    public gp() {
        this.attachInterface((IInterface)this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public static go a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if (iInterface != null && iInterface instanceof go) {
            return (go)iInterface;
        }
        return new gq(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel parcel, Parcel parcel2, int n3) {
        switch (n2) {
            default: {
                return super.onTransact(n2, parcel, parcel2, n3);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                return true;
            }
            case 1: 
        }
        parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        n2 = parcel.readInt();
        IBinder iBinder = parcel.readStrongBinder();
        parcel = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
        this.a(n2, iBinder, (Bundle)parcel);
        parcel2.writeNoException();
        return true;
    }
}

