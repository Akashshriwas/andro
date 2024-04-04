// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class dz implements SafeParcelable
{
    public static final hf a;
    private final int b;
    private final eb c;
    
    static {
        a = new hf();
    }
    
    dz(final int b, final eb c) {
        this.b = b;
        this.c = c;
    }
    
    private dz(final eb c) {
        this.b = 1;
        this.c = c;
    }
    
    public static dz a(final hi hi) {
        if (hi instanceof eb) {
            return new dz((eb)hi);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }
    
    int a() {
        return this.b;
    }
    
    eb b() {
        return this.c;
    }
    
    public hi c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public int describeContents() {
        final hf a = dz.a;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hf a = dz.a;
        hf.a(this, parcel, n);
    }
}
