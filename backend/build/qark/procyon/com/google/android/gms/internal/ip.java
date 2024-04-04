// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ip implements Parcelable$Creator
{
    static void a(final gs gs, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, gs.b(), false);
        c.a(parcel, 1000, gs.a());
        c.a(parcel, 2, gs.c(), false);
        c.a(parcel, 3, gs.d(), false);
        c.a(parcel, 4, gs.e(), false);
        c.a(parcel, 5, gs.f(), false);
        c.a(parcel, 6, gs.g(), false);
        c.a(parcel, 7, gs.h(), false);
        c.a(parcel, 8, gs.i(), false);
        c.a(parcel, a);
    }
    
    public gs a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        String i = null;
        String j = null;
        String k = null;
        String[] x = null;
        String[] x2 = null;
        String[] x3 = null;
        String l = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    x3 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 3: {
                    x2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 4: {
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
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
        return new gs(g, l, x3, x2, x, k, j, i, m);
    }
    
    public gs[] a(final int n) {
        return new gs[n];
    }
}
