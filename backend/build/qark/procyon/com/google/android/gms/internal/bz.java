// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class bz implements SafeParcelable
{
    public static final dn a;
    public final int b;
    public final Bundle c;
    public final v d;
    public final x e;
    public final String f;
    public final ApplicationInfo g;
    public final PackageInfo h;
    public final String i;
    public final String j;
    public final String k;
    public final ct l;
    
    static {
        a = new dn();
    }
    
    bz(final int b, final Bundle c, final v d, final x e, final String f, final ApplicationInfo g, final PackageInfo h, final String i, final String j, final String k, final ct l) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public bz(final Bundle bundle, final v v, final x x, final String s, final ApplicationInfo applicationInfo, final PackageInfo packageInfo, final String s2, final String s3, final String s4, final ct ct) {
        this(1, bundle, v, x, s, applicationInfo, packageInfo, s2, s3, s4, ct);
    }
    
    public bz(final dl dl, final String s) {
        this(dl.a, dl.b, dl.c, dl.d, dl.e, dl.f, s, dl.g, dl.h, dl.i);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        dn.a(this, parcel, n);
    }
}
