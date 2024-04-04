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
import com.google.android.gms.internal.fn;

public class ib
implements Parcelable.Creator {
    static void a(fn fn2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, fn2.f(), false);
        c.a(parcel, 1000, fn2.a());
        c.a(parcel, 2, fn2.g());
        c.a(parcel, 3, fn2.b());
        c.a(parcel, 4, fn2.c());
        c.a(parcel, 5, fn2.d());
        c.a(parcel, 6, fn2.e());
        c.a(parcel, 7, fn2.h());
        c.a(parcel, 8, fn2.i());
        c.a(parcel, 9, fn2.j());
        c.a(parcel, n2);
    }

    public fn a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        int n4 = 0;
        short s2 = 0;
        double d2 = 0.0;
        double d3 = 0.0;
        float f2 = 0.0f;
        long l2 = 0L;
        int n5 = 0;
        int n6 = -1;
        block12 : while (parcel.dataPosition() < n2) {
            int n7 = a.a(parcel);
            switch (a.a(n7)) {
                default: {
                    a.b(parcel, n7);
                    continue block12;
                }
                case 1: {
                    string = a.m(parcel, n7);
                    continue block12;
                }
                case 1000: {
                    n3 = a.g(parcel, n7);
                    continue block12;
                }
                case 2: {
                    l2 = a.h(parcel, n7);
                    continue block12;
                }
                case 3: {
                    s2 = a.f(parcel, n7);
                    continue block12;
                }
                case 4: {
                    d2 = a.k(parcel, n7);
                    continue block12;
                }
                case 5: {
                    d3 = a.k(parcel, n7);
                    continue block12;
                }
                case 6: {
                    f2 = a.j(parcel, n7);
                    continue block12;
                }
                case 7: {
                    n4 = a.g(parcel, n7);
                    continue block12;
                }
                case 8: {
                    n5 = a.g(parcel, n7);
                    continue block12;
                }
                case 9: 
            }
            n6 = a.g(parcel, n7);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new fn(n3, string, n4, s2, d2, d3, f2, l2, n5, n6);
    }

    public fn[] a(int n2) {
        return new fn[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

