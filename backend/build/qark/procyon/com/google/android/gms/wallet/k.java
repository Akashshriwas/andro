// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class k implements Parcelable$Creator
{
    static void a(final OfferWalletObject offerWalletObject, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, offerWalletObject.a());
        c.a(parcel, 2, offerWalletObject.a, false);
        c.a(parcel, 3, offerWalletObject.b, false);
        c.a(parcel, a);
    }
    
    public OfferWalletObject a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        String i = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new OfferWalletObject(g, i, m);
    }
    
    public OfferWalletObject[] a(final int n) {
        return new OfferWalletObject[n];
    }
}