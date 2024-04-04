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
import com.google.android.gms.internal.jq;
import com.google.android.gms.internal.js;

public abstract class jr
extends Binder
implements jq {
    public static jq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iInterface != null && iInterface instanceof jq) {
            return (jq)iInterface;
        }
        return new js(iBinder);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
        boolean bl2 = false;
        int n4 = 0;
        switch (n2) {
            default: {
                return super.onTransact(n2, (Parcel)object, parcel, n3);
            }
            case 1598968902: {
                parcel.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return true;
            }
            case 1: {
                object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                object = this.a();
                parcel.writeNoException();
                parcel.writeString((String)object);
                return true;
            }
            case 2: {
                object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                bl2 = object.readInt() != 0;
                bl2 = this.a(bl2);
                parcel.writeNoException();
                n2 = n4;
                if (bl2) {
                    n2 = 1;
                }
                parcel.writeInt(n2);
                return true;
            }
            case 3: {
                object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                object = this.a(object.readString());
                parcel.writeNoException();
                parcel.writeString((String)object);
                return true;
            }
            case 4: 
        }
        object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        String string = object.readString();
        if (object.readInt() != 0) {
            bl2 = true;
        }
        this.a(string, bl2);
        parcel.writeNoException();
        return true;
    }
}

