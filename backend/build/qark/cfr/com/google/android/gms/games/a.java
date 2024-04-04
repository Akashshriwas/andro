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
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.d;

final class a
extends d {
    a() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public GameEntity a(Parcel parcel) {
        boolean bl2;
        if (GameEntity.a(GameEntity.u())) return super.a(parcel);
        if (GameEntity.a(GameEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        string7 = string7 == null ? null : Uri.parse((String)string7);
        String string8 = parcel.readString();
        string8 = string8 == null ? null : Uri.parse((String)string8);
        String string9 = parcel.readString();
        string9 = string9 == null ? null : Uri.parse((String)string9);
        boolean bl3 = parcel.readInt() > 0;
        if (parcel.readInt() > 0) {
            bl2 = true;
            return new GameEntity(2, string, string2, string3, string4, string5, string6, (Uri)string7, (Uri)string8, (Uri)string9, bl3, bl2, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false);
        }
        bl2 = false;
        return new GameEntity(2, string, string2, string3, string4, string5, string6, (Uri)string7, (Uri)string8, (Uri)string9, bl3, bl2, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false);
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

