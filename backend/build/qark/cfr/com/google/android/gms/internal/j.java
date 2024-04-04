/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.h;
import com.google.android.gms.internal.x;

class j
implements h {
    private IBinder a;

    j(IBinder iBinder) {
        this.a = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public IBinder a(a a2, x x2, String string, bl bl2, int n2) {
        Object var6_7 = null;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            a2 = a2 != null ? a2.asBinder() : null;
            parcel.writeStrongBinder((IBinder)a2);
            if (x2 != null) {
                parcel.writeInt(1);
                x2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(string);
            a2 = var6_7;
            if (bl2 != null) {
                a2 = bl2.asBinder();
            }
            parcel.writeStrongBinder((IBinder)a2);
            parcel.writeInt(n2);
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            a2 = parcel2.readStrongBinder();
            return a2;
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

