/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.multiplayer.d;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.ia;

public final class ParticipantResult
implements SafeParcelable {
    public static final d a = new d();
    private final int b;
    private final String c;
    private final int d;
    private final int e;

    public ParticipantResult(int n2, String string, int n3, int n4) {
        this.b = n2;
        this.c = (String)hc.a((Object)string);
        hc.a(ia.a(n3));
        this.d = n3;
        this.e = n4;
    }

    public ParticipantResult(String string, int n2, int n3) {
        this(1, string, n2, n3);
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        d.a(this, parcel, n2);
    }
}

