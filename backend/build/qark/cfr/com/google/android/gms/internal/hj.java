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
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.hf;

public class hj
implements Parcelable.Creator {
    static void a(ee$a ee$a, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, ee$a.a());
        c.a(parcel, 2, ee$a.b());
        c.a(parcel, 3, ee$a.c());
        c.a(parcel, 4, ee$a.d());
        c.a(parcel, 5, ee$a.e());
        c.a(parcel, 6, ee$a.f(), false);
        c.a(parcel, 7, ee$a.g());
        c.a(parcel, 8, ee$a.i(), false);
        c.a(parcel, 9, ee$a.k(), n2, false);
        c.a(parcel, n3);
    }

    public ee$a a(Parcel parcel) {
        dz dz2 = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        String string = null;
        String string2 = null;
        boolean bl2 = false;
        int n4 = 0;
        boolean bl3 = false;
        int n5 = 0;
        int n6 = 0;
        block11 : while (parcel.dataPosition() < n3) {
            int n7 = a.a(parcel);
            switch (a.a(n7)) {
                default: {
                    a.b(parcel, n7);
                    continue block11;
                }
                case 1: {
                    n6 = a.g(parcel, n7);
                    continue block11;
                }
                case 2: {
                    n5 = a.g(parcel, n7);
                    continue block11;
                }
                case 3: {
                    bl3 = a.c(parcel, n7);
                    continue block11;
                }
                case 4: {
                    n4 = a.g(parcel, n7);
                    continue block11;
                }
                case 5: {
                    bl2 = a.c(parcel, n7);
                    continue block11;
                }
                case 6: {
                    string2 = a.m(parcel, n7);
                    continue block11;
                }
                case 7: {
                    n2 = a.g(parcel, n7);
                    continue block11;
                }
                case 8: {
                    string = a.m(parcel, n7);
                    continue block11;
                }
                case 9: 
            }
            dz2 = (dz)a.a(parcel, n7, dz.a);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ee$a(n6, n5, bl3, n4, bl2, string2, n2, string, dz2);
    }

    public ee$a[] a(int n2) {
        return new ee$a[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

