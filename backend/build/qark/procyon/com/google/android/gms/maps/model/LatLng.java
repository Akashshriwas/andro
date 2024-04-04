// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng implements SafeParcelable
{
    public static final f a;
    public final double b;
    public final double c;
    private final int d;
    
    static {
        a = new f();
    }
    
    LatLng(final int d, final double b, final double c) {
        this.d = d;
        if (-180.0 <= c && c < 180.0) {
            this.c = c;
        }
        else {
            this.c = ((c - 180.0) % 360.0 + 360.0) % 360.0 - 180.0;
        }
        this.b = Math.max(-90.0, Math.min(90.0, b));
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
            if (!(o instanceof LatLng)) {
                return false;
            }
            final LatLng latLng = (LatLng)o;
            if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(latLng.b) || Double.doubleToLongBits(this.c) != Double.doubleToLongBits(latLng.c)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.b);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.c);
        return (n + 31) * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
    }
    
    @Override
    public String toString() {
        return "lat/lng: (" + this.b + "," + this.c + ")";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            s.a(this, parcel, n);
            return;
        }
        f.a(this, parcel, n);
    }
}
