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
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.eb$a;
import com.google.android.gms.internal.hh;
import java.util.ArrayList;
import java.util.List;

public class hg
implements Parcelable.Creator {
    static void a(eb eb2, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, eb2.a());
        c.b(parcel, 2, (List)eb2.b(), false);
        c.a(parcel, n2);
    }

    public eb a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        ArrayList arrayList = null;
        block4 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block4;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block4;
                }
                case 2: 
            }
            arrayList = a.c(parcel, n4, eb$a.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new eb(n3, arrayList);
    }

    public eb[] a(int n2) {
        return new eb[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

