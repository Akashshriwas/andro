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
import com.google.android.gms.games.GameEntity;

public class d
implements Parcelable.Creator {
    static void a(GameEntity gameEntity, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, gameEntity.b(), false);
        c.a(parcel, 2, gameEntity.c(), false);
        c.a(parcel, 3, gameEntity.d(), false);
        c.a(parcel, 4, gameEntity.e(), false);
        c.a(parcel, 5, gameEntity.f(), false);
        c.a(parcel, 6, gameEntity.g(), false);
        c.a(parcel, 7, (Parcelable)gameEntity.h(), n2, false);
        c.a(parcel, 8, (Parcelable)gameEntity.i(), n2, false);
        c.a(parcel, 9, (Parcelable)gameEntity.j(), n2, false);
        c.a(parcel, 10, gameEntity.k());
        c.a(parcel, 11, gameEntity.l());
        c.a(parcel, 12, gameEntity.m(), false);
        c.a(parcel, 13, gameEntity.n());
        c.a(parcel, 14, gameEntity.o());
        c.a(parcel, 15, gameEntity.p());
        c.a(parcel, 17, gameEntity.r());
        c.a(parcel, 16, gameEntity.q());
        c.a(parcel, 1000, gameEntity.s());
        c.a(parcel, n3);
    }

    public GameEntity a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean bl2 = false;
        boolean bl3 = false;
        String string7 = null;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean bl4 = false;
        boolean bl5 = false;
        block20 : while (parcel.dataPosition() < n2) {
            int n7 = a.a(parcel);
            switch (a.a(n7)) {
                default: {
                    a.b(parcel, n7);
                    continue block20;
                }
                case 1: {
                    string = a.m(parcel, n7);
                    continue block20;
                }
                case 2: {
                    string2 = a.m(parcel, n7);
                    continue block20;
                }
                case 3: {
                    string3 = a.m(parcel, n7);
                    continue block20;
                }
                case 4: {
                    string4 = a.m(parcel, n7);
                    continue block20;
                }
                case 5: {
                    string5 = a.m(parcel, n7);
                    continue block20;
                }
                case 6: {
                    string6 = a.m(parcel, n7);
                    continue block20;
                }
                case 7: {
                    uri = (Uri)a.a(parcel, n7, Uri.CREATOR);
                    continue block20;
                }
                case 8: {
                    uri2 = (Uri)a.a(parcel, n7, Uri.CREATOR);
                    continue block20;
                }
                case 9: {
                    uri3 = (Uri)a.a(parcel, n7, Uri.CREATOR);
                    continue block20;
                }
                case 10: {
                    bl2 = a.c(parcel, n7);
                    continue block20;
                }
                case 11: {
                    bl3 = a.c(parcel, n7);
                    continue block20;
                }
                case 12: {
                    string7 = a.m(parcel, n7);
                    continue block20;
                }
                case 13: {
                    n4 = a.g(parcel, n7);
                    continue block20;
                }
                case 14: {
                    n5 = a.g(parcel, n7);
                    continue block20;
                }
                case 15: {
                    n6 = a.g(parcel, n7);
                    continue block20;
                }
                case 17: {
                    bl5 = a.c(parcel, n7);
                    continue block20;
                }
                case 16: {
                    bl4 = a.c(parcel, n7);
                    continue block20;
                }
                case 1000: 
            }
            n3 = a.g(parcel, n7);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new GameEntity(n3, string, string2, string3, string4, string5, string6, uri, uri2, uri3, bl2, bl3, string7, n4, n5, n6, bl4, bl5);
    }

    public GameEntity[] a(int n2) {
        return new GameEntity[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

