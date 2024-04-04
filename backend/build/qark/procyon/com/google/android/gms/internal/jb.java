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

public class jb implements Parcelable$Creator
{
    static void a(final ha$g ha$g, final Parcel parcel, int a) {
        a = c.a(parcel);
        final Set e = ha$g.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$g.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, ha$g.g());
        }
        if (e.contains(3)) {
            c.a(parcel, 3, ha$g.h(), true);
        }
        c.a(parcel, a);
    }
    
    public ha$g a(final Parcel parcel) {
        boolean c = false;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        String m = null;
        int g = 0;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(3);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$g(set, g, c, m);
    }
    
    public ha$g[] a(final int n) {
        return new ha$g[n];
    }
}
