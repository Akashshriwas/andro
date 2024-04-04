// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public Fragment$SavedState a(final Parcel parcel) {
        return new Fragment$SavedState(parcel, null);
    }
    
    public Fragment$SavedState[] a(final int n) {
        return new Fragment$SavedState[n];
    }
}
