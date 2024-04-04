// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ct implements SafeParcelable
{
    public static final eu a;
    public final int b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    
    static {
        a = new eu();
    }
    
    public ct(final int i, final int j, final boolean b) {
        final StringBuilder append = new StringBuilder().append("afma-sdk-a-v").append(i).append(".").append(j).append(".");
        String str;
        if (b) {
            str = "0";
        }
        else {
            str = "1";
        }
        this(1, append.append(str).toString(), i, j, b);
    }
    
    ct(final int b, final String c, final int d, final int e, final boolean f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        eu.a(this, parcel, n);
    }
}
