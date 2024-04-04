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

public class f implements Parcelable$Creator
{
    static void a(final PlayerEntity playerEntity, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, playerEntity.b(), false);
        c.a(parcel, 1000, playerEntity.g());
        c.a(parcel, 2, playerEntity.c(), false);
        c.a(parcel, 3, (Parcelable)playerEntity.d(), n, false);
        c.a(parcel, 4, (Parcelable)playerEntity.e(), n, false);
        c.a(parcel, 5, playerEntity.f());
        c.a(parcel, a);
    }
    
    public PlayerEntity a(final Parcel parcel) {
        Uri uri = null;
        final int b = a.b(parcel);
        int g = 0;
        long h = 0L;
        Uri uri2 = null;
        String m = null;
        String i = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 4: {
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 5: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new PlayerEntity(g, i, m, uri2, uri, h);
    }
    
    public PlayerEntity[] a(final int n) {
        return new PlayerEntity[n];
    }
}
