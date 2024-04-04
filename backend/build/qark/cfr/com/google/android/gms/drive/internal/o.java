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
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;

public class o
implements Parcelable.Creator {
    static void a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, openFileIntentSenderRequest.a);
        c.a(parcel, 2, openFileIntentSenderRequest.b, false);
        c.a(parcel, 3, openFileIntentSenderRequest.c, false);
        c.a(parcel, 4, openFileIntentSenderRequest.d, n2, false);
        c.a(parcel, n3);
    }

    public OpenFileIntentSenderRequest a(Parcel parcel) {
        DriveId driveId = null;
        int n2 = a.b(parcel);
        int n3 = 0;
        String[] arrstring = null;
        String string = null;
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
                    string = a.m(parcel, n4);
                    continue block6;
                }
                case 3: {
                    arrstring = a.x(parcel, n4);
                    continue block6;
                }
                case 4: 
            }
            driveId = (DriveId)a.a(parcel, n4, DriveId.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new OpenFileIntentSenderRequest(n3, string, arrstring, driveId);
    }

    public OpenFileIntentSenderRequest[] a(int n2) {
        return new OpenFileIntentSenderRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

