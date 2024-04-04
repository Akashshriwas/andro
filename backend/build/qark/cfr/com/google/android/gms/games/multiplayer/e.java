/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;

public final class e
extends com.google.android.gms.common.data.e
implements Participant {
    private final com.google.android.gms.games.e c;

    public e(DataHolder dataHolder, int n2) {
        super(dataHolder, n2);
        this.c = new com.google.android.gms.games.e(dataHolder, n2);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.l();
    }

    @Override
    public int b() {
        return this.b("player_status");
    }

    @Override
    public String c() {
        return this.d("client_address");
    }

    @Override
    public int d() {
        return this.b("capabilities");
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public boolean e() {
        if (this.b("connected") > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        return ParticipantEntity.a(this, object);
    }

    @Override
    public String f() {
        if (this.g("external_player_id")) {
            return this.d("default_display_name");
        }
        return this.c.c();
    }

    @Override
    public Uri g() {
        if (this.g("external_player_id")) {
            return this.f("default_display_image_uri");
        }
        return this.c.d();
    }

    @Override
    public Uri h() {
        if (this.g("external_player_id")) {
            return null;
        }
        return this.c.e();
    }

    @Override
    public int hashCode() {
        return ParticipantEntity.a(this);
    }

    @Override
    public String i() {
        return this.d("external_participant_id");
    }

    @Override
    public Player j() {
        if (this.g("external_player_id")) {
            return null;
        }
        return this.c;
    }

    @Override
    public ParticipantResult k() {
        if (this.g("result_type")) {
            return null;
        }
        int n2 = this.b("result_type");
        int n3 = this.b("placing");
        return new ParticipantResult(this.i(), n2, n3);
    }

    public Participant l() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((ParticipantEntity)this.l()).writeToParcel(parcel, n2);
    }
}

