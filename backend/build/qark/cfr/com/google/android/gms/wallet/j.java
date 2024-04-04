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
package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class j
implements Parcelable.Creator {
    static void a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, notifyTransactionStatusRequest.a);
        c.a(parcel, 2, notifyTransactionStatusRequest.b, false);
        c.a(parcel, 3, notifyTransactionStatusRequest.c);
        c.a(parcel, 4, notifyTransactionStatusRequest.d, false);
        c.a(parcel, n2);
    }

    public NotifyTransactionStatusRequest a(Parcel parcel) {
        String string = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        String string2 = null;
        int n4 = 0;
        block6 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block6;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block6;
                }
                case 2: {
                    string2 = a.m(parcel, n5);
                    continue block6;
                }
                case 3: {
                    n2 = a.g(parcel, n5);
                    continue block6;
                }
                case 4: 
            }
            string = a.m(parcel, n5);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new NotifyTransactionStatusRequest(n4, string2, n2, string);
    }

    public NotifyTransactionStatusRequest[] a(int n2) {
        return new NotifyTransactionStatusRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

