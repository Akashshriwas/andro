// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

final class cj
{
    private final Runnable a;
    private volatile boolean b;
    
    public cj(final ci ci) {
        this.b = false;
        this.a = new ck(this, ci);
    }
    
    public void a() {
        this.b = true;
        es.a.removeCallbacks(this.a);
    }
    
    public void b() {
        es.a.postDelayed(this.a, 250L);
    }
}
