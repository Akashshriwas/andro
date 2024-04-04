/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.n;
import com.google.android.gms.maps.model.y;

public final class VisibleRegion
implements SafeParcelable {
    public static final n a = new n();
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLng e;
    public final LatLngBounds f;
    private final int g;

    VisibleRegion(int n2, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.g = n2;
        this.b = latLng;
        this.c = latLng2;
        this.d = latLng3;
        this.e = latLng4;
        this.f = latLngBounds;
    }

    int a() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof VisibleRegion)) {
                    return false;
                }
                object = (VisibleRegion)object;
                if (!this.b.equals(object.b) || !this.c.equals(object.c) || !this.d.equals(object.d) || !this.e.equals(object.e) || !this.f.equals(object.f)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(this.b, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        return gw.a((Object)this).a("nearLeft", this.b).a("nearRight", this.c).a("farLeft", this.d).a("farRight", this.e).a("latLngBounds", this.f).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            y.a(this, parcel, n2);
            return;
        }
        n.a(this, parcel, n2);
    }
}

