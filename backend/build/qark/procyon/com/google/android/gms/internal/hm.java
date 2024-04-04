// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class hm implements Parcelable$Creator
{
    static void a(final eh$a eh$a, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, eh$a.b);
        c.a(parcel, 2, eh$a.c, false);
        c.b(parcel, 3, eh$a.d, false);
        c.a(parcel, a);
    }
    
    public eh$a a(final Parcel parcel) {
        ArrayList c = null;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)eh$b.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new eh$a(g, m, c);
    }
    
    public eh$a[] a(final int n) {
        return new eh$a[n];
    }
}
