// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Set;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class it implements Parcelable$Creator
{
    static void a(final ha ha, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        final Set e = ha.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ha.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, (Parcelable)ha.h(), n, true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, ha.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, ha.k());
        }
        if (e.contains(7)) {
            c.a(parcel, 7, (Parcelable)ha.l(), n, true);
        }
        if (e.contains(8)) {
            c.a(parcel, 8, ha.m(), true);
        }
        if (e.contains(9)) {
            c.a(parcel, 9, ha.n(), true);
        }
        if (e.contains(12)) {
            c.a(parcel, 12, ha.o());
        }
        if (e.contains(14)) {
            c.a(parcel, 14, ha.p(), true);
        }
        if (e.contains(15)) {
            c.a(parcel, 15, (Parcelable)ha.q(), n, true);
        }
        if (e.contains(16)) {
            c.a(parcel, 16, ha.r());
        }
        if (e.contains(19)) {
            c.a(parcel, 19, (Parcelable)ha.t(), n, true);
        }
        if (e.contains(18)) {
            c.a(parcel, 18, ha.s(), true);
        }
        if (e.contains(21)) {
            c.a(parcel, 21, ha.v());
        }
        if (e.contains(20)) {
            c.a(parcel, 20, ha.u(), true);
        }
        if (e.contains(23)) {
            c.b(parcel, 23, ha.x(), true);
        }
        if (e.contains(22)) {
            c.b(parcel, 22, ha.w(), true);
        }
        if (e.contains(25)) {
            c.a(parcel, 25, ha.z());
        }
        if (e.contains(24)) {
            c.a(parcel, 24, ha.y());
        }
        if (e.contains(27)) {
            c.a(parcel, 27, ha.B(), true);
        }
        if (e.contains(26)) {
            c.a(parcel, 26, ha.A(), true);
        }
        if (e.contains(29)) {
            c.a(parcel, 29, ha.D());
        }
        if (e.contains(28)) {
            c.b(parcel, 28, ha.C(), true);
        }
        c.a(parcel, a);
    }
    
    public ha a(final Parcel parcel) {
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        int g = 0;
        String m = null;
        ha$a ha$a = null;
        String i = null;
        String j = null;
        int g2 = 0;
        ha$b ha$b = null;
        String k = null;
        String l = null;
        int g3 = 0;
        String m2 = null;
        ha$c ha$c = null;
        boolean c = false;
        String m3 = null;
        ha$d ha$d = null;
        String m4 = null;
        int g4 = 0;
        List c2 = null;
        List c3 = null;
        int g5 = 0;
        int g6 = 0;
        String m5 = null;
        String m6 = null;
        List c4 = null;
        boolean c5 = false;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(1);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    ha$a = (ha$a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$a.a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(6);
                    continue;
                }
                case 7: {
                    ha$b = (ha$b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$b.a);
                    set.add(7);
                    continue;
                }
                case 8: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(8);
                    continue;
                }
                case 9: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(9);
                    continue;
                }
                case 12: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(12);
                    continue;
                }
                case 14: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(14);
                    continue;
                }
                case 15: {
                    ha$c = (ha$c)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$c.a);
                    set.add(15);
                    continue;
                }
                case 16: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    set.add(16);
                    continue;
                }
                case 19: {
                    ha$d = (ha$d)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$d.a);
                    set.add(19);
                    continue;
                }
                case 18: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(18);
                    continue;
                }
                case 21: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(21);
                    continue;
                }
                case 20: {
                    m4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(20);
                    continue;
                }
                case 23: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)ha$g.a);
                    set.add(23);
                    continue;
                }
                case 22: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)ha$f.a);
                    set.add(22);
                    continue;
                }
                case 25: {
                    g6 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(25);
                    continue;
                }
                case 24: {
                    g5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(24);
                    continue;
                }
                case 27: {
                    m6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(27);
                    continue;
                }
                case 26: {
                    m5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(26);
                    continue;
                }
                case 29: {
                    c5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    set.add(29);
                    continue;
                }
                case 28: {
                    c4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)ha$h.a);
                    set.add(28);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha(set, g, m, ha$a, i, j, g2, ha$b, k, l, g3, m2, ha$c, c, m3, ha$d, m4, g4, c2, c3, g5, g6, m5, m6, c4, c5);
    }
    
    public ha[] a(final int n) {
        return new ha[n];
    }
}
