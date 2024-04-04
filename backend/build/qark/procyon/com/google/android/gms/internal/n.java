// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Collections;
import com.google.android.gms.ads.d.a;
import java.util.Map;
import android.location.Location;
import java.util.Set;
import java.util.Date;

public final class n
{
    public static final String a;
    private final Date b;
    private final int c;
    private final Set d;
    private final Location e;
    private final boolean f;
    private final Map g;
    private final String h;
    private final a i;
    private final int j;
    private final Set k;
    
    static {
        a = es.a("emulator");
    }
    
    public n(final o o) {
        this(o, null);
    }
    
    public n(final o o, final a i) {
        this.b = o.d;
        this.c = o.e;
        this.d = Collections.unmodifiableSet((Set<?>)o.a);
        this.e = o.f;
        this.f = o.g;
        this.g = Collections.unmodifiableMap((Map<?, ?>)o.b);
        this.h = o.h;
        this.i = i;
        this.j = o.i;
        this.k = Collections.unmodifiableSet((Set<?>)o.c);
    }
    
    public com.google.android.gms.ads.c.a a(final Class clazz) {
        return this.g.get(clazz);
    }
    
    public Date a() {
        return this.b;
    }
    
    public boolean a(final Context context) {
        return this.k.contains(es.a(context));
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
    
    public a g() {
        return this.i;
    }
    
    public Map h() {
        return this.g;
    }
    
    public int i() {
        return this.j;
    }
}
