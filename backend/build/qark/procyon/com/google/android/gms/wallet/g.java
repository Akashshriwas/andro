// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class g implements Parcelable$Creator
{
    static void a(final LoyaltyWalletObject loyaltyWalletObject, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, loyaltyWalletObject.a());
        c.a(parcel, 2, loyaltyWalletObject.a, false);
        c.a(parcel, 3, loyaltyWalletObject.b, false);
        c.a(parcel, 4, loyaltyWalletObject.c, false);
        c.a(parcel, 5, loyaltyWalletObject.d, false);
        c.a(parcel, 6, loyaltyWalletObject.e, false);
        c.a(parcel, 7, loyaltyWalletObject.f, false);
        c.a(parcel, 8, loyaltyWalletObject.g, false);
        c.a(parcel, 9, loyaltyWalletObject.h, false);
        c.a(parcel, a);
    }
    
    public LoyaltyWalletObject a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        String i = null;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
        String m3 = null;
        String m4 = null;
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
                    m4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new LoyaltyWalletObject(g, m4, m3, m2, l, k, j, i, m);
    }
    
    public LoyaltyWalletObject[] a(final int n) {
        return new LoyaltyWalletObject[n];
    }
}
