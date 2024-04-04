/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.l;

public class OnListEntriesResponse
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new l();
    final int a;
    final DataHolder b;

    OnListEntriesResponse(int n2, DataHolder dataHolder) {
        this.a = n2;
        this.b = dataHolder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        l.a(this, parcel, n2);
    }
}

