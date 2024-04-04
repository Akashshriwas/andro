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
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;

public class e
implements Parcelable.Creator {
    static void a(FullWalletRequest fullWalletRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, fullWalletRequest.a());
        c.a(parcel, 2, fullWalletRequest.a, false);
        c.a(parcel, 3, fullWalletRequest.b, false);
        c.a(parcel, 4, fullWalletRequest.c, n2, false);
        c.a(parcel, n3);
    }

    public FullWalletRequest a(Parcel parcel) {
        Cart cart = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
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
                    string2 = a.m(parcel, n4);
                    continue block6;
                }
                case 3: {
                    string = a.m(parcel, n4);
                    continue block6;
                }
                case 4: 
            }
            cart = (Cart)a.a(parcel, n4, Cart.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new FullWalletRequest(n3, string2, string, cart);
    }

    public FullWalletRequest[] a(int n2) {
        return new FullWalletRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

