// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ib implements Parcelable$Creator
{
    static void a(final fn fn, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, fn.f(), false);
        c.a(parcel, 1000, fn.a());
        c.a(parcel, 2, fn.g());
        c.a(parcel, 3, fn.b());
        c.a(parcel, 4, fn.c());
        c.a(parcel, 5, fn.d());
        c.a(parcel, 6, fn.e());
        c.a(parcel, 7, fn.h());
        c.a(parcel, 8, fn.i());
        c.a(parcel, 9, fn.j());
        c.a(parcel, a);
    }
    
    public fn a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        int g2 = 0;
        short f = 0;
        double k = 0.0;
        double i = 0.0;
        float j = 0.0f;
        long h = 0L;
        int g3 = 0;
        int g4 = -1;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 4: {
                    k = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 6: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 7: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 8: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 9: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new fn(g, m, g2, f, k, i, j, h, g3, g4);
    }
    
    public fn[] a(final int n) {
        return new fn[n];
    }
}
