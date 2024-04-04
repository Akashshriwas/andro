// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class d implements Parcelable$Creator
{
    static void a(final CreateFileIntentSenderRequest createFileIntentSenderRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, createFileIntentSenderRequest.a);
        c.a(parcel, 2, (Parcelable)createFileIntentSenderRequest.b, n, false);
        c.a(parcel, 3, createFileIntentSenderRequest.c);
        c.a(parcel, 4, createFileIntentSenderRequest.d, false);
        c.a(parcel, 5, (Parcelable)createFileIntentSenderRequest.e, n, false);
        c.a(parcel, a);
    }
    
    public CreateFileIntentSenderRequest a(final Parcel parcel) {
        int g = 0;
        DriveId driveId = null;
        final int b = a.b(parcel);
        String m = null;
        MetadataBundle metadataBundle = null;
        int g2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    g2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 2: {
                    metadataBundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataBundle.CREATOR);
                    continue;
                }
                case 3: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    driveId = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DriveId.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new CreateFileIntentSenderRequest(g2, metadataBundle, g, m, driveId);
    }
    
    public CreateFileIntentSenderRequest[] a(final int n) {
        return new CreateFileIntentSenderRequest[n];
    }
}
