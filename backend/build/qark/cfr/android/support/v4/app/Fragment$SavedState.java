/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.f;

public class Fragment$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new f();
    final Bundle a;

    Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.a = parcel.readBundle();
        if (classLoader != null && this.a != null) {
            this.a.setClassLoader(classLoader);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeBundle(this.a);
    }
}

