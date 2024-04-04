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
import com.google.android.gms.internal.bj;

public class ca
implements Parcelable.Creator {
    static void a(bj bj2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, bj2.b);
        c.a(parcel, 2, bj2.c, false);
        c.a(parcel, 3, bj2.d, false);
        c.a(parcel, 4, bj2.e, false);
        c.a(parcel, 5, bj2.f, false);
        c.a(parcel, 6, bj2.g, false);
        c.a(parcel, 7, bj2.h, false);
        c.a(parcel, 8, bj2.i, false);
        c.a(parcel, n2);
    }

    public bj a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        block10 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block10;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block10;
                }
                case 2: {
                    string7 = a.m(parcel, n4);
                    continue block10;
                }
                case 3: {
                    string6 = a.m(parcel, n4);
                    continue block10;
                }
                case 4: {
                    string5 = a.m(parcel, n4);
                    continue block10;
                }
                case 5: {
                    string4 = a.m(parcel, n4);
                    continue block10;
                }
                case 6: {
                    string3 = a.m(parcel, n4);
                    continue block10;
                }
                case 7: {
                    string2 = a.m(parcel, n4);
                    continue block10;
                }
                case 8: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new bj(n3, string7, string6, string5, string4, string3, string2, string);
    }

    public bj[] a(int n2) {
        return new bj[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

