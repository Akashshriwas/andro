/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.a;
import java.util.List;

public class ActivityRecognitionResult
implements SafeParcelable {
    public static final a a = new a();
    List b;
    long c;
    long d;
    private final int e = 1;

    public ActivityRecognitionResult(int n2, List list, long l2, long l3) {
        this.b = list;
        this.c = l2;
        this.d = l3;
    }

    public int a() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + (Object)this.b + ", timeMillis=" + this.c + ", elapsedRealtimeMillis=" + this.d + "]";
    }

    public void writeToParcel(Parcel parcel, int n2) {
        a.a(this, parcel, n2);
    }
}

