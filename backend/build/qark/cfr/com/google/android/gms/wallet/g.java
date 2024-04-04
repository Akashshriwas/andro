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
import com.google.android.gms.wallet.LoyaltyWalletObject;

public class g
implements Parcelable.Creator {
    static void a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, loyaltyWalletObject.a());
        c.a(parcel, 2, loyaltyWalletObject.a, false);
        c.a(parcel, 3, loyaltyWalletObject.b, false);
        c.a(parcel, 4, loyaltyWalletObject.c, false);
        c.a(parcel, 5, loyaltyWalletObject.d, false);
        c.a(parcel, 6, loyaltyWalletObject.e, false);
        c.a(parcel, 7, loyaltyWalletObject.f, false);
        c.a(parcel, 8, loyaltyWalletObject.g, false);
        c.a(parcel, 9, loyaltyWalletObject.h, false);
        c.a(parcel, n2);
    }

    public LoyaltyWalletObject a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        block11 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block11;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block11;
                }
                case 2: {
                    string8 = a.m(parcel, n4);
                    continue block11;
                }
                case 3: {
                    string7 = a.m(parcel, n4);
                    continue block11;
                }
                case 4: {
                    string6 = a.m(parcel, n4);
                    continue block11;
                }
                case 5: {
                    string5 = a.m(parcel, n4);
                    continue block11;
                }
                case 6: {
                    string4 = a.m(parcel, n4);
                    continue block11;
                }
                case 7: {
                    string3 = a.m(parcel, n4);
                    continue block11;
                }
                case 8: {
                    string2 = a.m(parcel, n4);
                    continue block11;
                }
                case 9: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new LoyaltyWalletObject(n3, string8, string7, string6, string5, string4, string3, string2, string);
    }

    public LoyaltyWalletObject[] a(int n2) {
        return new LoyaltyWalletObject[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

