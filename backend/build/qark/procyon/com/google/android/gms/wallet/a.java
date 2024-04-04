// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a implements Parcelable$Creator
{
    static void a(final Address address, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, address.a());
        c.a(parcel, 2, address.a, false);
        c.a(parcel, 3, address.b, false);
        c.a(parcel, 4, address.c, false);
        c.a(parcel, 5, address.d, false);
        c.a(parcel, 6, address.e, false);
        c.a(parcel, 7, address.f, false);
        c.a(parcel, 8, address.g, false);
        c.a(parcel, 9, address.h, false);
        c.a(parcel, 10, address.i, false);
        c.a(parcel, 11, address.j);
        c.a(parcel, 12, address.k, false);
        c.a(parcel, a);
    }
    
    public Address a(final Parcel parcel) {
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int g = 0;
        String m = null;
        String i = null;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
        String m3 = null;
        String m4 = null;
        String m5 = null;
        boolean c = false;
        String m6 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    m4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 10: {
                    m5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 11: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 12: {
                    m6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new Address(g, m, i, j, k, l, m2, m3, m4, m5, c, m6);
    }
    
    public Address[] a(final int n) {
        return new Address[n];
    }
}
