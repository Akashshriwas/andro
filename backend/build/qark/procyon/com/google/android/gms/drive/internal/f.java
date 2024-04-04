// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class f implements Parcelable$Creator
{
    static void a(final CreateFolderRequest createFolderRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, createFolderRequest.a);
        c.a(parcel, 2, (Parcelable)createFolderRequest.b, n, false);
        c.a(parcel, 3, (Parcelable)createFolderRequest.c, n, false);
        c.a(parcel, a);
    }
    
    public CreateFolderRequest a(final Parcel parcel) {
        MetadataBundle metadataBundle = null;
        final int b = a.b(parcel);
        int g = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    driveId = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DriveId.CREATOR);
                    continue;
                }
                case 3: {
                    metadataBundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataBundle.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new CreateFolderRequest(g, driveId, metadataBundle);
    }
    
    public CreateFolderRequest[] a(final int n) {
        return new CreateFolderRequest[n];
    }
}
