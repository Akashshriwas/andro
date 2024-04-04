// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Locale;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fn implements SafeParcelable
{
    public static final ib a;
    private final int b;
    private final String c;
    private final long d;
    private final short e;
    private final double f;
    private final double g;
    private final float h;
    private final int i;
    private final int j;
    private final int k;
    
    static {
        a = new ib();
    }
    
    public fn(final int b, final String c, int a, final short e, final double f, final double g, final float h, final long d, final int j, final int k) {
        a(c);
        a(h);
        a(f, g);
        a = a(a);
        this.b = b;
        this.e = e;
        this.c = c;
        this.f = f;
        this.g = g;
        this.h = h;
        this.d = d;
        this.i = a;
        this.j = j;
        this.k = k;
    }
    
    private static int a(final int i) {
        final int n = i & 0x7;
        if (n == 0) {
            throw new IllegalArgumentException("No supported transition specified: " + i);
        }
        return n;
    }
    
    private static void a(final double d, final double d2) {
        if (d > 90.0 || d < -90.0) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        }
        if (d2 > 180.0 || d2 < -180.0) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }
    
    private static void a(final float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }
    
    private static void a(final String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }
    
    private static String b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return "CIRCLE";
            }
        }
    }
    
    public int a() {
        return this.b;
    }
    
    public short b() {
        return this.e;
    }
    
    public double c() {
        return this.f;
    }
    
    public double d() {
        return this.g;
    }
    
    public int describeContents() {
        final ib a = fn.a;
        return 0;
    }
    
    public float e() {
        return this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof fn)) {
                return false;
            }
            final fn fn = (fn)o;
            if (this.h != fn.h) {
                return false;
            }
            if (this.f != fn.f) {
                return false;
            }
            if (this.g != fn.g) {
                return false;
            }
            if (this.e != fn.e) {
                return false;
            }
        }
        return true;
    }
    
    public String f() {
        return this.c;
    }
    
    public long g() {
        return this.d;
    }
    
    public int h() {
        return this.i;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.f);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.g);
        return ((((n + 31) * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32)) * 31 + Float.floatToIntBits(this.h)) * 31 + this.e) * 31 + this.i;
    }
    
    public int i() {
        return this.j;
    }
    
    public int j() {
        return this.k;
    }
    
    @Override
    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", b(this.e), this.c, this.i, this.f, this.g, this.h, this.j / 1000, this.k, this.d);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ib a = fn.a;
        ib.a(this, parcel, n);
    }
}
