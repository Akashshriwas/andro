// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive;

import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class b implements Parcelable$Creator
{
    static void a(final DriveId driveId, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, driveId.a);
        c.a(parcel, 2, driveId.b, false);
        c.a(parcel, 3, driveId.c);
        c.a(parcel, 4, driveId.d);
        c.a(parcel, a);
    }
    
    public DriveId a(final Parcel parcel) {
        long h = 0L;
        final int b = a.b(parcel);
        int g = 0;
        String m = null;
        long h2 = 0L;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
        }
        return new DriveId(g, m, h2, h);
    }
    
    public DriveId[] a(final int n) {
        return new DriveId[n];
    }
}
