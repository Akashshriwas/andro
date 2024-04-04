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

public class il implements Parcelable$Creator
{
    static void a(final gd gd, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, gd.c, false);
        c.a(parcel, 1000, gd.b);
        c.a(parcel, 2, gd.d, false);
        c.a(parcel, 3, gd.e, false);
        c.a(parcel, 4, gd.f, false);
        c.a(parcel, 5, gd.g, false);
        c.a(parcel, a);
    }
    
    public gd a(final Parcel parcel) {
        List y = null;
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        String i = null;
        String j = null;
        String k = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
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
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new gd(g, k, j, i, m, y);
    }
    
    public gd[] a(final int n) {
        return new gd[n];
    }
}
