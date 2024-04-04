// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.b;
import android.database.CursorWindow;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final DataHolder dataHolder, final Parcel parcel, final int n) {
        final int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dataHolder.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, dataHolder.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[])dataHolder.d(), n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dataHolder.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dataHolder.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }
    
    public DataHolder a(final Parcel parcel) {
        int g = 0;
        Bundle o = null;
        final int b = a.b(parcel);
        CursorWindow[] array = null;
        String[] x = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 1000: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    array = (CursorWindow[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, CursorWindow.CREATOR);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 4: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        final DataHolder dataHolder = new DataHolder(g2, x, array, g, o);
        dataHolder.a();
        return dataHolder;
    }
    
    public DataHolder[] a(final int n) {
        return new DataHolder[n];
    }
}
