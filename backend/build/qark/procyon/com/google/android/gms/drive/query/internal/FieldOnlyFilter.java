// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldOnlyFilter implements SafeParcelable, a
{
    public static final Parcelable$Creator CREATOR;
    final MetadataBundle a;
    final int b;
    private final b c;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.drive.query.internal.b();
    }
    
    FieldOnlyFilter(final int b, final MetadataBundle a) {
        this.b = b;
        this.a = a;
        this.c = d.a(a);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.query.internal.b.a(this, parcel, n);
    }
}
