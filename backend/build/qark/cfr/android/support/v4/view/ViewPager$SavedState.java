/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.b.a;
import android.support.v4.view.ao;
import android.view.View;

public class ViewPager$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = a.a(new ao());
    int a;
    Parcelable b;
    ClassLoader c;

    ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = this.getClass().getClassLoader();
        }
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader2);
        this.c = classLoader2;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString((int)System.identityHashCode((Object)((Object)this))) + " position=" + this.a + "}";
    }

    public void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, n2);
    }
}

