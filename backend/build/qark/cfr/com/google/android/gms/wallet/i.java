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
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class i
implements Parcelable.Creator {
    static void a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, maskedWalletRequest.a());
        c.a(parcel, 2, maskedWalletRequest.a, false);
        c.a(parcel, 3, maskedWalletRequest.b);
        c.a(parcel, 4, maskedWalletRequest.c);
        c.a(parcel, 5, maskedWalletRequest.d);
        c.a(parcel, 6, maskedWalletRequest.e, false);
        c.a(parcel, 7, maskedWalletRequest.f, false);
        c.a(parcel, 8, maskedWalletRequest.g, false);
        c.a(parcel, 9, maskedWalletRequest.h, n2, false);
        c.a(parcel, 10, maskedWalletRequest.i);
        c.a(parcel, 11, maskedWalletRequest.j);
        c.a(parcel, 12, maskedWalletRequest.k, n2, false);
        c.a(parcel, 13, maskedWalletRequest.l);
        c.a(parcel, 14, maskedWalletRequest.m);
        c.a(parcel, n3);
    }

    public MaskedWalletRequest a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        Cart cart = null;
        boolean bl5 = false;
        boolean bl6 = false;
        CountrySpecification[] arrcountrySpecification = null;
        boolean bl7 = true;
        boolean bl8 = true;
        block16 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block16;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block16;
                }
                case 2: {
                    string = a.m(parcel, n4);
                    continue block16;
                }
                case 3: {
                    bl2 = a.c(parcel, n4);
                    continue block16;
                }
                case 4: {
                    bl3 = a.c(parcel, n4);
                    continue block16;
                }
                case 5: {
                    bl4 = a.c(parcel, n4);
                    continue block16;
                }
                case 6: {
                    string2 = a.m(parcel, n4);
                    continue block16;
                }
                case 7: {
                    string3 = a.m(parcel, n4);
                    continue block16;
                }
                case 8: {
                    string4 = a.m(parcel, n4);
                    continue block16;
                }
                case 9: {
                    cart = (Cart)a.a(parcel, n4, Cart.CREATOR);
                    continue block16;
                }
                case 10: {
                    bl5 = a.c(parcel, n4);
                    continue block16;
                }
                case 11: {
                    bl6 = a.c(parcel, n4);
                    continue block16;
                }
                case 12: {
                    arrcountrySpecification = (CountrySpecification[])a.b(parcel, n4, CountrySpecification.CREATOR);
                    continue block16;
                }
                case 13: {
                    bl7 = a.c(parcel, n4);
                    continue block16;
                }
                case 14: 
            }
            bl8 = a.c(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new MaskedWalletRequest(n3, string, bl2, bl3, bl4, string2, string3, string4, cart, bl5, bl6, arrcountrySpecification, bl7, bl8);
    }

    public MaskedWalletRequest[] a(int n2) {
        return new MaskedWalletRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

