// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class j implements Parcelable$Creator
{
    static void a(final NotifyTransactionStatusRequest notifyTransactionStatusRequest, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, notifyTransactionStatusRequest.a);
        c.a(parcel, 2, notifyTransactionStatusRequest.b, false);
        c.a(parcel, 3, notifyTransactionStatusRequest.c);
        c.a(parcel, 4, notifyTransactionStatusRequest.d, false);
        c.a(parcel, a);
    }
    
    public NotifyTransactionStatusRequest a(final Parcel parcel) {
        String m = null;
        int g = 0;
        final int b = a.b(parcel);
        String i = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new NotifyTransactionStatusRequest(g2, i, g, m);
    }
    
    public NotifyTransactionStatusRequest[] a(final int n) {
        return new NotifyTransactionStatusRequest[n];
    }
}
