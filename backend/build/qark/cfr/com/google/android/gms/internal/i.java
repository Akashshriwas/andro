/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.h;
import com.google.android.gms.internal.j;
import com.google.android.gms.internal.kb;
import com.google.android.gms.internal.x;

public abstract class i
extends Binder
implements h {
    public static h a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iInterface != null && iInterface instanceof h) {
            return (h)iInterface;
        }
        return new j(iBinder);
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
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            }
            case 1: 
        }
        parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        a a2 = b.a(parcel.readStrongBinder());
        x x2 = parcel.readInt() != 0 ? x.a.a(parcel) : null;
        parcel = this.a(a2, x2, parcel.readString(), bn.a(parcel.readStrongBinder()), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeStrongBinder((IBinder)parcel);
        return true;
    }
}

