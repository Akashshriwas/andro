// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Query implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    LogicalFilter a;
    String b;
    final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    Query(final int c, final LogicalFilter a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.query.b.a(this, parcel, n);
    }
}
