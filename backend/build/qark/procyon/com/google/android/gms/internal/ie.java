// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ie implements Parcelable$Creator
{
    static void a(final fs fs, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, fs.a());
        c.a(parcel, 1000, fs.b);
        c.b(parcel, 2, fs.c, false);
        c.a(parcel, 3, fs.b(), false);
        c.a(parcel, 4, fs.c(), false);
        c.a(parcel, 5, fs.d());
        c.a(parcel, a);
    }
    
    public fs a(final Parcel parcel) {
        String m = null;
        boolean c = false;
        final int b = a.b(parcel);
        String i = null;
        List c2 = null;
        int g = 0;
        int g2 = 0;
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
                case 1000: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)fw.bv);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new fs(g2, g, c2, i, m, c);
    }
    
    public fs[] a(final int n) {
        return new fs[n];
    }
}
