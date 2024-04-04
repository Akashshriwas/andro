/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.multiplayer.ParticipantResult;

public class d
implements Parcelable.Creator {
    static void a(ParticipantResult participantResult, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, participantResult.b(), false);
        c.a(parcel, 1000, participantResult.a());
        c.a(parcel, 2, participantResult.c());
        c.a(parcel, 3, participantResult.d());
        c.a(parcel, n2);
    }

    public ParticipantResult a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        String string = null;
        int n4 = 0;
        int n5 = 0;
        block6 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block6;
                }
                case 1: {
                    string = a.m(parcel, n6);
                    continue block6;
                }
                case 1000: {
                    n5 = a.g(parcel, n6);
                    continue block6;
                }
                case 2: {
                    n4 = a.g(parcel, n6);
                    continue block6;
                }
                case 3: 
            }
            n2 = a.g(parcel, n6);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ParticipantResult(n5, string, n4, n2);
    }

    public ParticipantResult[] a(int n2) {
        return new ParticipantResult[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

