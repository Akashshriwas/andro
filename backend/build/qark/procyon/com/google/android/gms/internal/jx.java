// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

class jx implements Runnable
{
    final /* synthetic */ ju a;
    final /* synthetic */ jw b;
    private final WeakReference c;
    
    jx(final jw b, final ju a) {
        this.b = b;
        this.a = a;
        this.c = new WeakReference((T)this.a);
    }
    
    @Override
    public void run() {
        this.b.c = false;
        final ju ju = (ju)this.c.get();
        if (ju != null) {
            ju.b(this.b.b);
        }
    }
}
