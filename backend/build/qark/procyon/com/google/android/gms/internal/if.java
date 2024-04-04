// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class if implements Parcelable$Creator
{
    static void a(final fu fu, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, (Parcelable)fu.a(), n, false);
        c.a(parcel, 1000, fu.b);
        c.a(parcel, 2, (Parcelable)fu.b(), n, false);
        c.a(parcel, a);
    }
    
    public fu a(final Parcel parcel) {
        fs fs = null;
        final int b = a.b(parcel);
        int g = 0;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    locationRequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LocationRequest.h);
                    continue;
                }
                case 1000: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    fs = (fs)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.fs.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new fu(g, locationRequest, fs);
    }
    
    public fu[] a(final int n) {
        return new fu[n];
    }
}
