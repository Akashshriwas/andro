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
import com.google.android.gms.drive.internal.j;

public class OnDownloadProgressResponse
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    final int a;
    final long b;
    final long c;

    OnDownloadProgressResponse(int n2, long l2, long l3) {
        this.a = n2;
        this.b = l2;
        this.c = l3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        j.a(this, parcel, n2);
    }
}

