/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.CloseContentsRequest;

public class b
implements Parcelable.Creator {
    static void a(CloseContentsRequest closeContentsRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, closeContentsRequest.a);
        c.a(parcel, 2, closeContentsRequest.b, n2, false);
        c.a(parcel, 3, closeContentsRequest.c, false);
        c.a(parcel, n3);
    }

    public CloseContentsRequest a(Parcel parcel) {
        Boolean bl2 = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        Contents contents = null;
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
                    contents = (Contents)a.a(parcel, n4, Contents.CREATOR);
                    continue block5;
                }
                case 3: 
            }
            bl2 = a.d(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new CloseContentsRequest(n3, contents, bl2);
    }

    public CloseContentsRequest[] a(int n2) {
        return new CloseContentsRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

