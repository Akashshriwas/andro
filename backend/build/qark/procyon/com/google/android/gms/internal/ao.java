// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

public final class ao extends bt
{
    private final Object a;
    private as b;
    private an c;
    
    public ao() {
        this.a = new Object();
    }
    
    public void a() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.j();
            }
        }
    }
    
    public void a(int n) {
        while (true) {
            while (true) {
                Label_0044: {
                    synchronized (this.a) {
                        if (this.b != null) {
                            if (n != 3) {
                                break Label_0044;
                            }
                            n = 1;
                            this.b.a(n);
                            this.b = null;
                        }
                        return;
                    }
                }
                n = 2;
                continue;
            }
        }
    }
    
    public void a(final an c) {
        synchronized (this.a) {
            this.c = c;
        }
    }
    
    public void a(final as b) {
        synchronized (this.a) {
            this.b = b;
        }
    }
    
    public void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.k();
            }
        }
    }
    
    public void c() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.l();
            }
        }
    }
    
    public void d() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.m();
            }
        }
    }
    
    public void e() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(0);
                this.b = null;
                return;
            }
            if (this.c != null) {
                this.c.n();
            }
        }
    }
}
