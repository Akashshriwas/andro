// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    String c;
    String d;
    int e;
    String f;
    private final int g;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    LineItem() {
        this.g = 1;
        this.e = 0;
    }
    
    LineItem(final int g, final String a, final String b, final String c, final String d, final int e, final String f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int a() {
        return this.g;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.wallet.f.a(this, parcel, n);
    }
}
