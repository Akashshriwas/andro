// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class fz extends id implements SafeParcelable
{
    public static final ij a;
    private static final fz c;
    final int b;
    private final gb[] d;
    private final float[] e;
    
    static {
        a = new ij();
        c = new fz(0, new gb[0], new float[0]);
    }
    
    fz(final int b, final gb[] d, final float[] e) {
        hc.b(d.length == e.length, "mismatched places to probabilities arrays");
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public gb[] a() {
        return this.d;
    }
    
    float[] b() {
        return this.e;
    }
    
    public int describeContents() {
        final ij a = fz.a;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof fz)) {
                return false;
            }
            final fz fz = (fz)o;
            if (!this.d.equals(fz.d) || !this.e.equals(fz.e)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.d, this.e);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaceEstimate{");
        for (int i = 0; i < this.d.length; ++i) {
            sb.append(String.format("(%f, %s)", this.e[i], this.d[i].toString()));
            if (i != this.d.length - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ij a = fz.a;
        ij.a(this, parcel, n);
    }
}
