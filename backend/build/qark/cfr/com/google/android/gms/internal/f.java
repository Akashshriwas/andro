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
import com.google.android.gms.a.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.c;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.ka;
import com.google.android.gms.internal.kb;
import com.google.android.gms.internal.l;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

public abstract class f
extends Binder
implements e {
    public f() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static e a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (iInterface != null && iInterface instanceof e) {
            return (e)iInterface;
        }
        return new g(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
        a a2 = null;
        a a3 = null;
        Object object2 = null;
        int n4 = 0;
        switch (n2) {
            default: {
                return super.onTransact(n2, (Parcel)object, parcel, n3);
            }
            case 1598968902: {
                parcel.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            }
            case 1: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a2 = this.a();
                parcel.writeNoException();
                object = object2;
                if (a2 != null) {
                    object = a2.asBinder();
                }
                parcel.writeStrongBinder((IBinder)object);
                return true;
            }
            case 2: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.b();
                parcel.writeNoException();
                return true;
            }
            case 3: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                boolean bl2 = this.c();
                parcel.writeNoException();
                n2 = bl2 ? 1 : 0;
                parcel.writeInt(n2);
                return true;
            }
            case 4: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                object2 = a2;
                if (object.readInt() != 0) {
                    object2 = v.a.a((Parcel)object);
                }
                boolean bl3 = this.a((v)object2);
                parcel.writeNoException();
                n2 = n4;
                if (bl3) {
                    n2 = 1;
                }
                parcel.writeInt(n2);
                return true;
            }
            case 5: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.d();
                parcel.writeNoException();
                return true;
            }
            case 6: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.e();
                parcel.writeNoException();
                return true;
            }
            case 7: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.a(c.a(object.readStrongBinder()));
                parcel.writeNoException();
                return true;
            }
            case 8: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.a(l.a(object.readStrongBinder()));
                parcel.writeNoException();
                return true;
            }
            case 9: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.f();
                parcel.writeNoException();
                return true;
            }
            case 10: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.g();
                parcel.writeNoException();
                return true;
            }
            case 11: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                this.h();
                parcel.writeNoException();
                return true;
            }
            case 12: {
                object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                object = this.i();
                parcel.writeNoException();
                if (object != null) {
                    parcel.writeInt(1);
                    object.writeToParcel(parcel, 1);
                    return true;
                }
                parcel.writeInt(0);
                return true;
            }
            case 13: 
        }
        object.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        object2 = a3;
        if (object.readInt() != 0) {
            object2 = x.a.a((Parcel)object);
        }
        this.a((x)object2);
        parcel.writeNoException();
        return true;
    }
}

