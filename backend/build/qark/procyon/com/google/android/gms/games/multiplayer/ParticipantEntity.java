// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gw;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.ey;

public final class ParticipantEntity extends ey implements Participant
{
    public static final Parcelable$Creator CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    ParticipantEntity(final int a, final String b, final String c, final Uri d, final Uri e, final int f, final String g, final boolean h, final PlayerEntity i, final int j, final ParticipantResult k) {
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
    }
    
    public ParticipantEntity(final Participant participant) {
        this.a = 2;
        this.b = participant.i();
        this.c = participant.f();
        this.d = participant.g();
        this.e = participant.h();
        this.f = participant.b();
        this.g = participant.c();
        this.h = participant.e();
        final Player j = participant.j();
        PlayerEntity i;
        if (j == null) {
            i = null;
        }
        else {
            i = new PlayerEntity(j);
        }
        this.i = i;
        this.j = participant.d();
        this.k = participant.k();
    }
    
    static int a(final Participant participant) {
        return gw.a(participant.j(), participant.b(), participant.c(), participant.e(), participant.f(), participant.g(), participant.h(), participant.d(), participant.k());
    }
    
    static boolean a(final Participant participant, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof Participant)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (participant != o) {
                final Participant participant2 = (Participant)o;
                if (gw.a(participant2.j(), participant.j()) && gw.a((Object)participant2.b(), participant.b()) && gw.a(participant2.c(), participant.c()) && gw.a((Object)participant2.e(), participant.e()) && gw.a(participant2.f(), participant.f()) && gw.a(participant2.g(), participant.g()) && gw.a(participant2.h(), participant.h()) && gw.a((Object)participant2.d(), participant.d())) {
                    b2 = b;
                    if (gw.a(participant2.k(), participant.k())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final Participant participant) {
        return gw.a(participant).a("Player", participant.j()).a("Status", participant.b()).a("ClientAddress", participant.c()).a("ConnectedToRoom", participant.e()).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("HiResImage", participant.h()).a("Capabilities", participant.d()).a("Result", participant.k()).toString();
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
    
    @Override
    public boolean equals(final Object o) {
        return a(this, o);
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
    
    @Override
    public int hashCode() {
        return a(this);
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
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final String s = null;
        final boolean b = false;
        if (!this.x()) {
            com.google.android.gms.games.multiplayer.h.a(this, parcel, n);
        }
        else {
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
            parcel.writeInt(this.f);
            parcel.writeString(this.g);
            int n2;
            if (this.h) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            parcel.writeInt(n2);
            int n3;
            if (this.i == null) {
                n3 = (b ? 1 : 0);
            }
            else {
                n3 = 1;
            }
            parcel.writeInt(n3);
            if (this.i != null) {
                this.i.writeToParcel(parcel, n);
            }
        }
    }
}
