/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.a;

public class Contents
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    final int a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final DriveId e;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;

    Contents(int n2, ParcelFileDescriptor parcelFileDescriptor, int n3, int n4, DriveId driveId) {
        this.a = n2;
        this.b = parcelFileDescriptor;
        this.c = n3;
        this.d = n4;
        this.e = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        a.a(this, parcel, n2);
    }
}

