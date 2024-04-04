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
import com.google.android.gms.internal.fs;
import com.google.android.gms.internal.fu;
import com.google.android.gms.internal.ie;
import com.google.android.gms.location.LocationRequest;

public class if
implements Parcelable.Creator {
    static void a(fu fu2, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, fu2.a(), n2, false);
        c.a(parcel, 1000, fu2.b);
        c.a(parcel, 2, fu2.b(), n2, false);
        c.a(parcel, n3);
    }

    public fu a(Parcel parcel) {
        fs fs2 = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        LocationRequest locationRequest = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    locationRequest = (LocationRequest)a.a(parcel, n4, LocationRequest.h);
                    continue block5;
                }
                case 1000: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: 
            }
            fs2 = (fs)a.a(parcel, n4, fs.a);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new fu(n3, locationRequest, fs2);
    }

    public fu[] a(int n2) {
        return new fu[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

