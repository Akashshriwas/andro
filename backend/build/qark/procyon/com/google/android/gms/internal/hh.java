// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class hh implements Parcelable$Creator
{
    static void a(final eb$a eb$a, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, eb$a.b);
        c.a(parcel, 2, eb$a.c, false);
        c.a(parcel, 3, eb$a.d);
        c.a(parcel, a);
    }
    
    public eb$a a(final Parcel parcel) {
        int g = 0;
        final int b = a.b(parcel);
        String m = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new eb$a(g2, m, g);
    }
    
    public eb$a[] a(final int n) {
        return new eb$a[n];
    }
}
