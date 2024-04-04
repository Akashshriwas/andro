// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import java.util.ArrayList;
import android.os.Bundle;
import com.google.android.gms.common.data.e;

public final class d extends e implements Room
{
    private final int c;
    
    @Override
    public String b() {
        return this.d("external_match_id");
    }
    
    @Override
    public String c() {
        return this.d("creator_external");
    }
    
    @Override
    public long d() {
        return this.a("creation_timestamp");
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public int e() {
        return this.b("status");
    }
    
    @Override
    public boolean equals(final Object o) {
        return RoomEntity.a(this, o);
    }
    
    @Override
    public String f() {
        return this.d("description");
    }
    
    @Override
    public int g() {
        return this.b("variant");
    }
    
    @Override
    public Bundle h() {
        if (!this.c("has_automatch_criteria")) {
            return null;
        }
        return com.google.android.gms.games.multiplayer.realtime.b.a(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
    }
    
    @Override
    public int hashCode() {
        return RoomEntity.a(this);
    }
    
    public ArrayList i() {
        final ArrayList<com.google.android.gms.games.multiplayer.e> list = new ArrayList<com.google.android.gms.games.multiplayer.e>(this.c);
        for (int i = 0; i < this.c; ++i) {
            list.add(new com.google.android.gms.games.multiplayer.e(this.a, this.b + i));
        }
        return list;
    }
    
    @Override
    public int j() {
        return this.b("automatch_wait_estimate_sec");
    }
    
    public Room k() {
        return new RoomEntity(this);
    }
    
    @Override
    public String toString() {
        return RoomEntity.b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((RoomEntity)this.k()).writeToParcel(parcel, n);
    }
}
