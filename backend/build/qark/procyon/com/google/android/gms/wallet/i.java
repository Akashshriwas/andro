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

public class i implements Parcelable$Creator
{
    static void a(final MaskedWalletRequest maskedWalletRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, maskedWalletRequest.a());
        c.a(parcel, 2, maskedWalletRequest.a, false);
        c.a(parcel, 3, maskedWalletRequest.b);
        c.a(parcel, 4, maskedWalletRequest.c);
        c.a(parcel, 5, maskedWalletRequest.d);
        c.a(parcel, 6, maskedWalletRequest.e, false);
        c.a(parcel, 7, maskedWalletRequest.f, false);
        c.a(parcel, 8, maskedWalletRequest.g, false);
        c.a(parcel, 9, (Parcelable)maskedWalletRequest.h, n, false);
        c.a(parcel, 10, maskedWalletRequest.i);
        c.a(parcel, 11, maskedWalletRequest.j);
        c.a(parcel, 12, (Parcelable[])maskedWalletRequest.k, n, false);
        c.a(parcel, 13, maskedWalletRequest.l);
        c.a(parcel, 14, maskedWalletRequest.m);
        c.a(parcel, a);
    }
    
    public MaskedWalletRequest a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        boolean c = false;
        boolean c2 = false;
        boolean c3 = false;
        String i = null;
        String j = null;
        String k = null;
        Cart cart = null;
        boolean c4 = false;
        boolean c5 = false;
        CountrySpecification[] array = null;
        boolean c6 = true;
        boolean c7 = true;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 5: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    cart = (Cart)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Cart.CREATOR);
                    continue;
                }
                case 10: {
                    c4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 11: {
                    c5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 12: {
                    array = (CountrySpecification[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, CountrySpecification.CREATOR);
                    continue;
                }
                case 13: {
                    c6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 14: {
                    c7 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new MaskedWalletRequest(g, m, c, c2, c3, i, j, k, cart, c4, c5, array, c6, c7);
    }
    
    public MaskedWalletRequest[] a(final int n) {
        return new MaskedWalletRequest[n];
    }
}
