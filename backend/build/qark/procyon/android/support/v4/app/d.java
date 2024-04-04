// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public BackStackState a(final Parcel parcel) {
        return new BackStackState(parcel);
    }
    
    public BackStackState[] a(final int n) {
        return new BackStackState[n];
    }
}
