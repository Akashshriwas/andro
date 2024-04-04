// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.fv;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.ey;

public final class PlayerEntity extends ey implements Player
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    PlayerEntity(final int a, final String b, final String c, final Uri d, final Uri e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public PlayerEntity(final Player player) {
        boolean b = true;
        this.a = 1;
        this.b = player.b();
        this.c = player.c();
        this.d = player.d();
        this.e = player.e();
        this.f = player.f();
        fv.a((Object)this.b);
        fv.a((Object)this.c);
        if (this.f <= 0L) {
            b = false;
        }
        fv.a(b);
    }
    
    static int a(final Player player) {
        return gw.a(player.b(), player.c(), player.d(), player.e(), player.f());
    }
    
    static boolean a(final Player player, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof Player)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (player != o) {
                final Player player2 = (Player)o;
                if (gw.a(player2.b(), player.b()) && gw.a(player2.c(), player.c()) && gw.a(player2.d(), player.d()) && gw.a(player2.e(), player.e())) {
                    b2 = b;
                    if (gw.a((Object)player2.f(), player.f())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final Player player) {
        return gw.a(player).a("PlayerId", player.b()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("HiResImageUri", player.e()).a("RetrievedTimestamp", player.f()).toString();
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
    
    @Override
    public boolean equals(final Object o) {
        return a(this, o);
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
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final String s = null;
        if (!this.x()) {
            com.google.android.gms.games.f.a(this, parcel, n);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        String string;
        if (this.d == null) {
            string = null;
        }
        else {
            string = this.d.toString();
        }
        parcel.writeString(string);
        String string2;
        if (this.e == null) {
            string2 = s;
        }
        else {
            string2 = this.e.toString();
        }
        parcel.writeString(string2);
        parcel.writeLong(this.f);
    }
}
