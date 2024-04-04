// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final FilterHolder filterHolder, final Parcel parcel, final int n) {
        final int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable)filterHolder.b, n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, filterHolder.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable)filterHolder.c, n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable)filterHolder.d, n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable)filterHolder.e, n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable)filterHolder.f, n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }
    
    public FilterHolder a(final Parcel parcel) {
        InFilter inFilter = null;
        final int b = a.b(parcel);
        int g = 0;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    comparisonFilter = (ComparisonFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)ComparisonFilter.a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    fieldOnlyFilter = (FieldOnlyFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, FieldOnlyFilter.CREATOR);
                    continue;
                }
                case 3: {
                    logicalFilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LogicalFilter.CREATOR);
                    continue;
                }
                case 4: {
                    notFilter = (NotFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, NotFilter.CREATOR);
                    continue;
                }
                case 5: {
                    inFilter = (InFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)InFilter.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new FilterHolder(g, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter);
    }
    
    public FilterHolder[] a(final int n) {
        return new FilterHolder[n];
    }
}
