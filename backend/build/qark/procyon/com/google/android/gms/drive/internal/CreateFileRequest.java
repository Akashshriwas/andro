// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.internal.hc;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.DriveId;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateFileRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    CreateFileRequest(final int a, final DriveId driveId, final MetadataBundle metadataBundle, final Contents contents) {
        this.a = a;
        this.b = (DriveId)hc.a(driveId);
        this.c = (MetadataBundle)hc.a(metadataBundle);
        this.d = (Contents)hc.a(contents);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.a(this, parcel, n);
    }
}
