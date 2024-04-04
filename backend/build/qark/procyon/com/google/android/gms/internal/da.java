// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

class da implements Runnable
{
    final /* synthetic */ ec a;
    final /* synthetic */ cy b;
    
    da(final cy b, final ec a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        synchronized (this.b.e) {
            this.b.b.a(this.a);
        }
    }
}
