// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.DriveId;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OpenContentsRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final DriveId b;
    final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    OpenContentsRequest(final int a, final DriveId b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        n.a(this, parcel, n);
    }
}
