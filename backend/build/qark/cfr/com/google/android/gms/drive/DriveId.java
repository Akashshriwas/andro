/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.b;
import com.google.android.gms.drive.internal.h;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.jg;

public class DriveId
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    final int a;
    final String b;
    final long c;
    final long d;
    private volatile String e = null;

    /*
     * Enabled aggressive block sorting
     */
    DriveId(int n2, String string, long l2, long l3) {
        this.a = n2;
        this.b = string;
        boolean bl2 = !"".equals((Object)string);
        hc.b(bl2);
        this.c = l2;
        this.d = l3;
    }

    public final String a() {
        if (this.e == null) {
            String string = Base64.encodeToString((byte[])this.b(), (int)10);
            this.e = "DriveId:" + string;
        }
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    final byte[] b() {
        h h2 = new h();
        h2.b = this.a;
        String string = this.b == null ? "" : this.b;
        h2.c = string;
        h2.d = this.c;
        h2.e = this.d;
        return jg.a(h2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof DriveId)) {
            return false;
        }
        object = (DriveId)object;
        return this.a().equals((Object)object.a());
    }

    public int hashCode() {
        return this.a().hashCode();
    }

    public String toString() {
        return this.a();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        b.a(this, parcel, n2);
    }
}

