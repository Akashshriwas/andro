// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games;

import com.google.android.gms.common.internal.safeparcel.b;
import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class d implements Parcelable$Creator
{
    static void a(final GameEntity gameEntity, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, gameEntity.b(), false);
        c.a(parcel, 2, gameEntity.c(), false);
        c.a(parcel, 3, gameEntity.d(), false);
        c.a(parcel, 4, gameEntity.e(), false);
        c.a(parcel, 5, gameEntity.f(), false);
        c.a(parcel, 6, gameEntity.g(), false);
        c.a(parcel, 7, (Parcelable)gameEntity.h(), n, false);
        c.a(parcel, 8, (Parcelable)gameEntity.i(), n, false);
        c.a(parcel, 9, (Parcelable)gameEntity.j(), n, false);
        c.a(parcel, 10, gameEntity.k());
        c.a(parcel, 11, gameEntity.l());
        c.a(parcel, 12, gameEntity.m(), false);
        c.a(parcel, 13, gameEntity.n());
        c.a(parcel, 14, gameEntity.o());
        c.a(parcel, 15, gameEntity.p());
        c.a(parcel, 17, gameEntity.r());
        c.a(parcel, 16, gameEntity.q());
        c.a(parcel, 1000, gameEntity.s());
        c.a(parcel, a);
    }
    
    public GameEntity a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        String i = null;
        String j = null;
        String k = null;
        String l = null;
        String m2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean c = false;
        boolean c2 = false;
        String m3 = null;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        boolean c3 = false;
        boolean c4 = false;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    m2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 8: {
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 9: {
                    uri3 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 10: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 11: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 12: {
                    m3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 13: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 14: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 15: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 17: {
                    c4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 16: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
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
        return new GameEntity(g, m, i, j, k, l, m2, uri, uri2, uri3, c, c2, m3, g2, g3, g4, c3, c4);
    }
    
    public GameEntity[] a(final int n) {
        return new GameEntity[n];
    }
}
