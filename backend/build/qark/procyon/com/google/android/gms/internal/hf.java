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

public class hf implements Parcelable$Creator
{
    static void a(final dz dz, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, dz.a());
        c.a(parcel, 2, (Parcelable)dz.b(), n, false);
        c.a(parcel, a);
    }
    
    public dz a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        eb eb = null;
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
                    eb = (eb)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.eb.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new dz(g, eb);
    }
    
    public dz[] a(final int n) {
        return new dz[n];
    }
}
