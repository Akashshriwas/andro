// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class eh$b implements SafeParcelable
{
    public static final hk a;
    final int b;
    final String c;
    final ee$a d;
    
    static {
        a = new hk();
    }
    
    eh$b(final int b, final String c, final ee$a d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    eh$b(final String c, final ee$a d) {
        this.b = 1;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        final hk a = eh$b.a;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hk a = eh$b.a;
        hk.a(this, parcel, n);
    }
}
