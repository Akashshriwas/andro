/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Date
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.o;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class n {
    public static final String a = es.a("emulator");
    private final Date b;
    private final int c;
    private final Set d;
    private final Location e;
    private final boolean f;
    private final Map g;
    private final String h;
    private final com.google.android.gms.ads.d.a i;
    private final int j;
    private final Set k;

    public n(o o2) {
        this(o2, null);
    }

    public n(o o2, com.google.android.gms.ads.d.a a2) {
        this.b = o.a(o2);
        this.c = o.b(o2);
        this.d = Collections.unmodifiableSet((Set)o.c(o2));
        this.e = o.d(o2);
        this.f = o.e(o2);
        this.g = Collections.unmodifiableMap((Map)o.f(o2));
        this.h = o.g(o2);
        this.i = a2;
        this.j = o.h(o2);
        this.k = Collections.unmodifiableSet((Set)o.i(o2));
    }

    public a a(Class class_) {
        return (a)this.g.get((Object)class_);
    }

    public Date a() {
        return this.b;
    }

    public boolean a(Context context) {
        return this.k.contains((Object)es.a(context));
    }

    public int b() {
        return this.c;
    }

    public Set c() {
        return this.d;
    }

    public Location d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public String f() {
        return this.h;
    }

    public com.google.android.gms.ads.d.a g() {
        return this.i;
    }

    public Map h() {
        return this.g;
    }

    public int i() {
        return this.j;
    }
}

