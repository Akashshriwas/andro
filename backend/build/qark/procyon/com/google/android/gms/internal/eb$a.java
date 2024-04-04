// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class eb$a implements SafeParcelable
{
    public static final hh a;
    final int b;
    final String c;
    final int d;
    
    static {
        a = new hh();
    }
    
    eb$a(final int b, final String c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    eb$a(final String c, final int d) {
        this.b = 1;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        final hh a = eb$a.a;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hh a = eb$a.a;
        hh.a(this, parcel, n);
    }
}
