// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.maps.model.a.b;
import android.os.IBinder;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TileOverlayOptions implements SafeParcelable
{
    public static final l a;
    private final int b;
    private a c;
    private m d;
    private boolean e;
    private float f;
    private boolean g;
    
    static {
        a = new l();
    }
    
    public TileOverlayOptions() {
        this.e = true;
        this.g = true;
        this.b = 1;
    }
    
    TileOverlayOptions(final int b, final IBinder binder, final boolean e, final float f, final boolean g) {
        this.e = true;
        this.g = true;
        this.b = b;
        this.c = com.google.android.gms.maps.model.a.b.a(binder);
        m d;
        if (this.c == null) {
            d = null;
        }
        else {
            d = new k(this);
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    int a() {
        return this.b;
    }
    
    IBinder b() {
        return this.c.asBinder();
    }
    
    public float c() {
        return this.f;
    }
    
    public boolean d() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return this.g;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (com.google.android.gms.maps.a.b.a()) {
            x.a(this, parcel, n);
            return;
        }
        l.a(this, parcel, n);
    }
}
