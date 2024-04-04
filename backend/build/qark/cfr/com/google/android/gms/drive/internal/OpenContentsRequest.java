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
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.n;

public class OpenContentsRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new n();
    final int a;
    final DriveId b;
    final int c;

    OpenContentsRequest(int n2, DriveId driveId, int n3) {
        this.a = n2;
        this.b = driveId;
        this.c = n3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        n.a(this, parcel, n2);
    }
}

