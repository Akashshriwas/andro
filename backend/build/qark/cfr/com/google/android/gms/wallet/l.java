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
import com.google.android.gms.wallet.ProxyCard;

public class l
implements Parcelable.Creator {
    static void a(ProxyCard proxyCard, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, proxyCard.a());
        c.a(parcel, 2, proxyCard.a, false);
        c.a(parcel, 3, proxyCard.b, false);
        c.a(parcel, 4, proxyCard.c);
        c.a(parcel, 5, proxyCard.d);
        c.a(parcel, n2);
    }

    public ProxyCard a(Parcel parcel) {
        String string = null;
        int n2 = 0;
        int n3 = a.b(parcel);
        int n4 = 0;
        String string2 = null;
        int n5 = 0;
        block7 : while (parcel.dataPosition() < n3) {
            int n6 = a.a(parcel);
            switch (a.a(n6)) {
                default: {
                    a.b(parcel, n6);
                    continue block7;
                }
                case 1: {
                    n5 = a.g(parcel, n6);
                    continue block7;
                }
                case 2: {
                    string2 = a.m(parcel, n6);
                    continue block7;
                }
                case 3: {
                    string = a.m(parcel, n6);
                    continue block7;
                }
                case 4: {
                    n4 = a.g(parcel, n6);
                    continue block7;
                }
                case 5: 
            }
            n2 = a.g(parcel, n6);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new ProxyCard(n5, string2, string, n4, n2);
    }

    public ProxyCard[] a(int n2) {
        return new ProxyCard[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

