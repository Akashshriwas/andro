/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.ca;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.eu;

public class cg
implements Parcelable.Creator {
    static void a(bm bm2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, bm2.b);
        c.a(parcel, 2, bm2.c, n2, false);
        c.a(parcel, 3, bm2.a(), false);
        c.a(parcel, 4, bm2.b(), false);
        c.a(parcel, 5, bm2.c(), false);
        c.a(parcel, 6, bm2.d(), false);
        c.a(parcel, 7, bm2.h, false);
        c.a(parcel, 8, bm2.i);
        c.a(parcel, 9, bm2.j, false);
        c.a(parcel, 10, bm2.e(), false);
        c.a(parcel, 11, bm2.l);
        c.a(parcel, 12, bm2.m);
        c.a(parcel, 13, bm2.n, false);
        c.a(parcel, 14, bm2.o, n2, false);
        c.a(parcel, n3);
    }

    public bm a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        bj bj2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String string = null;
        boolean bl2 = false;
        String string2 = null;
        IBinder iBinder5 = null;
        int n4 = 0;
        int n5 = 0;
        String string3 = null;
        ct ct2 = null;
        block16 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block16;
                }
                case 1: {
                    n3 = a.g(parcel, n6);
                    continue block16;
                }
                case 2: {
                    bj2 = (bj)a.a(parcel, n6, bj.a);
                    continue block16;
                }
                case 3: {
                    iBinder = a.n(parcel, n6);
                    continue block16;
                }
                case 4: {
                    iBinder2 = a.n(parcel, n6);
                    continue block16;
                }
                case 5: {
                    iBinder3 = a.n(parcel, n6);
                    continue block16;
                }
                case 6: {
                    iBinder4 = a.n(parcel, n6);
                    continue block16;
                }
                case 7: {
                    string = a.m(parcel, n6);
                    continue block16;
                }
                case 8: {
                    bl2 = a.c(parcel, n6);
                    continue block16;
                }
                case 9: {
                    string2 = a.m(parcel, n6);
                    continue block16;
                }
                case 10: {
                    iBinder5 = a.n(parcel, n6);
                    continue block16;
                }
                case 11: {
                    n4 = a.g(parcel, n6);
                    continue block16;
                }
                case 12: {
                    n5 = a.g(parcel, n6);
                    continue block16;
                }
                case 13: {
                    string3 = a.m(parcel, n6);
                    continue block16;
                }
                case 14: 
            }
            ct2 = (ct)a.a(parcel, n6, ct.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new bm(n3, bj2, iBinder, iBinder2, iBinder3, iBinder4, string, bl2, string2, iBinder5, n4, n5, string3, ct2);
    }

    public bm[] a(int n2) {
        return new bm[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

