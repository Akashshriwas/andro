/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class a
implements Parcelable.Creator {
    static void a(Status status, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, status.d());
        c.a(parcel, 1000, status.c());
        c.a(parcel, 2, status.b(), false);
        c.a(parcel, 3, (Parcelable)status.a(), n2, false);
        c.a(parcel, n3);
    }

    public Status a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int n2 = 0;
        int n3 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String string = null;
        int n4 = 0;
        block6 : while (parcel.dataPosition() < n3) {
            int n5 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n5)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n5);
                    continue block6;
                }
                case 1: {
                    n2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n5);
                    continue block6;
                }
                case 1000: {
                    n4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n5);
                    continue block6;
                }
                case 2: {
                    string = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n5);
                    continue block6;
                }
                case 3: 
            }
            pendingIntent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n5, PendingIntent.CREATOR);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new Status(n4, n2, string, pendingIntent);
    }

    public Status[] a(int n2) {
        return new Status[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

