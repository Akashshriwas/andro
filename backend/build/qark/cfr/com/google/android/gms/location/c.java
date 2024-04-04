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
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;

public class c
implements Parcelable.Creator {
    static void a(LocationRequest locationRequest, Parcel parcel, int n2) {
        n2 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, locationRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, locationRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, locationRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, locationRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, locationRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, locationRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, locationRequest.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, locationRequest.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, n2);
    }

    public LocationRequest a(Parcel parcel) {
        boolean bl2 = false;
        int n2 = a.b(parcel);
        int n3 = 102;
        long l2 = 3600000L;
        long l3 = 600000L;
        long l4 = Long.MAX_VALUE;
        int n4 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        int n5 = 0;
        block10 : while (parcel.dataPosition() < n2) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block10;
                }
                case 1: {
                    n3 = a.g(parcel, n6);
                    continue block10;
                }
                case 1000: {
                    n5 = a.g(parcel, n6);
                    continue block10;
                }
                case 2: {
                    l2 = a.h(parcel, n6);
                    continue block10;
                }
                case 3: {
                    l3 = a.h(parcel, n6);
                    continue block10;
                }
                case 4: {
                    bl2 = a.c(parcel, n6);
                    continue block10;
                }
                case 5: {
                    l4 = a.h(parcel, n6);
                    continue block10;
                }
                case 6: {
                    n4 = a.g(parcel, n6);
                    continue block10;
                }
                case 7: 
            }
            f2 = a.j(parcel, n6);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new LocationRequest(n5, n3, l2, l3, bl2, l4, n4, f2);
    }

    public LocationRequest[] a(int n2) {
        return new LocationRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

