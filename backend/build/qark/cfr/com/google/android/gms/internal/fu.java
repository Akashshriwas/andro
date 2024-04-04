/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fs;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.if;
import com.google.android.gms.location.LocationRequest;

public final class fu
implements SafeParcelable {
    public static final if a = new if();
    final int b;
    private final LocationRequest c;
    private final fs d;

    public fu(int n2, LocationRequest locationRequest, fs fs2) {
        this.b = n2;
        this.c = locationRequest;
        this.d = fs2;
    }

    public LocationRequest a() {
        return this.c;
    }

    public fs b() {
        return this.d;
    }

    public int describeContents() {
        if if_ = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof fu)) {
                    return false;
                }
                object = (fu)object;
                if (!this.c.equals(object.c) || !this.d.equals(object.d)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.c, this.d});
    }

    public String toString() {
        return gw.a((Object)this).a("locationRequest", this.c).a("filter", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if if_ = a;
        if.a(this, parcel, n2);
    }
}

