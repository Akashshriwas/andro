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
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.NotFilter;

public class g
implements Parcelable.Creator {
    static void a(NotFilter notFilter, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1000, notFilter.b);
        c.a(parcel, 1, notFilter.a, n2, false);
        c.a(parcel, n3);
    }

    public NotFilter a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        FilterHolder filterHolder = null;
        block4 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block4;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block4;
                }
                case 1: 
            }
            filterHolder = (FilterHolder)a.a(parcel, n4, FilterHolder.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new NotFilter(n3, filterHolder);
    }

    public NotFilter[] a(int n2) {
        return new NotFilter[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

