// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.a.a;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class f extends Binder implements e
{
    public f() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.client.IAdManager");
    }
    
    public static e a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface != null && queryLocalInterface instanceof e) {
            return (e)queryLocalInterface;
        }
        return new g(binder);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final v v = null;
        final x x = null;
        final IBinder binder = null;
        final int n3 = 0;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                final a a = this.a();
                parcel2.writeNoException();
                IBinder binder2 = binder;
                if (a != null) {
                    binder2 = a.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                final boolean c = this.c();
                parcel2.writeNoException();
                if (c) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                parcel2.writeInt(n);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                v a2 = v;
                if (parcel.readInt() != 0) {
                    a2 = com.google.android.gms.internal.v.a.a(parcel);
                }
                final boolean a3 = this.a(a2);
                parcel2.writeNoException();
                n = n3;
                if (a3) {
                    n = 1;
                }
                parcel2.writeInt(n);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.d();
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.e();
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.a(c.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.f();
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.g();
                parcel2.writeNoException();
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.h();
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                final x i = this.i();
                parcel2.writeNoException();
                if (i != null) {
                    parcel2.writeInt(1);
                    i.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                x a4 = x;
                if (parcel.readInt() != 0) {
                    a4 = com.google.android.gms.internal.x.a.a(parcel);
                }
                this.a(a4);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
