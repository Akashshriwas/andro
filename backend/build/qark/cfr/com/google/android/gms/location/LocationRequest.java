/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.SystemClock
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.location.c;

public final class LocationRequest
implements SafeParcelable {
    public static final c h = new c();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    private final int i;

    public LocationRequest() {
        this.i = 1;
        this.a = 102;
        this.b = 3600000L;
        this.c = 600000L;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
    }

    LocationRequest(int n2, int n3, long l2, long l3, boolean bl2, long l4, int n4, float f2) {
        this.i = n2;
        this.a = n3;
        this.b = l2;
        this.c = l3;
        this.d = bl2;
        this.e = l4;
        this.f = n4;
        this.g = f2;
    }

    public static String a(int n2) {
        switch (n2) {
            default: {
                return "???";
            }
            case 100: {
                return "PRIORITY_HIGH_ACCURACY";
            }
            case 102: {
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            }
            case 104: {
                return "PRIORITY_LOW_POWER";
            }
            case 105: 
        }
        return "PRIORITY_NO_POWER";
    }

    int a() {
        return this.i;
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
                if (!(object instanceof LocationRequest)) {
                    return false;
                }
                object = (LocationRequest)object;
                if (this.a != object.a || this.b != object.b || this.c != object.c || this.d != object.d || this.e != object.e || this.f != object.f || this.g != object.g) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Float.valueOf((float)this.g)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[").append(LocationRequest.a(this.a));
        if (this.a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append("" + this.b + "ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append("" + this.c + "ms");
        if (this.e != Long.MAX_VALUE) {
            long l2 = this.e;
            long l3 = SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append("" + (l2 - l3) + "ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            stringBuilder.append(" num=").append(this.f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        c.a(this, parcel, n2);
    }
}

