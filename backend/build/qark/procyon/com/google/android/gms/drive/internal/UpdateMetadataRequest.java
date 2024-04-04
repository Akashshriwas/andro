// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.DriveId;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UpdateMetadataRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final DriveId b;
    final MetadataBundle c;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    UpdateMetadataRequest(final int a, final DriveId b, final MetadataBundle c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.internal.a.a(this, parcel, n);
    }
}
