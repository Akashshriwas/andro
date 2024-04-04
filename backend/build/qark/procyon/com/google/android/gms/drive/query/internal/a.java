// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a implements Parcelable$Creator
{
    static void a(final ComparisonFilter comparisonFilter, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1000, comparisonFilter.d);
        c.a(parcel, 1, (Parcelable)comparisonFilter.b, n, false);
        c.a(parcel, 2, (Parcelable)comparisonFilter.c, n, false);
        c.a(parcel, a);
    }
    
    public ComparisonFilter a(final Parcel parcel) {
        MetadataBundle metadataBundle = null;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
                    metadataBundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataBundle.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ComparisonFilter(g, operator, metadataBundle);
    }
    
    public ComparisonFilter[] a(final int n) {
        return new ComparisonFilter[n];
    }
}
