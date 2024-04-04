// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLngBounds implements SafeParcelable
{
    public static final e a;
    public final LatLng b;
    public final LatLng c;
    private final int d;
    
    static {
        a = new e();
    }
    
    LatLngBounds(final int d, final LatLng b, final LatLng c) {
        hc.a(b, "null southwest");
        hc.a(c, "null northeast");
        hc.a(c.b >= b.b, "southern latitude exceeds northern latitude (%s > %s)", b.b, c.b);
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    int a() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof LatLngBounds)) {
                return false;
            }
            final LatLngBounds latLngBounds = (LatLngBounds)o;
            if (!this.b.equals(latLngBounds.b) || !this.c.equals(latLngBounds.c)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(new Object[] { this.b, this.c });
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("southwest", this.b).a("northeast", this.c).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            r.a(this, parcel, n);
            return;
        }
        e.a(this, parcel, n);
    }
}
