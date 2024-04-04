// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.internal.jg;
import com.google.android.gms.drive.internal.h;
import android.util.Base64;
import com.google.android.gms.internal.hc;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DriveId implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final String b;
    final long c;
    final long d;
    private volatile String e;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    DriveId(final int a, final String s, final long c, final long d) {
        this.e = null;
        this.a = a;
        this.b = s;
        hc.b(!"".equals(s));
        this.c = c;
        this.d = d;
    }
    
    public final String a() {
        if (this.e == null) {
            this.e = "DriveId:" + Base64.encodeToString(this.b(), 10);
        }
        return this.e;
    }
    
    final byte[] b() {
        final h h = new h();
        h.b = this.a;
        String b;
        if (this.b == null) {
            b = "";
        }
        else {
            b = this.b;
        }
        h.c = b;
        h.d = this.c;
        h.e = this.d;
        return jg.a(h);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof DriveId && this.a().equals(((DriveId)o).a());
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
    
    @Override
    public String toString() {
        return this.a();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.b.a(this, parcel, n);
    }
}
