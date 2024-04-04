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
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.ik;

public class ij
implements Parcelable.Creator {
    static void a(fz fz2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, fz2.a(), n2, false);
        c.a(parcel, 1000, fz2.b);
        c.a(parcel, 2, fz2.b(), false);
        c.a(parcel, n3);
    }

    public fz a(Parcel parcel) {
        float[] arrf = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        gb[] arrgb = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    arrgb = (gb[])a.b(parcel, n4, gb.a);
                    continue block5;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: 
            }
            arrf = a.u(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new fz(n3, arrgb, arrf);
    }

    public fz[] a(int n2) {
        return new fz[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

