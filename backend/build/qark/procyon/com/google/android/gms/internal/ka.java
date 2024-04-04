// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.List;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.b;
import android.location.Location;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ka implements Parcelable$Creator
{
    static void a(final v v, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, v.b);
        c.a(parcel, 2, v.c);
        c.a(parcel, 3, v.d, false);
        c.a(parcel, 4, v.e);
        c.a(parcel, 5, v.f, false);
        c.a(parcel, 6, v.g);
        c.a(parcel, 7, v.h);
        c.a(parcel, 8, v.i);
        c.a(parcel, 9, v.j, false);
        c.a(parcel, 10, (Parcelable)v.k, n, false);
        c.a(parcel, 11, (Parcelable)v.l, n, false);
        c.a(parcel, a);
    }
    
    public v a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        long h = 0L;
        Bundle o = null;
        int g2 = 0;
        List y = null;
        boolean c = false;
        int g3 = 0;
        boolean c2 = false;
        String m = null;
        ai ai = null;
        Location location = null;
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
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 4: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 5: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 6: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 7: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 8: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 9: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 10: {
                    ai = (ai)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ai.a);
                    continue;
                }
                case 11: {
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Location.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new v(g, h, o, g2, y, c, g3, c2, m, ai, location);
    }
    
    public v[] a(final int n) {
        return new v[n];
    }
}
