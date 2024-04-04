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
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cb;
import java.util.ArrayList;
import java.util.List;

public class do
implements Parcelable.Creator {
    static void a(cb cb2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, cb2.b);
        c.a(parcel, 2, cb2.c, false);
        c.a(parcel, 3, cb2.d, false);
        c.a(parcel, 4, cb2.e, false);
        c.a(parcel, 5, cb2.f);
        c.a(parcel, 6, cb2.g, false);
        c.a(parcel, 7, cb2.h);
        c.a(parcel, 8, cb2.i);
        c.a(parcel, 9, cb2.j);
        c.a(parcel, 10, cb2.k, false);
        c.a(parcel, 11, cb2.l);
        c.a(parcel, 12, cb2.m);
        c.a(parcel, 13, cb2.n, false);
        c.a(parcel, n2);
    }

    public cb a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
        ArrayList arrayList = null;
        int n4 = 0;
        ArrayList arrayList2 = null;
        long l2 = 0L;
        boolean bl2 = false;
        long l3 = 0L;
        ArrayList arrayList3 = null;
        long l4 = 0L;
        int n5 = 0;
        String string3 = null;
        block15 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block15;
                }
                case 1: {
                    n3 = a.g(parcel, n6);
                    continue block15;
                }
                case 2: {
                    string = a.m(parcel, n6);
                    continue block15;
                }
                case 3: {
                    string2 = a.m(parcel, n6);
                    continue block15;
                }
                case 4: {
                    arrayList = a.y(parcel, n6);
                    continue block15;
                }
                case 5: {
                    n4 = a.g(parcel, n6);
                    continue block15;
                }
                case 6: {
                    arrayList2 = a.y(parcel, n6);
                    continue block15;
                }
                case 7: {
                    l2 = a.h(parcel, n6);
                    continue block15;
                }
                case 8: {
                    bl2 = a.c(parcel, n6);
                    continue block15;
                }
                case 9: {
                    l3 = a.h(parcel, n6);
                    continue block15;
                }
                case 10: {
                    arrayList3 = a.y(parcel, n6);
                    continue block15;
                }
                case 11: {
                    l4 = a.h(parcel, n6);
                    continue block15;
                }
                case 12: {
                    n5 = a.g(parcel, n6);
                    continue block15;
                }
                case 13: 
            }
            string3 = a.m(parcel, n6);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new cb(n3, string, string2, (List)arrayList, n4, (List)arrayList2, l2, bl2, l3, (List)arrayList3, l4, n5, string3);
    }

    public cb[] a(int n2) {
        return new cb[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

