// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.DriveId;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDriveIdResponse implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    DriveId b;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    OnDriveIdResponse(final int a, final DriveId b) {
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        k.a(this, parcel, n);
    }
}
