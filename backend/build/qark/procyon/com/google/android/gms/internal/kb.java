// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class kb implements Parcelable$Creator
{
    static void a(final x x, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, x.b);
        c.a(parcel, 2, x.c, false);
        c.a(parcel, 3, x.d);
        c.a(parcel, 4, x.e);
        c.a(parcel, 5, x.f);
        c.a(parcel, 6, x.g);
        c.a(parcel, 7, x.h);
        c.a(parcel, 8, (Parcelable[])x.i, n, false);
        c.a(parcel, a);
    }
    
    public x a(final Parcel parcel) {
        x[] array = null;
        int g = 0;
        final int b = a.b(parcel);
        int g2 = 0;
        boolean c = false;
        int g3 = 0;
        int g4 = 0;
        String m = null;
        int g5 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 4: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 5: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 6: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 7: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 8: {
                    array = (x[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, (Parcelable$Creator)x.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new x(g5, m, g4, g3, c, g2, g, array);
    }
    
    public x[] a(final int n) {
        return new x[n];
    }
}
