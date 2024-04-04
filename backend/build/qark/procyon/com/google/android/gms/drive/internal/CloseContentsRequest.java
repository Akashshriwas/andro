// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.Contents;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CloseContentsRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final Contents b;
    final Boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    CloseContentsRequest(final int a, final Contents b, final Boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.internal.b.a(this, parcel, n);
    }
}
