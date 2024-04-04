/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.c;
import com.google.android.gms.games.multiplayer.realtime.e;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import java.util.ArrayList;
import java.util.Collection;

public final class RoomEntity
extends ey
implements Room {
    public static final Parcelable.Creator CREATOR = new c();
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

    RoomEntity(int n2, String string, String string2, long l2, int n3, String string3, int n4, Bundle bundle, ArrayList arrayList, int n5) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = l2;
        this.e = n3;
        this.f = string3;
        this.g = n4;
        this.h = bundle;
        this.i = arrayList;
        this.j = n5;
    }

    public RoomEntity(Room room) {
        this.a = 2;
        this.b = room.b();
        this.c = room.c();
        this.d = room.d();
        this.e = room.e();
        this.f = room.f();
        this.g = room.g();
        this.h = room.h();
        ArrayList arrayList = room.i();
        int n2 = arrayList.size();
        this.i = new ArrayList(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.i.add((Object)((ParticipantEntity)((Participant)arrayList.get(i2)).a()));
        }
        this.j = room.j();
    }

    static int a(Room room) {
        return gw.a(new Object[]{room.b(), room.c(), room.d(), room.e(), room.f(), room.g(), room.h(), room.i(), room.j()});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Room room, Object object) {
        boolean bl2 = true;
        if (!(object instanceof Room)) {
            return false;
        }
        boolean bl3 = bl2;
        if (room == object) return bl3;
        if (!gw.a((Object)(object = (Room)object).b(), (Object)room.b())) return false;
        if (!gw.a((Object)object.c(), (Object)room.c())) return false;
        if (!gw.a((Object)object.d(), (Object)room.d())) return false;
        if (!gw.a((Object)object.e(), (Object)room.e())) return false;
        if (!gw.a((Object)object.f(), (Object)room.f())) return false;
        if (!gw.a((Object)object.g(), (Object)room.g())) return false;
        if (!gw.a((Object)object.h(), (Object)room.h())) return false;
        if (!gw.a((Object)object.i(), (Object)room.i())) return false;
        bl3 = bl2;
        if (gw.a((Object)object.j(), (Object)room.j())) return bl3;
        return false;
    }

    static /* synthetic */ boolean a(Integer n2) {
        return RoomEntity.b(n2);
    }

    static /* synthetic */ boolean a(String string) {
        return RoomEntity.b(string);
    }

    static String b(Room room) {
        return gw.a((Object)room).a("RoomId", room.b()).a("CreatorId", room.c()).a("CreationTimestamp", room.d()).a("RoomStatus", room.e()).a("Description", room.f()).a("Variant", room.g()).a("AutoMatchCriteria", (Object)room.h()).a("Participants", (Object)room.i()).a("AutoMatchWaitEstimateSeconds", room.j()).toString();
    }

    static /* synthetic */ Integer m() {
        return RoomEntity.w();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.l();
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

    public boolean equals(Object object) {
        return RoomEntity.a(this, object);
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

    public int hashCode() {
        return RoomEntity.a(this);
    }

    @Override
    public ArrayList i() {
        return new ArrayList((Collection)this.i);
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

    public String toString() {
        return RoomEntity.b(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void writeToParcel(Parcel parcel, int n2) {
        if (!this.x()) {
            e.a(this, parcel, n2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeBundle(this.h);
        int n3 = this.i.size();
        parcel.writeInt(n3);
        int n4 = 0;
        while (n4 < n3) {
            ((ParticipantEntity)this.i.get(n4)).writeToParcel(parcel, n2);
            ++n4;
        }
    }
}

