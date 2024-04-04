/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.b.c;
import android.support.v4.view.ViewPager$SavedState;

final class ao
implements c {
    ao() {
    }

    @Override
    public /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        return this.b(parcel, classLoader);
    }

    @Override
    public /* synthetic */ Object[] a(int n2) {
        return this.b(n2);
    }

    public ViewPager$SavedState b(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager$SavedState(parcel, classLoader);
    }

    public ViewPager$SavedState[] b(int n2) {
        return new ViewPager$SavedState[n2];
    }
}

