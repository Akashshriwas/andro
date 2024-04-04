// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CameraPosition implements SafeParcelable
{
    public static final b a;
    public final LatLng b;
    public final float c;
    public final float d;
    public final float e;
    private final int f;
    
    static {
        a = new b();
    }
    
    CameraPosition(final int f, final LatLng b, float c, final float n, final float n2) {
        hc.a(b, "null camera target");
        hc.b(0.0f <= n && n <= 90.0f, "Tilt needs to be between 0 and 90 inclusive");
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = n + 0.0f;
        c = n2;
        if (n2 <= 0.0) {
            c = n2 % 360.0f + 360.0f;
        }
        this.e = c % 360.0f;
    }
    
    int a() {
        return this.f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CameraPosition)) {
                return false;
            }
            final CameraPosition cameraPosition = (CameraPosition)o;
            if (!this.b.equals(cameraPosition.b) || Float.floatToIntBits(this.c) != Float.floatToIntBits(cameraPosition.c) || Float.floatToIntBits(this.d) != Float.floatToIntBits(cameraPosition.d) || Float.floatToIntBits(this.e) != Float.floatToIntBits(cameraPosition.e)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.b, this.c, this.d, this.e);
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("target", this.b).a("zoom", this.c).a("tilt", this.d).a("bearing", this.e).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            o.a(this, parcel, n);
            return;
        }
        com.google.android.gms.maps.model.b.a(this, parcel, n);
    }
}
