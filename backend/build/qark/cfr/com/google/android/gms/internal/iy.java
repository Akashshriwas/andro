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
import com.google.android.gms.internal.ha$c;
import java.util.HashSet;
import java.util.Set;

public class iy
implements Parcelable.Creator {
    static void a(ha$c ha$c, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$c.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$c.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$c.g(), true);
        }
        c.a(parcel, n2);
    }

    public ha$c a(Parcel parcel) {
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n3 = 0;
        String string = null;
        block4 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block4;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    hashSet.add((Object)1);
                    continue block4;
                }
                case 2: 
            }
            string = a.m(parcel, n4);
            hashSet.add((Object)2);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ha$c((Set)hashSet, n3, string);
    }

    public ha$c[] a(int n2) {
        return new ha$c[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

