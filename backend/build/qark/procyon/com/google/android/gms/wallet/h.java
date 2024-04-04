// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class h implements Parcelable$Creator
{
    static void a(final MaskedWallet maskedWallet, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, maskedWallet.a());
        c.a(parcel, 2, maskedWallet.a, false);
        c.a(parcel, 3, maskedWallet.b, false);
        c.a(parcel, 4, maskedWallet.c, false);
        c.a(parcel, 5, maskedWallet.d, false);
        c.a(parcel, 6, (Parcelable)maskedWallet.e, n, false);
        c.a(parcel, 7, (Parcelable)maskedWallet.f, n, false);
        c.a(parcel, 8, (Parcelable[])maskedWallet.g, n, false);
        c.a(parcel, 9, (Parcelable[])maskedWallet.h, n, false);
        c.a(parcel, a);
    }
    
    public MaskedWallet a(final Parcel parcel) {
        OfferWalletObject[] array = null;
        final int b = a.b(parcel);
        int g = 0;
        LoyaltyWalletObject[] array2 = null;
        Address address = null;
        Address address2 = null;
        String m = null;
        String[] x = null;
        String i = null;
        String j = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 5: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    address2 = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Address.CREATOR);
                    continue;
                }
                case 7: {
                    address = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Address.CREATOR);
                    continue;
                }
                case 8: {
                    array2 = (LoyaltyWalletObject[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, LoyaltyWalletObject.CREATOR);
                    continue;
                }
                case 9: {
                    array = (OfferWalletObject[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, OfferWalletObject.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new MaskedWallet(g, j, i, x, m, address2, address, array2, array);
    }
    
    public MaskedWallet[] a(final int n) {
        return new MaskedWallet[n];
    }
}
