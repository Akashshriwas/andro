// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class q implements Parcelable$Creator
{
    public FragmentManagerState a(final Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
    
    public FragmentManagerState[] a(final int n) {
        return new FragmentManagerState[n];
    }
}
