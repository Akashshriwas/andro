// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Player;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;

public final class e extends com.google.android.gms.common.data.e implements Participant
{
    private final com.google.android.gms.games.e c;
    
    public e(final DataHolder dataHolder, final int n) {
        super(dataHolder, n);
        this.c = new com.google.android.gms.games.e(dataHolder, n);
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
        return this.b("connected") > 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return ParticipantEntity.a(this, o);
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
        return new ParticipantResult(this.i(), this.b("result_type"), this.b("placing"));
    }
    
    public Participant l() {
        return new ParticipantEntity(this);
    }
    
    @Override
    public String toString() {
        return ParticipantEntity.b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((ParticipantEntity)this.l()).writeToParcel(parcel, n);
    }
}
