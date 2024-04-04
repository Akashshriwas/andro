// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class bq extends Binder implements bp
{
    public bq() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }
    
    public static bp a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (queryLocalInterface != null && queryLocalInterface instanceof bp) {
            return (bp)queryLocalInterface;
        }
        return new br(binder);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final v v = null;
        final IBinder binder = null;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                final a a = b.a(parcel.readStrongBinder());
                x a2;
                if (parcel.readInt() != 0) {
                    a2 = x.a.a(parcel);
                }
                else {
                    a2 = null;
                }
                v a3;
                if (parcel.readInt() != 0) {
                    a3 = com.google.android.gms.internal.v.a.a(parcel);
                }
                else {
                    a3 = null;
                }
                this.a(a, a2, a3, parcel.readString(), bt.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                final a a4 = this.a();
                parcel2.writeNoException();
                IBinder binder2 = binder;
                if (a4 != null) {
                    binder2 = a4.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                final a a5 = b.a(parcel.readStrongBinder());
                v a6 = v;
                if (parcel.readInt() != 0) {
                    a6 = com.google.android.gms.internal.v.a.a(parcel);
                }
                this.a(a5, a6, parcel.readString(), bt.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                this.c();
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                final a a7 = b.a(parcel.readStrongBinder());
                x a8;
                if (parcel.readInt() != 0) {
                    a8 = x.a.a(parcel);
                }
                else {
                    a8 = null;
                }
                v a9;
                if (parcel.readInt() != 0) {
                    a9 = com.google.android.gms.internal.v.a.a(parcel);
                }
                else {
                    a9 = null;
                }
                this.a(a7, a8, a9, parcel.readString(), parcel.readString(), bt.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                final a a10 = b.a(parcel.readStrongBinder());
                v a11;
                if (parcel.readInt() != 0) {
                    a11 = com.google.android.gms.internal.v.a.a(parcel);
                }
                else {
                    a11 = null;
                }
                this.a(a10, a11, parcel.readString(), parcel.readString(), bt.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
