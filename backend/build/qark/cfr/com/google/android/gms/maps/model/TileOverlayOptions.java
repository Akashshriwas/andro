/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.b;
import com.google.android.gms.maps.model.k;
import com.google.android.gms.maps.model.l;
import com.google.android.gms.maps.model.m;
import com.google.android.gms.maps.model.x;

public final class TileOverlayOptions
implements SafeParcelable {
    public static final l a = new l();
    private final int b;
    private a c;
    private m d;
    private boolean e = true;
    private float f;
    private boolean g = true;

    public TileOverlayOptions() {
        this.b = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    TileOverlayOptions(int n2, IBinder object, boolean bl2, float f2, boolean bl3) {
        this.b = n2;
        this.c = b.a((IBinder)object);
        object = this.c == null ? null : new k(this);
        this.d = object;
        this.e = bl2;
        this.f = f2;
        this.g = bl3;
    }

    static /* synthetic */ a a(TileOverlayOptions tileOverlayOptions) {
        return tileOverlayOptions.c;
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

    public void writeToParcel(Parcel parcel, int n2) {
        if (com.google.android.gms.maps.a.b.a()) {
            x.a(this, parcel, n2);
            return;
        }
        l.a(this, parcel, n2);
    }
}

