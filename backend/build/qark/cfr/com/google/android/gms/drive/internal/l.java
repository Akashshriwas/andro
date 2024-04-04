/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.internal.OnListEntriesResponse;

public class l
implements Parcelable.Creator {
    static void a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int n2) {
        int n3 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, onListEntriesResponse.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, onListEntriesResponse.b, n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n3);
    }

    public OnListEntriesResponse a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        DataHolder dataHolder = null;
        block4 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block4;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block4;
                }
                case 2: 
            }
            dataHolder = (DataHolder)a.a(parcel, n4, DataHolder.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new OnListEntriesResponse(n3, dataHolder);
    }

    public OnListEntriesResponse[] a(int n2) {
        return new OnListEntriesResponse[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

