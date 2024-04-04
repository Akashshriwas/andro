/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.CursorWindow
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
implements Parcelable.Creator {
    static void a(DataHolder dataHolder, Parcel parcel, int n2) {
        int n3 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dataHolder.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, dataHolder.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[])dataHolder.d(), n2, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dataHolder.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dataHolder.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n3);
    }

    public DataHolder a(Parcel object) {
        int n2 = 0;
        Bundle bundle = null;
        int n3 = a.b((Parcel)object);
        CursorWindow[] arrcursorWindow = null;
        String[] arrstring = null;
        int n4 = 0;
        block7 : while (object.dataPosition() < n3) {
            int n5 = a.a((Parcel)object);
            switch (a.a(n5)) {
                default: {
                    a.b((Parcel)object, n5);
                    continue block7;
                }
                case 1: {
                    arrstring = a.x((Parcel)object, n5);
                    continue block7;
                }
                case 1000: {
                    n4 = a.g((Parcel)object, n5);
                    continue block7;
                }
                case 2: {
                    arrcursorWindow = (CursorWindow[])a.b((Parcel)object, n5, CursorWindow.CREATOR);
                    continue block7;
                }
                case 3: {
                    n2 = a.g((Parcel)object, n5);
                    continue block7;
                }
                case 4: 
            }
            bundle = a.o((Parcel)object, n5);
        }
        if (object.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, (Parcel)object);
        }
        object = new DataHolder(n4, arrstring, arrcursorWindow, n2, bundle);
        object.a();
        return object;
    }

    public DataHolder[] a(int n2) {
        return new DataHolder[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

