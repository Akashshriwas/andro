// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.IBinder;

class dr implements dp
{
    private IBinder a;
    
    dr(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public cb a(final bz bz) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (bz != null) {
                    obtain.writeInt(1);
                    bz.writeToParcel(obtain, 0);
                }
                else {
                    obtain.writeInt(0);
                }
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    return cb.a.a(obtain2);
                }
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
            return null;
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
}
