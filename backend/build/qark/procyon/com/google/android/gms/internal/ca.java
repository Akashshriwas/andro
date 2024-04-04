// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ca implements Parcelable$Creator
{
    static void a(final bj bj, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, bj.b);
        c.a(parcel, 2, bj.c, false);
        c.a(parcel, 3, bj.d, false);
        c.a(parcel, 4, bj.e, false);
        c.a(parcel, 5, bj.f, false);
        c.a(parcel, 6, bj.g, false);
        c.a(parcel, 7, bj.h, false);
        c.a(parcel, 8, bj.i, false);
        c.a(parcel, a);
    }
    
    public bj a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        String i = null;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
        String m3 = null;
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
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new bj(g, m3, m2, l, k, j, i, m);
    }
    
    public bj[] a(final int n) {
        return new bj[n];
    }
}
