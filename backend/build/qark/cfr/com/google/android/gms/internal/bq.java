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
import com.google.android.gms.a.b;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.br;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.ka;
import com.google.android.gms.internal.kb;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

public abstract class bq
extends Binder
implements bp {
    public bq() {
        this.attachInterface((IInterface)this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static bp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iInterface != null && iInterface instanceof bp) {
            return (bp)iInterface;
        }
        return new br(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
        Object object2 = null;
        Object object3 = null;
        switch (n2) {
            default: {
                return super.onTransact(n2, (Parcel)object, parcel, n3);
            }
            case 1598968902: {
                parcel.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            }
            case 1: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a a2 = b.a(object.readStrongBinder());
                object3 = object.readInt() != 0 ? x.a.a((Parcel)object) : null;
                object2 = object.readInt() != 0 ? v.a.a((Parcel)object) : null;
                this.a(a2, (x)object3, (v)object2, object.readString(), bt.a(object.readStrongBinder()));
                parcel.writeNoException();
                return true;
            }
            case 2: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                object2 = this.a();
                parcel.writeNoException();
                object = object3;
                if (object2 != null) {
                    object = object2.asBinder();
                }
                parcel.writeStrongBinder((IBinder)object);
                return true;
            }
            case 3: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a a3 = b.a(object.readStrongBinder());
                object3 = object2;
                if (object.readInt() != 0) {
                    object3 = v.a.a((Parcel)object);
                }
                this.a(a3, (v)object3, object.readString(), bt.a(object.readStrongBinder()));
                parcel.writeNoException();
                return true;
            }
            case 4: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                this.b();
                parcel.writeNoException();
                return true;
            }
            case 5: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                this.c();
                parcel.writeNoException();
                return true;
            }
            case 6: {
                object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a a4 = b.a(object.readStrongBinder());
                object3 = object.readInt() != 0 ? x.a.a((Parcel)object) : null;
                object2 = object.readInt() != 0 ? v.a.a((Parcel)object) : null;
                this.a(a4, (x)object3, (v)object2, object.readString(), object.readString(), bt.a(object.readStrongBinder()));
                parcel.writeNoException();
                return true;
            }
            case 7: 
        }
        object.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        object2 = b.a(object.readStrongBinder());
        object3 = object.readInt() != 0 ? v.a.a((Parcel)object) : null;
        this.a((a)object2, (v)object3, object.readString(), object.readString(), bt.a(object.readStrongBinder()));
        parcel.writeNoException();
        return true;
    }
}

