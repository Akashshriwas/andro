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
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.hl;

public class hn
implements Parcelable.Creator {
    static void a(ek ek2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, ek2.a());
        c.a(parcel, 2, ek2.e(), false);
        c.a(parcel, 3, ek2.f(), n2, false);
        c.a(parcel, n3);
    }

    public ek a(Parcel parcel) {
        eh eh2 = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        Parcel parcel2 = null;
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
                    parcel2 = a.z(parcel, n4);
                    continue block5;
                }
                case 3: 
            }
            eh2 = (eh)a.a(parcel, n4, eh.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new ek(n3, parcel2, eh2);
    }

    public ek[] a(int n2) {
        return new ek[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

