// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class i extends Binder implements h
{
    public static h a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface != null && queryLocalInterface instanceof h) {
            return (h)queryLocalInterface;
        }
        return new j(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                final a a = b.a(parcel.readStrongBinder());
                x a2;
                if (parcel.readInt() != 0) {
                    a2 = x.a.a(parcel);
                }
                else {
                    a2 = null;
                }
                final IBinder a3 = this.a(a, a2, parcel.readString(), bn.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a3);
                return true;
            }
        }
    }
}
