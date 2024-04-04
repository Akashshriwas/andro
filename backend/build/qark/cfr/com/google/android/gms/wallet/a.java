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
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wallet.Address;

public class a
implements Parcelable.Creator {
    static void a(Address address, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, address.a());
        c.a(parcel, 2, address.a, false);
        c.a(parcel, 3, address.b, false);
        c.a(parcel, 4, address.c, false);
        c.a(parcel, 5, address.d, false);
        c.a(parcel, 6, address.e, false);
        c.a(parcel, 7, address.f, false);
        c.a(parcel, 8, address.g, false);
        c.a(parcel, 9, address.h, false);
        c.a(parcel, 10, address.i, false);
        c.a(parcel, 11, address.j);
        c.a(parcel, 12, address.k, false);
        c.a(parcel, n2);
    }

    public Address a(Parcel parcel) {
        int n2 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int n3 = 0;
        String string = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        String string9 = null;
        boolean bl2 = false;
        String string10 = null;
        block14 : while (parcel.dataPosition() < n2) {
            int n4 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n4)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n4);
                    continue block14;
                }
                case 1: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n4);
                    continue block14;
                }
                case 2: {
                    string = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 3: {
                    string2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 4: {
                    string3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 5: {
                    string4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 6: {
                    string5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 7: {
                    string6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 8: {
                    string7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 9: {
                    string8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 10: {
                    string9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
                    continue block14;
                }
                case 11: {
                    bl2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, n4);
                    continue block14;
                }
                case 12: 
            }
            string10 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new Address(n3, string, string2, string3, string4, string5, string6, string7, string8, string9, bl2, string10);
    }

    public Address[] a(int n2) {
        return new Address[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

