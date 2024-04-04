// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.drive.DriveId;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OpenFileIntentSenderRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final String b;
    final String[] c;
    final DriveId d;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    OpenFileIntentSenderRequest(final int a, final String b, final String[] c, final DriveId d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        o.a(this, parcel, n);
    }
}
