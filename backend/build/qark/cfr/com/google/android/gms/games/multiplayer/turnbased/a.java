/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.e;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity;
import com.google.android.gms.games.multiplayer.turnbased.b;
import java.util.ArrayList;

public final class a
extends com.google.android.gms.common.data.e
implements TurnBasedMatch {
    private final Game c;
    private final int d;

    @Override
    public /* synthetic */ Object a() {
        return this.u();
    }

    @Override
    public Game b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.d("external_match_id");
    }

    @Override
    public String d() {
        return this.d("creator_external");
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public long e() {
        return this.a("creation_timestamp");
    }

    @Override
    public boolean equals(Object object) {
        return TurnBasedMatchEntity.a(this, object);
    }

    @Override
    public int f() {
        return this.b("status");
    }

    @Override
    public int g() {
        return this.b("user_match_status");
    }

    @Override
    public int h() {
        return this.b("variant");
    }

    @Override
    public int hashCode() {
        return TurnBasedMatchEntity.a(this);
    }

    @Override
    public ArrayList i() {
        ArrayList arrayList = new ArrayList(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            arrayList.add((Object)new e(this.a, this.b + i2));
        }
        return arrayList;
    }

    @Override
    public String j() {
        return this.d("last_updater_external");
    }

    @Override
    public long k() {
        return this.a("last_updated_timestamp");
    }

    @Override
    public String l() {
        return this.d("pending_participant_external");
    }

    @Override
    public byte[] m() {
        return this.e("data");
    }

    @Override
    public int n() {
        return this.b("version");
    }

    @Override
    public String o() {
        return this.d("rematch_id");
    }

    @Override
    public byte[] p() {
        return this.e("previous_match_data");
    }

    @Override
    public int q() {
        return this.b("match_number");
    }

    @Override
    public Bundle r() {
        if (!this.c("has_automatch_criteria")) {
            return null;
        }
        return b.a(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
    }

    @Override
    public int s() {
        if (!this.c("has_automatch_criteria")) {
            return 0;
        }
        return this.b("automatch_max_players");
    }

    @Override
    public boolean t() {
        return this.c("upsync_required");
    }

    public String toString() {
        return TurnBasedMatchEntity.b(this);
    }

    public TurnBasedMatch u() {
        return new TurnBasedMatchEntity(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((TurnBasedMatchEntity)this.u()).writeToParcel(parcel, n2);
    }
}

