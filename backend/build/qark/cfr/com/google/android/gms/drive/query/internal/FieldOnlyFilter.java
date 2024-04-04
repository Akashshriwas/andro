/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.drive.query.internal.b;
import com.google.android.gms.drive.query.internal.d;

public class FieldOnlyFilter
implements SafeParcelable,
a {
    public static final Parcelable.Creator CREATOR = new b();
    final MetadataBundle a;
    final int b;
    private final com.google.android.gms.drive.metadata.b c;

    FieldOnlyFilter(int n2, MetadataBundle metadataBundle) {
        this.b = n2;
        this.a = metadataBundle;
        this.c = d.a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

