// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class gt extends Binder implements gr
{
    public static gr a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (queryLocalInterface != null && queryLocalInterface instanceof gr) {
            return (gr)queryLocalInterface;
        }
        return new gu(binder);
    }
    
    public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final Bundle bundle = null;
        final Bundle bundle2 = null;
        final Bundle bundle3 = null;
        final Bundle bundle4 = null;
        final Bundle bundle5 = null;
        final Bundle bundle6 = null;
        final Bundle bundle7 = null;
        final Bundle bundle8 = null;
        final Bundle bundle9 = null;
        final Bundle bundle10 = null;
        final Bundle bundle11 = null;
        final Bundle bundle12 = null;
        Bundle bundle13 = null;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                final String[] stringArray = parcel.createStringArray();
                final String string3 = parcel.readString();
                Bundle bundle14;
                if (parcel.readInt() != 0) {
                    bundle14 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle14 = null;
                }
                this.a(a, n, string, string2, stringArray, string3, bundle14);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a2 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle13 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.a(a2, n, string4, bundle13);
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
                final go a3 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string5 = parcel.readString();
                Bundle bundle15 = bundle;
                if (parcel.readInt() != 0) {
                    bundle15 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b(a3, n, string5, bundle15);
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a4 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string6 = parcel.readString();
                Bundle bundle16 = bundle2;
                if (parcel.readInt() != 0) {
                    bundle16 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.c(a4, n, string6, bundle16);
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a5 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string7 = parcel.readString();
                Bundle bundle17 = bundle3;
                if (parcel.readInt() != 0) {
                    bundle17 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.d(a5, n, string7, bundle17);
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a6 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string8 = parcel.readString();
                Bundle bundle18 = bundle4;
                if (parcel.readInt() != 0) {
                    bundle18 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.e(a6, n, string8, bundle18);
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a7 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string9 = parcel.readString();
                final String string10 = parcel.readString();
                final String[] stringArray2 = parcel.createStringArray();
                final String string11 = parcel.readString();
                final IBinder strongBinder = parcel.readStrongBinder();
                final String string12 = parcel.readString();
                Bundle bundle19;
                if (parcel.readInt() != 0) {
                    bundle19 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle19 = null;
                }
                this.a(a7, n, string9, string10, stringArray2, string11, strongBinder, string12, bundle19);
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
                final go a8 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string13 = parcel.readString();
                Bundle bundle20 = bundle5;
                if (parcel.readInt() != 0) {
                    bundle20 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.f(a8, n, string13, bundle20);
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a9 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string14 = parcel.readString();
                Bundle bundle21 = bundle6;
                if (parcel.readInt() != 0) {
                    bundle21 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.g(a9, n, string14, bundle21);
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a10 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string15 = parcel.readString();
                Bundle bundle22 = bundle7;
                if (parcel.readInt() != 0) {
                    bundle22 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.h(a10, n, string15, bundle22);
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a11 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string16 = parcel.readString();
                Bundle bundle23 = bundle8;
                if (parcel.readInt() != 0) {
                    bundle23 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.i(a11, n, string16, bundle23);
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a12 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string17 = parcel.readString();
                Bundle bundle24 = bundle9;
                if (parcel.readInt() != 0) {
                    bundle24 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.j(a12, n, string17, bundle24);
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a13 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string18 = parcel.readString();
                Bundle bundle25 = bundle10;
                if (parcel.readInt() != 0) {
                    bundle25 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.k(a13, n, string18, bundle25);
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a14 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string19 = parcel.readString();
                Bundle bundle26 = bundle11;
                if (parcel.readInt() != 0) {
                    bundle26 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.l(a14, n, string19, bundle26);
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a15 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string20 = parcel.readString();
                Bundle bundle27 = bundle12;
                if (parcel.readInt() != 0) {
                    bundle27 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.m(a15, n, string20, bundle27);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a16 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string21 = parcel.readString();
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Bundle bundle28;
                if (parcel.readInt() != 0) {
                    bundle28 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle28 = null;
                }
                this.a(a16, n, string21, strongBinder2, bundle28);
                parcel2.writeNoException();
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                final go a17 = gp.a(parcel.readStrongBinder());
                n = parcel.readInt();
                final String string22 = parcel.readString();
                final String[] stringArray3 = parcel.createStringArray();
                final String string23 = parcel.readString();
                Bundle bundle29;
                if (parcel.readInt() != 0) {
                    bundle29 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle29 = null;
                }
                this.a(a17, n, string22, stringArray3, string23, bundle29);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
