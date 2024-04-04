// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnMetadataResponse implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final MetadataBundle b;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    OnMetadataResponse(final int a, final MetadataBundle b) {
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        m.a(this, parcel, n);
    }
}
