// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class r implements Parcelable$Creator
{
    public FragmentState a(final Parcel parcel) {
        return new FragmentState(parcel);
    }
    
    public FragmentState[] a(final int n) {
        return new FragmentState[n];
    }
}
