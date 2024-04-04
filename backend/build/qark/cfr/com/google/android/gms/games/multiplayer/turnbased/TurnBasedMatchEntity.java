/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.c;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import java.util.ArrayList;
import java.util.Collection;

public final class TurnBasedMatchEntity
implements SafeParcelable,
TurnBasedMatch {
    public static final c b = new c();
    private final int c;
    private final GameEntity d;
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final long i;
    private final String j;
    private final int k;
    private final int l;
    private final int m;
    private final byte[] n;
    private final ArrayList o;
    private final String p;
    private final byte[] q;
    private final int r;
    private final Bundle s;
    private final int t;
    private final boolean u;

    TurnBasedMatchEntity(int n2, GameEntity gameEntity, String string, String string2, long l2, String string3, long l3, String string4, int n3, int n4, int n5, byte[] arrby, ArrayList arrayList, String string5, byte[] arrby2, int n6, Bundle bundle, int n7, boolean bl2) {
        this.c = n2;
        this.d = gameEntity;
        this.e = string;
        this.f = string2;
        this.g = l2;
        this.h = string3;
        this.i = l3;
        this.j = string4;
        this.k = n3;
        this.t = n7;
        this.l = n4;
        this.m = n5;
        this.n = arrby;
        this.o = arrayList;
        this.p = string5;
        this.q = arrby2;
        this.r = n6;
        this.s = bundle;
        this.u = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.c = 2;
        this.d = new GameEntity(turnBasedMatch.b());
        this.e = turnBasedMatch.c();
        this.f = turnBasedMatch.d();
        this.g = turnBasedMatch.e();
        this.h = turnBasedMatch.j();
        this.i = turnBasedMatch.k();
        this.j = turnBasedMatch.l();
        this.k = turnBasedMatch.f();
        this.t = turnBasedMatch.g();
        this.l = turnBasedMatch.h();
        this.m = turnBasedMatch.n();
        this.p = turnBasedMatch.o();
        this.r = turnBasedMatch.q();
        this.s = turnBasedMatch.r();
        this.u = turnBasedMatch.t();
        byte[] arrby = turnBasedMatch.m();
        if (arrby == null) {
            this.n = null;
        } else {
            this.n = new byte[arrby.length];
            System.arraycopy((Object)arrby, (int)0, (Object)this.n, (int)0, (int)arrby.length);
        }
        if ((arrby = turnBasedMatch.p()) == null) {
            this.q = null;
        } else {
            this.q = new byte[arrby.length];
            System.arraycopy((Object)arrby, (int)0, (Object)this.q, (int)0, (int)arrby.length);
        }
        turnBasedMatch = turnBasedMatch.i();
        int n2 = turnBasedMatch.size();
        this.o = new ArrayList(n2);
        int n3 = 0;
        while (n3 < n2) {
            this.o.add((Object)((ParticipantEntity)((Participant)turnBasedMatch.get(n3)).a()));
            ++n3;
        }
    }

    static int a(TurnBasedMatch turnBasedMatch) {
        return gw.a(new Object[]{turnBasedMatch.b(), turnBasedMatch.c(), turnBasedMatch.d(), turnBasedMatch.e(), turnBasedMatch.j(), turnBasedMatch.k(), turnBasedMatch.l(), turnBasedMatch.f(), turnBasedMatch.g(), turnBasedMatch.h(), turnBasedMatch.n(), turnBasedMatch.i(), turnBasedMatch.o(), turnBasedMatch.q(), turnBasedMatch.r(), turnBasedMatch.s(), turnBasedMatch.t()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(TurnBasedMatch turnBasedMatch, Object object) {
        boolean bl2 = true;
        if (!(object instanceof TurnBasedMatch)) {
            return false;
        }
        boolean bl3 = bl2;
        if (turnBasedMatch == object) return bl3;
        if (!gw.a((Object)(object = (TurnBasedMatch)object).b(), (Object)turnBasedMatch.b())) return false;
        if (!gw.a((Object)object.c(), (Object)turnBasedMatch.c())) return false;
        if (!gw.a((Object)object.d(), (Object)turnBasedMatch.d())) return false;
        if (!gw.a((Object)object.e(), (Object)turnBasedMatch.e())) return false;
        if (!gw.a((Object)object.j(), (Object)turnBasedMatch.j())) return false;
        if (!gw.a((Object)object.k(), (Object)turnBasedMatch.k())) return false;
        if (!gw.a((Object)object.l(), (Object)turnBasedMatch.l())) return false;
        if (!gw.a((Object)object.f(), (Object)turnBasedMatch.f())) return false;
        if (!gw.a((Object)object.g(), (Object)turnBasedMatch.g())) return false;
        if (!gw.a((Object)object.h(), (Object)turnBasedMatch.h())) return false;
        if (!gw.a((Object)object.n(), (Object)turnBasedMatch.n())) return false;
        if (!gw.a((Object)object.i(), (Object)turnBasedMatch.i())) return false;
        if (!gw.a((Object)object.o(), (Object)turnBasedMatch.o())) return false;
        if (!gw.a((Object)object.q(), (Object)turnBasedMatch.q())) return false;
        if (!gw.a((Object)object.r(), (Object)turnBasedMatch.r())) return false;
        if (!gw.a((Object)object.s(), (Object)turnBasedMatch.s())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.t(), (Object)turnBasedMatch.t())) return bl3;
        return false;
    }

    static String b(TurnBasedMatch turnBasedMatch) {
        return gw.a((Object)turnBasedMatch).a("Game", turnBasedMatch.b()).a("MatchId", turnBasedMatch.c()).a("CreatorId", turnBasedMatch.d()).a("CreationTimestamp", turnBasedMatch.e()).a("LastUpdaterId", turnBasedMatch.j()).a("LastUpdatedTimestamp", turnBasedMatch.k()).a("PendingParticipantId", turnBasedMatch.l()).a("MatchStatus", turnBasedMatch.f()).a("TurnStatus", turnBasedMatch.g()).a("Variant", turnBasedMatch.h()).a("Data", turnBasedMatch.m()).a("Version", turnBasedMatch.n()).a("Participants", (Object)turnBasedMatch.i()).a("RematchId", turnBasedMatch.o()).a("PreviousData", turnBasedMatch.p()).a("MatchNumber", turnBasedMatch.q()).a("AutoMatchCriteria", (Object)turnBasedMatch.r()).a("AvailableAutoMatchSlots", turnBasedMatch.s()).a("LocallyModified", turnBasedMatch.t()).toString();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.v();
    }

    @Override
    public Game b() {
        return this.d;
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public String d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public long e() {
        return this.g;
    }

    public boolean equals(Object object) {
        return TurnBasedMatchEntity.a(this, object);
    }

    @Override
    public int f() {
        return this.k;
    }

    @Override
    public int g() {
        return this.t;
    }

    @Override
    public int h() {
        return this.l;
    }

    public int hashCode() {
        return TurnBasedMatchEntity.a(this);
    }

    @Override
    public ArrayList i() {
        return new ArrayList((Collection)this.o);
    }

    @Override
    public String j() {
        return this.h;
    }

    @Override
    public long k() {
        return this.i;
    }

    @Override
    public String l() {
        return this.j;
    }

    @Override
    public byte[] m() {
        return this.n;
    }

    @Override
    public int n() {
        return this.m;
    }

    @Override
    public String o() {
        return this.p;
    }

    @Override
    public byte[] p() {
        return this.q;
    }

    @Override
    public int q() {
        return this.r;
    }

    @Override
    public Bundle r() {
        return this.s;
    }

    @Override
    public int s() {
        if (this.s == null) {
            return 0;
        }
        return this.s.getInt("max_automatch_players");
    }

    @Override
    public boolean t() {
        return this.u;
    }

    public String toString() {
        return TurnBasedMatchEntity.b(this);
    }

    public int u() {
        return this.c;
    }

    public TurnBasedMatch v() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        c.a(this, parcel, n2);
    }
}

