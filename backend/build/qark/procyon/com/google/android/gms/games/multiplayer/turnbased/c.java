// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final TurnBasedMatchEntity turnBasedMatchEntity, final Parcel parcel, final int n) {
        final int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable)turnBasedMatchEntity.b(), n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, turnBasedMatchEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, turnBasedMatchEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, turnBasedMatchEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, turnBasedMatchEntity.j(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, turnBasedMatchEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, turnBasedMatchEntity.l(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, turnBasedMatchEntity.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, turnBasedMatchEntity.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, turnBasedMatchEntity.n());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, turnBasedMatchEntity.m(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 13, turnBasedMatchEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, turnBasedMatchEntity.o(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, turnBasedMatchEntity.p(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, turnBasedMatchEntity.r(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, turnBasedMatchEntity.q());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, turnBasedMatchEntity.u());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, turnBasedMatchEntity.t());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, turnBasedMatchEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }
    
    public TurnBasedMatchEntity a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        GameEntity gameEntity = null;
        String m = null;
        String i = null;
        long h = 0L;
        String j = null;
        long h2 = 0L;
        String k = null;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        byte[] p = null;
        ArrayList c = null;
        String l = null;
        byte[] p2 = null;
        int g5 = 0;
        Bundle o = null;
        int g6 = 0;
        boolean c2 = false;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    gameEntity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, GameEntity.CREATOR);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 7: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 8: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 10: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 11: {
                    g4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 12: {
                    p = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                    continue;
                }
                case 13: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, ParticipantEntity.CREATOR);
                    continue;
                }
                case 14: {
                    l = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 15: {
                    p2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                    continue;
                }
                case 17: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 16: {
                    g5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 19: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 18: {
                    g6 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new TurnBasedMatchEntity(g, gameEntity, m, i, h, j, h2, k, g2, g3, g4, p, c, l, p2, g5, o, g6, c2);
    }
    
    public TurnBasedMatchEntity[] a(final int n) {
        return new TurnBasedMatchEntity[n];
    }
}
