// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class l implements Parcelable$Creator
{
    static void a(final OnListEntriesResponse onListEntriesResponse, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, onListEntriesResponse.a);
        c.a(parcel, 2, (Parcelable)onListEntriesResponse.b, n, false);
        c.a(parcel, a);
    }
    
    public OnListEntriesResponse a(final Parcel parcel) {
        final int b = a.b(parcel);
        int g = 0;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    dataHolder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)DataHolder.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new OnListEntriesResponse(g, dataHolder);
    }
    
    public OnListEntriesResponse[] a(final int n) {
        return new OnListEntriesResponse[n];
    }
}