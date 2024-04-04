// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

class aq implements Runnable
{
    final /* synthetic */ ao a;
    final /* synthetic */ ap b;
    
    aq(final ap b, final ao a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        synchronized (this.b.h) {
            if (this.b.j != -2) {
                return;
            }
            this.b.i = this.b.b();
            if (this.b.i == null) {
                this.b.a(4);
                return;
            }
        }
        this.a.a(this.b);
        this.b.a(this.a);
    }
    // monitorexit(o)
}
