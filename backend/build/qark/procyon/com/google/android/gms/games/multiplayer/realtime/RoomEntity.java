// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import java.util.Collection;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gw;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.ey;

public final class RoomEntity extends ey implements Room
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    RoomEntity(final int a, final String b, final String c, final long d, final int e, final String f, final int g, final Bundle h, final ArrayList i, final int j) {
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
    }
    
    public RoomEntity(final Room room) {
        this.a = 2;
        this.b = room.b();
        this.c = room.c();
        this.d = room.d();
        this.e = room.e();
        this.f = room.f();
        this.g = room.g();
        this.h = room.h();
        final ArrayList i = room.i();
        final int size = i.size();
        this.i = new ArrayList(size);
        for (int j = 0; j < size; ++j) {
            this.i.add(i.get(j).a());
        }
        this.j = room.j();
    }
    
    static int a(final Room room) {
        return gw.a(room.b(), room.c(), room.d(), room.e(), room.f(), room.g(), room.h(), room.i(), room.j());
    }
    
    static boolean a(final Room room, final Object o) {
        final boolean b = true;
        boolean b2;
        if (!(o instanceof Room)) {
            b2 = false;
        }
        else {
            b2 = b;
            if (room != o) {
                final Room room2 = (Room)o;
                if (gw.a(room2.b(), room.b()) && gw.a(room2.c(), room.c()) && gw.a((Object)room2.d(), room.d()) && gw.a((Object)room2.e(), room.e()) && gw.a(room2.f(), room.f()) && gw.a((Object)room2.g(), room.g()) && gw.a(room2.h(), room.h()) && gw.a(room2.i(), room.i())) {
                    b2 = b;
                    if (gw.a((Object)room2.j(), room.j())) {
                        return b2;
                    }
                }
                return false;
            }
        }
        return b2;
    }
    
    static String b(final Room room) {
        return gw.a(room).a("RoomId", room.b()).a("CreatorId", room.c()).a("CreationTimestamp", room.d()).a("RoomStatus", room.e()).a("Description", room.f()).a("Variant", room.g()).a("AutoMatchCriteria", room.h()).a("Participants", room.i()).a("AutoMatchWaitEstimateSeconds", room.j()).toString();
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
    public long d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public int e() {
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
    public int g() {
        return this.g;
    }
    
    @Override
    public Bundle h() {
        return this.h;
    }
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    public ArrayList i() {
        return new ArrayList(this.i);
    }
    
    @Override
    public int j() {
        return this.j;
    }
    
    public int k() {
        return this.a;
    }
    
    public Room l() {
        return this;
    }
    
    @Override
    public String toString() {
        return b(this);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (!this.x()) {
            com.google.android.gms.games.multiplayer.realtime.e.a(this, parcel, n);
        }
        else {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeBundle(this.h);
            final int size = this.i.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; ++i) {
                ((ParticipantEntity)this.i.get(i)).writeToParcel(parcel, n);
            }
        }
    }
}
