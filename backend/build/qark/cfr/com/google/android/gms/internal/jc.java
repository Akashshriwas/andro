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
import com.google.android.gms.internal.ha$h;
import java.util.HashSet;
import java.util.Set;

public class jc
implements Parcelable.Creator {
    static void a(ha$h ha$h, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        Set set = ha$h.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha$h.f());
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha$h.h());
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, ha$h.j(), true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, ha$h.g(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, ha$h.i());
        }
        c.a(parcel, n2);
    }

    public ha$h a(Parcel parcel) {
        String string = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n4 = 0;
        String string2 = null;
        int n5 = 0;
        block7 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block7;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    hashSet.add((Object)1);
                    continue block7;
                }
                case 3: {
                    n2 = a.g(parcel, n6);
                    hashSet.add((Object)3);
                    continue block7;
                }
                case 4: {
                    string = a.m(parcel, n6);
                    hashSet.add((Object)4);
                    continue block7;
                }
                case 5: {
                    string2 = a.m(parcel, n6);
                    hashSet.add((Object)5);
                    continue block7;
                }
                case 6: 
            }
            n4 = a.g(parcel, n6);
            hashSet.add((Object)6);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ha$h((Set)hashSet, n5, string2, n4, string, n2);
    }

    public ha$h[] a(int n2) {
        return new ha$h[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

