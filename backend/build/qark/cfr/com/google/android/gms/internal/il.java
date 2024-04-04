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
import com.google.android.gms.internal.gd;
import java.util.ArrayList;
import java.util.List;

public class il
implements Parcelable.Creator {
    static void a(gd gd2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, gd2.c, false);
        c.a(parcel, 1000, gd2.b);
        c.a(parcel, 2, gd2.d, false);
        c.a(parcel, 3, gd2.e, false);
        c.a(parcel, 4, gd2.f, false);
        c.a(parcel, 5, gd2.g, false);
        c.a(parcel, n2);
    }

    public gd a(Parcel parcel) {
        ArrayList arrayList = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        block8 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block8;
                }
                case 1: {
                    string4 = a.m(parcel, n4);
                    continue block8;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block8;
                }
                case 2: {
                    string3 = a.m(parcel, n4);
                    continue block8;
                }
                case 3: {
                    string2 = a.m(parcel, n4);
                    continue block8;
                }
                case 4: {
                    string = a.m(parcel, n4);
                    continue block8;
                }
                case 5: 
            }
            arrayList = a.y(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new gd(n3, string4, string3, string2, string, (List)arrayList);
    }

    public gd[] a(int n2) {
        return new gd[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

