/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.il;
import java.util.List;

public final class gd
implements SafeParcelable {
    public static final il a = new il();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    public gd(int n2, String string, String string2, String string3, String string4, List list) {
        this.b = n2;
        this.c = string;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = list;
    }

    public int describeContents() {
        il il2 = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof gd)) {
                    return false;
                }
                object = (gd)object;
                if (!gw.a((Object)this.c, (Object)object.c) || !gw.a((Object)this.d, (Object)object.d) || !gw.a((Object)this.e, (Object)object.e) || !gw.a((Object)this.f, (Object)object.f) || !gw.a((Object)this.g, (Object)object.g)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(this.c, this.d, this.e, this.f);
    }

    public String toString() {
        return gw.a((Object)this).a("name", this.c).a("address", this.d).a("internationalPhoneNumber", this.e).a("regularOpenHours", this.f).a("attributions", (Object)this.g).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        il il2 = a;
        il.a(this, parcel, n2);
    }
}

