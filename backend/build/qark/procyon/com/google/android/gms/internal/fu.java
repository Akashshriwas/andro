// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class fu implements SafeParcelable
{
    public static final if a;
    final int b;
    private final LocationRequest c;
    private final fs d;
    
    static {
        a = new if();
    }
    
    public fu(final int b, final LocationRequest c, final fs d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public LocationRequest a() {
        return this.c;
    }
    
    public fs b() {
        return this.d;
    }
    
    public int describeContents() {
        final if a = fu.a;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof fu)) {
                return false;
            }
            final fu fu = (fu)o;
            if (!this.c.equals(fu.c) || !this.d.equals(fu.d)) {
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
        return gw.a(this).a("locationRequest", this.c).a("filter", this.d).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final if a = fu.a;
        if.a(this, parcel, n);
    }
}
