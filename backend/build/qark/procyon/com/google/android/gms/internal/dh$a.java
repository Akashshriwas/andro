// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class dh$a implements SafeParcelable
{
    public static final hb a;
    private final int b;
    private final String c;
    private final List d;
    private final int e;
    private final String f;
    
    static {
        a = new hb();
    }
    
    dh$a(final int b, final String c, final List list, final int e, final String f) {
        this.d = new ArrayList();
        this.b = b;
        this.c = c;
        this.d.addAll(list);
        this.e = e;
        this.f = f;
    }
    
    public String a() {
        return this.c;
    }
    
    public int b() {
        return this.e;
    }
    
    public String c() {
        return this.f;
    }
    
    public List d() {
        return new ArrayList(this.d);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.b;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        hb.a(this, parcel, n);
    }
}
