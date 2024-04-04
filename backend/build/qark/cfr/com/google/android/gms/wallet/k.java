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
import com.google.android.gms.wallet.OfferWalletObject;

public class k
implements Parcelable.Creator {
    static void a(OfferWalletObject offerWalletObject, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, offerWalletObject.a());
        c.a(parcel, 2, offerWalletObject.a, false);
        c.a(parcel, 3, offerWalletObject.b, false);
        c.a(parcel, n2);
    }

    public OfferWalletObject a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string2 = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: {
                    string2 = a.m(parcel, n4);
                    continue block5;
                }
                case 3: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new OfferWalletObject(n3, string2, string);
    }

    public OfferWalletObject[] a(int n2) {
        return new OfferWalletObject[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

