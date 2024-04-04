/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ib;
import java.util.Locale;

public class fn
implements SafeParcelable {
    public static final ib a = new ib();
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

    public fn(int n2, String string, int n3, short s2, double d2, double d3, float f2, long l2, int n4, int n5) {
        fn.a(string);
        fn.a(f2);
        fn.a(d2, d3);
        n3 = fn.a(n3);
        this.b = n2;
        this.e = s2;
        this.c = string;
        this.f = d2;
        this.g = d3;
        this.h = f2;
        this.d = l2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
    }

    private static int a(int n2) {
        int n3 = n2 & 7;
        if (n3 == 0) {
            throw new IllegalArgumentException("No supported transition specified: " + n2);
        }
        return n3;
    }

    private static void a(double d2, double d3) {
        if (d2 > 90.0 || d2 < -90.0) {
            throw new IllegalArgumentException("invalid latitude: " + d2);
        }
        if (d3 > 180.0 || d3 < -180.0) {
            throw new IllegalArgumentException("invalid longitude: " + d3);
        }
    }

    private static void a(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f2);
        }
    }

    private static void a(String string) {
        if (string == null || string.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + string);
        }
    }

    private static String b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 1: 
        }
        return "CIRCLE";
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
        ib ib2 = a;
        return 0;
    }

    public float e() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block9 : {
            block8 : {
                if (this == object) break block8;
                if (object == null) {
                    return false;
                }
                if (!(object instanceof fn)) {
                    return false;
                }
                object = (fn)object;
                if (this.h != object.h) {
                    return false;
                }
                if (this.f != object.f) {
                    return false;
                }
                if (this.g != object.g) {
                    return false;
                }
                if (this.e != object.e) break block9;
            }
            return true;
        }
        return false;
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

    public int hashCode() {
        long l2 = Double.doubleToLongBits((double)this.f);
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits((double)this.g);
        return ((((n2 + 31) * 31 + (int)(l2 ^ l2 >>> 32)) * 31 + Float.floatToIntBits((float)this.h)) * 31 + this.e) * 31 + this.i;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public String toString() {
        return String.format((Locale)Locale.US, (String)"Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", (Object[])new Object[]{fn.b(this.e), this.c, this.i, this.f, this.g, Float.valueOf((float)this.h), this.j / 1000, this.k, this.d});
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ib ib2 = a;
        ib.a(this, parcel, n2);
    }
}

