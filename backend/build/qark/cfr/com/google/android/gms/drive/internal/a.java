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
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class a
implements Parcelable.Creator {
    static void a(UpdateMetadataRequest updateMetadataRequest, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, updateMetadataRequest.a);
        c.a(parcel, 2, updateMetadataRequest.b, n2, false);
        c.a(parcel, 3, updateMetadataRequest.c, n2, false);
        c.a(parcel, n3);
    }

    public UpdateMetadataRequest a(Parcel parcel) {
        MetadataBundle metadataBundle = null;
        int n2 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int n3 = 0;
        DriveId driveId = null;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n4)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n4);
                    continue block5;
                }
                case 2: {
                    driveId = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, DriveId.CREATOR);
                    continue block5;
                }
                case 3: 
            }
            metadataBundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, n4, MetadataBundle.CREATOR);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new UpdateMetadataRequest(n3, driveId, metadataBundle);
    }

    public UpdateMetadataRequest[] a(int n2) {
        return new UpdateMetadataRequest[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

