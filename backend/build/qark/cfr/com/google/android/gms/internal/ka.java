/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.q;
import com.google.android.gms.internal.v;
import java.util.ArrayList;
import java.util.List;

public class ka
implements Parcelable.Creator {
    static void a(v v2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, v2.b);
        c.a(parcel, 2, v2.c);
        c.a(parcel, 3, v2.d, false);
        c.a(parcel, 4, v2.e);
        c.a(parcel, 5, v2.f, false);
        c.a(parcel, 6, v2.g);
        c.a(parcel, 7, v2.h);
        c.a(parcel, 8, v2.i);
        c.a(parcel, 9, v2.j, false);
        c.a(parcel, 10, v2.k, n2, false);
        c.a(parcel, 11, (Parcelable)v2.l, n2, false);
        c.a(parcel, n3);
    }

    public v a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        long l2 = 0L;
        Bundle bundle = null;
        int n4 = 0;
        ArrayList arrayList = null;
        boolean bl2 = false;
        int n5 = 0;
        boolean bl3 = false;
        String string = null;
        ai ai2 = null;
        Location location = null;
        block13 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block13;
                }
                case 1: {
                    n3 = a.g(parcel, n6);
                    continue block13;
                }
                case 2: {
                    l2 = a.h(parcel, n6);
                    continue block13;
                }
                case 3: {
                    bundle = a.o(parcel, n6);
                    continue block13;
                }
                case 4: {
                    n4 = a.g(parcel, n6);
                    continue block13;
                }
                case 5: {
                    arrayList = a.y(parcel, n6);
                    continue block13;
                }
                case 6: {
                    bl2 = a.c(parcel, n6);
                    continue block13;
                }
                case 7: {
                    n5 = a.g(parcel, n6);
                    continue block13;
                }
                case 8: {
                    bl3 = a.c(parcel, n6);
                    continue block13;
                }
                case 9: {
                    string = a.m(parcel, n6);
                    continue block13;
                }
                case 10: {
                    ai2 = (ai)a.a(parcel, n6, ai.a);
                    continue block13;
                }
                case 11: 
            }
            location = (Location)a.a(parcel, n6, Location.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new v(n3, l2, bundle, n4, (List)arrayList, bl2, n5, bl3, string, ai2, location);
    }

    public v[] a(int n2) {
        return new v[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

