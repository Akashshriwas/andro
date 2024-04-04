/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.iq;
import java.util.HashSet;
import java.util.Set;

public class ir
implements Parcelable.Creator {
    static void a(gx gx2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        Set set = gx2.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, gx2.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, gx2.g(), true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, gx2.h(), n2, true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, gx2.i(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, gx2.j(), n2, true);
        }
        if (set.contains((Object)7)) {
            c.a(parcel, 7, gx2.k(), true);
        }
        c.a(parcel, n3);
    }

    public gx a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n3 = 0;
        gv gv2 = null;
        String string2 = null;
        gv gv3 = null;
        String string3 = null;
        block8 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block8;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    hashSet.add((Object)1);
                    continue block8;
                }
                case 2: {
                    string3 = a.m(parcel, n4);
                    hashSet.add((Object)2);
                    continue block8;
                }
                case 4: {
                    gv3 = (gv)a.a(parcel, n4, gv.a);
                    hashSet.add((Object)4);
                    continue block8;
                }
                case 5: {
                    string2 = a.m(parcel, n4);
                    hashSet.add((Object)5);
                    continue block8;
                }
                case 6: {
                    gv2 = (gv)a.a(parcel, n4, gv.a);
                    hashSet.add((Object)6);
                    continue block8;
                }
                case 7: 
            }
            string = a.m(parcel, n4);
            hashSet.add((Object)7);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new gx((Set)hashSet, n3, string3, gv3, string2, gv2, string);
    }

    public gx[] a(int n2) {
        return new gx[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

