// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.a.b;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Tile implements SafeParcelable
{
    public static final j a;
    public final int b;
    public final int c;
    public final byte[] d;
    private final int e;
    
    static {
        a = new j();
    }
    
    Tile(final int e, final int b, final int c, final byte[] d) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Tile(final int n, final int n2, final byte[] array) {
        this(1, n, n2, array);
    }
    
    int a() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            w.a(this, parcel, n);
            return;
        }
        j.a(this, parcel, n);
    }
}
