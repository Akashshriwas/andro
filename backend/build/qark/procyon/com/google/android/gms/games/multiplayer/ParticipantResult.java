// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.internal.ia;
import com.google.android.gms.internal.hc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ParticipantResult implements SafeParcelable
{
    public static final d a;
    private final int b;
    private final String c;
    private final int d;
    private final int e;
    
    static {
        a = new d();
    }
    
    public ParticipantResult(final int b, final String s, final int d, final int e) {
        this.b = b;
        this.c = (String)hc.a((Object)s);
        hc.a(ia.a(d));
        this.d = d;
        this.e = e;
    }
    
    public ParticipantResult(final String s, final int n, final int n2) {
        this(1, s, n, n2);
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.games.multiplayer.d.a(this, parcel, n);
    }
}
