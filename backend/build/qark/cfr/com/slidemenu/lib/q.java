/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.slidemenu.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.slidemenu.lib.SlidingMenu$SavedState;

class q
implements Parcelable.Creator {
    q() {
    }

    public SlidingMenu$SavedState a(Parcel parcel) {
        return new SlidingMenu$SavedState(parcel, null);
    }

    public SlidingMenu$SavedState[] a(int n2) {
        return new SlidingMenu$SavedState[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

