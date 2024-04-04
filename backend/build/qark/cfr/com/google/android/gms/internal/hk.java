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
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.eh$b;
import com.google.android.gms.internal.hj;

public class hk
implements Parcelable.Creator {
    static void a(eh$b eh$b, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, eh$b.b);
        c.a(parcel, 2, eh$b.c, false);
        c.a(parcel, 3, eh$b.d, n2, false);
        c.a(parcel, n3);
    }

    public eh$b a(Parcel parcel) {
        ee$a ee$a = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: {
                    string = a.m(parcel, n4);
                    continue block5;
                }
                case 3: 
            }
            ee$a = (ee$a)a.a(parcel, n4, ee$a.i);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new eh$b(n3, string, ee$a);
    }

    public eh$b[] a(int n2) {
        return new eh$b[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

