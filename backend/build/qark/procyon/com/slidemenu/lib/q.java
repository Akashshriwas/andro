// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.os.Parcel;
import android.os.Parcelable$Creator;

class q implements Parcelable$Creator
{
    public SlidingMenu$SavedState a(final Parcel parcel) {
        return new SlidingMenu$SavedState(parcel, null);
    }
    
    public SlidingMenu$SavedState[] a(final int n) {
        return new SlidingMenu$SavedState[n];
    }
}
