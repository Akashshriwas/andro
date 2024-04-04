/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.LineItem;
import java.util.ArrayList;
import java.util.List;

public class b
implements Parcelable.Creator {
    static void a(Cart cart, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, cart.a());
        c.a(parcel, 2, cart.a, false);
        c.a(parcel, 3, cart.b, false);
        c.b(parcel, 4, (List)cart.c, false);
        c.a(parcel, n2);
    }

    public Cart a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        ArrayList arrayList = new ArrayList();
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
            arrayList = a.c(parcel, n4, LineItem.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new Cart(n3, string2, string, arrayList);
    }

    public Cart[] a(int n2) {
        return new Cart[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

