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
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.g;
import java.util.ArrayList;

final class a
extends g {
    a() {
    }

    @Override
    public InvitationEntity a(Parcel parcel) {
        if (InvitationEntity.a(InvitationEntity.k()) || InvitationEntity.a(InvitationEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        GameEntity gameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        long l2 = parcel.readLong();
        int n2 = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel);
        int n3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, string, l2, n2, participantEntity, arrayList, -1);
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

