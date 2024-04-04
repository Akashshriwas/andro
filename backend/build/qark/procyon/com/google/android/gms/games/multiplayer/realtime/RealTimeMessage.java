// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.internal.hc;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class RealTimeMessage implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final byte[] b;
    private final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    private RealTimeMessage(final Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }
    
    public RealTimeMessage(final String s, final byte[] array, final int c) {
        this.a = (String)hc.a((Object)s);
        this.b = ((byte[])hc.a(array)).clone();
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }
}
