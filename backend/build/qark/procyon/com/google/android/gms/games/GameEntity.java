// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gw;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.ey;

public final class GameEntity extends ey implements Game
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final boolean r;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    GameEntity(final int a, final String b, final String c, final String d, final String e, final String f, final String g, final Uri h, final Uri i, final Uri j, final boolean k, final boolean l, final String m, final int n, final int o, final int p18, final boolean q, final boolean r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    public GameEntity(final Game game) {
        this.a = 2;
        this.b = game.b();
        this.d = game.d();
        this.e = game.e();
        this.f = game.f();
        this.g = game.g();
        this.c = game.c();
        this.h = game.h();
        this.i = game.i();
        this.j = game.j();
        this.k = game.k();
        this.l = game.l();
        this.m = game.m();
        this.n = game.n();
        this.o = game.o();
        this.p = game.p();
        this.q = game.q();
        this.r = game.r();
    }
    
    static int a(final Game game) {
        return gw.a(game.b(), game.c(), game.d(), game.e(), game.f(), game.g(), game.h(), game.i(), game.j(), game.k(), game.l(), game.m(), game.n(), game.o(), game.p(), game.q(), game.r());
    }
    
    static boolean a(final Game game, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof Game)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (game != o) {
                final Game game2 = (Game)o;
                if (gw.a(game2.b(), game.b()) && gw.a(game2.c(), game.c()) && gw.a(game2.d(), game.d()) && gw.a(game2.e(), game.e()) && gw.a(game2.f(), game.f()) && gw.a(game2.g(), game.g()) && gw.a(game2.h(), game.h()) && gw.a(game2.i(), game.i()) && gw.a(game2.j(), game.j()) && gw.a((Object)game2.k(), game.k()) && gw.a((Object)game2.l(), game.l()) && gw.a(game2.m(), game.m()) && gw.a((Object)game2.n(), game.n()) && gw.a((Object)game2.o(), game.o()) && gw.a((Object)game2.p(), game.p()) && gw.a((Object)game2.q(), game.q())) {
                    b2 = b;
                    if (gw.a((Object)game2.r(), game.r())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final Game game) {
        return gw.a(game).a("ApplicationId", game.b()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", game.h()).a("HiResImageUri", game.i()).a("FeaturedImageUri", game.j()).a("PlayEnabledGame", game.k()).a("InstanceInstalled", game.l()).a("InstancePackageName", game.m()).a("GameplayAclStatus", game.n()).a("AchievementTotalCount", game.o()).a("LeaderboardCount", game.p()).a("RealTimeMultiplayerEnabled", game.q()).a("TurnBasedMultiplayerEnabled", game.r()).toString();
    }
    
    @Override
    public String b() {
        return this.b;
    }
    
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public String d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        return a(this, o);
    }
    
    @Override
    public String f() {
        return this.f;
    }
    
    @Override
    public String g() {
        return this.g;
    }
    
    @Override
    public Uri h() {
        return this.h;
    }
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    @Override
    public Uri i() {
        return this.i;
    }
    
    @Override
    public Uri j() {
        return this.j;
    }
    
    @Override
    public boolean k() {
        return this.k;
    }
    
    @Override
    public boolean l() {
        return this.l;
    }
    
    @Override
    public String m() {
        return this.m;
    }
    
    @Override
    public int n() {
        return this.n;
    }
    
    @Override
    public int o() {
        return this.o;
    }
    
    @Override
    public int p() {
        return this.p;
    }
    
    @Override
    public boolean q() {
        return this.q;
    }
    
    @Override
    public boolean r() {
        return this.r;
    }
    
    public int s() {
        return this.a;
    }
    
    public Game t() {
        return this;
    }
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public void writeToParcel(final Parcel parcel, int n) {
        final int n2 = 1;
        final String s = null;
        if (!this.x()) {
            com.google.android.gms.games.d.a(this, parcel, n);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        String string;
        if (this.h == null) {
            string = null;
        }
        else {
            string = this.h.toString();
        }
        parcel.writeString(string);
        String string2;
        if (this.i == null) {
            string2 = null;
        }
        else {
            string2 = this.i.toString();
        }
        parcel.writeString(string2);
        String string3;
        if (this.j == null) {
            string3 = s;
        }
        else {
            string3 = this.j.toString();
        }
        parcel.writeString(string3);
        if (this.k) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        if (this.l) {
            n = n2;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }
}
