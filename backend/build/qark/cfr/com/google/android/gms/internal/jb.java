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
import com.google.android.gms.internal.ha$g;
import java.util.HashSet;
import java.util.Set;

public class jb
implements Parcelable.Creator {
    static void a(ha$g ha$g, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$g.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$g.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$g.g());
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$g.h(), true);
        }
        c.a(parcel, n2);
    }

    public ha$g a(Parcel parcel) {
        boolean bl2 = false;
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        String string = null;
        int n3 = 0;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    hashSet.add((Object)1);
                    continue block5;
                }
                case 2: {
                    bl2 = a.c(parcel, n4);
                    hashSet.add((Object)2);
                    continue block5;
                }
                case 3: 
            }
            string = a.m(parcel, n4);
            hashSet.add((Object)3);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ha$g((Set)hashSet, n3, bl2, string);
    }

    public ha$g[] a(int n2) {
        return new ha$g[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

