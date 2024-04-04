// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.PlayerEntity;
import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class h implements Parcelable$Creator
{
    static void a(final ParticipantEntity participantEntity, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, participantEntity.i(), false);
        c.a(parcel, 1000, participantEntity.l());
        c.a(parcel, 2, participantEntity.f(), false);
        c.a(parcel, 3, (Parcelable)participantEntity.g(), n, false);
        c.a(parcel, 4, (Parcelable)participantEntity.h(), n, false);
        c.a(parcel, 5, participantEntity.b());
        c.a(parcel, 6, participantEntity.c(), false);
        c.a(parcel, 7, participantEntity.e());
        c.a(parcel, 8, (Parcelable)participantEntity.j(), n, false);
        c.a(parcel, 9, participantEntity.d());
        c.a(parcel, 10, (Parcelable)participantEntity.k(), n, false);
        c.a(parcel, a);
    }
    
    public ParticipantEntity a(final Parcel parcel) {
        int g = 0;
        ParticipantResult participantResult = null;
        final int b = a.b(parcel);
        PlayerEntity playerEntity = null;
        boolean c = false;
        String m = null;
        int g2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String i = null;
        String j = null;
        int g3 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 4: {
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    continue;
                }
                case 5: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 6: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 8: {
                    playerEntity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, PlayerEntity.CREATOR);
                    continue;
                }
                case 9: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 10: {
                    participantResult = (ParticipantResult)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)ParticipantResult.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ParticipantEntity(g3, j, i, uri2, uri, g2, m, c, playerEntity, g, participantResult);
    }
    
    public ParticipantEntity[] a(final int n) {
        return new ParticipantEntity[n];
    }
}
