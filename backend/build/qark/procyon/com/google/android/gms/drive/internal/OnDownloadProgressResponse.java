// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final long b;
    final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    OnDownloadProgressResponse(final int a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        j.a(this, parcel, n);
    }
}
