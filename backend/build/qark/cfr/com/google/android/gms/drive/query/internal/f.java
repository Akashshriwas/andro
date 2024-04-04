/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

public class f
implements Parcelable.Creator {
    static void a(LogicalFilter logicalFilter, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1000, logicalFilter.c);
        c.a(parcel, 1, logicalFilter.a, n2, false);
        c.b(parcel, 2, logicalFilter.b, false);
        c.a(parcel, n3);
    }

    public LogicalFilter a(Parcel parcel) {
        ArrayList arrayList = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        Operator operator = null;
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
                    operator = (Operator)a.a(parcel, n4, Operator.CREATOR);
                    continue block5;
                }
                case 2: 
            }
            arrayList = a.c(parcel, n4, FilterHolder.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new LogicalFilter(n3, operator, (List)arrayList);
    }

    public LogicalFilter[] a(int n2) {
        return new LogicalFilter[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

