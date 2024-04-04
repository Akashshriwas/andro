// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public RealTimeMessage a(final Parcel parcel) {
        return new RealTimeMessage(parcel, null);
    }
    
    public RealTimeMessage[] a(final int n) {
        return new RealTimeMessage[n];
    }
}
