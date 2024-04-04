// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LogicalFilter implements SafeParcelable, a
{
    public static final Parcelable$Creator CREATOR;
    final Operator a;
    final List b;
    final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    LogicalFilter(final int c, final Operator a, final List b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.a(this, parcel, n);
    }
}
