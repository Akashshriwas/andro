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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class e
extends com.google.android.gms.common.data.e
implements Player {
    public e(DataHolder dataHolder, int n2) {
        super(dataHolder, n2);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.g();
    }

    @Override
    public String b() {
        return this.d("external_player_id");
    }

    @Override
    public String c() {
        return this.d("profile_name");
    }

    @Override
    public Uri d() {
        return this.f("profile_icon_image_uri");
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public Uri e() {
        return this.f("profile_hi_res_image_uri");
    }

    @Override
    public boolean equals(Object object) {
        return PlayerEntity.a(this, object);
    }

    @Override
    public long f() {
        return this.a("last_updated");
    }

    public Player g() {
        return new PlayerEntity(this);
    }

    @Override
    public int hashCode() {
        return PlayerEntity.a(this);
    }

    public String toString() {
        return PlayerEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((PlayerEntity)this.g()).writeToParcel(parcel, n2);
    }
}

