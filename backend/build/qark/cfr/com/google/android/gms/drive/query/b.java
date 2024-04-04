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
package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.LogicalFilter;

public class b
implements Parcelable.Creator {
    static void a(Query query, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1000, query.c);
        c.a(parcel, 1, query.a, n2, false);
        c.a(parcel, 3, query.b, false);
        c.a(parcel, n3);
    }

    public Query a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        LogicalFilter logicalFilter = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 1: {
                    logicalFilter = (LogicalFilter)a.a(parcel, n4, LogicalFilter.CREATOR);
                    continue block5;
                }
                case 3: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new Query(n3, logicalFilter, string);
    }

    public Query[] a(int n2) {
        return new Query[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

