/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity;
import java.util.ArrayList;
import java.util.List;

public class c
implements Parcelable.Creator {
    static void a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int n2) {
        int n3 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, turnBasedMatchEntity.b(), n2, false);
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
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 13, (List)turnBasedMatchEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, turnBasedMatchEntity.o(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, turnBasedMatchEntity.p(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, turnBasedMatchEntity.r(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, turnBasedMatchEntity.q());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, turnBasedMatchEntity.u());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, turnBasedMatchEntity.t());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, turnBasedMatchEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n3);
    }

    public TurnBasedMatchEntity a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        GameEntity gameEntity = null;
        String string = null;
        String string2 = null;
        long l2 = 0L;
        String string3 = null;
        long l3 = 0L;
        String string4 = null;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        byte[] arrby = null;
        ArrayList arrayList = null;
        String string5 = null;
        byte[] arrby2 = null;
        int n7 = 0;
        Bundle bundle = null;
        int n8 = 0;
        boolean bl2 = false;
        block21 : while (parcel.dataPosition() < n2) {
            int n9 = a.a(parcel);
            switch (a.a(n9)) {
                default: {
                    a.b(parcel, n9);
                    continue block21;
                }
                case 1: {
                    gameEntity = (GameEntity)a.a(parcel, n9, GameEntity.CREATOR);
                    continue block21;
                }
                case 2: {
                    string = a.m(parcel, n9);
                    continue block21;
                }
                case 3: {
                    string2 = a.m(parcel, n9);
                    continue block21;
                }
                case 4: {
                    l2 = a.h(parcel, n9);
                    continue block21;
                }
                case 5: {
                    string3 = a.m(parcel, n9);
                    continue block21;
                }
                case 6: {
                    l3 = a.h(parcel, n9);
                    continue block21;
                }
                case 7: {
                    string4 = a.m(parcel, n9);
                    continue block21;
                }
                case 8: {
                    n4 = a.g(parcel, n9);
                    continue block21;
                }
                case 10: {
                    n5 = a.g(parcel, n9);
                    continue block21;
                }
                case 11: {
                    n6 = a.g(parcel, n9);
                    continue block21;
                }
                case 12: {
                    arrby = a.p(parcel, n9);
                    continue block21;
                }
                case 13: {
                    arrayList = a.c(parcel, n9, ParticipantEntity.CREATOR);
                    continue block21;
                }
                case 14: {
                    string5 = a.m(parcel, n9);
                    continue block21;
                }
                case 15: {
                    arrby2 = a.p(parcel, n9);
                    continue block21;
                }
                case 17: {
                    bundle = a.o(parcel, n9);
                    continue block21;
                }
                case 16: {
                    n7 = a.g(parcel, n9);
                    continue block21;
                }
                case 1000: {
                    n3 = a.g(parcel, n9);
                    continue block21;
                }
                case 19: {
                    bl2 = a.c(parcel, n9);
                    continue block21;
                }
                case 18: 
            }
            n8 = a.g(parcel, n9);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new TurnBasedMatchEntity(n3, gameEntity, string, string2, l2, string3, l3, string4, n4, n5, n6, arrby, arrayList, string5, arrby2, n7, bundle, n8, bl2);
    }

    public TurnBasedMatchEntity[] a(int n2) {
        return new TurnBasedMatchEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

