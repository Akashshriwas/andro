/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.b.c;

class b
implements Parcelable.Creator {
    final c a;

    public b(c c2) {
        this.a = c2;
    }

    public Object createFromParcel(Parcel parcel) {
        return this.a.a(parcel, null);
    }

    public Object[] newArray(int n2) {
        return this.a.a(n2);
    }
}

