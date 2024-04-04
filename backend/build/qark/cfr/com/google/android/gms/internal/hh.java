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
import com.google.android.gms.internal.eb$a;

public class hh
implements Parcelable.Creator {
    static void a(eb$a eb$a, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, eb$a.b);
        c.a(parcel, 2, eb$a.c, false);
        c.a(parcel, 3, eb$a.d);
        c.a(parcel, n2);
    }

    public eb$a a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        String string = null;
        int n4 = 0;
        block5 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block5;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block5;
                }
                case 2: {
                    string = a.m(parcel, n5);
                    continue block5;
                }
                case 3: 
            }
            n2 = a.g(parcel, n5);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new eb$a(n4, string, n2);
    }

    public eb$a[] a(int n2) {
        return new eb$a[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

