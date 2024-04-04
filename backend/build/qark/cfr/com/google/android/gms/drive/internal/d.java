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
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class d
implements Parcelable.Creator {
    static void a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, createFileIntentSenderRequest.a);
        c.a(parcel, 2, createFileIntentSenderRequest.b, n2, false);
        c.a(parcel, 3, createFileIntentSenderRequest.c);
        c.a(parcel, 4, createFileIntentSenderRequest.d, false);
        c.a(parcel, 5, createFileIntentSenderRequest.e, n2, false);
        c.a(parcel, n3);
    }

    public CreateFileIntentSenderRequest a(Parcel parcel) {
        int n2 = 0;
        DriveId driveId = null;
        int n3 = a.b(parcel);
        String string = null;
        MetadataBundle metadataBundle = null;
        int n4 = 0;
        block7 : while (parcel.dataPosition() < n3) {
            int n5 = a.a(parcel);
            switch (a.a(n5)) {
                default: {
                    a.b(parcel, n5);
                    continue block7;
                }
                case 1: {
                    n4 = a.g(parcel, n5);
                    continue block7;
                }
                case 2: {
                    metadataBundle = (MetadataBundle)a.a(parcel, n5, MetadataBundle.CREATOR);
                    continue block7;
                }
                case 3: {
                    n2 = a.g(parcel, n5);
                    continue block7;
                }
                case 4: {
                    string = a.m(parcel, n5);
                    continue block7;
                }
                case 5: 
            }
            driveId = (DriveId)a.a(parcel, n5, DriveId.CREATOR);
        }
        if (parcel.dataPosition() != n3) {
            throw new b("Overread allowed size end=" + n3, parcel);
        }
        return new CreateFileIntentSenderRequest(n4, metadataBundle, n2, string, driveId);
    }

    public CreateFileIntentSenderRequest[] a(int n2) {
        return new CreateFileIntentSenderRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

