// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class b implements Parcelable$Creator
{
    static void a(final Query query, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1000, query.c);
        c.a(parcel, 1, (Parcelable)query.a, n, false);
        c.a(parcel, 3, query.b, false);
        c.a(parcel, a);
    }
    
    public Query a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        LogicalFilter logicalFilter = null;
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
                    logicalFilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LogicalFilter.CREATOR);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
        }
        return new Query(g, logicalFilter, m);
    }
    
    public Query[] a(final int n) {
        return new Query[n];
    }
}
