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
import com.google.android.gms.a.b;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

class br
implements bp {
    private IBinder a;

    br(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public a a() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.a.transact(2, parcel, parcel2, 0);
            parcel2.readException();
            a a2 = b.a(parcel2.readStrongBinder());
            return a2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a a2, v v2, String string, bs bs2) {
        Object var5_6 = null;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a2 = a2 != null ? a2.asBinder() : null;
            parcel.writeStrongBinder((IBinder)a2);
            if (v2 != null) {
                parcel.writeInt(1);
                v2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(string);
            a2 = var5_6;
            if (bs2 != null) {
                a2 = bs2.asBinder();
            }
            parcel.writeStrongBinder((IBinder)a2);
            this.a.transact(3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a a2, v v2, String string, String string2, bs bs2) {
        Object var6_7 = null;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a2 = a2 != null ? a2.asBinder() : null;
            parcel.writeStrongBinder((IBinder)a2);
            if (v2 != null) {
                parcel.writeInt(1);
                v2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(string);
            parcel.writeString(string2);
            a2 = var6_7;
            if (bs2 != null) {
                a2 = bs2.asBinder();
            }
            parcel.writeStrongBinder((IBinder)a2);
            this.a.transact(7, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a a2, x x2, v v2, String string, bs bs2) {
        Object var6_7 = null;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a2 = a2 != null ? a2.asBinder() : null;
            parcel.writeStrongBinder((IBinder)a2);
            if (x2 != null) {
                parcel.writeInt(1);
                x2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            if (v2 != null) {
                parcel.writeInt(1);
                v2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(string);
            a2 = var6_7;
            if (bs2 != null) {
                a2 = bs2.asBinder();
            }
            parcel.writeStrongBinder((IBinder)a2);
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a a2, x x2, v v2, String string, String string2, bs bs2) {
        Object var7_8 = null;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a2 = a2 != null ? a2.asBinder() : null;
            parcel.writeStrongBinder((IBinder)a2);
            if (x2 != null) {
                parcel.writeInt(1);
                x2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            if (v2 != null) {
                parcel.writeInt(1);
                v2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(string);
            parcel.writeString(string2);
            a2 = var7_8;
            if (bs2 != null) {
                a2 = bs2.asBinder();
            }
            parcel.writeStrongBinder((IBinder)a2);
            this.a.transact(6, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    @Override
    public void b() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.a.transact(4, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public void c() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.a.transact(5, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }
}

