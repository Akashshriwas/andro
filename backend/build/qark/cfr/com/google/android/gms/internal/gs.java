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
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.ip;

public class gs
implements SafeParcelable {
    public static final ip a = new ip();
    private final int b;
    private final String c;
    private final String[] d;
    private final String[] e;
    private final String[] f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    gs(int n2, String string, String[] arrstring, String[] arrstring2, String[] arrstring3, String string2, String string3, String string4, String string5) {
        this.b = n2;
        this.c = string;
        this.d = arrstring;
        this.e = arrstring2;
        this.f = arrstring3;
        this.g = string2;
        this.h = string3;
        this.i = string4;
        this.j = string5;
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

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block3 : {
            block2 : {
                if (!(object instanceof gs)) break block2;
                object = (gs)object;
                if (this.b == object.b && gw.a((Object)this.c, (Object)object.c) && gw.a((Object)this.d, (Object)object.d) && gw.a((Object)this.e, (Object)object.e) && gw.a((Object)this.f, (Object)object.f) && gw.a((Object)this.g, (Object)object.g) && gw.a((Object)this.h, (Object)object.h) && gw.a((Object)this.i, (Object)object.i) && gw.a((Object)this.j, (Object)object.j)) break block3;
            }
            return false;
        }
        return true;
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

    public int hashCode() {
        return gw.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public String i() {
        return this.j;
    }

    public String toString() {
        return gw.a((Object)this).a("versionCode", this.b).a("accountName", this.c).a("requestedScopes", this.d).a("visibleActivities", this.e).a("requiredFeatures", this.f).a("packageNameForAuth", this.g).a("callingPackageName", this.h).a("applicationName", this.i).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ip.a(this, parcel, n2);
    }
}

