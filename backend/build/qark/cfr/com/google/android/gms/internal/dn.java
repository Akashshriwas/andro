/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ka;
import com.google.android.gms.internal.kb;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;

public class dn
implements Parcelable.Creator {
    static void a(bz bz2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, bz2.b);
        c.a(parcel, 2, bz2.c, false);
        c.a(parcel, 3, bz2.d, n2, false);
        c.a(parcel, 4, bz2.e, n2, false);
        c.a(parcel, 5, bz2.f, false);
        c.a(parcel, 6, (Parcelable)bz2.g, n2, false);
        c.a(parcel, 7, (Parcelable)bz2.h, n2, false);
        c.a(parcel, 8, bz2.i, false);
        c.a(parcel, 9, bz2.j, false);
        c.a(parcel, 10, bz2.k, false);
        c.a(parcel, 11, bz2.l, n2, false);
        c.a(parcel, n3);
    }

    public bz a(Parcel parcel) {
        ct ct2 = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
        String string3 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        String string4 = null;
        x x2 = null;
        v v2 = null;
        Bundle bundle = null;
        block13 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block13;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block13;
                }
                case 2: {
                    bundle = a.o(parcel, n4);
                    continue block13;
                }
                case 3: {
                    v2 = (v)a.a(parcel, n4, v.a);
                    continue block13;
                }
                case 4: {
                    x2 = (x)a.a(parcel, n4, x.a);
                    continue block13;
                }
                case 5: {
                    string4 = a.m(parcel, n4);
                    continue block13;
                }
                case 6: {
                    applicationInfo = (ApplicationInfo)a.a(parcel, n4, ApplicationInfo.CREATOR);
                    continue block13;
                }
                case 7: {
                    packageInfo = (PackageInfo)a.a(parcel, n4, PackageInfo.CREATOR);
                    continue block13;
                }
                case 8: {
                    string3 = a.m(parcel, n4);
                    continue block13;
                }
                case 9: {
                    string2 = a.m(parcel, n4);
                    continue block13;
                }
                case 10: {
                    string = a.m(parcel, n4);
                    continue block13;
                }
                case 11: 
            }
            ct2 = (ct)a.a(parcel, n4, ct.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new bz(n3, bundle, v2, x2, string4, applicationInfo, packageInfo, string3, string2, string, ct2);
    }

    public bz[] a(int n2) {
        return new bz[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

