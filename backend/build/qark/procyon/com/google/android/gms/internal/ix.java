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

public class ix implements Parcelable$Creator
{
    static void a(final ha$b$b ha$b$b, final Parcel parcel, int a) {
        a = c.a(parcel);
        final Set e = ha$b$b.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$b$b.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ha$b$b.g());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, ha$b$b.h(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha$b$b.i());
        }
        c.a(parcel, a);
    }
    
    public ha$b$b a(final Parcel parcel) {
        int g = 0;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        String m = null;
        int g2 = 0;
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
                case 2: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(4);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$b$b(set, g3, g2, m, g);
    }
    
    public ha$b$b[] a(final int n) {
        return new ha$b$b[n];
    }
}
