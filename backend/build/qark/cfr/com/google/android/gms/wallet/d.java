/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.ProxyCard;

public class d
implements Parcelable.Creator {
    static void a(FullWallet fullWallet, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, fullWallet.a());
        c.a(parcel, 2, fullWallet.a, false);
        c.a(parcel, 3, fullWallet.b, false);
        c.a(parcel, 4, fullWallet.c, n2, false);
        c.a(parcel, 5, fullWallet.d, false);
        c.a(parcel, 6, fullWallet.e, n2, false);
        c.a(parcel, 7, fullWallet.f, n2, false);
        c.a(parcel, 8, fullWallet.g, false);
        c.a(parcel, n3);
    }

    public FullWallet a(Parcel parcel) {
        String[] arrstring = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        Address address = null;
        Address address2 = null;
        String string = null;
        ProxyCard proxyCard = null;
        String string2 = null;
        String string3 = null;
        block10 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block10;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block10;
                }
                case 2: {
                    string3 = a.m(parcel, n4);
                    continue block10;
                }
                case 3: {
                    string2 = a.m(parcel, n4);
                    continue block10;
                }
                case 4: {
                    proxyCard = (ProxyCard)a.a(parcel, n4, ProxyCard.CREATOR);
                    continue block10;
                }
                case 5: {
                    string = a.m(parcel, n4);
                    continue block10;
                }
                case 6: {
                    address2 = (Address)a.a(parcel, n4, Address.CREATOR);
                    continue block10;
                }
                case 7: {
                    address = (Address)a.a(parcel, n4, Address.CREATOR);
                    continue block10;
                }
                case 8: 
            }
            arrstring = a.x(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new FullWallet(n3, string3, string2, proxyCard, string, address2, address, arrstring);
    }

    public FullWallet[] a(int n2) {
        return new FullWallet[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

