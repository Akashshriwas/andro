// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import java.util.ArrayList;
import com.google.android.gms.games.GameEntity;
import android.os.Parcel;

final class a extends g
{
    @Override
    public InvitationEntity a(final Parcel parcel) {
        if (.b(.w()) || .b(InvitationEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        final GameEntity gameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
        final String string = parcel.readString();
        final long long1 = parcel.readLong();
        final int int1 = parcel.readInt();
        final ParticipantEntity participantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel);
        final int int2 = parcel.readInt();
        final ArrayList list = new ArrayList<Object>(int2);
        for (int i = 0; i < int2; ++i) {
            list.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, string, long1, int1, participantEntity, list, -1);
    }
}
