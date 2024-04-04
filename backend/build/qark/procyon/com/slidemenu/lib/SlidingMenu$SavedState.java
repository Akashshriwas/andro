// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class SlidingMenu$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new q();
    }
    
    private SlidingMenu$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }
    
    public SlidingMenu$SavedState(final Parcelable parcelable, final int a) {
        super(parcelable);
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
    }
}
