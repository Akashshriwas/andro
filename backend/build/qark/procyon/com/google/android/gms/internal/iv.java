// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Set;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class iv implements Parcelable$Creator
{
    static void a(final ha$b ha$b, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        final Set e = ha$b.e();
        if (e.contains(1)) {
            c.a(parcel, 1, ha$b.f());
        }
        if (e.contains(2)) {
            c.a(parcel, 2, (Parcelable)ha$b.g(), n, true);
        }
        if (e.contains(3)) {
            c.a(parcel, 3, (Parcelable)ha$b.h(), n, true);
        }
        if (e.contains(4)) {
            c.a(parcel, 4, ha$b.i());
        }
        c.a(parcel, a);
    }
    
    public ha$b a(final Parcel parcel) {
        ha$b$b ha$b$b = null;
        int g = 0;
        final int b = a.b(parcel);
        final HashSet<Integer> set = new HashSet<Integer>();
        ha$b$a ha$b$a = null;
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
                    set.add(1);
                    continue;
                }
                case 2: {
                    ha$b$a = (ha$b$a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$b$a.a);
                    set.add(2);
                    continue;
                }
                case 3: {
                    ha$b$b = (ha$b$b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ha$b$b.a);
                    set.add(3);
                    continue;
                }
                case 4: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    set.add(4);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ha$b(set, g2, ha$b$a, ha$b$b, g);
    }
    
    public ha$b[] a(final int n) {
        return new ha$b[n];
    }
}
