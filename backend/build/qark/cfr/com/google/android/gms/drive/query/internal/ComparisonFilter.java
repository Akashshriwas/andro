/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.d;

public class ComparisonFilter
implements SafeParcelable,
a {
    public static final com.google.android.gms.drive.query.internal.a a = new com.google.android.gms.drive.query.internal.a();
    final Operator b;
    final MetadataBundle c;
    final int d;
    final b e;

    ComparisonFilter(int n2, Operator operator, MetadataBundle metadataBundle) {
        this.d = n2;
        this.b = operator;
        this.c = metadataBundle;
        this.e = d.a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        com.google.android.gms.drive.query.internal.a.a(this, parcel, n2);
    }
}

