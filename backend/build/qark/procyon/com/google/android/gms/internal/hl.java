// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class hl implements Parcelable$Creator
{
    static void a(final eh eh, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, eh.b());
        c.b(parcel, 2, eh.c(), false);
        c.a(parcel, 3, eh.d(), false);
        c.a(parcel, a);
    }
    
    public eh a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int g = 0;
        ArrayList c = null;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)eh$a.a);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new eh(g, c, m);
    }
    
    public eh[] a(final int n) {
        return new eh[n];
    }
}
