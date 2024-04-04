// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class do implements Parcelable$Creator
{
    static void a(final cb cb, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, cb.b);
        c.a(parcel, 2, cb.c, false);
        c.a(parcel, 3, cb.d, false);
        c.a(parcel, 4, cb.e, false);
        c.a(parcel, 5, cb.f);
        c.a(parcel, 6, cb.g, false);
        c.a(parcel, 7, cb.h);
        c.a(parcel, 8, cb.i);
        c.a(parcel, 9, cb.j);
        c.a(parcel, 10, cb.k, false);
        c.a(parcel, 11, cb.l);
        c.a(parcel, 12, cb.m);
        c.a(parcel, 13, cb.n, false);
        c.a(parcel, a);
    }
    
    public cb a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        String i = null;
        List y = null;
        int g2 = 0;
        List y2 = null;
        long h = 0L;
        boolean c = false;
        long h2 = 0L;
        List y3 = null;
        long h3 = 0L;
        int g3 = 0;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 5: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 6: {
                    y2 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 7: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 9: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 10: {
                    y3 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 11: {
                    h3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 12: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 13: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new cb(g, m, i, y, g2, y2, h, c, h2, y3, h3, g3, j);
    }
    
    public cb[] a(final int n) {
        return new cb[n];
    }
}
