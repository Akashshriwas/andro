/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.f;

final class c
extends f {
    c() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public PlayerEntity a(Parcel parcel) {
        Uri uri = null;
        if (PlayerEntity.a(PlayerEntity.i())) return super.a(parcel);
        if (PlayerEntity.a(PlayerEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        string3 = string3 == null ? null : Uri.parse((String)string3);
        if (string4 == null) {
            return new PlayerEntity(1, string, string2, (Uri)string3, uri, parcel.readLong());
        }
        uri = Uri.parse((String)string4);
        return new PlayerEntity(1, string, string2, (Uri)string3, uri, parcel.readLong());
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

