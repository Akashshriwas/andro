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

public class d implements Parcelable$Creator
{
    static void a(final FullWallet fullWallet, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, fullWallet.a());
        c.a(parcel, 2, fullWallet.a, false);
        c.a(parcel, 3, fullWallet.b, false);
        c.a(parcel, 4, (Parcelable)fullWallet.c, n, false);
        c.a(parcel, 5, fullWallet.d, false);
        c.a(parcel, 6, (Parcelable)fullWallet.e, n, false);
        c.a(parcel, 7, (Parcelable)fullWallet.f, n, false);
        c.a(parcel, 8, fullWallet.g, false);
        c.a(parcel, a);
    }
    
    public FullWallet a(final Parcel parcel) {
        String[] x = null;
        final int b = a.b(parcel);
        int g = 0;
        Address address = null;
        Address address2 = null;
        String m = null;
        ProxyCard proxyCard = null;
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
                    proxyCard = (ProxyCard)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ProxyCard.CREATOR);
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
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new FullWallet(g, j, i, proxyCard, m, address2, address, x);
    }
    
    public FullWallet[] a(final int n) {
        return new FullWallet[n];
    }
}
