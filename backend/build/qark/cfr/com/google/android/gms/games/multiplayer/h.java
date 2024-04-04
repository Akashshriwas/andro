/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.d;

public class h
implements Parcelable.Creator {
    static void a(ParticipantEntity participantEntity, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, participantEntity.i(), false);
        c.a(parcel, 1000, participantEntity.l());
        c.a(parcel, 2, participantEntity.f(), false);
        c.a(parcel, 3, (Parcelable)participantEntity.g(), n2, false);
        c.a(parcel, 4, (Parcelable)participantEntity.h(), n2, false);
        c.a(parcel, 5, participantEntity.b());
        c.a(parcel, 6, participantEntity.c(), false);
        c.a(parcel, 7, participantEntity.e());
        c.a(parcel, 8, participantEntity.j(), n2, false);
        c.a(parcel, 9, participantEntity.d());
        c.a(parcel, 10, participantEntity.k(), n2, false);
        c.a(parcel, n3);
    }

    public ParticipantEntity a(Parcel parcel) {
        int n2 = 0;
        ParticipantResult participantResult = null;
        int n3 = a.b(parcel);
        PlayerEntity playerEntity = null;
        boolean bl2 = false;
        String string = null;
        int n4 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String string2 = null;
        String string3 = null;
        int n5 = 0;
        block13 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block13;
                }
                case 1: {
                    string3 = a.m(parcel, n6);
                    continue block13;
                }
                case 1000: {
                    n5 = a.g(parcel, n6);
                    continue block13;
                }
                case 2: {
                    string2 = a.m(parcel, n6);
                    continue block13;
                }
                case 3: {
                    uri2 = (Uri)a.a(parcel, n6, Uri.CREATOR);
                    continue block13;
                }
                case 4: {
                    uri = (Uri)a.a(parcel, n6, Uri.CREATOR);
                    continue block13;
                }
                case 5: {
                    n4 = a.g(parcel, n6);
                    continue block13;
                }
                case 6: {
                    string = a.m(parcel, n6);
                    continue block13;
                }
                case 7: {
                    bl2 = a.c(parcel, n6);
                    continue block13;
                }
                case 8: {
                    playerEntity = (PlayerEntity)a.a(parcel, n6, PlayerEntity.CREATOR);
                    continue block13;
                }
                case 9: {
                    n2 = a.g(parcel, n6);
                    continue block13;
                }
                case 10: 
            }
            participantResult = (ParticipantResult)a.a(parcel, n6, ParticipantResult.a);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ParticipantEntity(n5, string3, string2, uri2, uri, n4, string, bl2, playerEntity, n2, participantResult);
    }

    public ParticipantEntity[] a(int n2) {
        return new ParticipantEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

