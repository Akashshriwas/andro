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
package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.DriveId;

public class b
implements Parcelable.Creator {
    static void a(DriveId driveId, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, driveId.a);
        c.a(parcel, 2, driveId.b, false);
        c.a(parcel, 3, driveId.c);
        c.a(parcel, 4, driveId.d);
        c.a(parcel, n2);
    }

    public DriveId a(Parcel parcel) {
        long l2 = 0L;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        long l3 = 0L;
        block6 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block6;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block6;
                }
                case 2: {
                    string = a.m(parcel, n4);
                    continue block6;
                }
                case 3: {
                    l3 = a.h(parcel, n4);
                    continue block6;
                }
                case 4: 
            }
            l2 = a.h(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new DriveId(n3, string, l3, l2);
    }

    public DriveId[] a(int n2) {
        return new DriveId[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

