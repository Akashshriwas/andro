// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class InFilter implements SafeParcelable, a
{
    public static final e a;
    final MetadataBundle b;
    final int c;
    private final com.google.android.gms.drive.metadata.a d;
    
    static {
        a = new e();
    }
    
    InFilter(final int c, final MetadataBundle b) {
        this.c = c;
        this.b = b;
        this.d = (com.google.android.gms.drive.metadata.a)com.google.android.gms.drive.query.internal.d.a(b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.a(this, parcel, n);
    }
}
