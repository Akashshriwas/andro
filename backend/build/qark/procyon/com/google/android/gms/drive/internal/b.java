// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Contents;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class b implements Parcelable$Creator
{
    static void a(final CloseContentsRequest closeContentsRequest, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.a(parcel, 1, closeContentsRequest.a);
        c.a(parcel, 2, (Parcelable)closeContentsRequest.b, n, false);
        c.a(parcel, 3, closeContentsRequest.c, false);
        c.a(parcel, a);
    }
    
    public CloseContentsRequest a(final Parcel parcel) {
        Boolean d = null;
        final int b = a.b(parcel);
        int g = 0;
        Contents contents = null;
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
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Contents.CREATOR);
                    continue;
                }
                case 3: {
                    d = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
        }
        return new CloseContentsRequest(g, contents, d);
    }
    
    public CloseContentsRequest[] a(final int n) {
        return new CloseContentsRequest[n];
    }
}
