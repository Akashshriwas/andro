// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import java.util.Collection;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gw;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;
import com.google.android.gms.games.GameEntity;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.ey;

public final class InvitationEntity extends ey implements Invitation
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    InvitationEntity(final int a, final GameEntity b, final String c, final long d, final int e, final ParticipantEntity f, final ArrayList g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    InvitationEntity(final Invitation invitation) {
        this.a = 1;
        this.b = new GameEntity(invitation.b());
        this.c = invitation.c();
        this.d = invitation.e();
        this.e = invitation.f();
        this.h = invitation.g();
        final String i = invitation.d().i();
        final d d = null;
        final ArrayList j = invitation.i();
        final int size = j.size();
        this.g = new ArrayList(size);
        int k = 0;
        d d2 = d;
        while (k < size) {
            final Participant participant = j.get(k);
            if (participant.i().equals(i)) {
                d2 = participant;
            }
            this.g.add(participant.a());
            ++k;
        }
        hc.a(d2, "Must have a valid inviter!");
        this.f = (ParticipantEntity)d2.a();
    }
    
    static int a(final Invitation invitation) {
        return gw.a(invitation.b(), invitation.c(), invitation.e(), invitation.f(), invitation.d(), invitation.i(), invitation.g());
    }
    
    static boolean a(final Invitation invitation, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof Invitation)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (invitation != o) {
                final Invitation invitation2 = (Invitation)o;
                if (gw.a(invitation2.b(), invitation.b()) && gw.a(invitation2.c(), invitation.c()) && gw.a((Object)invitation2.e(), invitation.e()) && gw.a((Object)invitation2.f(), invitation.f()) && gw.a(invitation2.d(), invitation.d()) && gw.a(invitation2.i(), invitation.i())) {
                    b2 = b;
                    if (gw.a((Object)invitation2.g(), invitation.g())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final Invitation invitation) {
        return gw.a(invitation).a("Game", invitation.b()).a("InvitationId", invitation.c()).a("CreationTimestamp", invitation.e()).a("InvitationType", invitation.f()).a("Inviter", invitation.d()).a("Participants", invitation.i()).a("Variant", invitation.g()).toString();
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
    
    @Override
    public boolean equals(final Object o) {
        return a(this, o);
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
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    public ArrayList i() {
        return new ArrayList(this.g);
    }
    
    public Invitation j() {
        return this;
    }
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (!this.x()) {
            com.google.android.gms.games.multiplayer.g.a(this, parcel, n);
        }
        else {
            this.b.writeToParcel(parcel, n);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeInt(this.e);
            this.f.writeToParcel(parcel, n);
            final int size = this.g.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; ++i) {
                ((ParticipantEntity)this.g.get(i)).writeToParcel(parcel, n);
            }
        }
    }
}
