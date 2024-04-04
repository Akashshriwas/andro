// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class f implements Parcelable$Creator
{
    static void a(final LineItem lineItem, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, lineItem.a());
        c.a(parcel, 2, lineItem.a, false);
        c.a(parcel, 3, lineItem.b, false);
        c.a(parcel, 4, lineItem.c, false);
        c.a(parcel, 5, lineItem.d, false);
        c.a(parcel, 6, lineItem.e);
        c.a(parcel, 7, lineItem.f, false);
        c.a(parcel, a);
    }
    
    public LineItem a(final Parcel parcel) {
        int g = 0;
        String m = null;
        final int b = a.b(parcel);
        String i = null;
        String j = null;
        String k = null;
        String l = null;
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
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 7: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new LineItem(g2, l, k, j, i, g, m);
    }
    
    public LineItem[] a(final int n) {
        return new LineItem[n];
    }
}
