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
import com.google.android.gms.drive.internal.o;

public class OpenFileIntentSenderRequest
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new o();
    final int a;
    final String b;
    final String[] c;
    final DriveId d;

    OpenFileIntentSenderRequest(int n2, String string, String[] arrstring, DriveId driveId) {
        this.a = n2;
        this.b = string;
        this.c = arrstring;
        this.d = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        o.a(this, parcel, n2);
    }
}

