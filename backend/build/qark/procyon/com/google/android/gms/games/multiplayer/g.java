// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class g implements Parcelable$Creator
{
    static void a(final InvitationEntity invitationEntity, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, (Parcelable)invitationEntity.b(), n, false);
        c.a(parcel, 1000, invitationEntity.h());
        c.a(parcel, 2, invitationEntity.c(), false);
        c.a(parcel, 3, invitationEntity.e());
        c.a(parcel, 4, invitationEntity.f());
        c.a(parcel, 5, (Parcelable)invitationEntity.d(), n, false);
        c.b(parcel, 6, invitationEntity.i(), false);
        c.a(parcel, 7, invitationEntity.g());
        c.a(parcel, a);
    }
    
    public InvitationEntity a(final Parcel parcel) {
        int g = 0;
        ArrayList c = null;
        final int b = a.b(parcel);
        long h = 0L;
        ParticipantEntity participantEntity = null;
        int g2 = 0;
        String m = null;
        GameEntity gameEntity = null;
        int g3 = 0;
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
                case 1000: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 5: {
                    participantEntity = (ParticipantEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ParticipantEntity.CREATOR);
                    continue;
                }
                case 6: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, ParticipantEntity.CREATOR);
                    continue;
                }
                case 7: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new InvitationEntity(g3, gameEntity, m, h, g2, participantEntity, c, g);
    }
    
    public InvitationEntity[] a(final int n) {
        return new InvitationEntity[n];
    }
}
