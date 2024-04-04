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
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;

public final class b
extends e
implements Game {
    @Override
    public /* synthetic */ Object a() {
        return this.s();
    }

    @Override
    public String b() {
        return this.d("external_game_id");
    }

    @Override
    public String c() {
        return this.d("display_name");
    }

    @Override
    public String d() {
        return this.d("primary_category");
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public String e() {
        return this.d("secondary_category");
    }

    @Override
    public boolean equals(Object object) {
        return GameEntity.a(this, object);
    }

    @Override
    public String f() {
        return this.d("game_description");
    }

    @Override
    public String g() {
        return this.d("developer_name");
    }

    @Override
    public Uri h() {
        return this.f("game_icon_image_uri");
    }

    @Override
    public int hashCode() {
        return GameEntity.a(this);
    }

    @Override
    public Uri i() {
        return this.f("game_hi_res_image_uri");
    }

    @Override
    public Uri j() {
        return this.f("featured_image_uri");
    }

    @Override
    public boolean k() {
        return this.c("play_enabled_game");
    }

    @Override
    public boolean l() {
        if (this.b("installed") > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String m() {
        return this.d("package_name");
    }

    @Override
    public int n() {
        return this.b("gameplay_acl_status");
    }

    @Override
    public int o() {
        return this.b("achievement_total_count");
    }

    @Override
    public int p() {
        return this.b("leaderboard_count");
    }

    @Override
    public boolean q() {
        if (this.b("real_time_support") > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean r() {
        if (this.b("turn_based_support") > 0) {
            return true;
        }
        return false;
    }

    public Game s() {
        return new GameEntity(this);
    }

    public String toString() {
        return GameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((GameEntity)this.s()).writeToParcel(parcel, n2);
    }
}

