// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class o implements Parcelable$Creator
{
    static void a(final OpenFileIntentSenderRequest openFileIntentSenderRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, openFileIntentSenderRequest.a);
        c.a(parcel, 2, openFileIntentSenderRequest.b, false);
        c.a(parcel, 3, openFileIntentSenderRequest.c, false);
        c.a(parcel, 4, (Parcelable)openFileIntentSenderRequest.d, n, false);
        c.a(parcel, a);
    }
    
    public OpenFileIntentSenderRequest a(final Parcel parcel) {
        DriveId driveId = null;
        final int b = a.b(parcel);
        int g = 0;
        String[] x = null;
        String m = null;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 4: {
                    driveId = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DriveId.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new OpenFileIntentSenderRequest(g, m, x, driveId);
    }
    
    public OpenFileIntentSenderRequest[] a(final int n) {
        return new OpenFileIntentSenderRequest[n];
    }
}
