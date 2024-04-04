// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class gs implements SafeParcelable
{
    public static final ip a;
    private final int b;
    private final String c;
    private final String[] d;
    private final String[] e;
    private final String[] f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    
    static {
        a = new ip();
    }
    
    gs(final int b, final String c, final String[] d, final String[] e, final String[] f, final String g, final String h, final String i, final String j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public int a() {
        return this.b;
    }
    
    public String b() {
        return this.c;
    }
    
    public String[] c() {
        return this.d;
    }
    
    public String[] d() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String[] e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof gs) {
            final gs gs = (gs)o;
            if (this.b == gs.b && gw.a(this.c, gs.c) && gw.a((Object)this.d, gs.d) && gw.a((Object)this.e, gs.e) && gw.a((Object)this.f, gs.f) && gw.a(this.g, gs.g) && gw.a(this.h, gs.h) && gw.a(this.i, gs.i) && gw.a(this.j, gs.j)) {
                return true;
            }
        }
        return false;
    }
    
    public String f() {
        return this.g;
    }
    
    public String g() {
        return this.h;
    }
    
    public String h() {
        return this.i;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
    
    public String i() {
        return this.j;
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("versionCode", this.b).a("accountName", this.c).a("requestedScopes", this.d).a("visibleActivities", this.e).a("requiredFeatures", this.f).a("packageNameForAuth", this.g).a("callingPackageName", this.h).a("applicationName", this.i).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ip.a(this, parcel, n);
    }
}
