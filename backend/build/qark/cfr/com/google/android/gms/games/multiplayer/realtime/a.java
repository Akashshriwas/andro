/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

final class a
implements Parcelable.Creator {
    a() {
    }

    public RealTimeMessage a(Parcel parcel) {
        return new RealTimeMessage(parcel, null);
    }

    public RealTimeMessage[] a(int n2) {
        return new RealTimeMessage[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

