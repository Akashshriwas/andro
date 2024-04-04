// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable
{
    public static final b a;
    int b;
    int c;
    private final int d;
    
    static {
        a = new b();
    }
    
    public DetectedActivity(final int d, final int b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    private int a(final int n) {
        int n2 = n;
        if (n > 6) {
            n2 = 4;
        }
        return n2;
    }
    
    public int a() {
        return this.a(this.b);
    }
    
    public int b() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "DetectedActivity [type=" + this.a() + ", confidence=" + this.c + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.location.b.a(this, parcel, n);
    }
}
