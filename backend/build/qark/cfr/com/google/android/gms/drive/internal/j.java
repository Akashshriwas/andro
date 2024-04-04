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
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;

public class j
implements Parcelable.Creator {
    static void a(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.a(parcel, 1, onDownloadProgressResponse.a);
        c.a(parcel, 2, onDownloadProgressResponse.b);
        c.a(parcel, 3, onDownloadProgressResponse.c);
        c.a(parcel, n2);
    }

    public OnDownloadProgressResponse a(Parcel parcel) {
        long l2 = 0L;
        int n2 = a.b(parcel);
        int n3 = 0;
        long l3 = 0L;
        block5 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block5;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block5;
                }
                case 2: {
                    l3 = a.h(parcel, n4);
                    continue block5;
                }
                case 3: 
            }
            l2 = a.h(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new OnDownloadProgressResponse(n3, l3, l2);
    }

    public OnDownloadProgressResponse[] a(int n2) {
        return new OnDownloadProgressResponse[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

