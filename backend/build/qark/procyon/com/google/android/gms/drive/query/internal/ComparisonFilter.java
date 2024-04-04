// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ComparisonFilter implements SafeParcelable, a
{
    public static final com.google.android.gms.drive.query.internal.a a;
    final Operator b;
    final MetadataBundle c;
    final int d;
    final b e;
    
    static {
        a = new com.google.android.gms.drive.query.internal.a();
    }
    
    ComparisonFilter(final int d, final Operator b, final MetadataBundle c) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = com.google.android.gms.drive.query.internal.d.a(c);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.query.internal.a.a(this, parcel, n);
    }
}
