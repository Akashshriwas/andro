/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View
 *  android.view.View$BaseSavedState
 */
package com.slidemenu.lib;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.slidemenu.lib.q;

public class SlidingMenu$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new q();
    private final int a;

    private SlidingMenu$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    /* synthetic */ SlidingMenu$SavedState(Parcel parcel, SlidingMenu$SavedState slidingMenu$SavedState) {
        this(parcel);
    }

    public SlidingMenu$SavedState(Parcelable parcelable, int n2) {
        super(parcelable);
        this.a = n2;
    }

    public int a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
    }
}

