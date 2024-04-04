/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.p;
import com.google.android.gms.drive.query.Query;

public class QueryRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new p();
    final int a;
    final Query b;

    QueryRequest(int n2, Query query) {
        this.a = n2;
        this.b = query;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        p.a(this, parcel, n2);
    }
}

