// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWalletRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    boolean l;
    boolean m;
    private final int n;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    MaskedWalletRequest() {
        this.n = 3;
        this.l = true;
        this.m = true;
    }
    
    MaskedWalletRequest(final int n, final String a, final boolean b, final boolean c, final boolean d, final String e, final String f, final String g, final Cart h, final boolean i, final boolean j, final CountrySpecification[] k, final boolean l, final boolean m) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public int a() {
        return this.n;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.wallet.i.a(this, parcel, n);
    }
}
