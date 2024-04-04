/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.e;
import java.util.ArrayList;

public final class b
extends com.google.android.gms.common.data.e
implements Invitation {
    private final Game c;
    private final e d;
    private final ArrayList e;

    @Override
    public /* synthetic */ Object a() {
        return this.h();
    }

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
        return Math.max((long)this.a("creation_timestamp"), (long)this.a("last_modified_timestamp"));
    }

    @Override
    public boolean equals(Object object) {
        return InvitationEntity.a(this, object);
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

    @Override
    public ArrayList i() {
        return this.e;
    }

    public String toString() {
        return InvitationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ((InvitationEntity)this.h()).writeToParcel(parcel, n2);
    }
}

