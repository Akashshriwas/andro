// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import java.util.Collection;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.gw;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch
{
    public static final c b;
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
    
    static {
        b = new c();
    }
    
    TurnBasedMatchEntity(final int c, final GameEntity d, final String e, final String f, final long g, final String h, final long i, final String j, final int k, final int l, final int m, final byte[] n, final ArrayList o, final String p19, final byte[] q, final int r, final Bundle s, final int t, final boolean u) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.t = t;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
        this.s = s;
        this.u = u;
    }
    
    public TurnBasedMatchEntity(final TurnBasedMatch turnBasedMatch) {
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
        final byte[] m = turnBasedMatch.m();
        if (m == null) {
            this.n = null;
        }
        else {
            System.arraycopy(m, 0, this.n = new byte[m.length], 0, m.length);
        }
        final byte[] p = turnBasedMatch.p();
        if (p == null) {
            this.q = null;
        }
        else {
            System.arraycopy(p, 0, this.q = new byte[p.length], 0, p.length);
        }
        final ArrayList i = turnBasedMatch.i();
        final int size = i.size();
        this.o = new ArrayList(size);
        for (int j = 0; j < size; ++j) {
            this.o.add(i.get(j).a());
        }
    }
    
    static int a(final TurnBasedMatch turnBasedMatch) {
        return gw.a(turnBasedMatch.b(), turnBasedMatch.c(), turnBasedMatch.d(), turnBasedMatch.e(), turnBasedMatch.j(), turnBasedMatch.k(), turnBasedMatch.l(), turnBasedMatch.f(), turnBasedMatch.g(), turnBasedMatch.h(), turnBasedMatch.n(), turnBasedMatch.i(), turnBasedMatch.o(), turnBasedMatch.q(), turnBasedMatch.r(), turnBasedMatch.s(), turnBasedMatch.t());
    }
    
    static boolean a(final TurnBasedMatch turnBasedMatch, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof TurnBasedMatch)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (turnBasedMatch != o) {
                final TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch)o;
                if (gw.a(turnBasedMatch2.b(), turnBasedMatch.b()) && gw.a(turnBasedMatch2.c(), turnBasedMatch.c()) && gw.a(turnBasedMatch2.d(), turnBasedMatch.d()) && gw.a((Object)turnBasedMatch2.e(), turnBasedMatch.e()) && gw.a(turnBasedMatch2.j(), turnBasedMatch.j()) && gw.a((Object)turnBasedMatch2.k(), turnBasedMatch.k()) && gw.a(turnBasedMatch2.l(), turnBasedMatch.l()) && gw.a((Object)turnBasedMatch2.f(), turnBasedMatch.f()) && gw.a((Object)turnBasedMatch2.g(), turnBasedMatch.g()) && gw.a((Object)turnBasedMatch2.h(), turnBasedMatch.h()) && gw.a((Object)turnBasedMatch2.n(), turnBasedMatch.n()) && gw.a(turnBasedMatch2.i(), turnBasedMatch.i()) && gw.a(turnBasedMatch2.o(), turnBasedMatch.o()) && gw.a((Object)turnBasedMatch2.q(), turnBasedMatch.q()) && gw.a(turnBasedMatch2.r(), turnBasedMatch.r()) && gw.a((Object)turnBasedMatch2.s(), turnBasedMatch.s())) {
                    b2 = b;
                    if (gw.a((Object)turnBasedMatch2.t(), turnBasedMatch.t())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final TurnBasedMatch turnBasedMatch) {
        return gw.a(turnBasedMatch).a("Game", turnBasedMatch.b()).a("MatchId", turnBasedMatch.c()).a("CreatorId", turnBasedMatch.d()).a("CreationTimestamp", turnBasedMatch.e()).a("LastUpdaterId", turnBasedMatch.j()).a("LastUpdatedTimestamp", turnBasedMatch.k()).a("PendingParticipantId", turnBasedMatch.l()).a("MatchStatus", turnBasedMatch.f()).a("TurnStatus", turnBasedMatch.g()).a("Variant", turnBasedMatch.h()).a("Data", turnBasedMatch.m()).a("Version", turnBasedMatch.n()).a("Participants", turnBasedMatch.i()).a("RematchId", turnBasedMatch.o()).a("PreviousData", turnBasedMatch.p()).a("MatchNumber", turnBasedMatch.q()).a("AutoMatchCriteria", turnBasedMatch.r()).a("AvailableAutoMatchSlots", turnBasedMatch.s()).a("LocallyModified", turnBasedMatch.t()).toString();
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
    
    @Override
    public boolean equals(final Object o) {
        return a(this, o);
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
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    public ArrayList i() {
        return new ArrayList(this.o);
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
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public int u() {
        return this.c;
    }
    
    public TurnBasedMatch v() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.games.multiplayer.turnbased.c.a(this, parcel, n);
    }
}
