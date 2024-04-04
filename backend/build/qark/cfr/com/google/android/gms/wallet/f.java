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
import com.google.android.gms.wallet.LineItem;

public class f
implements Parcelable.Creator {
    static void a(LineItem lineItem, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, lineItem.a());
        c.a(parcel, 2, lineItem.a, false);
        c.a(parcel, 3, lineItem.b, false);
        c.a(parcel, 4, lineItem.c, false);
        c.a(parcel, 5, lineItem.d, false);
        c.a(parcel, 6, lineItem.e);
        c.a(parcel, 7, lineItem.f, false);
        c.a(parcel, n2);
    }

    public LineItem a(Parcel parcel) {
        int n2 = 0;
        String string = null;
        int n3 = a.b(parcel);
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        int n4 = 0;
        block9 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block9;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block9;
                }
                case 2: {
                    string5 = a.m(parcel, n5);
                    continue block9;
                }
                case 3: {
                    string4 = a.m(parcel, n5);
                    continue block9;
                }
                case 4: {
                    string3 = a.m(parcel, n5);
                    continue block9;
                }
                case 5: {
                    string2 = a.m(parcel, n5);
                    continue block9;
                }
                case 6: {
                    n2 = a.g(parcel, n5);
                    continue block9;
                }
                case 7: 
            }
            string = a.m(parcel, n5);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new LineItem(n4, string5, string4, string3, string2, n2, string);
    }

    public LineItem[] a(int n2) {
        return new LineItem[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

