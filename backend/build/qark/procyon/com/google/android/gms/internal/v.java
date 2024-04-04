// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Set;
import java.util.Date;
import com.google.android.gms.ads.c.a.a;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.content.Context;
import android.location.Location;
import java.util.List;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class v implements SafeParcelable
{
    public static final ka a;
    public final int b;
    public final long c;
    public final Bundle d;
    public final int e;
    public final List f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final String j;
    public final ai k;
    public final Location l;
    
    static {
        a = new ka();
    }
    
    v(final int b, final long c, final Bundle d, final int e, final List f, final boolean g, final int h, final boolean i, final String j, final ai k, final Location l) {
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
    }
    
    public v(final Context context, final n n) {
        final ai ai = null;
        this.b = 2;
        final Date a = n.a();
        long time;
        if (a != null) {
            time = a.getTime();
        }
        else {
            time = -1L;
        }
        this.c = time;
        this.e = n.b();
        final Set c = n.c();
        List<Object> unmodifiableList;
        if (!c.isEmpty()) {
            unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(c));
        }
        else {
            unmodifiableList = null;
        }
        this.f = unmodifiableList;
        this.g = n.a(context);
        this.h = n.i();
        this.l = n.d();
        final a a2 = (a)n.a(a.class);
        Bundle a3;
        if (a2 != null) {
            a3 = a2.a();
        }
        else {
            a3 = null;
        }
        this.d = a3;
        this.i = n.e();
        this.j = n.f();
        final com.google.android.gms.ads.d.a g = n.g();
        ai k = ai;
        if (g != null) {
            k = new ai(g);
        }
        this.k = k;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ka.a(this, parcel, n);
    }
}
