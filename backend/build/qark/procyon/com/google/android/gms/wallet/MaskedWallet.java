// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWallet implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    private final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    MaskedWallet() {
        this.i = 2;
    }
    
    MaskedWallet(final int i, final String a, final String b, final String[] c, final String d, final Address e, final Address f, final LoyaltyWalletObject[] g, final OfferWalletObject[] h) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public int a() {
        return this.i;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.wallet.h.a(this, parcel, n);
    }
}
