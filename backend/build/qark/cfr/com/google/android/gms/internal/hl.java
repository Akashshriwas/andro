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
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.eh$a;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.List;

public class hl
implements Parcelable.Creator {
    static void a(eh eh2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, eh2.b());
        c.b(parcel, 2, (List)eh2.c(), false);
        c.a(parcel, 3, eh2.d(), false);
        c.a(parcel, n2);
    }

    public eh a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        ArrayList arrayList = null;
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
                    arrayList = a.c(parcel, n4, eh$a.a);
                    continue block5;
                }
                case 3: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new eh(n3, arrayList, string);
    }

    public eh[] a(int n2) {
        return new eh[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

