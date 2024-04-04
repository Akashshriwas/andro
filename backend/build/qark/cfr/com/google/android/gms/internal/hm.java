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
import com.google.android.gms.internal.eh$a;
import com.google.android.gms.internal.eh$b;
import com.google.android.gms.internal.hk;
import java.util.ArrayList;
import java.util.List;

public class hm
implements Parcelable.Creator {
    static void a(eh$a eh$a, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, eh$a.b);
        c.a(parcel, 2, eh$a.c, false);
        c.b(parcel, 3, (List)eh$a.d, false);
        c.a(parcel, n2);
    }

    public eh$a a(Parcel parcel) {
        ArrayList arrayList = null;
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
            arrayList = a.c(parcel, n4, eh$b.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new eh$a(n3, string, arrayList);
    }

    public eh$a[] a(int n2) {
        return new eh$a[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

