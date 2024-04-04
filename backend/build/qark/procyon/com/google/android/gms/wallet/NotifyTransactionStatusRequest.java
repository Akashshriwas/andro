// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    String b;
    int c;
    String d;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    NotifyTransactionStatusRequest() {
        this.a = 1;
    }
    
    NotifyTransactionStatusRequest(final int a, final String b, final int c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        j.a(this, parcel, n);
    }
}
