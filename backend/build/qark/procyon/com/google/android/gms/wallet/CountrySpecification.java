// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    private final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    CountrySpecification(final int b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public int a() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        c.a(this, parcel, n);
    }
}
