/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
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

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.fw;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.ig;
import com.google.android.gms.internal.il;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.List;

public class ik
implements Parcelable.Creator {
    static void a(gb gb2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, gb2.a(), false);
        c.a(parcel, 2, gb2.k(), false);
        c.a(parcel, 3, gb2.l(), n2, false);
        c.a(parcel, 4, gb2.c(), n2, false);
        c.a(parcel, 5, gb2.d());
        c.a(parcel, 6, gb2.e(), n2, false);
        c.a(parcel, 7, gb2.m(), false);
        c.a(parcel, 8, (Parcelable)gb2.f(), n2, false);
        c.a(parcel, 9, gb2.g());
        c.a(parcel, 10, gb2.h());
        c.a(parcel, 11, gb2.i());
        c.a(parcel, 12, gb2.j());
        c.b(parcel, 13, gb2.b(), false);
        c.a(parcel, 1000, gb2.b);
        c.a(parcel, n3);
    }

    public gb a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        ArrayList arrayList = null;
        Bundle bundle = null;
        gd gd2 = null;
        LatLng latLng = null;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        String string2 = null;
        Uri uri = null;
        boolean bl2 = false;
        float f3 = 0.0f;
        int n4 = 0;
        long l2 = 0L;
        block16 : while (parcel.dataPosition() < n2) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block16;
                }
                case 1: {
                    string = a.m(parcel, n5);
                    continue block16;
                }
                case 2: {
                    bundle = a.o(parcel, n5);
                    continue block16;
                }
                case 3: {
                    gd2 = (gd)a.a(parcel, n5, gd.a);
                    continue block16;
                }
                case 4: {
                    latLng = (LatLng)a.a(parcel, n5, LatLng.a);
                    continue block16;
                }
                case 5: {
                    f2 = a.j(parcel, n5);
                    continue block16;
                }
                case 6: {
                    latLngBounds = (LatLngBounds)a.a(parcel, n5, LatLngBounds.a);
                    continue block16;
                }
                case 7: {
                    string2 = a.m(parcel, n5);
                    continue block16;
                }
                case 8: {
                    uri = (Uri)a.a(parcel, n5, Uri.CREATOR);
                    continue block16;
                }
                case 9: {
                    bl2 = a.c(parcel, n5);
                    continue block16;
                }
                case 10: {
                    f3 = a.j(parcel, n5);
                    continue block16;
                }
                case 11: {
                    n4 = a.g(parcel, n5);
                    continue block16;
                }
                case 12: {
                    l2 = a.h(parcel, n5);
                    continue block16;
                }
                case 13: {
                    arrayList = a.c(parcel, n5, fw.bv);
                    continue block16;
                }
                case 1000: 
            }
            n3 = a.g(parcel, n5);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new gb(n3, string, (List)arrayList, bundle, gd2, latLng, f2, latLngBounds, string2, uri, bl2, f3, n4, l2);
    }

    public gb[] a(int n2) {
        return new gb[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

