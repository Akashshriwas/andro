/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.s;

public final class LatLng
implements SafeParcelable {
    public static final f a = new f();
    public final double b;
    public final double c;
    private final int d;

    /*
     * Enabled aggressive block sorting
     */
    LatLng(int n2, double d2, double d3) {
        this.d = n2;
        this.c = -180.0 <= d3 && d3 < 180.0 ? d3 : ((d3 - 180.0) % 360.0 + 360.0) % 360.0 - 180.0;
        this.b = Math.max((double)-90.0, (double)Math.min((double)90.0, (double)d2));
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
                if (!(object instanceof LatLng)) {
                    return false;
                }
                object = (LatLng)object;
                if (Double.doubleToLongBits((double)this.b) != Double.doubleToLongBits((double)object.b) || Double.doubleToLongBits((double)this.c) != Double.doubleToLongBits((double)object.c)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits((double)this.b);
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits((double)this.c);
        return (n2 + 31) * 31 + (int)(l2 ^ l2 >>> 32);
    }

    public String toString() {
        return "lat/lng: (" + this.b + "," + this.c + ")";
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            s.a(this, parcel, n2);
            return;
        }
        f.a(this, parcel, n2);
    }
}

