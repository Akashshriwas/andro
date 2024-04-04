// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class gg implements SafeParcelable
{
    public static final io a;
    public final int b;
    public final String c;
    public final String d;
    
    static {
        a = new io();
    }
    
    public gg(final int b, final String c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        final io a = gg.a;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || !(o instanceof gg)) {
                return false;
            }
            final gg gg = (gg)o;
            if (!this.d.equals(gg.d) || !this.c.equals(gg.c)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(new Object[] { this.c, this.d });
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("clientPackageName", this.c).a("locale", this.d).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final io a = gg.a;
        io.a(this, parcel, n);
    }
}
