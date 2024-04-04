// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class io implements Parcelable$Creator
{
    static void a(final gg gg, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, gg.c, false);
        c.a(parcel, 1000, gg.b);
        c.a(parcel, 2, gg.d, false);
        c.a(parcel, a);
    }
    
    public gg a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        String i = null;
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
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new gg(g, i, m);
    }
    
    public gg[] a(final int n) {
        return new gg[n];
    }
}
