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
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;

public class b
implements Parcelable.Creator {
    static void a(FieldOnlyFilter fieldOnlyFilter, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1000, fieldOnlyFilter.b);
        c.a(parcel, 1, fieldOnlyFilter.a, n2, false);
        c.a(parcel, n3);
    }

    public FieldOnlyFilter a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        MetadataBundle metadataBundle = null;
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
            metadataBundle = (MetadataBundle)a.a(parcel, n4, MetadataBundle.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new FieldOnlyFilter(n3, metadataBundle);
    }

    public FieldOnlyFilter[] a(int n2) {
        return new FieldOnlyFilter[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}
