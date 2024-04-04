// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

public abstract class ef
{
    private final Runnable a;
    private volatile Thread b;
    
    public ef() {
        this.a = new eg(this);
    }
    
    public abstract void a();
    
    public abstract void b();
    
    public final void e() {
        ei.a(this.a);
    }
    
    public final void f() {
        this.b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }
}
