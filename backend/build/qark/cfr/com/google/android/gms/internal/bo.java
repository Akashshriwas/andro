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
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bq;

class bo
implements bl {
    private IBinder a;

    bo(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public bp a(String object) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            parcel.writeString((String)object);
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            object = bq.a(parcel2.readStrongBinder());
            return object;
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

