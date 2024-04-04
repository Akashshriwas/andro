/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.a;
import com.google.android.gms.games.multiplayer.g;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;
import java.util.Collection;

public final class InvitationEntity
extends ey
implements Invitation {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;

    InvitationEntity(int n2, GameEntity gameEntity, String string, long l2, int n3, ParticipantEntity participantEntity, ArrayList arrayList, int n4) {
        this.a = n2;
        this.b = gameEntity;
        this.c = string;
        this.d = l2;
        this.e = n3;
        this.f = participantEntity;
        this.g = arrayList;
        this.h = n4;
    }

    InvitationEntity(Invitation parcelable) {
        this.a = 1;
        this.b = new GameEntity(parcelable.b());
        this.c = parcelable.c();
        this.d = parcelable.e();
        this.e = parcelable.f();
        this.h = parcelable.g();
        String string = parcelable.d().i();
        Participant participant = null;
        ArrayList arrayList = parcelable.i();
        int n2 = arrayList.size();
        this.g = new ArrayList(n2);
        parcelable = participant;
        for (int i2 = 0; i2 < n2; ++i2) {
            participant = (Participant)arrayList.get(i2);
            if (participant.i().equals((Object)string)) {
                parcelable = participant;
            }
            this.g.add((Object)((ParticipantEntity)participant.a()));
        }
        hc.a(parcelable, (Object)"Must have a valid inviter!");
        this.f = (ParticipantEntity)parcelable.a();
    }

    static int a(Invitation invitation) {
        return gw.a(new Object[]{invitation.b(), invitation.c(), invitation.e(), invitation.f(), invitation.d(), invitation.i(), invitation.g()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Invitation invitation, Object object) {
        boolean bl2 = true;
        if (!(object instanceof Invitation)) {
            return false;
        }
        boolean bl3 = bl2;
        if (invitation == object) return bl3;
        if (!gw.a((Object)(object = (Invitation)object).b(), (Object)invitation.b())) return false;
        if (!gw.a((Object)object.c(), (Object)invitation.c())) return false;
        if (!gw.a((Object)object.e(), (Object)invitation.e())) return false;
        if (!gw.a((Object)object.f(), (Object)invitation.f())) return false;
        if (!gw.a((Object)object.d(), (Object)invitation.d())) return false;
        if (!gw.a((Object)object.i(), (Object)invitation.i())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.g(), (Object)invitation.g())) return bl3;
        return false;
    }

    static /* synthetic */ boolean a(Integer n2) {
        return InvitationEntity.b(n2);
    }

    static /* synthetic */ boolean a(String string) {
        return InvitationEntity.b(string);
    }

    static String b(Invitation invitation) {
        return gw.a((Object)invitation).a("Game", invitation.b()).a("InvitationId", invitation.c()).a("CreationTimestamp", invitation.e()).a("InvitationType", invitation.f()).a("Inviter", invitation.d()).a("Participants", (Object)invitation.i()).a("Variant", invitation.g()).toString();
    }

    static /* synthetic */ Integer k() {
        return InvitationEntity.w();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.j();
    }

    @Override
    public Game b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public Participant d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public long e() {
        return this.d;
    }

    public boolean equals(Object object) {
        return InvitationEntity.a(this, object);
    }

    @Override
    public int f() {
        return this.e;
    }

    @Override
    public int g() {
        return this.h;
    }

    public int h() {
        return this.a;
    }

    public int hashCode() {
        return InvitationEntity.a(this);
    }

    @Override
    public ArrayList i() {
        return new ArrayList((Collection)this.g);
    }

    public Invitation j() {
        return this;
    }

    public String toString() {
        return InvitationEntity.b(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void writeToParcel(Parcel parcel, int n2) {
        if (!this.x()) {
            g.a(this, parcel, n2);
            return;
        }
        this.b.writeToParcel(parcel, n2);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        this.f.writeToParcel(parcel, n2);
        int n3 = this.g.size();
        parcel.writeInt(n3);
        int n4 = 0;
        while (n4 < n3) {
            ((ParticipantEntity)this.g.get(n4)).writeToParcel(parcel, n2);
            ++n4;
        }
    }
}

