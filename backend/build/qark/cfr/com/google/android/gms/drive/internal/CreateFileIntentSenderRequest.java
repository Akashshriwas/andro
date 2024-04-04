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
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.d;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int a;
    final MetadataBundle b;
    final int c;
    final String d;
    final DriveId e;

    CreateFileIntentSenderRequest(int n2, MetadataBundle metadataBundle, int n3, String string, DriveId driveId) {
        this.a = n2;
        this.b = metadataBundle;
        this.c = n3;
        this.d = string;
        this.e = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        d.a(this, parcel, n2);
    }
}

