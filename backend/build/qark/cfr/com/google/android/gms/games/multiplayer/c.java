/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.h;

final class c
extends h {
    c() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public ParticipantEntity a(Parcel object) {
        boolean bl2 = true;
        if (ParticipantEntity.a(ParticipantEntity.n())) return super.a((Parcel)object);
        if (ParticipantEntity.a(ParticipantEntity.class.getCanonicalName())) {
            return super.a((Parcel)object);
        }
        String string = object.readString();
        String string2 = object.readString();
        String string3 = object.readString();
        string3 = string3 == null ? null : Uri.parse((String)string3);
        String string4 = object.readString();
        string4 = string4 == null ? null : Uri.parse((String)string4);
        int n2 = object.readInt();
        String string5 = object.readString();
        boolean bl3 = object.readInt() > 0;
        if (object.readInt() <= 0) {
            bl2 = false;
        }
        if (bl2) {
            object = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel((Parcel)object);
            return new ParticipantEntity(2, string, string2, (Uri)string3, (Uri)string4, n2, string5, bl3, (PlayerEntity)object, 7, null);
        }
        object = null;
        return new ParticipantEntity(2, string, string2, (Uri)string3, (Uri)string4, n2, string5, bl3, (PlayerEntity)object, 7, null);
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

