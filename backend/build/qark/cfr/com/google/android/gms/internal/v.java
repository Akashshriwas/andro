/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Date
 *  java.util.List
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.ka;
import com.google.android.gms.internal.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class v
implements SafeParcelable {
    public static final ka a = new ka();
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

    v(int n2, long l2, Bundle bundle, int n3, List list, boolean bl2, int n4, boolean bl3, String string, ai ai2, Location location) {
        this.b = n2;
        this.c = l2;
        this.d = bundle;
        this.e = n3;
        this.f = list;
        this.g = bl2;
        this.h = n4;
        this.i = bl3;
        this.j = string;
        this.k = ai2;
        this.l = location;
    }

    /*
     * Enabled aggressive block sorting
     */
    public v(Context object, n object2) {
        Object var6_3 = null;
        this.b = 2;
        Date date = object2.a();
        long l2 = date != null ? date.getTime() : -1L;
        this.c = l2;
        this.e = object2.b();
        date = object2.c();
        date = !date.isEmpty() ? Collections.unmodifiableList((List)new ArrayList((Collection)date)) : null;
        this.f = date;
        this.g = object2.a((Context)object);
        this.h = object2.i();
        this.l = object2.d();
        object = (com.google.android.gms.ads.c.a.a)object2.a(com.google.android.gms.ads.c.a.a.class);
        object = object != null ? object.a() : null;
        this.d = object;
        this.i = object2.e();
        this.j = object2.f();
        object2 = object2.g();
        object = var6_3;
        if (object2 != null) {
            object = new ai((com.google.android.gms.ads.d.a)object2);
        }
        this.k = object;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ka.a(this, parcel, n2);
    }
}

