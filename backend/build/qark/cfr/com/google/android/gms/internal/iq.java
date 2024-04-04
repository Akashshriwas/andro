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
import com.google.android.gms.internal.gv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class iq
implements Parcelable.Creator {
    static void a(gv gv2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        Set set = gv2.e();
        if (set.contains((Object)1)) {
            c.a(parcel, 1, gv2.f());
        }
        if (set.contains((Object)2)) {
            c.a(parcel, 2, gv2.g(), n2, true);
        }
        if (set.contains((Object)3)) {
            c.a(parcel, 3, gv2.h(), true);
        }
        if (set.contains((Object)4)) {
            c.a(parcel, 4, gv2.i(), n2, true);
        }
        if (set.contains((Object)5)) {
            c.a(parcel, 5, gv2.j(), true);
        }
        if (set.contains((Object)6)) {
            c.a(parcel, 6, gv2.k(), true);
        }
        if (set.contains((Object)7)) {
            c.a(parcel, 7, gv2.l(), true);
        }
        if (set.contains((Object)8)) {
            c.b(parcel, 8, gv2.m(), true);
        }
        if (set.contains((Object)9)) {
            c.a(parcel, 9, gv2.n());
        }
        if (set.contains((Object)10)) {
            c.b(parcel, 10, gv2.o(), true);
        }
        if (set.contains((Object)11)) {
            c.a(parcel, 11, gv2.p(), n2, true);
        }
        if (set.contains((Object)12)) {
            c.b(parcel, 12, gv2.q(), true);
        }
        if (set.contains((Object)13)) {
            c.a(parcel, 13, gv2.r(), true);
        }
        if (set.contains((Object)14)) {
            c.a(parcel, 14, gv2.s(), true);
        }
        if (set.contains((Object)15)) {
            c.a(parcel, 15, gv2.t(), n2, true);
        }
        if (set.contains((Object)17)) {
            c.a(parcel, 17, gv2.v(), true);
        }
        if (set.contains((Object)16)) {
            c.a(parcel, 16, gv2.u(), true);
        }
        if (set.contains((Object)19)) {
            c.b(parcel, 19, gv2.x(), true);
        }
        if (set.contains((Object)18)) {
            c.a(parcel, 18, gv2.w(), true);
        }
        if (set.contains((Object)21)) {
            c.a(parcel, 21, gv2.z(), true);
        }
        if (set.contains((Object)20)) {
            c.a(parcel, 20, gv2.y(), true);
        }
        if (set.contains((Object)23)) {
            c.a(parcel, 23, gv2.B(), true);
        }
        if (set.contains((Object)22)) {
            c.a(parcel, 22, gv2.A(), true);
        }
        if (set.contains((Object)25)) {
            c.a(parcel, 25, gv2.D(), true);
        }
        if (set.contains((Object)24)) {
            c.a(parcel, 24, gv2.C(), true);
        }
        if (set.contains((Object)27)) {
            c.a(parcel, 27, gv2.F(), true);
        }
        if (set.contains((Object)26)) {
            c.a(parcel, 26, gv2.E(), true);
        }
        if (set.contains((Object)29)) {
            c.a(parcel, 29, gv2.H(), n2, true);
        }
        if (set.contains((Object)28)) {
            c.a(parcel, 28, gv2.G(), true);
        }
        if (set.contains((Object)31)) {
            c.a(parcel, 31, gv2.J(), true);
        }
        if (set.contains((Object)30)) {
            c.a(parcel, 30, gv2.I(), true);
        }
        if (set.contains((Object)34)) {
            c.a(parcel, 34, gv2.M(), n2, true);
        }
        if (set.contains((Object)32)) {
            c.a(parcel, 32, gv2.K(), true);
        }
        if (set.contains((Object)33)) {
            c.a(parcel, 33, gv2.L(), true);
        }
        if (set.contains((Object)38)) {
            c.a(parcel, 38, gv2.P());
        }
        if (set.contains((Object)39)) {
            c.a(parcel, 39, gv2.Q(), true);
        }
        if (set.contains((Object)36)) {
            c.a(parcel, 36, gv2.N());
        }
        if (set.contains((Object)37)) {
            c.a(parcel, 37, gv2.O(), n2, true);
        }
        if (set.contains((Object)42)) {
            c.a(parcel, 42, gv2.T(), true);
        }
        if (set.contains((Object)43)) {
            c.a(parcel, 43, gv2.U(), true);
        }
        if (set.contains((Object)40)) {
            c.a(parcel, 40, gv2.R(), n2, true);
        }
        if (set.contains((Object)41)) {
            c.b(parcel, 41, gv2.S(), true);
        }
        if (set.contains((Object)46)) {
            c.a(parcel, 46, gv2.X(), n2, true);
        }
        if (set.contains((Object)47)) {
            c.a(parcel, 47, gv2.Y(), true);
        }
        if (set.contains((Object)44)) {
            c.a(parcel, 44, gv2.V(), true);
        }
        if (set.contains((Object)45)) {
            c.a(parcel, 45, gv2.W(), true);
        }
        if (set.contains((Object)51)) {
            c.a(parcel, 51, gv2.ac(), true);
        }
        if (set.contains((Object)50)) {
            c.a(parcel, 50, gv2.ab(), n2, true);
        }
        if (set.contains((Object)49)) {
            c.a(parcel, 49, gv2.aa(), true);
        }
        if (set.contains((Object)48)) {
            c.a(parcel, 48, gv2.Z(), true);
        }
        if (set.contains((Object)55)) {
            c.a(parcel, 55, gv2.ag(), true);
        }
        if (set.contains((Object)54)) {
            c.a(parcel, 54, gv2.af(), true);
        }
        if (set.contains((Object)53)) {
            c.a(parcel, 53, gv2.ae(), true);
        }
        if (set.contains((Object)52)) {
            c.a(parcel, 52, gv2.ad(), true);
        }
        if (set.contains((Object)56)) {
            c.a(parcel, 56, gv2.ah(), true);
        }
        c.a(parcel, n3);
    }

    public gv a(Parcel parcel) {
        int n2 = a.b(parcel);
        HashSet hashSet = new HashSet();
        int n3 = 0;
        gv gv2 = null;
        ArrayList arrayList = null;
        gv gv3 = null;
        String string = null;
        String string2 = null;
        String string3 = null;
        ArrayList arrayList2 = null;
        int n4 = 0;
        ArrayList arrayList3 = null;
        gv gv4 = null;
        ArrayList arrayList4 = null;
        String string4 = null;
        String string5 = null;
        gv gv5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        ArrayList arrayList5 = null;
        String string9 = null;
        String string10 = null;
        String string11 = null;
        String string12 = null;
        String string13 = null;
        String string14 = null;
        String string15 = null;
        String string16 = null;
        String string17 = null;
        gv gv6 = null;
        String string18 = null;
        String string19 = null;
        String string20 = null;
        String string21 = null;
        gv gv7 = null;
        double d2 = 0.0;
        gv gv8 = null;
        double d3 = 0.0;
        String string22 = null;
        gv gv9 = null;
        ArrayList arrayList6 = null;
        String string23 = null;
        String string24 = null;
        String string25 = null;
        String string26 = null;
        gv gv10 = null;
        String string27 = null;
        String string28 = null;
        String string29 = null;
        gv gv11 = null;
        String string30 = null;
        String string31 = null;
        String string32 = null;
        String string33 = null;
        String string34 = null;
        String string35 = null;
        block57 : while (parcel.dataPosition() < n2) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block57;
                }
                case 1: {
                    n3 = a.g(parcel, n5);
                    hashSet.add((Object)1);
                    continue block57;
                }
                case 2: {
                    gv2 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)2);
                    continue block57;
                }
                case 3: {
                    arrayList = a.y(parcel, n5);
                    hashSet.add((Object)3);
                    continue block57;
                }
                case 4: {
                    gv3 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)4);
                    continue block57;
                }
                case 5: {
                    string = a.m(parcel, n5);
                    hashSet.add((Object)5);
                    continue block57;
                }
                case 6: {
                    string2 = a.m(parcel, n5);
                    hashSet.add((Object)6);
                    continue block57;
                }
                case 7: {
                    string3 = a.m(parcel, n5);
                    hashSet.add((Object)7);
                    continue block57;
                }
                case 8: {
                    arrayList2 = a.c(parcel, n5, gv.a);
                    hashSet.add((Object)8);
                    continue block57;
                }
                case 9: {
                    n4 = a.g(parcel, n5);
                    hashSet.add((Object)9);
                    continue block57;
                }
                case 10: {
                    arrayList3 = a.c(parcel, n5, gv.a);
                    hashSet.add((Object)10);
                    continue block57;
                }
                case 11: {
                    gv4 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)11);
                    continue block57;
                }
                case 12: {
                    arrayList4 = a.c(parcel, n5, gv.a);
                    hashSet.add((Object)12);
                    continue block57;
                }
                case 13: {
                    string4 = a.m(parcel, n5);
                    hashSet.add((Object)13);
                    continue block57;
                }
                case 14: {
                    string5 = a.m(parcel, n5);
                    hashSet.add((Object)14);
                    continue block57;
                }
                case 15: {
                    gv5 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)15);
                    continue block57;
                }
                case 17: {
                    string7 = a.m(parcel, n5);
                    hashSet.add((Object)17);
                    continue block57;
                }
                case 16: {
                    string6 = a.m(parcel, n5);
                    hashSet.add((Object)16);
                    continue block57;
                }
                case 19: {
                    arrayList5 = a.c(parcel, n5, gv.a);
                    hashSet.add((Object)19);
                    continue block57;
                }
                case 18: {
                    string8 = a.m(parcel, n5);
                    hashSet.add((Object)18);
                    continue block57;
                }
                case 21: {
                    string10 = a.m(parcel, n5);
                    hashSet.add((Object)21);
                    continue block57;
                }
                case 20: {
                    string9 = a.m(parcel, n5);
                    hashSet.add((Object)20);
                    continue block57;
                }
                case 23: {
                    string12 = a.m(parcel, n5);
                    hashSet.add((Object)23);
                    continue block57;
                }
                case 22: {
                    string11 = a.m(parcel, n5);
                    hashSet.add((Object)22);
                    continue block57;
                }
                case 25: {
                    string14 = a.m(parcel, n5);
                    hashSet.add((Object)25);
                    continue block57;
                }
                case 24: {
                    string13 = a.m(parcel, n5);
                    hashSet.add((Object)24);
                    continue block57;
                }
                case 27: {
                    string16 = a.m(parcel, n5);
                    hashSet.add((Object)27);
                    continue block57;
                }
                case 26: {
                    string15 = a.m(parcel, n5);
                    hashSet.add((Object)26);
                    continue block57;
                }
                case 29: {
                    gv6 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)29);
                    continue block57;
                }
                case 28: {
                    string17 = a.m(parcel, n5);
                    hashSet.add((Object)28);
                    continue block57;
                }
                case 31: {
                    string19 = a.m(parcel, n5);
                    hashSet.add((Object)31);
                    continue block57;
                }
                case 30: {
                    string18 = a.m(parcel, n5);
                    hashSet.add((Object)30);
                    continue block57;
                }
                case 34: {
                    gv7 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)34);
                    continue block57;
                }
                case 32: {
                    string20 = a.m(parcel, n5);
                    hashSet.add((Object)32);
                    continue block57;
                }
                case 33: {
                    string21 = a.m(parcel, n5);
                    hashSet.add((Object)33);
                    continue block57;
                }
                case 38: {
                    d3 = a.k(parcel, n5);
                    hashSet.add((Object)38);
                    continue block57;
                }
                case 39: {
                    string22 = a.m(parcel, n5);
                    hashSet.add((Object)39);
                    continue block57;
                }
                case 36: {
                    d2 = a.k(parcel, n5);
                    hashSet.add((Object)36);
                    continue block57;
                }
                case 37: {
                    gv8 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)37);
                    continue block57;
                }
                case 42: {
                    string23 = a.m(parcel, n5);
                    hashSet.add((Object)42);
                    continue block57;
                }
                case 43: {
                    string24 = a.m(parcel, n5);
                    hashSet.add((Object)43);
                    continue block57;
                }
                case 40: {
                    gv9 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)40);
                    continue block57;
                }
                case 41: {
                    arrayList6 = a.c(parcel, n5, gv.a);
                    hashSet.add((Object)41);
                    continue block57;
                }
                case 46: {
                    gv10 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)46);
                    continue block57;
                }
                case 47: {
                    string27 = a.m(parcel, n5);
                    hashSet.add((Object)47);
                    continue block57;
                }
                case 44: {
                    string25 = a.m(parcel, n5);
                    hashSet.add((Object)44);
                    continue block57;
                }
                case 45: {
                    string26 = a.m(parcel, n5);
                    hashSet.add((Object)45);
                    continue block57;
                }
                case 51: {
                    string30 = a.m(parcel, n5);
                    hashSet.add((Object)51);
                    continue block57;
                }
                case 50: {
                    gv11 = (gv)a.a(parcel, n5, gv.a);
                    hashSet.add((Object)50);
                    continue block57;
                }
                case 49: {
                    string29 = a.m(parcel, n5);
                    hashSet.add((Object)49);
                    continue block57;
                }
                case 48: {
                    string28 = a.m(parcel, n5);
                    hashSet.add((Object)48);
                    continue block57;
                }
                case 55: {
                    string34 = a.m(parcel, n5);
                    hashSet.add((Object)55);
                    continue block57;
                }
                case 54: {
                    string33 = a.m(parcel, n5);
                    hashSet.add((Object)54);
                    continue block57;
                }
                case 53: {
                    string32 = a.m(parcel, n5);
                    hashSet.add((Object)53);
                    continue block57;
                }
                case 52: {
                    string31 = a.m(parcel, n5);
                    hashSet.add((Object)52);
                    continue block57;
                }
                case 56: 
            }
            string35 = a.m(parcel, n5);
            hashSet.add((Object)56);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new gv((Set)hashSet, n3, gv2, (List)arrayList, gv3, string, string2, string3, (List)arrayList2, n4, (List)arrayList3, gv4, (List)arrayList4, string4, string5, gv5, string6, string7, string8, (List)arrayList5, string9, string10, string11, string12, string13, string14, string15, string16, string17, gv6, string18, string19, string20, string21, gv7, d2, gv8, d3, string22, gv9, (List)arrayList6, string23, string24, string25, string26, gv10, string27, string28, string29, gv11, string30, string31, string32, string33, string34, string35);
    }

    public gv[] a(int n2) {
        return new gv[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

