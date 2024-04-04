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
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;

public class h
implements Parcelable.Creator {
    static void a(MaskedWallet maskedWallet, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, maskedWallet.a());
        c.a(parcel, 2, maskedWallet.a, false);
        c.a(parcel, 3, maskedWallet.b, false);
        c.a(parcel, 4, maskedWallet.c, false);
        c.a(parcel, 5, maskedWallet.d, false);
        c.a(parcel, 6, maskedWallet.e, n2, false);
        c.a(parcel, 7, maskedWallet.f, n2, false);
        c.a(parcel, 8, maskedWallet.g, n2, false);
        c.a(parcel, 9, maskedWallet.h, n2, false);
        c.a(parcel, n3);
    }

    public MaskedWallet a(Parcel parcel) {
        OfferWalletObject[] arrofferWalletObject = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        LoyaltyWalletObject[] arrloyaltyWalletObject = null;
        Address address = null;
        Address address2 = null;
        String string = null;
        String[] arrstring = null;
        String string2 = null;
        String string3 = null;
        block11 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block11;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block11;
                }
                case 2: {
                    string3 = a.m(parcel, n4);
                    continue block11;
                }
                case 3: {
                    string2 = a.m(parcel, n4);
                    continue block11;
                }
                case 4: {
                    arrstring = a.x(parcel, n4);
                    continue block11;
                }
                case 5: {
                    string = a.m(parcel, n4);
                    continue block11;
                }
                case 6: {
                    address2 = (Address)a.a(parcel, n4, Address.CREATOR);
                    continue block11;
                }
                case 7: {
                    address = (Address)a.a(parcel, n4, Address.CREATOR);
                    continue block11;
                }
                case 8: {
                    arrloyaltyWalletObject = (LoyaltyWalletObject[])a.b(parcel, n4, LoyaltyWalletObject.CREATOR);
                    continue block11;
                }
                case 9: 
            }
            arrofferWalletObject = (OfferWalletObject[])a.b(parcel, n4, OfferWalletObject.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new MaskedWallet(n3, string3, string2, arrstring, string, address2, address, arrloyaltyWalletObject, arrofferWalletObject);
    }

    public MaskedWallet[] a(int n2) {
        return new MaskedWallet[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

