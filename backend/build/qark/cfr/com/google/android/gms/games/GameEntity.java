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
package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.a;
import com.google.android.gms.games.d;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;

public final class GameEntity
extends ey
implements Game {
    public static final Parcelable.Creator CREATOR = new a();
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

    GameEntity(int n2, String string, String string2, String string3, String string4, String string5, String string6, Uri uri, Uri uri2, Uri uri3, boolean bl2, boolean bl3, String string7, int n3, int n4, int n5, boolean bl4, boolean bl5) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = uri;
        this.i = uri2;
        this.j = uri3;
        this.k = bl2;
        this.l = bl3;
        this.m = string7;
        this.n = n3;
        this.o = n4;
        this.p = n5;
        this.q = bl4;
        this.r = bl5;
    }

    public GameEntity(Game game) {
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

    static int a(Game game) {
        return gw.a(new Object[]{game.b(), game.c(), game.d(), game.e(), game.f(), game.g(), game.h(), game.i(), game.j(), game.k(), game.l(), game.m(), game.n(), game.o(), game.p(), game.q(), game.r()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Game game, Object object) {
        boolean bl2 = true;
        if (!(object instanceof Game)) {
            return false;
        }
        boolean bl3 = bl2;
        if (game == object) return bl3;
        if (!gw.a((Object)(object = (Game)object).b(), (Object)game.b())) return false;
        if (!gw.a((Object)object.c(), (Object)game.c())) return false;
        if (!gw.a((Object)object.d(), (Object)game.d())) return false;
        if (!gw.a((Object)object.e(), (Object)game.e())) return false;
        if (!gw.a((Object)object.f(), (Object)game.f())) return false;
        if (!gw.a((Object)object.g(), (Object)game.g())) return false;
        if (!gw.a((Object)object.h(), (Object)game.h())) return false;
        if (!gw.a((Object)object.i(), (Object)game.i())) return false;
        if (!gw.a((Object)object.j(), (Object)game.j())) return false;
        if (!gw.a((Object)object.k(), (Object)game.k())) return false;
        if (!gw.a((Object)object.l(), (Object)game.l())) return false;
        if (!gw.a((Object)object.m(), (Object)game.m())) return false;
        if (!gw.a((Object)object.n(), (Object)game.n())) return false;
        if (!gw.a((Object)object.o(), (Object)game.o())) return false;
        if (!gw.a((Object)object.p(), (Object)game.p())) return false;
        if (!gw.a((Object)object.q(), (Object)game.q())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.r(), (Object)game.r())) return bl3;
        return false;
    }

    static /* synthetic */ boolean a(Integer n2) {
        return GameEntity.b(n2);
    }

    static /* synthetic */ boolean a(String string) {
        return GameEntity.b(string);
    }

    static String b(Game game) {
        return gw.a((Object)game).a("ApplicationId", game.b()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", (Object)game.h()).a("HiResImageUri", (Object)game.i()).a("FeaturedImageUri", (Object)game.j()).a("PlayEnabledGame", game.k()).a("InstanceInstalled", game.l()).a("InstancePackageName", game.m()).a("GameplayAclStatus", game.n()).a("AchievementTotalCount", game.o()).a("LeaderboardCount", game.p()).a("RealTimeMultiplayerEnabled", game.q()).a("TurnBasedMultiplayerEnabled", game.r()).toString();
    }

    static /* synthetic */ Integer u() {
        return GameEntity.w();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.t();
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

    public boolean equals(Object object) {
        return GameEntity.a(this, object);
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

    public int hashCode() {
        return GameEntity.a(this);
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

    public String toString() {
        return GameEntity.b(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        int n3 = 1;
        Object var5_4 = null;
        if (!this.x()) {
            d.a(this, parcel, n2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        String string = this.h == null ? null : this.h.toString();
        parcel.writeString(string);
        string = this.i == null ? null : this.i.toString();
        parcel.writeString(string);
        string = this.j == null ? var5_4 : this.j.toString();
        parcel.writeString(string);
        n2 = this.k ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.l ? n3 : 0;
        parcel.writeInt(n2);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }
}

