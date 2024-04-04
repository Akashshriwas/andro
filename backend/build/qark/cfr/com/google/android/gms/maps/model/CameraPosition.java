/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.o;

public final class CameraPosition
implements SafeParcelable {
    public static final b a = new b();
    public final LatLng b;
    public final float c;
    public final float d;
    public final float e;
    private final int f;

    /*
     * Enabled aggressive block sorting
     */
    CameraPosition(int n2, LatLng latLng, float f2, float f3, float f4) {
        hc.a(latLng, (Object)"null camera target");
        boolean bl2 = 0.0f <= f3 && f3 <= 90.0f;
        hc.b(bl2, "Tilt needs to be between 0 and 90 inclusive");
        this.f = n2;
        this.b = latLng;
        this.c = f2;
        this.d = f3 + 0.0f;
        f2 = f4;
        if ((double)f4 <= 0.0) {
            f2 = f4 % 360.0f + 360.0f;
        }
        this.e = f2 % 360.0f;
    }

    int a() {
        return this.f;
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
                if (!(object instanceof CameraPosition)) {
                    return false;
                }
                object = (CameraPosition)object;
                if (!this.b.equals(object.b) || Float.floatToIntBits((float)this.c) != Float.floatToIntBits((float)object.c) || Float.floatToIntBits((float)this.d) != Float.floatToIntBits((float)object.d) || Float.floatToIntBits((float)this.e) != Float.floatToIntBits((float)object.e)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.b, Float.valueOf((float)this.c), Float.valueOf((float)this.d), Float.valueOf((float)this.e)});
    }

    public String toString() {
        return gw.a((Object)this).a("target", this.b).a("zoom", (Object)Float.valueOf((float)this.c)).a("tilt", (Object)Float.valueOf((float)this.d)).a("bearing", (Object)Float.valueOf((float)this.e)).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (com.google.android.gms.maps.a.b.a()) {
            o.a(this, parcel, n2);
            return;
        }
        b.a(this, parcel, n2);
    }
}

