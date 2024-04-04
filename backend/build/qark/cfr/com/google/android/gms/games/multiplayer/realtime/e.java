/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import java.util.ArrayList;
import java.util.List;

public class e
implements Parcelable.Creator {
    static void a(RoomEntity roomEntity, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, roomEntity.b(), false);
        c.a(parcel, 1000, roomEntity.k());
        c.a(parcel, 2, roomEntity.c(), false);
        c.a(parcel, 3, roomEntity.d());
        c.a(parcel, 4, roomEntity.e());
        c.a(parcel, 5, roomEntity.f(), false);
        c.a(parcel, 6, roomEntity.g());
        c.a(parcel, 7, roomEntity.h(), false);
        c.b(parcel, 8, (List)roomEntity.i(), false);
        c.a(parcel, 9, roomEntity.j());
        c.a(parcel, n2);
    }

    public RoomEntity a(Parcel parcel) {
        int n2 = 0;
        ArrayList arrayList = null;
        int n3 = a.b(parcel);
        long l2 = 0L;
        Bundle bundle = null;
        int n4 = 0;
        String string = null;
        int n5 = 0;
        String string2 = null;
        String string3 = null;
        int n6 = 0;
        block12 : while (parcel.dataPosition() < n3) {
            int n7 = a.a(parcel);
            switch (a.a(n7)) {
                default: {
                    a.b(parcel, n7);
                    continue block12;
                }
                case 1: {
                    string3 = a.m(parcel, n7);
                    continue block12;
                }
                case 1000: {
                    n6 = a.g(parcel, n7);
                    continue block12;
                }
                case 2: {
                    string2 = a.m(parcel, n7);
                    continue block12;
                }
                case 3: {
                    l2 = a.h(parcel, n7);
                    continue block12;
                }
                case 4: {
                    n5 = a.g(parcel, n7);
                    continue block12;
                }
                case 5: {
                    string = a.m(parcel, n7);
                    continue block12;
                }
                case 6: {
                    n4 = a.g(parcel, n7);
                    continue block12;
                }
                case 7: {
                    bundle = a.o(parcel, n7);
                    continue block12;
                }
                case 8: {
                    arrayList = a.c(parcel, n7, ParticipantEntity.CREATOR);
                    continue block12;
                }
                case 9: 
            }
            n2 = a.g(parcel, n7);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new RoomEntity(n6, string3, string2, l2, n5, string, n4, bundle, arrayList, n2);
    }

    public RoomEntity[] a(int n2) {
        return new RoomEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

