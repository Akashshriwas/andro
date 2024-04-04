// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import java.util.ArrayList;
import com.google.android.gms.games.Game;
import com.google.android.gms.common.data.e;

public final class b extends e implements Invitation
{
    private final Game c;
    private final com.google.android.gms.games.multiplayer.e d;
    private final ArrayList e;
    
    @Override
    public Game b() {
        return this.c;
    }
    
    @Override
    public String c() {
        return this.d("external_invitation_id");
    }
    
    @Override
    public Participant d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public long e() {
        return Math.max(this.a("creation_timestamp"), this.a("last_modified_timestamp"));
    }
    
    @Override
    public boolean equals(final Object o) {
        return InvitationEntity.a(this, o);
    }
    
    @Override
    public int f() {
        return this.b("type");
    }
    
    @Override
    public int g() {
        return this.b("variant");
    }
    
    public Invitation h() {
        return new InvitationEntity(this);
    }
    
    @Override
    public int hashCode() {
        return InvitationEntity.a(this);
    }
    
    public ArrayList i() {
        return this.e;
    }
    
    @Override
    public String toString() {
        return InvitationEntity.b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ((InvitationEntity)this.h()).writeToParcel(parcel, n);
    }
}
