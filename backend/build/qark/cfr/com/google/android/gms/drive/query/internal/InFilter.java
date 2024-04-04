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
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.drive.query.internal.d;
import com.google.android.gms.drive.query.internal.e;

public class InFilter
implements SafeParcelable,
a {
    public static final e a = new e();
    final MetadataBundle b;
    final int c;
    private final com.google.android.gms.drive.metadata.a d;

    InFilter(int n2, MetadataBundle metadataBundle) {
        this.c = n2;
        this.b = metadataBundle;
        this.d = (com.google.android.gms.drive.metadata.a)d.a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        e.a(this, parcel, n2);
    }
}

