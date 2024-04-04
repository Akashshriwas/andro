// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class e implements Parcelable$Creator
{
    static void a(final RoomEntity roomEntity, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, roomEntity.b(), false);
        c.a(parcel, 1000, roomEntity.k());
        c.a(parcel, 2, roomEntity.c(), false);
        c.a(parcel, 3, roomEntity.d());
        c.a(parcel, 4, roomEntity.e());
        c.a(parcel, 5, roomEntity.f(), false);
        c.a(parcel, 6, roomEntity.g());
        c.a(parcel, 7, roomEntity.h(), false);
        c.b(parcel, 8, roomEntity.i(), false);
        c.a(parcel, 9, roomEntity.j());
        c.a(parcel, a);
    }
    
    public RoomEntity a(final Parcel parcel) {
        int g = 0;
        ArrayList c = null;
        final int b = a.b(parcel);
        long h = 0L;
        Bundle o = null;
        int g2 = 0;
        String m = null;
        int g3 = 0;
        String i = null;
        String j = null;
        int g4 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 5: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 7: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, ParticipantEntity.CREATOR);
                    continue;
                }
                case 9: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new RoomEntity(g4, j, i, h, g3, m, g2, o, c, g);
    }
    
    public RoomEntity[] a(final int n) {
        return new RoomEntity[n];
    }
}
