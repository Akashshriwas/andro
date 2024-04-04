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
import com.google.android.gms.drive.internal.m;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new m();
    final int a;
    final MetadataBundle b;

    OnMetadataResponse(int n2, MetadataBundle metadataBundle) {
        this.a = n2;
        this.b = metadataBundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        m.a(this, parcel, n2);
    }
}

