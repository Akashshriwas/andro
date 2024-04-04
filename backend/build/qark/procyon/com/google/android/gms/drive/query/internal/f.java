// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class f implements Parcelable$Creator
{
    static void a(final LogicalFilter logicalFilter, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1000, logicalFilter.c);
        c.a(parcel, 1, (Parcelable)logicalFilter.a, n, false);
        c.b(parcel, 2, logicalFilter.b, false);
        c.a(parcel, a);
    }
    
    public LogicalFilter a(final Parcel parcel) {
        List c = null;
        final int b = a.b(parcel);
        int g = 0;
        Operator operator = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 1: {
                    operator = (Operator)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Operator.CREATOR);
                    continue;
                }
                case 2: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, FilterHolder.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new LogicalFilter(g, operator, c);
    }
    
    public LogicalFilter[] a(final int n) {
        return new LogicalFilter[n];
    }
}
