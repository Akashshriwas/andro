/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import java.util.List;

public class g
implements Parcelable.Creator {
    static void a(InvitationEntity invitationEntity, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, invitationEntity.b(), n2, false);
        c.a(parcel, 1000, invitationEntity.h());
        c.a(parcel, 2, invitationEntity.c(), false);
        c.a(parcel, 3, invitationEntity.e());
        c.a(parcel, 4, invitationEntity.f());
        c.a(parcel, 5, invitationEntity.d(), n2, false);
        c.b(parcel, 6, (List)invitationEntity.i(), false);
        c.a(parcel, 7, invitationEntity.g());
        c.a(parcel, n3);
    }

    public InvitationEntity a(Parcel parcel) {
        int n2 = 0;
        ArrayList arrayList = null;
        int n3 = a.b(parcel);
        long l2 = 0L;
        ParticipantEntity participantEntity = null;
        int n4 = 0;
        String string = null;
        GameEntity gameEntity = null;
        int n5 = 0;
        block10 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block10;
                }
                case 1: {
                    gameEntity = (GameEntity)a.a(parcel, n6, GameEntity.CREATOR);
                    continue block10;
                }
                case 1000: {
                    n5 = a.g(parcel, n6);
                    continue block10;
                }
                case 2: {
                    string = a.m(parcel, n6);
                    continue block10;
                }
                case 3: {
                    l2 = a.h(parcel, n6);
                    continue block10;
                }
                case 4: {
                    n4 = a.g(parcel, n6);
                    continue block10;
                }
                case 5: {
                    participantEntity = (ParticipantEntity)a.a(parcel, n6, ParticipantEntity.CREATOR);
                    continue block10;
                }
                case 6: {
                    arrayList = a.c(parcel, n6, ParticipantEntity.CREATOR);
                    continue block10;
                }
                case 7: 
            }
            n2 = a.g(parcel, n6);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new InvitationEntity(n5, gameEntity, string, l2, n4, participantEntity, arrayList, n2);
    }

    public InvitationEntity[] a(int n2) {
        return new InvitationEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

