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
import com.google.android.gms.internal.ha$a;
import java.util.HashSet;
import java.util.Set;

public class iu
implements Parcelable.Creator {
    static void a(ha$a ha$a, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$a.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$a.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$a.g());
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$a.h());
        }
        c.a(parcel, n2);
    }

    public ha$a a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n4 = 0;
        int n5 = 0;
        block5 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block5;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    hashSet.add((Object)1);
                    continue block5;
                }
                case 2: {
                    n4 = a.g(parcel, n6);
                    hashSet.add((Object)2);
                    continue block5;
                }
                case 3: 
            }
            n2 = a.g(parcel, n6);
            hashSet.add((Object)3);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ha$a((Set)hashSet, n5, n4, n2);
    }

    public ha$a[] a(int n2) {
        return new ha$a[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

