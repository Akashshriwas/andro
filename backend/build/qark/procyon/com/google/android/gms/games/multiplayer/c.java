// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.PlayerEntity;
import android.net.Uri;
import android.os.Parcel;

final class c extends h
{
    @Override
    public ParticipantEntity a(final Parcel parcel) {
        int n = 1;
        if (.b(.w()) || .b(ParticipantEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        final String string = parcel.readString();
        final String string2 = parcel.readString();
        final String string3 = parcel.readString();
        Uri parse;
        if (string3 == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(string3);
        }
        final String string4 = parcel.readString();
        Uri parse2;
        if (string4 == null) {
            parse2 = null;
        }
        else {
            parse2 = Uri.parse(string4);
        }
        final int int1 = parcel.readInt();
        final String string5 = parcel.readString();
        final boolean b = parcel.readInt() > 0;
        if (parcel.readInt() <= 0) {
            n = 0;
        }
        PlayerEntity playerEntity;
        if (n != 0) {
            playerEntity = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
        }
        else {
            playerEntity = null;
        }
        return new ParticipantEntity(2, string, string2, parse, parse2, int1, string5, b, playerEntity, 7, null);
    }
}
