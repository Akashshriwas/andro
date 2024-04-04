// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class gd implements SafeParcelable
{
    public static final il a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    
    static {
        a = new il();
    }
    
    public gd(final int b, final String c, final String d, final String e, final String f, final List g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public int describeContents() {
        final il a = gd.a;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof gd)) {
                return false;
            }
            final gd gd = (gd)o;
            if (!gw.a(this.c, gd.c) || !gw.a(this.d, gd.d) || !gw.a(this.e, gd.e) || !gw.a(this.f, gd.f) || !gw.a(this.g, gd.g)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.c, this.d, this.e, this.f);
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("name", this.c).a("address", this.d).a("internationalPhoneNumber", this.e).a("regularOpenHours", this.f).a("attributions", this.g).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final il a = gd.a;
        il.a(this, parcel, n);
    }
}
