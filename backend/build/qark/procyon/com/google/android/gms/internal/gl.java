// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class gl
{
    final /* synthetic */ gk a;
    private final String b;
    private final gm c;
    private final HashSet d;
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;
    
    public gl(final gk a, final String b) {
        this.a = a;
        this.b = b;
        this.c = new gm(this);
        this.d = new HashSet();
        this.e = 0;
    }
    
    public gm a() {
        return this.c;
    }
    
    public void a(final ge e) {
        this.d.add(e);
    }
    
    public void a(final boolean f) {
        this.f = f;
    }
    
    public String b() {
        return this.b;
    }
    
    public void b(final ge o) {
        this.d.remove(o);
    }
    
    public boolean c() {
        return this.f;
    }
    
    public boolean c(final ge o) {
        return this.d.contains(o);
    }
    
    public int d() {
        return this.e;
    }
    
    public boolean e() {
        return this.d.isEmpty();
    }
    
    public IBinder f() {
        return this.g;
    }
    
    public ComponentName g() {
        return this.h;
    }
}
