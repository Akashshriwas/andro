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
import com.google.android.gms.internal.hc;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.r;

public final class LatLngBounds
implements SafeParcelable {
    public static final e a = new e();
    public final LatLng b;
    public final LatLng c;
    private final int d;

    /*
     * Enabled aggressive block sorting
     */
    LatLngBounds(int n2, LatLng latLng, LatLng latLng2) {
        hc.a(latLng, (Object)"null southwest");
        hc.a(latLng2, (Object)"null northeast");
        boolean bl2 = latLng2.b >= latLng.b;
        hc.a(bl2, "southern latitude exceeds northern latitude (%s > %s)", latLng.b, latLng2.b);
        this.d = n2;
        this.b = latLng;
        this.c = latLng2;
    }

    int a() {
        return this.d;
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
                if (!(object instanceof LatLngBounds)) {
                    return false;
                }
                object = (LatLngBounds)object;
                if (!this.b.equals(object.b) || !this.c.equals(object.c)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return gw.a((Object)this).a("southwest", this.b).a("northeast", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            r.a(this, parcel, n2);
            return;
        }
        e.a(this, parcel, n2);
    }
}

