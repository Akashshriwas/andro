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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.b;
import com.google.android.gms.drive.query.internal.LogicalFilter;

public class Query
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    LogicalFilter a;
    String b;
    final int c;

    Query(int n2, LogicalFilter logicalFilter, String string) {
        this.c = n2;
        this.a = logicalFilter;
        this.b = string;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

