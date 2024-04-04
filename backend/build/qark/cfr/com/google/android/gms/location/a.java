/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.b;
import java.util.ArrayList;
import java.util.List;

public class a
implements Parcelable.Creator {
    static void a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int n2) {
        n2 = c.a(parcel);
        c.b(parcel, 1, activityRecognitionResult.b, false);
        c.a(parcel, 1000, activityRecognitionResult.a());
        c.a(parcel, 2, activityRecognitionResult.c);
        c.a(parcel, 3, activityRecognitionResult.d);
        c.a(parcel, n2);
    }

    public ActivityRecognitionResult a(Parcel parcel) {
        long l2 = 0L;
        int n2 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int n3 = 0;
        ArrayList arrayList = null;
        long l3 = 0L;
        block6 : while (parcel.dataPosition() < n2) {
            int n4 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(n4)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n4);
                    continue block6;
                }
                case 1: {
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, n4, DetectedActivity.a);
                    continue block6;
                }
                case 1000: {
                    n3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n4);
                    continue block6;
                }
                case 2: {
                    l3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, n4);
                    continue block6;
                }
                case 3: 
            }
            l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + n2, parcel);
        }
        return new ActivityRecognitionResult(n3, (List)arrayList, l3, l2);
    }

    public ActivityRecognitionResult[] a(int n2) {
        return new ActivityRecognitionResult[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}

