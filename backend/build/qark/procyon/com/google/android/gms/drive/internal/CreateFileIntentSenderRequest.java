// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateFileIntentSenderRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final MetadataBundle b;
    final int c;
    final String d;
    final DriveId e;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    CreateFileIntentSenderRequest(final int a, final MetadataBundle b, final int c, final String d, final DriveId e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.internal.d.a(this, parcel, n);
    }
}
