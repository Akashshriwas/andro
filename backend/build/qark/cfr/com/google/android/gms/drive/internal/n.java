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
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenContentsRequest;

public class n
implements Parcelable.Creator {
    static void a(OpenContentsRequest openContentsRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, openContentsRequest.a);
        c.a(parcel, 2, openContentsRequest.b, n2, false);
        c.a(parcel, 3, openContentsRequest.c);
        c.a(parcel, n3);
    }

    public OpenContentsRequest a(Parcel parcel) {
        int n2 = 0;
        int n3 = a.b(parcel);
        DriveId driveId = null;
        int n4 = 0;
        block5 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block5;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block5;
                }
                case 2: {
                    driveId = (DriveId)a.a(parcel, n5, DriveId.CREATOR);
                    continue block5;
                }
                case 3: 
            }
            n2 = a.g(parcel, n5);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new OpenContentsRequest(n4, driveId, n2);
    }

    public OpenContentsRequest[] a(int n2) {
        return new OpenContentsRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

