/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.c;
import com.google.android.gms.games.multiplayer.h;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;

public final class ParticipantEntity
extends ey
implements Participant {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;
    private final ParticipantResult k;

    ParticipantEntity(int n2, String string, String string2, Uri uri, Uri uri2, int n3, String string3, boolean bl2, PlayerEntity playerEntity, int n4, ParticipantResult participantResult) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = uri;
        this.e = uri2;
        this.f = n3;
        this.g = string3;
        this.h = bl2;
        this.i = playerEntity;
        this.j = n4;
        this.k = participantResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    public ParticipantEntity(Participant participant) {
        this.a = 2;
        this.b = participant.i();
        this.c = participant.f();
        this.d = participant.g();
        this.e = participant.h();
        this.f = participant.b();
        this.g = participant.c();
        this.h = participant.e();
        Player player = participant.j();
        player = player == null ? null : new PlayerEntity(player);
        this.i = player;
        this.j = participant.d();
        this.k = participant.k();
    }

    static int a(Participant participant) {
        return gw.a(new Object[]{participant.j(), participant.b(), participant.c(), participant.e(), participant.f(), participant.g(), participant.h(), participant.d(), participant.k()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Participant participant, Object object) {
        boolean bl2 = true;
        if (!(object instanceof Participant)) {
            return false;
        }
        boolean bl3 = bl2;
        if (participant == object) return bl3;
        if (!gw.a((Object)(object = (Participant)object).j(), (Object)participant.j())) return false;
        if (!gw.a((Object)object.b(), (Object)participant.b())) return false;
        if (!gw.a((Object)object.c(), (Object)participant.c())) return false;
        if (!gw.a((Object)object.e(), (Object)participant.e())) return false;
        if (!gw.a((Object)object.f(), (Object)participant.f())) return false;
        if (!gw.a((Object)object.g(), (Object)participant.g())) return false;
        if (!gw.a((Object)object.h(), (Object)participant.h())) return false;
        if (!gw.a((Object)object.d(), (Object)participant.d())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.k(), (Object)participant.k())) return bl3;
        return false;
    }

    static /* synthetic */ boolean a(Integer n2) {
        return ParticipantEntity.b(n2);
    }

    static /* synthetic */ boolean a(String string) {
        return ParticipantEntity.b(string);
    }

    static String b(Participant participant) {
        return gw.a((Object)participant).a("Player", participant.j()).a("Status", participant.b()).a("ClientAddress", participant.c()).a("ConnectedToRoom", participant.e()).a("DisplayName", participant.f()).a("IconImage", (Object)participant.g()).a("HiResImage", (Object)participant.h()).a("Capabilities", participant.d()).a("Result", participant.k()).toString();
    }

    static /* synthetic */ Integer n() {
        return ParticipantEntity.w();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.m();
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public String c() {
        return this.g;
    }

    @Override
    public int d() {
        return this.j;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public boolean e() {
        return this.h;
    }

    public boolean equals(Object object) {
        return ParticipantEntity.a(this, object);
    }

    @Override
    public String f() {
        if (this.i == null) {
            return this.c;
        }
        return this.i.c();
    }

    @Override
    public Uri g() {
        if (this.i == null) {
            return this.d;
        }
        return this.i.d();
    }

    @Override
    public Uri h() {
        if (this.i == null) {
            return this.e;
        }
        return this.i.e();
    }

    public int hashCode() {
        return ParticipantEntity.a(this);
    }

    @Override
    public String i() {
        return this.b;
    }

    @Override
    public Player j() {
        return this.i;
    }

    @Override
    public ParticipantResult k() {
        return this.k;
    }

    public int l() {
        return this.a;
    }

    public Participant m() {
        return this;
    }

    public String toString() {
        return ParticipantEntity.b(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        Object var6_3 = null;
        int n3 = 0;
        if (!this.x()) {
            h.a(this, parcel, n2);
            return;
        } else {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            String string = this.d == null ? null : this.d.toString();
            parcel.writeString(string);
            string = this.e == null ? var6_3 : this.e.toString();
            parcel.writeString(string);
            parcel.writeInt(this.f);
            parcel.writeString(this.g);
            int n4 = this.h ? 1 : 0;
            parcel.writeInt(n4);
            n4 = this.i == null ? n3 : 1;
            parcel.writeInt(n4);
            if (this.i == null) return;
            {
                this.i.writeToParcel(parcel, n2);
                return;
            }
        }
    }
}

