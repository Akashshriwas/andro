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
import com.google.android.gms.internal.x;

public class kb
implements Parcelable.Creator {
    static void a(x x2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, x2.b);
        c.a(parcel, 2, x2.c, false);
        c.a(parcel, 3, x2.d);
        c.a(parcel, 4, x2.e);
        c.a(parcel, 5, x2.f);
        c.a(parcel, 6, x2.g);
        c.a(parcel, 7, x2.h);
        c.a(parcel, 8, x2.i, n2, false);
        c.a(parcel, n3);
    }

    public x a(Parcel parcel) {
        x[] arrx = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        int n6 = 0;
        String string = null;
        int n7 = 0;
        block10 : while (parcel.dataPosition() < n3) {
            int n8 = a.a(parcel);
            switch (a.a(n8)) {
                default: {
                    a.b(parcel, n8);
                    continue block10;
                }
                case 1: {
                    n7 = a.g(parcel, n8);
                    continue block10;
                }
                case 2: {
                    string = a.m(parcel, n8);
                    continue block10;
                }
                case 3: {
                    n6 = a.g(parcel, n8);
                    continue block10;
                }
                case 4: {
                    n5 = a.g(parcel, n8);
                    continue block10;
                }
                case 5: {
                    bl2 = a.c(parcel, n8);
                    continue block10;
                }
                case 6: {
                    n4 = a.g(parcel, n8);
                    continue block10;
                }
                case 7: {
                    n2 = a.g(parcel, n8);
                    continue block10;
                }
                case 8: 
            }
            arrx = (x[])a.b(parcel, n8, x.a);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new x(n7, string, n6, n5, bl2, n4, n2, arrx);
    }

    public x[] a(int n2) {
        return new x[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

