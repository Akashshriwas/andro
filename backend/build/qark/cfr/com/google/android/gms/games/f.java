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
package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

public class f
implements Parcelable.Creator {
    static void a(PlayerEntity playerEntity, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, playerEntity.b(), false);
        c.a(parcel, 1000, playerEntity.g());
        c.a(parcel, 2, playerEntity.c(), false);
        c.a(parcel, 3, (Parcelable)playerEntity.d(), n2, false);
        c.a(parcel, 4, (Parcelable)playerEntity.e(), n2, false);
        c.a(parcel, 5, playerEntity.f());
        c.a(parcel, n3);
    }

    public PlayerEntity a(Parcel parcel) {
        Uri uri = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        long l2 = 0L;
        Uri uri2 = null;
        String string = null;
        String string2 = null;
        block8 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block8;
                }
                case 1: {
                    string2 = a.m(parcel, n4);
                    continue block8;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block8;
                }
                case 2: {
                    string = a.m(parcel, n4);
                    continue block8;
                }
                case 3: {
                    uri2 = (Uri)a.a(parcel, n4, Uri.CREATOR);
                    continue block8;
                }
                case 4: {
                    uri = (Uri)a.a(parcel, n4, Uri.CREATOR);
                    continue block8;
                }
                case 5: 
            }
            l2 = a.h(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new PlayerEntity(n3, string2, string, uri2, uri, l2);
    }

    public PlayerEntity[] a(int n2) {
        return new PlayerEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

