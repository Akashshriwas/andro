/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 */
package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.w;

public final class Tile
implements SafeParcelable {
    public static final j a = new j();
    public final int b;
    public final int c;
    public final byte[] d;
    private final int e;

    Tile(int n2, int n3, int n4, byte[] arrby) {
        this.e = n2;
        this.b = n3;
        this.c = n4;
        this.d = arrby;
    }

    public Tile(int n2, int n3, byte[] arrby) {
        this(1, n2, n3, arrby);
    }

    int a() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (b.a()) {
            w.a(this, parcel, n2);
            return;
        }
        j.a(this, parcel, n2);
    }
}

