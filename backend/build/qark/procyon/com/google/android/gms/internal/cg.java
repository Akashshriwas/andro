// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cg implements Parcelable$Creator
{
    static void a(final bm bm, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, bm.b);
        c.a(parcel, 2, (Parcelable)bm.c, n, false);
        c.a(parcel, 3, bm.a(), false);
        c.a(parcel, 4, bm.b(), false);
        c.a(parcel, 5, bm.c(), false);
        c.a(parcel, 6, bm.d(), false);
        c.a(parcel, 7, bm.h, false);
        c.a(parcel, 8, bm.i);
        c.a(parcel, 9, bm.j, false);
        c.a(parcel, 10, bm.e(), false);
        c.a(parcel, 11, bm.l);
        c.a(parcel, 12, bm.m);
        c.a(parcel, 13, bm.n, false);
        c.a(parcel, 14, (Parcelable)bm.o, n, false);
        c.a(parcel, a);
    }
    
    public bm a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        bj bj = null;
        IBinder n = null;
        IBinder n2 = null;
        IBinder n3 = null;
        IBinder n4 = null;
        String m = null;
        boolean c = false;
        String i = null;
        IBinder n5 = null;
        int g2 = 0;
        int g3 = 0;
        String j = null;
        ct ct = null;
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
                    bj = (bj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.bj.a);
                    continue;
                }
                case 3: {
                    n = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 4: {
                    n2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 5: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 6: {
                    n4 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 7: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 9: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 10: {
                    n5 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 11: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
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
                case 14: {
                    ct = (ct)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ct.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new bm(g, bj, n, n2, n3, n4, m, c, i, n5, g2, g3, j, ct);
    }
    
    public bm[] a(final int n) {
        return new bm[n];
    }
}
