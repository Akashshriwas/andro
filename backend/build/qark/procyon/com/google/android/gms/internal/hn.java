// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class hn implements Parcelable$Creator
{
    static void a(final ek ek, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, ek.a());
        c.a(parcel, 2, ek.e(), false);
        c.a(parcel, 3, (Parcelable)ek.f(), n, false);
        c.a(parcel, a);
    }
    
    public ek a(final Parcel parcel) {
        eh eh = null;
        final int b = a.b(parcel);
        int g = 0;
        Parcel z = null;
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
                    z = com.google.android.gms.common.internal.safeparcel.a.z(parcel, a);
                    continue;
                }
                case 3: {
                    eh = (eh)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.eh.a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new ek(g, z, eh);
    }
    
    public ek[] a(final int n) {
        return new ek[n];
    }
}
