// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

public final class dv
{
    public final ad a;
    public final ad b;
    private final Object c;
    private ev d;
    private int e;
    private String f;
    
    public dv() {
        this.c = new Object();
        this.e = -2;
        this.a = new dw(this);
        this.b = new dx(this);
    }
    
    public int a() {
        synchronized (this.c) {
            return this.e;
        }
    }
    
    public void a(final ev d) {
        synchronized (this.c) {
            this.d = d;
        }
    }
    
    public String b() {
        synchronized (this.c) {
            while (this.f == null && this.e == -2) {
                try {
                    this.c.wait();
                    continue;
                }
                catch (InterruptedException ex) {
                    et.e("Ad request service was interrupted.");
                    return null;
                }
                break;
            }
            return this.f;
        }
    }
}
