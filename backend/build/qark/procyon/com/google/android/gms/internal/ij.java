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

public class ij implements Parcelable$Creator
{
    static void a(final fz fz, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, (Parcelable[])fz.a(), n, false);
        c.a(parcel, 1000, fz.b);
        c.a(parcel, 2, fz.b(), false);
        c.a(parcel, a);
    }
    
    public fz a(final Parcel parcel) {
        float[] u = null;
        final int b = a.b(parcel);
        int g = 0;
        gb[] array = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    array = (gb[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, (Parcelable$Creator)gb.a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    u = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new fz(g, array, u);
    }
    
    public fz[] a(final int n) {
        return new fz[n];
    }
}
