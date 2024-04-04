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
import com.google.android.gms.internal.io;

public class gg
implements SafeParcelable {
    public static final io a = new io();
    public final int b;
    public final String c;
    public final String d;

    public gg(int n2, String string, String string2) {
        this.b = n2;
        this.c = string;
        this.d = string2;
    }

    public int describeContents() {
        io io2 = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (object == null || !(object instanceof gg)) {
                    return false;
                }
                object = (gg)object;
                if (!this.d.equals((Object)object.d) || !this.c.equals((Object)object.c)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.c, this.d});
    }

    public String toString() {
        return gw.a((Object)this).a("clientPackageName", this.c).a("locale", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        io io2 = a;
        io.a(this, parcel, n2);
    }
}

