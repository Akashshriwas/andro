/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.os.IBinder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 */
package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.gm;
import java.util.HashSet;

final class gl {
    final /* synthetic */ gk a;
    private final String b;
    private final gm c;
    private final HashSet d;
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public gl(gk gk2, String string) {
        this.a = gk2;
        this.b = string;
        this.c = new gm(this);
        this.d = new HashSet();
        this.e = 0;
    }

    static /* synthetic */ int a(gl gl2, int n2) {
        gl2.e = n2;
        return n2;
    }

    static /* synthetic */ ComponentName a(gl gl2, ComponentName componentName) {
        gl2.h = componentName;
        return componentName;
    }

    static /* synthetic */ IBinder a(gl gl2, IBinder iBinder) {
        gl2.g = iBinder;
        return iBinder;
    }

    static /* synthetic */ HashSet a(gl gl2) {
        return gl2.d;
    }

    public gm a() {
        return this.c;
    }

    public void a(ge ge2) {
        this.d.add((Object)ge2);
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }

    public String b() {
        return this.b;
    }

    public void b(ge ge2) {
        this.d.remove((Object)ge2);
    }

    public boolean c() {
        return this.f;
    }

    public boolean c(ge ge2) {
        return this.d.contains((Object)ge2);
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

