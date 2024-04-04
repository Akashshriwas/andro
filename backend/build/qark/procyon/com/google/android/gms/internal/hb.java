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

public class hb implements Parcelable$Creator
{
    static void a(final dh$a dh$a, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, dh$a.a(), false);
        c.a(parcel, 1000, dh$a.e());
        c.a(parcel, 2, dh$a.d(), false);
        c.a(parcel, 3, dh$a.b());
        c.a(parcel, 4, dh$a.c(), false);
        c.a(parcel, a);
    }
    
    public dh$a a(final Parcel parcel) {
        int g = 0;
        String m = null;
        final int b = a.b(parcel);
        List y = null;
        String i = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new dh$a(g2, i, y, g, m);
    }
    
    public dh$a[] a(final int n) {
        return new dh$a[n];
    }
}
