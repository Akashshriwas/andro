// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

class ck implements Runnable
{
    final /* synthetic */ ci a;
    final /* synthetic */ cj b;
    private final WeakReference c;
    
    ck(final cj b, final ci a) {
        this.b = b;
        this.a = a;
        this.c = new WeakReference((T)this.a);
    }
    
    @Override
    public void run() {
        final ci ci = (ci)this.c.get();
        if (!this.b.b && ci != null) {
            ci.e();
            this.b.b();
        }
    }
}
