// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class j implements Parcelable$Creator
{
    static void a(final OnDownloadProgressResponse onDownloadProgressResponse, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.a(parcel, 1, onDownloadProgressResponse.a);
        c.a(parcel, 2, onDownloadProgressResponse.b);
        c.a(parcel, 3, onDownloadProgressResponse.c);
        c.a(parcel, a);
    }
    
    public OnDownloadProgressResponse a(final Parcel parcel) {
        long h = 0L;
        final int b = a.b(parcel);
        int g = 0;
        long h2 = 0L;
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
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        return new OnDownloadProgressResponse(g, h2, h);
    }
    
    public OnDownloadProgressResponse[] a(final int n) {
        return new OnDownloadProgressResponse[n];
    }
}
