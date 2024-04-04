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

public class iz implements Parcelable$Creator
{
    static void a(final ha$d ha$d, final Parcel parcel, int a) {
        a = c.a(parcel);
        final Set e = ha$d.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$d.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ha$d.g(), true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, ha$d.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha$d.i(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, ha$d.j(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, ha$d.k(), true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, ha$d.l(), true);
        }
        c.a(parcel, a);
    }
    
    public ha$d a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        int g = 0;
        String i = null;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
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
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(6);
                    continue;
                }
                case 7: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(7);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$d(set, g, m2, l, k, j, i, m);
    }
    
    public ha$d[] a(final int n) {
        return new ha$d[n];
    }
}
