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

public class iq implements Parcelable$Creator
{
    static void a(final gv gv, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        final Set e = gv.e();
        if (e.contains(1)) {
            c.a(parcel, 1, gv.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, (Parcelable)gv.g(), n, true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, gv.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, (Parcelable)gv.i(), n, true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, gv.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, gv.k(), true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, gv.l(), true);
        }
        if (e.contains(8)) {
            c.b(parcel, 8, gv.m(), true);
        }
        if (e.contains(9)) {
            c.a(parcel, 9, gv.n());
        }
        if (e.contains(10)) {
            c.b(parcel, 10, gv.o(), true);
        }
        if (e.contains(11)) {
            c.a(parcel, 11, (Parcelable)gv.p(), n, true);
        }
        if (e.contains(12)) {
            c.b(parcel, 12, gv.q(), true);
        }
        if (e.contains(13)) {
            c.a(parcel, 13, gv.r(), true);
        }
        if (e.contains(14)) {
            c.a(parcel, 14, gv.s(), true);
        }
        if (e.contains(15)) {
            c.a(parcel, 15, (Parcelable)gv.t(), n, true);
        }
        if (e.contains(17)) {
            c.a(parcel, 17, gv.v(), true);
        }
        if (e.contains(16)) {
            c.a(parcel, 16, gv.u(), true);
        }
        if (e.contains(19)) {
            c.b(parcel, 19, gv.x(), true);
        }
        if (e.contains(18)) {
            c.a(parcel, 18, gv.w(), true);
        }
        if (e.contains(21)) {
            c.a(parcel, 21, gv.z(), true);
        }
        if (e.contains(20)) {
            c.a(parcel, 20, gv.y(), true);
        }
        if (e.contains(23)) {
            c.a(parcel, 23, gv.B(), true);
        }
        if (e.contains(22)) {
            c.a(parcel, 22, gv.A(), true);
        }
        if (e.contains(25)) {
            c.a(parcel, 25, gv.D(), true);
        }
        if (e.contains(24)) {
            c.a(parcel, 24, gv.C(), true);
        }
        if (e.contains(27)) {
            c.a(parcel, 27, gv.F(), true);
        }
        if (e.contains(26)) {
            c.a(parcel, 26, gv.E(), true);
        }
        if (e.contains(29)) {
            c.a(parcel, 29, (Parcelable)gv.H(), n, true);
        }
        if (e.contains(28)) {
            c.a(parcel, 28, gv.G(), true);
        }
        if (e.contains(31)) {
            c.a(parcel, 31, gv.J(), true);
        }
        if (e.contains(30)) {
            c.a(parcel, 30, gv.I(), true);
        }
        if (e.contains(34)) {
            c.a(parcel, 34, (Parcelable)gv.M(), n, true);
        }
        if (e.contains(32)) {
            c.a(parcel, 32, gv.K(), true);
        }
        if (e.contains(33)) {
            c.a(parcel, 33, gv.L(), true);
        }
        if (e.contains(38)) {
            c.a(parcel, 38, gv.P());
        }
        if (e.contains(39)) {
            c.a(parcel, 39, gv.Q(), true);
        }
        if (e.contains(36)) {
            c.a(parcel, 36, gv.N());
        }
        if (e.contains(37)) {
            c.a(parcel, 37, (Parcelable)gv.O(), n, true);
        }
        if (e.contains(42)) {
            c.a(parcel, 42, gv.T(), true);
        }
        if (e.contains(43)) {
            c.a(parcel, 43, gv.U(), true);
        }
        if (e.contains(40)) {
            c.a(parcel, 40, (Parcelable)gv.R(), n, true);
        }
        if (e.contains(41)) {
            c.b(parcel, 41, gv.S(), true);
        }
        if (e.contains(46)) {
            c.a(parcel, 46, (Parcelable)gv.X(), n, true);
        }
        if (e.contains(47)) {
            c.a(parcel, 47, gv.Y(), true);
        }
        if (e.contains(44)) {
            c.a(parcel, 44, gv.V(), true);
        }
        if (e.contains(45)) {
            c.a(parcel, 45, gv.W(), true);
        }
        if (e.contains(51)) {
            c.a(parcel, 51, gv.ac(), true);
        }
        if (e.contains(50)) {
            c.a(parcel, 50, (Parcelable)gv.ab(), n, true);
        }
        if (e.contains(49)) {
            c.a(parcel, 49, gv.aa(), true);
        }
        if (e.contains(48)) {
            c.a(parcel, 48, gv.Z(), true);
        }
        if (e.contains(55)) {
            c.a(parcel, 55, gv.ag(), true);
        }
        if (e.contains(54)) {
            c.a(parcel, 54, gv.af(), true);
        }
        if (e.contains(53)) {
            c.a(parcel, 53, gv.ae(), true);
        }
        if (e.contains(52)) {
            c.a(parcel, 52, gv.ad(), true);
        }
        if (e.contains(56)) {
            c.a(parcel, 56, gv.ah(), true);
        }
        c.a(parcel, a);
    }
    
    public gv a(final Parcel parcel) {
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        int g = 0;
        gv gv = null;
        List y = null;
        gv gv2 = null;
        String m = null;
        String i = null;
        String j = null;
        List c = null;
        int g2 = 0;
        List c2 = null;
        gv gv3 = null;
        List c3 = null;
        String k = null;
        String l = null;
        gv gv4 = null;
        String m2 = null;
        String m3 = null;
        String m4 = null;
        List c4 = null;
        String m5 = null;
        String m6 = null;
        String m7 = null;
        String m8 = null;
        String m9 = null;
        String m10 = null;
        String m11 = null;
        String m12 = null;
        String m13 = null;
        gv gv5 = null;
        String m14 = null;
        String m15 = null;
        String m16 = null;
        String m17 = null;
        gv gv6 = null;
        double k2 = 0.0;
        gv gv7 = null;
        double k3 = 0.0;
        String m18 = null;
        gv gv8 = null;
        List c5 = null;
        String m19 = null;
        String m20 = null;
        String m21 = null;
        String m22 = null;
        gv gv9 = null;
        String m23 = null;
        String m24 = null;
        String m25 = null;
        gv gv10 = null;
        String m26 = null;
        String m27 = null;
        String m28 = null;
        String m29 = null;
        String m30 = null;
        String m31 = null;
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
                    gv = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    gv2 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(6);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(7);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(8);
                    continue;
                }
                case 9: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(9);
                    continue;
                }
                case 10: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(10);
                    continue;
                }
                case 11: {
                    gv3 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(11);
                    continue;
                }
                case 12: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(12);
                    continue;
                }
                case 13: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(13);
                    continue;
                }
                case 14: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(14);
                    continue;
                }
                case 15: {
                    gv4 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(15);
                    continue;
                }
                case 17: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(17);
                    continue;
                }
                case 16: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(16);
                    continue;
                }
                case 19: {
                    c4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(19);
                    continue;
                }
                case 18: {
                    m4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(18);
                    continue;
                }
                case 21: {
                    m6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(21);
                    continue;
                }
                case 20: {
                    m5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(20);
                    continue;
                }
                case 23: {
                    m8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(23);
                    continue;
                }
                case 22: {
                    m7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(22);
                    continue;
                }
                case 25: {
                    m10 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(25);
                    continue;
                }
                case 24: {
                    m9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(24);
                    continue;
                }
                case 27: {
                    m12 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(27);
                    continue;
                }
                case 26: {
                    m11 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(26);
                    continue;
                }
                case 29: {
                    gv5 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(29);
                    continue;
                }
                case 28: {
                    m13 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(28);
                    continue;
                }
                case 31: {
                    m15 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(31);
                    continue;
                }
                case 30: {
                    m14 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(30);
                    continue;
                }
                case 34: {
                    gv6 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(34);
                    continue;
                }
                case 32: {
                    m16 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(32);
                    continue;
                }
                case 33: {
                    m17 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(33);
                    continue;
                }
                case 38: {
                    k3 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    set.add(38);
                    continue;
                }
                case 39: {
                    m18 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(39);
                    continue;
                }
                case 36: {
                    k2 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    set.add(36);
                    continue;
                }
                case 37: {
                    gv7 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(37);
                    continue;
                }
                case 42: {
                    m19 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(42);
                    continue;
                }
                case 43: {
                    m20 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(43);
                    continue;
                }
                case 40: {
                    gv8 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(40);
                    continue;
                }
                case 41: {
                    c5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(41);
                    continue;
                }
                case 46: {
                    gv9 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(46);
                    continue;
                }
                case 47: {
                    m23 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(47);
                    continue;
                }
                case 44: {
                    m21 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(44);
                    continue;
                }
                case 45: {
                    m22 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(45);
                    continue;
                }
                case 51: {
                    m26 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(51);
                    continue;
                }
                case 50: {
                    gv10 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(50);
                    continue;
                }
                case 49: {
                    m25 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(49);
                    continue;
                }
                case 48: {
                    m24 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(48);
                    continue;
                }
                case 55: {
                    m30 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(55);
                    continue;
                }
                case 54: {
                    m29 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(54);
                    continue;
                }
                case 53: {
                    m28 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(53);
                    continue;
                }
                case 52: {
                    m27 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(52);
                    continue;
                }
                case 56: {
                    m31 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(56);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new gv(set, g, gv, y, gv2, m, i, j, c, g2, c2, gv3, c3, k, l, gv4, m2, m3, m4, c4, m5, m6, m7, m8, m9, m10, m11, m12, m13, gv5, m14, m15, m16, m17, gv6, k2, gv7, k3, m18, gv8, c5, m19, m20, m21, m22, gv9, m23, m24, m25, gv10, m26, m27, m28, m29, m30, m31);
    }
    
    public gv[] a(final int n) {
        return new gv[n];
    }
}
