// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Set;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ir implements Parcelable$Creator
{
    static void a(final gx gx, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        final Set e = gx.e();
        if (e.contains(1)) {
            c.a(parcel, 1, gx.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, gx.g(), true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, (Parcelable)gx.h(), n, true);
        }
        if (e.contains(5)) {
            c.a(parcel, 5, gx.i(), true);
        }
        if (e.contains(6)) {
            c.a(parcel, 6, (Parcelable)gx.j(), n, true);
        }
        if (e.contains(7)) {
            c.a(parcel, 7, gx.k(), true);
        }
        c.a(parcel, a);
    }
    
    public gx a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        int g = 0;
        gv gv = null;
        String i = null;
        gv gv2 = null;
        String j = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(2);
                    continue;
                }
                case 4: {
                    gv2 = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
                    set.add(4);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    set.add(5);
                    continue;
                }
                case 6: {
                    gv = (gv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gv.a);
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
        return new gx(set, g, j, gv2, i, gv, m);
    }
    
    public gx[] a(final int n) {
        return new gx[n];
    }
}
