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
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.a;
import com.google.android.gms.internal.hc;

public final class RealTimeMessage
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final byte[] b;
    private final int c;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    /* synthetic */ RealTimeMessage(Parcel parcel, a a2) {
        this(parcel);
    }

    public RealTimeMessage(String string, byte[] arrby, int n2) {
        this.a = (String)hc.a((Object)string);
        this.b = (byte[])((byte[])hc.a(arrby)).clone();
        this.c = n2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }
}

