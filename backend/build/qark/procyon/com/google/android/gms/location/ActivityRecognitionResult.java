// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ActivityRecognitionResult implements SafeParcelable
{
    public static final a a;
    List b;
    long c;
    long d;
    private final int e;
    
    static {
        a = new a();
    }
    
    public ActivityRecognitionResult(final int n, final List b, final long c, final long d) {
        this.e = 1;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.b + ", timeMillis=" + this.c + ", elapsedRealtimeMillis=" + this.d + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.location.a.a(this, parcel, n);
    }
}
