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
import com.google.android.gms.internal.ha$b;
import com.google.android.gms.internal.ha$b$a;
import com.google.android.gms.internal.ha$b$b;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.ix;
import java.util.HashSet;
import java.util.Set;

public class iv
implements Parcelable.Creator {
    static void a(ha$b ha$b, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        Set set = ha$b.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$b.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$b.g(), n2, true);
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$b.h(), n2, true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, ha$b.i());
        }
        c.a(parcel, n3);
    }

    public ha$b a(Parcel parcel) {
        ha$b$b ha$b$b = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        HashSet hashSet = new HashSet();
        ha$b$a ha$b$a = null;
        int n4 = 0;
        block6 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block6;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    hashSet.add((Object)1);
                    continue block6;
                }
                case 2: {
                    ha$b$a = (ha$b$a)a.a(parcel, n5, ha$b$a.a);
                    hashSet.add((Object)2);
                    continue block6;
                }
                case 3: {
                    ha$b$b = (ha$b$b)a.a(parcel, n5, ha$b$b.a);
                    hashSet.add((Object)3);
                    continue block6;
                }
                case 4: 
            }
            n2 = a.g(parcel, n5);
            hashSet.add((Object)4);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ha$b((Set)hashSet, n4, ha$b$a, ha$b$b, n2);
    }

    public ha$b[] a(int n2) {
        return new ha$b[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

