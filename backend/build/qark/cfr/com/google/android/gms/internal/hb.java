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
import com.google.android.gms.internal.dh$a;
import java.util.ArrayList;
import java.util.List;

public class hb
implements Parcelable.Creator {
    static void a(dh$a dh$a, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, dh$a.a(), false);
        c.a(parcel, 1000, dh$a.e());
        c.a(parcel, 2, dh$a.d(), false);
        c.a(parcel, 3, dh$a.b());
        c.a(parcel, 4, dh$a.c(), false);
        c.a(parcel, n2);
    }

    public dh$a a(Parcel parcel) {
        int n2 = 0;
        String string = null;
        int n3 = a.b(parcel);
        ArrayList arrayList = null;
        String string2 = null;
        int n4 = 0;
        block7 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block7;
                }
                case 1: {
                    string2 = a.m(parcel, n5);
                    continue block7;
                }
                case 1000: {
                    n4 = a.g(parcel, n5);
                    continue block7;
                }
                case 2: {
                    arrayList = a.y(parcel, n5);
                    continue block7;
                }
                case 3: {
                    n2 = a.g(parcel, n5);
                    continue block7;
                }
                case 4: 
            }
            string = a.m(parcel, n5);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new dh$a(n4, string2, (List)arrayList, n2, string);
    }

    public dh$a[] a(int n2) {
        return new dh$a[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

