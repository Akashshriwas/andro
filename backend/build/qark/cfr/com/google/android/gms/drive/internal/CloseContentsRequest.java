/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.b;

public class CloseContentsRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    final int a;
    final Contents b;
    final Boolean c;

    CloseContentsRequest(int n2, Contents contents, Boolean bl2) {
        this.a = n2;
        this.b = contents;
        this.c = bl2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

