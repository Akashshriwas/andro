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
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.e;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.b;
import java.util.ArrayList;

public final class d
extends com.google.android.gms.common.data.e
implements Room {
    private final int c;

    @Override
    public /* synthetic */ Object a() {
        return this.k();
    }

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
    public boolean equals(Object object) {
        return RoomEntity.a(this, object);
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
        return b.a(this.b("automatch_min_players"), this.b("automatch_max_players"), this.a("automatch_bit_mask"));
    }

    @Override
    public int hashCode() {
        return RoomEntity.a(this);
    }

    @Override
    public ArrayList i() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i2 = 0; i2 < this.c; ++i2) {
            arrayList.add((Object)new e(this.a, this.b + i2));
        }
        return arrayList;
    }

    @Override
    public int j() {
        return this.b("automatch_wait_estimate_sec");
    }

    public Room k() {
        return new RoomEntity(this);
    }

    public String toString() {
        return RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((RoomEntity)this.k()).writeToParcel(parcel, n2);
    }
}

