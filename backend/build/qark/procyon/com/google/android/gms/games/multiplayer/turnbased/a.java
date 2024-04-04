// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.games.Game;
import com.google.android.gms.common.data.e;

public final class a extends e implements TurnBasedMatch
{
    private final Game c;
    private final int d;
    
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
    public boolean equals(final Object o) {
        return TurnBasedMatchEntity.a(this, o);
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
    
    public ArrayList i() {
        final ArrayList<com.google.android.gms.games.multiplayer.e> list = new ArrayList<com.google.android.gms.games.multiplayer.e>(this.d);
        for (int i = 0; i < this.d; ++i) {
            list.add(new com.google.android.gms.games.multiplayer.e(this.a, this.b + i));
        }
        return list;
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
        return com.google.android.gms.games.multiplayer.turnbased.b.a(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
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
    
    @Override
    public String toString() {
        return TurnBasedMatchEntity.b(this);
    }
    
    public TurnBasedMatch u() {
        return new TurnBasedMatchEntity(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((TurnBasedMatchEntity)this.u()).writeToParcel(parcel, n);
    }
}
