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
 */
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.e;
import java.util.ArrayList;

final class c
extends e {
    c() {
    }

    @Override
    public RoomEntity a(Parcel parcel) {
        if (RoomEntity.a(RoomEntity.m()) || RoomEntity.a(RoomEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        long l2 = parcel.readLong();
        int n2 = parcel.readInt();
        String string3 = parcel.readString();
        int n3 = parcel.readInt();
        Bundle bundle = parcel.readBundle();
        int n4 = parcel.readInt();
        ArrayList arrayList = new ArrayList(n4);
        for (int i2 = 0; i2 < n4; ++i2) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new RoomEntity(2, string, string2, l2, n2, string3, n3, bundle, arrayList, -1);
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

