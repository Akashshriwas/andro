// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.b.c;

final class ao implements c
{
    public ViewPager$SavedState b(final Parcel parcel, final ClassLoader classLoader) {
        return new ViewPager$SavedState(parcel, classLoader);
    }
    
    public ViewPager$SavedState[] b(final int n) {
        return new ViewPager$SavedState[n];
    }
}
