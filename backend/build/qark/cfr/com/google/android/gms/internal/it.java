/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.ha$a;
import com.google.android.gms.internal.ha$b;
import com.google.android.gms.internal.ha$c;
import com.google.android.gms.internal.ha$d;
import com.google.android.gms.internal.ha$f;
import com.google.android.gms.internal.ha$g;
import com.google.android.gms.internal.ha$h;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.iv;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class it
implements Parcelable.Creator {
    static void a(ha ha2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        Set set = ha2.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, ha2.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, ha2.g(), true);
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, ha2.h(), n2, true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, ha2.i(), true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, ha2.j(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, ha2.k());
        }
        if (set.contains((Object)7)) {
            c.a(parcel, 7, ha2.l(), n2, true);
        }
        if (set.contains((Object)8)) {
            c.a(parcel, 8, ha2.m(), true);
        }
        if (set.contains((Object)9)) {
            c.a(parcel, 9, ha2.n(), true);
        }
        if (set.contains((Object)12)) {
            c.a(parcel, 12, ha2.o());
        }
        if (set.contains((Object)14)) {
            c.a(parcel, 14, ha2.p(), true);
        }
        if (set.contains((Object)15)) {
            c.a(parcel, 15, ha2.q(), n2, true);
        }
        if (set.contains((Object)16)) {
            c.a(parcel, 16, ha2.r());
        }
        if (set.contains((Object)19)) {
            c.a(parcel, 19, ha2.t(), n2, true);
        }
        if (set.contains((Object)18)) {
            c.a(parcel, 18, ha2.s(), true);
        }
        if (set.contains((Object)21)) {
            c.a(parcel, 21, ha2.v());
        }
        if (set.contains((Object)20)) {
            c.a(parcel, 20, ha2.u(), true);
        }
        if (set.contains((Object)23)) {
            c.b(parcel, 23, ha2.x(), true);
        }
        if (set.contains((Object)22)) {
            c.b(parcel, 22, ha2.w(), true);
        }
        if (set.contains((Object)25)) {
            c.a(parcel, 25, ha2.z());
        }
        if (set.contains((Object)24)) {
            c.a(parcel, 24, ha2.y());
        }
        if (set.contains((Object)27)) {
            c.a(parcel, 27, ha2.B(), true);
        }
        if (set.contains((Object)26)) {
            c.a(parcel, 26, ha2.A(), true);
        }
        if (set.contains((Object)29)) {
            c.a(parcel, 29, ha2.D());
        }
        if (set.contains((Object)28)) {
            c.b(parcel, 28, ha2.C(), true);
        }
        c.a(parcel, n3);
    }

    public ha a(Parcel parcel) {
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n3 = 0;
        String string = null;
        ha$a ha$a = null;
        String string2 = null;
        String string3 = null;
        int n4 = 0;
        ha$b ha$b = null;
        String string4 = null;
        String string5 = null;
        int n5 = 0;
        String string6 = null;
        ha$c ha$c = null;
        boolean bl2 = false;
        String string7 = null;
        ha$d ha$d = null;
        String string8 = null;
        int n6 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int n7 = 0;
        int n8 = 0;
        String string9 = null;
        String string10 = null;
        ArrayList arrayList3 = null;
        boolean bl3 = false;
        block27 : while (parcel.dataPosition() < n2) {
            int n9 = a.a(parcel);
            switch (a.a(n9)) {
                default: {
                    a.b(parcel, n9);
                    continue block27;
                }
                case 1: {
                    n3 = a.g(parcel, n9);
                    hashSet.add((Object)1);
                    continue block27;
                }
                case 2: {
                    string = a.m(parcel, n9);
                    hashSet.add((Object)2);
                    continue block27;
                }
                case 3: {
                    ha$a = (ha$a)a.a(parcel, n9, ha$a.a);
                    hashSet.add((Object)3);
                    continue block27;
                }
                case 4: {
                    string2 = a.m(parcel, n9);
                    hashSet.add((Object)4);
                    continue block27;
                }
                case 5: {
                    string3 = a.m(parcel, n9);
                    hashSet.add((Object)5);
                    continue block27;
                }
                case 6: {
                    n4 = a.g(parcel, n9);
                    hashSet.add((Object)6);
                    continue block27;
                }
                case 7: {
                    ha$b = (ha$b)a.a(parcel, n9, ha$b.a);
                    hashSet.add((Object)7);
                    continue block27;
                }
                case 8: {
                    string4 = a.m(parcel, n9);
                    hashSet.add((Object)8);
                    continue block27;
                }
                case 9: {
                    string5 = a.m(parcel, n9);
                    hashSet.add((Object)9);
                    continue block27;
                }
                case 12: {
                    n5 = a.g(parcel, n9);
                    hashSet.add((Object)12);
                    continue block27;
                }
                case 14: {
                    string6 = a.m(parcel, n9);
                    hashSet.add((Object)14);
                    continue block27;
                }
                case 15: {
                    ha$c = (ha$c)a.a(parcel, n9, ha$c.a);
                    hashSet.add((Object)15);
                    continue block27;
                }
                case 16: {
                    bl2 = a.c(parcel, n9);
                    hashSet.add((Object)16);
                    continue block27;
                }
                case 19: {
                    ha$d = (ha$d)a.a(parcel, n9, ha$d.a);
                    hashSet.add((Object)19);
                    continue block27;
                }
                case 18: {
                    string7 = a.m(parcel, n9);
                    hashSet.add((Object)18);
                    continue block27;
                }
                case 21: {
                    n6 = a.g(parcel, n9);
                    hashSet.add((Object)21);
                    continue block27;
                }
                case 20: {
                    string8 = a.m(parcel, n9);
                    hashSet.add((Object)20);
                    continue block27;
                }
                case 23: {
                    arrayList2 = a.c(parcel, n9, ha$g.a);
                    hashSet.add((Object)23);
                    continue block27;
                }
                case 22: {
                    arrayList = a.c(parcel, n9, ha$f.a);
                    hashSet.add((Object)22);
                    continue block27;
                }
                case 25: {
                    n8 = a.g(parcel, n9);
                    hashSet.add((Object)25);
                    continue block27;
                }
                case 24: {
                    n7 = a.g(parcel, n9);
                    hashSet.add((Object)24);
                    continue block27;
                }
                case 27: {
                    string10 = a.m(parcel, n9);
                    hashSet.add((Object)27);
                    continue block27;
                }
                case 26: {
                    string9 = a.m(parcel, n9);
                    hashSet.add((Object)26);
                    continue block27;
                }
                case 29: {
                    bl3 = a.c(parcel, n9);
                    hashSet.add((Object)29);
                    continue block27;
                }
                case 28: 
            }
            arrayList3 = a.c(parcel, n9, ha$h.a);
            hashSet.add((Object)28);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ha((Set)hashSet, n3, string, ha$a, string2, string3, n4, ha$b, string4, string5, n5, string6, ha$c, bl2, string7, ha$d, string8, n6, (List)arrayList, (List)arrayList2, n7, n8, string9, string10, (List)arrayList3, bl3);
    }

    public ha[] a(int n2) {
        return new ha[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

