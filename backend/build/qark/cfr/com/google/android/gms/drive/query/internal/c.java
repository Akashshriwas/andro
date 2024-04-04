/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.a;
import com.google.android.gms.drive.query.internal.e;

public class c
implements Parcelable.Creator {
    static void a(FilterHolder filterHolder, Parcel parcel, int n2) {
        int n3 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, filterHolder.b, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, filterHolder.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, filterHolder.c, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, filterHolder.d, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, filterHolder.e, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, filterHolder.f, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n3);
    }

    public FilterHolder a(Parcel parcel) {
        InFilter inFilter = null;
        int n2 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int n3 = 0;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        block8 : while (parcel.dataPosition() < n2) {
            int n4 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n4)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n4);
                    continue block8;
                }
                case 1: {
                    comparisonFilter = (ComparisonFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, ComparisonFilter.a);
                    continue block8;
                }
                case 1000: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n4);
                    continue block8;
                }
                case 2: {
                    fieldOnlyFilter = (FieldOnlyFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, FieldOnlyFilter.CREATOR);
                    continue block8;
                }
                case 3: {
                    logicalFilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, LogicalFilter.CREATOR);
                    continue block8;
                }
                case 4: {
                    notFilter = (NotFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, NotFilter.CREATOR);
                    continue block8;
                }
                case 5: 
            }
            inFilter = (InFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, InFilter.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new FilterHolder(n3, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter);
    }

    public FilterHolder[] a(int n2) {
        return new FilterHolder[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

