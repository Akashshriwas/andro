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
import com.google.android.gms.games.Player;
import com.google.android.gms.games.c;
import com.google.android.gms.games.f;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;

public final class PlayerEntity
extends ey
implements Player {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;

    PlayerEntity(int n2, String string, String string2, Uri uri, Uri uri2, long l2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = uri;
        this.e = uri2;
        this.f = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public PlayerEntity(Player player) {
        boolean bl2 = true;
        this.a = 1;
        this.b = player.b();
        this.c = player.c();
        this.d = player.d();
        this.e = player.e();
        this.f = player.f();
        fv.a((Object)this.b);
        fv.a((Object)this.c);
        if (this.f <= 0L) {
            bl2 = false;
        }
        fv.a(bl2);
    }

    static int a(Player player) {
        return gw.a(new Object[]{player.b(), player.c(), player.d(), player.e(), player.f()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Player player, Object object) {
        boolean bl2 = true;
        if (!(object instanceof Player)) {
            return false;
        }
        boolean bl3 = bl2;
        if (player == object) return bl3;
        if (!gw.a((Object)(object = (Player)object).b(), (Object)player.b())) return false;
        if (!gw.a((Object)object.c(), (Object)player.c())) return false;
        if (!gw.a((Object)object.d(), (Object)player.d())) return false;
        if (!gw.a((Object)object.e(), (Object)player.e())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.f(), (Object)player.f())) return bl3;
        return false;
    }

    static /* synthetic */ boolean a(Integer n2) {
        return PlayerEntity.b(n2);
    }

    static /* synthetic */ boolean a(String string) {
        return PlayerEntity.b(string);
    }

    static String b(Player player) {
        return gw.a((Object)player).a("PlayerId", player.b()).a("DisplayName", player.c()).a("IconImageUri", (Object)player.d()).a("HiResImageUri", (Object)player.e()).a("RetrievedTimestamp", player.f()).toString();
    }

    static /* synthetic */ Integer i() {
        return PlayerEntity.w();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.h();
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
    public Uri d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public Uri e() {
        return this.e;
    }

    public boolean equals(Object object) {
        return PlayerEntity.a(this, object);
    }

    @Override
    public long f() {
        return this.f;
    }

    public int g() {
        return this.a;
    }

    public Player h() {
        return this;
    }

    public int hashCode() {
        return PlayerEntity.a(this);
    }

    public String toString() {
        return PlayerEntity.b(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        Object var4_3 = null;
        if (!this.x()) {
            f.a(this, parcel, n2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        String string = this.d == null ? null : this.d.toString();
        parcel.writeString(string);
        string = this.e == null ? var4_3 : this.e.toString();
        parcel.writeString(string);
        parcel.writeLong(this.f);
    }
}

