// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class e implements Parcelable$Creator
{
    static void a(final CreateFileRequest createFileRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, createFileRequest.a);
        c.a(parcel, 2, (Parcelable)createFileRequest.b, n, false);
        c.a(parcel, 3, (Parcelable)createFileRequest.c, n, false);
        c.a(parcel, 4, (Parcelable)createFileRequest.d, n, false);
        c.a(parcel, a);
    }
    
    public CreateFileRequest a(final Parcel parcel) {
        Contents contents = null;
        final int b = a.b(parcel);
        int g = 0;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            DriveId driveId2 = null;
            MetadataBundle metadataBundle3 = null;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    final MetadataBundle metadataBundle2 = metadataBundle;
                    driveId2 = driveId;
                    metadataBundle3 = metadataBundle2;
                    break;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    final DriveId driveId3 = driveId;
                    metadataBundle3 = metadataBundle;
                    driveId2 = driveId3;
                    break;
                }
                case 2: {
                    final DriveId driveId4 = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DriveId.CREATOR);
                    metadataBundle3 = metadataBundle;
                    driveId2 = driveId4;
                    break;
                }
                case 3: {
                    final MetadataBundle metadataBundle4 = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataBundle.CREATOR);
                    driveId2 = driveId;
                    metadataBundle3 = metadataBundle4;
                    break;
                }
                case 4: {
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Contents.CREATOR);
                    final DriveId driveId5 = driveId;
                    metadataBundle3 = metadataBundle;
                    driveId2 = driveId5;
                    break;
                }
            }
            final DriveId driveId6 = driveId2;
            metadataBundle = metadataBundle3;
            driveId = driveId6;
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new CreateFileRequest(g, driveId, metadataBundle, contents);
    }
    
    public CreateFileRequest[] a(final int n) {
        return new CreateFileRequest[n];
    }
}
