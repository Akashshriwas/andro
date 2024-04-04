// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWallet implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    private final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    FullWallet() {
        this.h = 1;
    }
    
    FullWallet(final int h, final String a, final String b, final ProxyCard c, final String d, final Address e, final Address f, final String[] g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public int a() {
        return this.h;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.wallet.d.a(this, parcel, n);
    }
}
