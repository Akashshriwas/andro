// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.internal.gw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class VisibleRegion implements SafeParcelable
{
    public static final n a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLng e;
    public final LatLngBounds f;
    private final int g;
    
    static {
        a = new n();
    }
    
    VisibleRegion(final int g, final LatLng b, final LatLng c, final LatLng d, final LatLng e, final LatLngBounds f) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    int a() {
        return this.g;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof VisibleRegion)) {
                return false;
            }
            final VisibleRegion visibleRegion = (VisibleRegion)o;
            if (!this.b.equals(visibleRegion.b) || !this.c.equals(visibleRegion.c) || !this.d.equals(visibleRegion.d) || !this.e.equals(visibleRegion.e) || !this.f.equals(visibleRegion.f)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.b, this.c, this.d, this.e, this.f);
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("nearLeft", this.b).a("nearRight", this.c).a("farLeft", this.d).a("farRight", this.e).a("latLngBounds", this.f).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            y.a(this, parcel, n);
            return;
        }
        n.a(this, parcel, n);
    }
}
