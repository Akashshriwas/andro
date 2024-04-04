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
import com.google.android.gms.internal.dz;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.hg;

public class hf
implements Parcelable.Creator {
    static void a(dz dz2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, dz2.a());
        c.a(parcel, 2, dz2.b(), n2, false);
        c.a(parcel, n3);
    }

    public dz a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        eb eb2 = null;
        block4 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block4;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block4;
                }
                case 2: 
            }
            eb2 = (eb)a.a(parcel, n4, eb.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new dz(n3, eb2);
    }

    public dz[] a(int n2) {
        return new dz[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

