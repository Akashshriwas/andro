// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.IBinder;

class bo implements bl
{
    private IBinder a;
    
    bo(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public bp a(final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            obtain.writeString(s);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return bq.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
}
