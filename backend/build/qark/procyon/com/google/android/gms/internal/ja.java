// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Set;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ja implements Parcelable$Creator
{
    static void a(final ha$f ha$f, final Parcel parcel, int a) {
        a = c.a(parcel);
        final Set e = ha$f.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$f.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ha$f.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, ha$f.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha$f.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, ha$f.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, ha$f.k(), true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, ha$f.l());
        }
        if (e.contains(8)) {
            c.a(parcel, 8, ha$f.m(), true);
        }
        if (e.contains(9)) {
            c.a(parcel, 9, ha$f.n(), true);
        }
        if (e.contains(10)) {
            c.a(parcel, 10, ha$f.o());
        }
        c.a(parcel, a);
    }
    
    public ha$f a(final Parcel parcel) {
        int g = 0;
        String m = null;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        String i = null;
        boolean c = false;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
        String m3 = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(1);
                    continue;
                }
                case 2: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(6);
                    continue;
                }
                case 7: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    set.add(7);
                    continue;
                }
                case 8: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(8);
                    continue;
                }
                case 9: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(9);
                    continue;
                }
                case 10: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(10);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$f(set, g2, m3, m2, l, k, j, c, i, m, g);
    }
    
    public ha$f[] a(final int n) {
        return new ha$f[n];
    }
}
