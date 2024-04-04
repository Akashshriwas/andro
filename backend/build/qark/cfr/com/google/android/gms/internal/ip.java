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
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.gs;

public class ip
implements Parcelable.Creator {
    static void a(gs gs2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, gs2.b(), false);
        c.a(parcel, 1000, gs2.a());
        c.a(parcel, 2, gs2.c(), false);
        c.a(parcel, 3, gs2.d(), false);
        c.a(parcel, 4, gs2.e(), false);
        c.a(parcel, 5, gs2.f(), false);
        c.a(parcel, 6, gs2.g(), false);
        c.a(parcel, 7, gs2.h(), false);
        c.a(parcel, 8, gs2.i(), false);
        c.a(parcel, n2);
    }

    public gs a(Parcel parcel) {
        String string = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String[] arrstring = null;
        String[] arrstring2 = null;
        String[] arrstring3 = null;
        String string5 = null;
        block11 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block11;
                }
                case 1: {
                    string5 = a.m(parcel, n4);
                    continue block11;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block11;
                }
                case 2: {
                    arrstring3 = a.x(parcel, n4);
                    continue block11;
                }
                case 3: {
                    arrstring2 = a.x(parcel, n4);
                    continue block11;
                }
                case 4: {
                    arrstring = a.x(parcel, n4);
                    continue block11;
                }
                case 5: {
                    string4 = a.m(parcel, n4);
                    continue block11;
                }
                case 6: {
                    string3 = a.m(parcel, n4);
                    continue block11;
                }
                case 7: {
                    string2 = a.m(parcel, n4);
                    continue block11;
                }
                case 8: 
            }
            string = a.m(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new gs(n3, string5, arrstring3, arrstring2, arrstring, string4, string3, string2, string);
    }

    public gs[] a(int n2) {
        return new gs[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

