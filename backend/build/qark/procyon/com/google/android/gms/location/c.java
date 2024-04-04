// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final LocationRequest locationRequest, final Parcel parcel, int a) {
        a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, locationRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, locationRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, locationRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, locationRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, locationRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, locationRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, locationRequest.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, locationRequest.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }
    
    public LocationRequest a(final Parcel parcel) {
        boolean c = false;
        final int b = a.b(parcel);
        int g = 102;
        long h = 3600000L;
        long h2 = 600000L;
        long h3 = Long.MAX_VALUE;
        int g2 = Integer.MAX_VALUE;
        float j = 0.0f;
        int g3 = 0;
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
                case 1000: {
                    g3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 5: {
                    h3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 6: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new LocationRequest(g3, g, h, h2, c, h3, g2, j);
    }
    
    public LocationRequest[] a(final int n) {
        return new LocationRequest[n];
    }
}
