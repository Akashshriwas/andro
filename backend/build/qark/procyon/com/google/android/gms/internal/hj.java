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

public class hj implements Parcelable$Creator
{
    static void a(final ee$a ee$a, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, ee$a.a());
        c.a(parcel, 2, ee$a.b());
        c.a(parcel, 3, ee$a.c());
        c.a(parcel, 4, ee$a.d());
        c.a(parcel, 5, ee$a.e());
        c.a(parcel, 6, ee$a.f(), false);
        c.a(parcel, 7, ee$a.g());
        c.a(parcel, 8, ee$a.i(), false);
        c.a(parcel, 9, (Parcelable)ee$a.k(), n, false);
        c.a(parcel, a);
    }
    
    public ee$a a(final Parcel parcel) {
        dz dz = null;
        int g = 0;
        final int b = a.b(parcel);
        String m = null;
        String i = null;
        boolean c = false;
        int g2 = 0;
        boolean c2 = false;
        int g3 = 0;
        int g4 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 3: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 5: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 8: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    dz = (dz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.dz.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ee$a(g4, g3, c2, g2, c, i, g, m, dz);
    }
    
    public ee$a[] a(final int n) {
        return new ee$a[n];
    }
}
