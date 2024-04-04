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
import com.google.android.gms.internal.ct;

public class eu
implements Parcelable.Creator {
    static void a(ct ct2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, ct2.b);
        c.a(parcel, 2, ct2.c, false);
        c.a(parcel, 3, ct2.d);
        c.a(parcel, 4, ct2.e);
        c.a(parcel, 5, ct2.f);
        c.a(parcel, n2);
    }

    public ct a(Parcel parcel) {
        boolean bl2 = false;
        int n2 = a.b(parcel);
        String string = null;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        block7 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block7;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    continue block7;
                }
                case 2: {
                    string = a.m(parcel, n6);
                    continue block7;
                }
                case 3: {
                    n4 = a.g(parcel, n6);
                    continue block7;
                }
                case 4: {
                    n3 = a.g(parcel, n6);
                    continue block7;
                }
                case 5: 
            }
            bl2 = a.c(parcel, n6);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ct(n5, string, n4, n3, bl2);
    }

    public ct[] a(int n2) {
        return new ct[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

