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
import com.google.android.gms.internal.ha$f;
import java.util.HashSet;
import java.util.Set;

public class ja
implements Parcelable.Creator {
    static void a(ha$f ha$f, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$f.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$f.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha$f.g(), true);
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$f.h(), true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, ha$f.i(), true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, ha$f.j(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, ha$f.k(), true);
        }
        if (set.contains((Object)7)) {
            c.a(parcel, 7, ha$f.l());
        }
        if (set.contains((Object)8)) {
            c.a(parcel, 8, ha$f.m(), true);
        }
        if (set.contains((Object)9)) {
            c.a(parcel, 9, ha$f.n(), true);
        }
        if (set.contains((Object)10)) {
            c.a(parcel, 10, ha$f.o());
        }
        c.a(parcel, n2);
    }

    public ha$f a(Parcel parcel) {
        int n2 = 0;
        String string = null;
        int n3 = a.b(parcel);
        HashSet hashSet = new HashSet();
        String string2 = null;
        boolean bl2 = false;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        int n4 = 0;
        block12 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block12;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    hashSet.add((Object)1);
                    continue block12;
                }
                case 2: {
                    string7 = a.m(parcel, n5);
                    hashSet.add((Object)2);
                    continue block12;
                }
                case 3: {
                    string6 = a.m(parcel, n5);
                    hashSet.add((Object)3);
                    continue block12;
                }
                case 4: {
                    string5 = a.m(parcel, n5);
                    hashSet.add((Object)4);
                    continue block12;
                }
                case 5: {
                    string4 = a.m(parcel, n5);
                    hashSet.add((Object)5);
                    continue block12;
                }
                case 6: {
                    string3 = a.m(parcel, n5);
                    hashSet.add((Object)6);
                    continue block12;
                }
                case 7: {
                    bl2 = a.c(parcel, n5);
                    hashSet.add((Object)7);
                    continue block12;
                }
                case 8: {
                    string2 = a.m(parcel, n5);
                    hashSet.add((Object)8);
                    continue block12;
                }
                case 9: {
                    string = a.m(parcel, n5);
                    hashSet.add((Object)9);
                    continue block12;
                }
                case 10: 
            }
            n2 = a.g(parcel, n5);
            hashSet.add((Object)10);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ha$f((Set)hashSet, n4, string7, string6, string5, string4, string3, bl2, string2, string, n2);
    }

    public ha$f[] a(int n2) {
        return new ha$f[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

