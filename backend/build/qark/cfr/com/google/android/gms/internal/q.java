/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ai;

public class q
implements Parcelable.Creator {
    static void a(ai ai2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, ai2.b);
        c.a(parcel, 2, ai2.c);
        c.a(parcel, 3, ai2.d);
        c.a(parcel, 4, ai2.e);
        c.a(parcel, 5, ai2.f);
        c.a(parcel, 6, ai2.g);
        c.a(parcel, 7, ai2.h);
        c.a(parcel, 8, ai2.i);
        c.a(parcel, 9, ai2.j);
        c.a(parcel, 10, ai2.k, false);
        c.a(parcel, 11, ai2.l);
        c.a(parcel, 12, ai2.m, false);
        c.a(parcel, 13, ai2.n);
        c.a(parcel, 14, ai2.o);
        c.a(parcel, 15, ai2.p, false);
        c.a(parcel, n2);
    }

    public ai a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        String string = null;
        int n12 = 0;
        String string2 = null;
        int n13 = 0;
        int n14 = 0;
        String string3 = null;
        block17 : while (parcel.dataPosition() < n2) {
            int n15 = a.a(parcel);
            switch (a.a(n15)) {
                default: {
                    a.b(parcel, n15);
                    continue block17;
                }
                case 1: {
                    n3 = a.g(parcel, n15);
                    continue block17;
                }
                case 2: {
                    n4 = a.g(parcel, n15);
                    continue block17;
                }
                case 3: {
                    n5 = a.g(parcel, n15);
                    continue block17;
                }
                case 4: {
                    n6 = a.g(parcel, n15);
                    continue block17;
                }
                case 5: {
                    n7 = a.g(parcel, n15);
                    continue block17;
                }
                case 6: {
                    n8 = a.g(parcel, n15);
                    continue block17;
                }
                case 7: {
                    n9 = a.g(parcel, n15);
                    continue block17;
                }
                case 8: {
                    n10 = a.g(parcel, n15);
                    continue block17;
                }
                case 9: {
                    n11 = a.g(parcel, n15);
                    continue block17;
                }
                case 10: {
                    string = a.m(parcel, n15);
                    continue block17;
                }
                case 11: {
                    n12 = a.g(parcel, n15);
                    continue block17;
                }
                case 12: {
                    string2 = a.m(parcel, n15);
                    continue block17;
                }
                case 13: {
                    n13 = a.g(parcel, n15);
                    continue block17;
                }
                case 14: {
                    n14 = a.g(parcel, n15);
                    continue block17;
                }
                case 15: 
            }
            string3 = a.m(parcel, n15);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ai(n3, n4, n5, n6, n7, n8, n9, n10, n11, string, n12, string2, n13, n14, string3);
    }

    public ai[] a(int n2) {
        return new ai[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

