/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gu;

public abstract class gt
extends Binder
implements gr {
    public static gr a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iInterface != null && iInterface instanceof gr) {
            return (gr)iInterface;
        }
        return new gu(iBinder);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTransact(int n2, Parcel parcel, Parcel parcel2, int n3) {
        Object object = null;
        String[] arrstring = null;
        Object object2 = null;
        String string = null;
        IBinder iBinder = null;
        String string2 = null;
        Object var12_11 = null;
        Object var13_12 = null;
        Object var14_13 = null;
        Object var15_14 = null;
        Object var16_15 = null;
        Object var17_16 = null;
        Object object3 = null;
        switch (n2) {
            default: {
                return super.onTransact(n2, parcel, parcel2, n3);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object3 = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                object = parcel.readString();
                arrstring = parcel.readString();
                object2 = parcel.createStringArray();
                string = parcel.readString();
                parcel = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
                this.a((go)object3, n2, (String)object, (String)arrstring, (String[])object2, string, (Bundle)parcel);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.a((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                this.a(gp.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                this.a(gp.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                arrstring = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                object2 = parcel.readString();
                object3 = object;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b((go)arrstring, n2, (String)object2, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                object2 = parcel.readString();
                object3 = arrstring;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.c((go)object, n2, (String)object2, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = object2;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.d((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = string;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.e((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object3 = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                object = parcel.readString();
                arrstring = parcel.readString();
                object2 = parcel.createStringArray();
                string = parcel.readString();
                iBinder = parcel.readStrongBinder();
                string2 = parcel.readString();
                parcel = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
                this.a((go)object3, n2, (String)object, (String)arrstring, (String[])object2, string, iBinder, string2, (Bundle)parcel);
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                this.a(gp.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = iBinder;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.f((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = string2;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.g((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var12_11;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.h((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var13_12;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.i((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var14_13;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.j((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var15_14;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.k((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var16_15;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.l((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                arrstring = parcel.readString();
                object3 = var17_16;
                if (parcel.readInt() != 0) {
                    object3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.m((go)object, n2, (String)arrstring, (Bundle)object3);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                object3 = gp.a(parcel.readStrongBinder());
                n2 = parcel.readInt();
                object = parcel.readString();
                arrstring = parcel.readStrongBinder();
                parcel = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
                this.a((go)object3, n2, (String)object, (IBinder)arrstring, (Bundle)parcel);
                parcel2.writeNoException();
                return true;
            }
            case 20: 
        }
        parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        object3 = gp.a(parcel.readStrongBinder());
        n2 = parcel.readInt();
        object = parcel.readString();
        arrstring = parcel.createStringArray();
        object2 = parcel.readString();
        parcel = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
        this.a((go)object3, n2, (String)object, arrstring, (String)object2, (Bundle)parcel);
        parcel2.writeNoException();
        return true;
    }
}

