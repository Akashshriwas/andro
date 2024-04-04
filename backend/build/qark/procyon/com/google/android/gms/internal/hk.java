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

public class hk implements Parcelable$Creator
{
    static void a(final eh$b eh$b, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, eh$b.b);
        c.a(parcel, 2, eh$b.c, false);
        c.a(parcel, 3, (Parcelable)eh$b.d, n, false);
        c.a(parcel, a);
    }
    
    public eh$b a(final Parcel parcel) {
        ee$a ee$a = null;
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    ee$a = (ee$a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ee$a.i);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new eh$b(g, m, ee$a);
    }
    
    public eh$b[] a(final int n) {
        return new eh$b[n];
    }
}
