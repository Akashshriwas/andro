// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import android.net.Uri;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ik implements Parcelable$Creator
{
    static void a(final gb gb, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, gb.a(), false);
        c.a(parcel, 2, gb.k(), false);
        c.a(parcel, 3, (Parcelable)gb.l(), n, false);
        c.a(parcel, 4, (Parcelable)gb.c(), n, false);
        c.a(parcel, 5, gb.d());
        c.a(parcel, 6, (Parcelable)gb.e(), n, false);
        c.a(parcel, 7, gb.m(), false);
        c.a(parcel, 8, (Parcelable)gb.f(), n, false);
        c.a(parcel, 9, gb.g());
        c.a(parcel, 10, gb.h());
        c.a(parcel, 11, gb.i());
        c.a(parcel, 12, gb.j());
        c.b(parcel, 13, gb.b(), false);
        c.a(parcel, 1000, gb.b);
        c.a(parcel, a);
    }
    
    public gb a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        List c = null;
        Bundle o = null;
        gd gd = null;
        LatLng latLng = null;
        float j = 0.0f;
        LatLngBounds latLngBounds = null;
        String i = null;
        Uri uri = null;
        boolean c2 = false;
        float k = 0.0f;
        int g2 = 0;
        long h = 0L;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 2: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 3: {
                    gd = (gd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.gd.a);
                    continue;
                }
                case 4: {
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 6: {
                    latLngBounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLngBounds.a);
                    continue;
                }
                case 7: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 9: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 10: {
                    k = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 11: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 12: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 13: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)fw.bv);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new gb(g, m, c, o, gd, latLng, j, latLngBounds, i, uri, c2, k, g2, h);
    }
    
    public gb[] a(final int n) {
        return new gb[n];
    }
}
