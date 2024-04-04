/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ij;

public final class fz
extends id
implements SafeParcelable {
    public static final ij a = new ij();
    private static final fz c = new fz(0, new gb[0], new float[0]);
    final int b;
    private final gb[] d;
    private final float[] e;

    /*
     * Enabled aggressive block sorting
     */
    fz(int n2, gb[] arrgb, float[] arrf) {
        boolean bl2 = arrgb.length == arrf.length;
        hc.b(bl2, "mismatched places to probabilities arrays");
        this.b = n2;
        this.d = arrgb;
        this.e = arrf;
    }

    public gb[] a() {
        return this.d;
    }

    float[] b() {
        return this.e;
    }

    public int describeContents() {
        ij ij2 = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof fz)) {
                    return false;
                }
                object = (fz)object;
                if (!this.d.equals((Object)object.d) || !this.e.equals((Object)object.e)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.d, this.e});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaceEstimate{");
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            stringBuilder.append(String.format((String)"(%f, %s)", (Object[])new Object[]{Float.valueOf((float)this.e[i2]), this.d[i2].toString()}));
            if (i2 == this.d.length - 1) continue;
            stringBuilder.append(",");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ij ij2 = a;
        ij.a(this, parcel, n2);
    }
}

