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

public class jc implements Parcelable$Creator
{
    static void a(final ha$h ha$h, final Parcel parcel, int a) {
        a = c.a(parcel);
        final Set e = ha$h.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$h.f());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, ha$h.h());
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha$h.j(), true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, ha$h.g(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, ha$h.i());
        }
        c.a(parcel, a);
    }
    
    public ha$h a(final Parcel parcel) {
        String m = null;
        int g = 0;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        int g2 = 0;
        String i = null;
        int g3 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(1);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(6);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$h(set, g3, i, g2, m, g);
    }
    
    public ha$h[] a(final int n) {
        return new ha$h[n];
    }
}
