// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.location;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a implements Parcelable$Creator
{
    static void a(final ActivityRecognitionResult activityRecognitionResult, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.b(parcel, 1, activityRecognitionResult.b, false);
        c.a(parcel, 1000, activityRecognitionResult.a());
        c.a(parcel, 2, activityRecognitionResult.c);
        c.a(parcel, 3, activityRecognitionResult.d);
        c.a(parcel, a);
    }
    
    public ActivityRecognitionResult a(final Parcel parcel) {
        long h = 0L;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int g = 0;
        List c = null;
        long h2 = 0L;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)DetectedActivity.a);
                    continue;
                }
                case 1000: {
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
        return new ActivityRecognitionResult(g, c, h2, h);
    }
    
    public ActivityRecognitionResult[] a(final int n) {
        return new ActivityRecognitionResult[n];
    }
}
