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
import com.google.android.gms.internal.fs;
import com.google.android.gms.internal.fw;
import com.google.android.gms.internal.ig;
import java.util.ArrayList;
import java.util.List;

public class ie
implements Parcelable.Creator {
    static void a(fs fs2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, fs2.a());
        c.a(parcel, 1000, fs2.b);
        c.b(parcel, 2, fs2.c, false);
        c.a(parcel, 3, fs2.b(), false);
        c.a(parcel, 4, fs2.c(), false);
        c.a(parcel, 5, fs2.d());
        c.a(parcel, n2);
    }

    public fs a(Parcel parcel) {
        String string = null;
        boolean bl2 = false;
        int n2 = a.b(parcel);
        String string2 = null;
        ArrayList arrayList = null;
        int n3 = 0;
        int n4 = 0;
        block8 : while (parcel.dataPosition() < n2) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block8;
                }
                case 1: {
                    n3 = a.g(parcel, n5);
                    continue block8;
                }
                case 1000: {
                    n4 = a.g(parcel, n5);
                    continue block8;
                }
                case 2: {
                    arrayList = a.c(parcel, n5, fw.bv);
                    continue block8;
                }
                case 3: {
                    string2 = a.m(parcel, n5);
                    continue block8;
                }
                case 4: {
                    string = a.m(parcel, n5);
                    continue block8;
                }
                case 5: 
            }
            bl2 = a.c(parcel, n5);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new fs(n4, n3, (List)arrayList, string2, string, bl2);
    }

    public fs[] a(int n2) {
        return new fs[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

