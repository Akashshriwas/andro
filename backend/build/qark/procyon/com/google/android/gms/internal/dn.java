// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.b;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class dn implements Parcelable$Creator
{
    static void a(final bz bz, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, bz.b);
        c.a(parcel, 2, bz.c, false);
        c.a(parcel, 3, (Parcelable)bz.d, n, false);
        c.a(parcel, 4, (Parcelable)bz.e, n, false);
        c.a(parcel, 5, bz.f, false);
        c.a(parcel, 6, (Parcelable)bz.g, n, false);
        c.a(parcel, 7, (Parcelable)bz.h, n, false);
        c.a(parcel, 8, bz.i, false);
        c.a(parcel, 9, bz.j, false);
        c.a(parcel, 10, bz.k, false);
        c.a(parcel, 11, (Parcelable)bz.l, n, false);
        c.a(parcel, a);
    }
    
    public bz a(final Parcel parcel) {
        ct ct = null;
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        String i = null;
        String j = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        String k = null;
        x x = null;
        v v = null;
        Bundle o = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 3: {
                    v = (v)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.v.a);
                    continue;
                }
                case 4: {
                    x = (x)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.x.a);
                    continue;
                }
                case 5: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    applicationInfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ApplicationInfo.CREATOR);
                    continue;
                }
                case 7: {
                    packageInfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, PackageInfo.CREATOR);
                    continue;
                }
                case 8: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 10: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 11: {
                    ct = (ct)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ct.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new bz(g, o, v, x, k, applicationInfo, packageInfo, j, i, m, ct);
    }
    
    public bz[] a(final int n) {
        return new bz[n];
    }
}
