/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

public final class bz
implements SafeParcelable {
    public static final dn a = new dn();
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

    bz(int n2, Bundle bundle, v v2, x x2, String string, ApplicationInfo applicationInfo, PackageInfo packageInfo, String string2, String string3, String string4, ct ct2) {
        this.b = n2;
        this.c = bundle;
        this.d = v2;
        this.e = x2;
        this.f = string;
        this.g = applicationInfo;
        this.h = packageInfo;
        this.i = string2;
        this.j = string3;
        this.k = string4;
        this.l = ct2;
    }

    public bz(Bundle bundle, v v2, x x2, String string, ApplicationInfo applicationInfo, PackageInfo packageInfo, String string2, String string3, String string4, ct ct2) {
        this(1, bundle, v2, x2, string, applicationInfo, packageInfo, string2, string3, string4, ct2);
    }

    public bz(dl dl2, String string) {
        this(dl2.a, dl2.b, dl2.c, dl2.d, dl2.e, dl2.f, string, dl2.g, dl2.h, dl2.i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        dn.a(this, parcel, n2);
    }
}

