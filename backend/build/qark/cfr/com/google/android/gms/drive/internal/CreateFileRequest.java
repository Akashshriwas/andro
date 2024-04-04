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
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.e;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hc;

public class CreateFileRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;

    CreateFileRequest(int n2, DriveId driveId, MetadataBundle metadataBundle, Contents contents) {
        this.a = n2;
        this.b = (DriveId)hc.a(driveId);
        this.c = (MetadataBundle)hc.a(metadataBundle);
        this.d = (Contents)hc.a(contents);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        e.a(this, parcel, n2);
    }
}

