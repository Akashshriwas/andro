// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

public final class jw
{
    private final Runnable a;
    private v b;
    private boolean c;
    
    public jw(final ju ju) {
        this.c = false;
        this.a = new jx(this, ju);
    }
    
    public void a() {
        es.a.removeCallbacks(this.a);
    }
    
    public void a(final v v) {
        this.a(v, 60000L);
    }
    
    public void a(final v b, final long lng) {
        if (this.c) {
            et.e("An ad refresh is already scheduled.");
            return;
        }
        et.c("Scheduling ad refresh " + lng + " milliseconds from now.");
        this.b = b;
        this.c = true;
        es.a.postDelayed(this.a, lng);
    }
}
