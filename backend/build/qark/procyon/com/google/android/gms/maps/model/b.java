// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class b implements Parcelable$Creator
{
    static void a(final CameraPosition cameraPosition, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, cameraPosition.a());
        c.a(parcel, 2, (Parcelable)cameraPosition.b, n, false);
        c.a(parcel, 3, cameraPosition.c);
        c.a(parcel, 4, cameraPosition.d);
        c.a(parcel, 5, cameraPosition.e);
        c.a(parcel, a);
    }
    
    public CameraPosition a(final Parcel parcel) {
        float j = 0.0f;
        final int b = a.b(parcel);
        int g = 0;
        LatLng latLng = null;
        float i = 0.0f;
        float k = 0.0f;
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
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.a);
                    continue;
                }
                case 3: {
                    k = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 4: {
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
        }
        return new CameraPosition(g, latLng, k, i, j);
    }
    
    public CameraPosition[] a(final int n) {
        return new CameraPosition[n];
    }
}
