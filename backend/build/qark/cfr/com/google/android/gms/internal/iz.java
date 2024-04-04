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
import com.google.android.gms.internal.ha$d;
import java.util.HashSet;
import java.util.Set;

public class iz
implements Parcelable.Creator {
    static void a(ha$d ha$d, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$d.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$d.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$d.g(), true);
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$d.h(), true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, ha$d.i(), true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, ha$d.j(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, ha$d.k(), true);
        }
        if (set.contains((Object)7)) {
            c.a(parcel, 7, ha$d.l(), true);
        }
        c.a(parcel, n2);
    }

    public ha$d a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n3 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        block9 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block9;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    hashSet.add((Object)1);
                    continue block9;
                }
                case 2: {
                    string6 = a.m(parcel, n4);
                    hashSet.add((Object)2);
                    continue block9;
                }
                case 3: {
                    string5 = a.m(parcel, n4);
                    hashSet.add((Object)3);
                    continue block9;
                }
                case 4: {
                    string4 = a.m(parcel, n4);
                    hashSet.add((Object)4);
                    continue block9;
                }
                case 5: {
                    string3 = a.m(parcel, n4);
                    hashSet.add((Object)5);
                    continue block9;
                }
                case 6: {
                    string2 = a.m(parcel, n4);
                    hashSet.add((Object)6);
                    continue block9;
                }
                case 7: 
            }
            string = a.m(parcel, n4);
            hashSet.add((Object)7);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ha$d((Set)hashSet, n3, string6, string5, string4, string3, string2, string);
    }

    public ha$d[] a(int n2) {
        return new ha$d[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

